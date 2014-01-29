/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "config_item_status", schema = "dstack", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"name", "agent_id"})
})
public interface ConfigItemStatus extends java.io.Serializable {

	/**
	 * Setter for <code>dstack.config_item_status.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.config_item_status.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId();

	/**
	 * Setter for <code>dstack.config_item_status.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>dstack.config_item_status.name</code>.
	 */
	@javax.persistence.Column(name = "name", nullable = false, length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>dstack.config_item_status.requested_version</code>.
	 */
	public void setRequestedVersion(java.lang.Long value);

	/**
	 * Getter for <code>dstack.config_item_status.requested_version</code>.
	 */
	@javax.persistence.Column(name = "requested_version", nullable = false, precision = 19)
	public java.lang.Long getRequestedVersion();

	/**
	 * Setter for <code>dstack.config_item_status.applied_version</code>.
	 */
	public void setAppliedVersion(java.lang.Long value);

	/**
	 * Getter for <code>dstack.config_item_status.applied_version</code>.
	 */
	@javax.persistence.Column(name = "applied_version", nullable = false, precision = 19)
	public java.lang.Long getAppliedVersion();

	/**
	 * Setter for <code>dstack.config_item_status.source_version</code>.
	 */
	public void setSourceVersion(java.lang.String value);

	/**
	 * Getter for <code>dstack.config_item_status.source_version</code>.
	 */
	@javax.persistence.Column(name = "source_version", length = 255)
	public java.lang.String getSourceVersion();

	/**
	 * Setter for <code>dstack.config_item_status.requested_updated</code>.
	 */
	public void setRequestedUpdated(java.util.Date value);

	/**
	 * Getter for <code>dstack.config_item_status.requested_updated</code>.
	 */
	@javax.persistence.Column(name = "requested_updated", nullable = false)
	public java.util.Date getRequestedUpdated();

	/**
	 * Setter for <code>dstack.config_item_status.applied_updated</code>.
	 */
	public void setAppliedUpdated(java.util.Date value);

	/**
	 * Getter for <code>dstack.config_item_status.applied_updated</code>.
	 */
	@javax.persistence.Column(name = "applied_updated")
	public java.util.Date getAppliedUpdated();

	/**
	 * Setter for <code>dstack.config_item_status.agent_id</code>.
	 */
	public void setAgentId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.config_item_status.agent_id</code>.
	 */
	@javax.persistence.Column(name = "agent_id", precision = 19)
	public java.lang.Long getAgentId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ConfigItemStatus
	 */
	public void from(io.github.ibuildthecloud.dstack.core.model.ConfigItemStatus from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ConfigItemStatus
	 */
	public <E extends io.github.ibuildthecloud.dstack.core.model.ConfigItemStatus> E into(E into);
}
