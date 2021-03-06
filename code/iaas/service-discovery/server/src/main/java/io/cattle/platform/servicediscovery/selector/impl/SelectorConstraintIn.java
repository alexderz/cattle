package io.cattle.platform.servicediscovery.selector.impl;

import io.cattle.platform.servicediscovery.selector.SelectorConstraint;

import java.util.List;
import java.util.Map;

public class SelectorConstraintIn extends SelectorConstraint<List<String>> {

    public SelectorConstraintIn(String key, List<String> value) {
        super(key, value);
    }

    @Override
    public boolean isMatch(Map<String, String> toCompare) {
        boolean found = false;
        for (String key : toCompare.keySet()) {
            if (this.key.equalsIgnoreCase(key)) {
                if (this.getValue().contains(toCompare.get(key).toLowerCase())) {
                    found = true;
                    break;
                }
            }
        }
        return found;
    }
}
