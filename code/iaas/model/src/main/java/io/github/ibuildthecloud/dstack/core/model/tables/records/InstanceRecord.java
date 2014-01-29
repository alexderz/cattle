/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "instance", schema = "dstack")
public class InstanceRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.InstanceRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record20<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.util.Date, java.util.Map<String,Object>, java.lang.Long>, io.github.ibuildthecloud.dstack.core.model.Instance {

	private static final long serialVersionUID = -1636219712;

	/**
	 * Setter for <code>dstack.instance.id</code>.
	 */
	@Override
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.instance.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.instance.name</code>.
	 */
	@Override
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.instance.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dstack.instance.kind</code>.
	 */
	@Override
	public void setKind(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.instance.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	@Override
	public java.lang.String getKind() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dstack.instance.account_id</code>.
	 */
	@Override
	public void setAccountId(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.instance.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>dstack.instance.uuid</code>.
	 */
	@Override
	public void setUuid(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.instance.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", nullable = false, length = 128)
	@Override
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>dstack.instance.description</code>.
	 */
	@Override
	public void setDescription(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dstack.instance.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>dstack.instance.requested_state</code>.
	 */
	@Override
	public void setRequestedState(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dstack.instance.requested_state</code>.
	 */
	@javax.persistence.Column(name = "requested_state", length = 255)
	@Override
	public java.lang.String getRequestedState() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>dstack.instance.state</code>.
	 */
	@Override
	public void setState(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dstack.instance.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>dstack.instance.allocation_state</code>.
	 */
	@Override
	public void setAllocationState(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dstack.instance.allocation_state</code>.
	 */
	@javax.persistence.Column(name = "allocation_state", nullable = false, length = 255)
	@Override
	public java.lang.String getAllocationState() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>dstack.instance.post_compute_state</code>.
	 */
	@Override
	public void setPostComputeState(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dstack.instance.post_compute_state</code>.
	 */
	@javax.persistence.Column(name = "post_compute_state", length = 255)
	@Override
	public java.lang.String getPostComputeState() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>dstack.instance.image_id</code>.
	 */
	@Override
	public void setImageId(java.lang.Long value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>dstack.instance.image_id</code>.
	 */
	@javax.persistence.Column(name = "image_id", precision = 19)
	@Override
	public java.lang.Long getImageId() {
		return (java.lang.Long) getValue(10);
	}

	/**
	 * Setter for <code>dstack.instance.offering_id</code>.
	 */
	@Override
	public void setOfferingId(java.lang.Long value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>dstack.instance.offering_id</code>.
	 */
	@javax.persistence.Column(name = "offering_id", precision = 19)
	@Override
	public java.lang.Long getOfferingId() {
		return (java.lang.Long) getValue(11);
	}

	/**
	 * Setter for <code>dstack.instance.requested_offering_id</code>.
	 */
	@Override
	public void setRequestedOfferingId(java.lang.Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>dstack.instance.requested_offering_id</code>.
	 */
	@javax.persistence.Column(name = "requested_offering_id", precision = 19)
	@Override
	public java.lang.Long getRequestedOfferingId() {
		return (java.lang.Long) getValue(12);
	}

	/**
	 * Setter for <code>dstack.instance.on_crash</code>.
	 */
	@Override
	public void setOnCrash(java.lang.String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>dstack.instance.on_crash</code>.
	 */
	@javax.persistence.Column(name = "on_crash", nullable = false, length = 255)
	@Override
	public java.lang.String getOnCrash() {
		return (java.lang.String) getValue(13);
	}

	/**
	 * Setter for <code>dstack.instance.hostname</code>.
	 */
	@Override
	public void setHostname(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>dstack.instance.hostname</code>.
	 */
	@javax.persistence.Column(name = "hostname", length = 255)
	@Override
	public java.lang.String getHostname() {
		return (java.lang.String) getValue(14);
	}

	/**
	 * Setter for <code>dstack.instance.created</code>.
	 */
	@Override
	public void setCreated(java.util.Date value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>dstack.instance.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	@Override
	public java.util.Date getCreated() {
		return (java.util.Date) getValue(15);
	}

	/**
	 * Setter for <code>dstack.instance.removed</code>.
	 */
	@Override
	public void setRemoved(java.util.Date value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>dstack.instance.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	@Override
	public java.util.Date getRemoved() {
		return (java.util.Date) getValue(16);
	}

	/**
	 * Setter for <code>dstack.instance.remove_time</code>.
	 */
	@Override
	public void setRemoveTime(java.util.Date value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>dstack.instance.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	@Override
	public java.util.Date getRemoveTime() {
		return (java.util.Date) getValue(17);
	}

	/**
	 * Setter for <code>dstack.instance.data</code>.
	 */
	@Override
	public void setData(java.util.Map<String,Object> value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>dstack.instance.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	@Override
	public java.util.Map<String,Object> getData() {
		return (java.util.Map<String,Object>) getValue(18);
	}

	/**
	 * Setter for <code>dstack.instance.zone_id</code>.
	 */
	@Override
	public void setZoneId(java.lang.Long value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>dstack.instance.zone_id</code>.
	 */
	@javax.persistence.Column(name = "zone_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getZoneId() {
		return (java.lang.Long) getValue(19);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record20 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row20<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.util.Date, java.util.Map<String,Object>, java.lang.Long> fieldsRow() {
		return (org.jooq.Row20) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row20<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.util.Date, java.util.Map<String,Object>, java.lang.Long> valuesRow() {
		return (org.jooq.Row20) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.KIND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.REQUESTED_STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.ALLOCATION_STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.POST_COMPUTE_STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field11() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.IMAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field12() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.OFFERING_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field13() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.REQUESTED_OFFERING_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field14() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.ON_CRASH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.HOSTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Date> field16() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Date> field17() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.REMOVED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Date> field18() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.REMOVE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Map<String,Object>> field19() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field20() {
		return io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE.ZONE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getKind();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getRequestedState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getAllocationState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getPostComputeState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value11() {
		return getImageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value12() {
		return getOfferingId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value13() {
		return getRequestedOfferingId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value14() {
		return getOnCrash();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getHostname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Date value16() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Date value17() {
		return getRemoved();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Date value18() {
		return getRemoveTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Map<String,Object> value19() {
		return getData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value20() {
		return getZoneId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value1(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value3(java.lang.String value) {
		setKind(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value4(java.lang.Long value) {
		setAccountId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value5(java.lang.String value) {
		setUuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value6(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value7(java.lang.String value) {
		setRequestedState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value8(java.lang.String value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value9(java.lang.String value) {
		setAllocationState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value10(java.lang.String value) {
		setPostComputeState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value11(java.lang.Long value) {
		setImageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value12(java.lang.Long value) {
		setOfferingId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value13(java.lang.Long value) {
		setRequestedOfferingId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value14(java.lang.String value) {
		setOnCrash(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value15(java.lang.String value) {
		setHostname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value16(java.util.Date value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value17(java.util.Date value) {
		setRemoved(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value18(java.util.Date value) {
		setRemoveTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value19(java.util.Map<String,Object> value) {
		setData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord value20(java.lang.Long value) {
		setZoneId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstanceRecord values(java.lang.Long value1, java.lang.String value2, java.lang.String value3, java.lang.Long value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.String value10, java.lang.Long value11, java.lang.Long value12, java.lang.Long value13, java.lang.String value14, java.lang.String value15, java.util.Date value16, java.util.Date value17, java.util.Date value18, java.util.Map<String,Object> value19, java.lang.Long value20) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.github.ibuildthecloud.dstack.core.model.Instance from) {
		setId(from.getId());
		setName(from.getName());
		setKind(from.getKind());
		setAccountId(from.getAccountId());
		setUuid(from.getUuid());
		setDescription(from.getDescription());
		setRequestedState(from.getRequestedState());
		setState(from.getState());
		setAllocationState(from.getAllocationState());
		setPostComputeState(from.getPostComputeState());
		setImageId(from.getImageId());
		setOfferingId(from.getOfferingId());
		setRequestedOfferingId(from.getRequestedOfferingId());
		setOnCrash(from.getOnCrash());
		setHostname(from.getHostname());
		setCreated(from.getCreated());
		setRemoved(from.getRemoved());
		setRemoveTime(from.getRemoveTime());
		setData(from.getData());
		setZoneId(from.getZoneId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.github.ibuildthecloud.dstack.core.model.Instance> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InstanceRecord
	 */
	public InstanceRecord() {
		super(io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE);
	}

	/**
	 * Create a detached, initialised InstanceRecord
	 */
	public InstanceRecord(java.lang.Long id, java.lang.String name, java.lang.String kind, java.lang.Long accountId, java.lang.String uuid, java.lang.String description, java.lang.String requestedState, java.lang.String state, java.lang.String allocationState, java.lang.String postComputeState, java.lang.Long imageId, java.lang.Long offeringId, java.lang.Long requestedOfferingId, java.lang.String onCrash, java.lang.String hostname, java.util.Date created, java.util.Date removed, java.util.Date removeTime, java.util.Map<String,Object> data, java.lang.Long zoneId) {
		super(io.github.ibuildthecloud.dstack.core.model.tables.InstanceTable.INSTANCE);

		setValue(0, id);
		setValue(1, name);
		setValue(2, kind);
		setValue(3, accountId);
		setValue(4, uuid);
		setValue(5, description);
		setValue(6, requestedState);
		setValue(7, state);
		setValue(8, allocationState);
		setValue(9, postComputeState);
		setValue(10, imageId);
		setValue(11, offeringId);
		setValue(12, requestedOfferingId);
		setValue(13, onCrash);
		setValue(14, hostname);
		setValue(15, created);
		setValue(16, removed);
		setValue(17, removeTime);
		setValue(18, data);
		setValue(19, zoneId);
	}
}
