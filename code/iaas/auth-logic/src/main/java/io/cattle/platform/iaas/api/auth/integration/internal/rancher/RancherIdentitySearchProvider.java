package io.cattle.platform.iaas.api.auth.integration.internal.rancher;

import io.cattle.platform.api.auth.Identity;
import io.cattle.platform.core.constants.ProjectConstants;
import io.cattle.platform.core.model.Account;
import io.cattle.platform.iaas.api.auth.dao.AuthDao;
import io.cattle.platform.iaas.api.auth.integration.interfaces.IdentitySearchProvider;
import io.github.ibuildthecloud.gdapi.context.ApiContext;
import io.github.ibuildthecloud.gdapi.exception.ClientVisibleException;
import io.github.ibuildthecloud.gdapi.util.ResponseCodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

public class RancherIdentitySearchProvider implements IdentitySearchProvider {

    @Inject
    AuthDao authDao;

    @Override
    public List<Identity> searchIdentities(String name, String scope, boolean exactMatch) {
        if (!isConfigured()){
            notConfigured();
        }
        List<Identity> identities = new ArrayList<>();
        if (!scopes().contains(scope)){
            return identities;
        }
        List<Account> accounts = new ArrayList<>();
        if (exactMatch){
            accounts.add(authDao.getByUsername(name));
        } else {
            accounts.addAll(authDao.searchUsers(name));
        }
        for(Account account: accounts){
            if (account != null) {
                identities.add(authDao.getIdentity(account.getId()));
            }
        }
        return identities;
    }

    @Override
    public Set<Identity> getIdentities(Account account) {
        Set<Identity> identities = new HashSet<>();
        identities.add(new Identity(ProjectConstants.RANCHER_ID, String.valueOf(account.getId())));
        return identities;
    }

    @Override
    public List<Identity> searchIdentities(String name, boolean exactMatch) {
        if (!isConfigured()){
            notConfigured();
        }
        List<Identity> identities = new ArrayList<>();
        for (String scope : scopes()) {
            identities.addAll(searchIdentities(name, scope, exactMatch));
        }
        return identities;
    }

    private void notConfigured() {
        throw new ClientVisibleException(ResponseCodes.SERVICE_UNAVAILABLE,
                "RancherIdentityNotConfigured", "Rancher is not configured as an Identity provider.", null);
    }

    @Override
    public Identity getIdentity(String id, String scope) {
        if (!isConfigured()){
            notConfigured();
        }
        if (!scopes().contains(scope)) {
            return null;
        }
        String accountId = ApiContext.getContext().getIdFormatter().parseId(id);
        return authDao.getIdentity(Long.valueOf(accountId == null ? id : accountId));
    }

    @Override
    public Set<String> scopes() {
        return ProjectConstants.SCOPES;
    }

    @Override
    public boolean isConfigured() {
        return true;
    }

    @Override
    public String getName() {
        return ProjectConstants.RANCHER_SEARCH_PROVIDER;
    }
}
