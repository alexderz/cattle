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
@javax.persistence.Table(name = "process_instance", schema = "dstack")
public class ProcessInstanceRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.ProcessInstanceRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record13<java.lang.Long, java.util.Date, java.util.Date, java.util.Map<String,Object>, java.util.Map<String,Object>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, io.github.ibuildthecloud.dstack.core.model.ProcessInstance {

	private static final long serialVersionUID = 1719293508;

	/**
	 * Setter for <code>dstack.process_instance.id</code>.
	 */
	@Override
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.process_instance.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.process_instance.start_time</code>.
	 */
	@Override
	public void setStartTime(java.util.Date value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.process_instance.start_time</code>.
	 */
	@javax.persistence.Column(name = "start_time")
	@Override
	public java.util.Date getStartTime() {
		return (java.util.Date) getValue(1);
	}

	/**
	 * Setter for <code>dstack.process_instance.end_time</code>.
	 */
	@Override
	public void setEndTime(java.util.Date value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.process_instance.end_time</code>.
	 */
	@javax.persistence.Column(name = "end_time")
	@Override
	public java.util.Date getEndTime() {
		return (java.util.Date) getValue(2);
	}

	/**
	 * Setter for <code>dstack.process_instance.log</code>.
	 */
	@Override
	public void setLog(java.util.Map<String,Object> value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.process_instance.log</code>.
	 */
	@javax.persistence.Column(name = "log", length = 16777215)
	@Override
	public java.util.Map<String,Object> getLog() {
		return (java.util.Map<String,Object>) getValue(3);
	}

	/**
	 * Setter for <code>dstack.process_instance.data</code>.
	 */
	@Override
	public void setData(java.util.Map<String,Object> value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.process_instance.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	@Override
	public java.util.Map<String,Object> getData() {
		return (java.util.Map<String,Object>) getValue(4);
	}

	/**
	 * Setter for <code>dstack.process_instance.process_name</code>.
	 */
	@Override
	public void setProcessName(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dstack.process_instance.process_name</code>.
	 */
	@javax.persistence.Column(name = "process_name", length = 128)
	@Override
	public java.lang.String getProcessName() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>dstack.process_instance.resource_type</code>.
	 */
	@Override
	public void setResourceType(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dstack.process_instance.resource_type</code>.
	 */
	@javax.persistence.Column(name = "resource_type", length = 128)
	@Override
	public java.lang.String getResourceType() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>dstack.process_instance.resource_id</code>.
	 */
	@Override
	public void setResourceId(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dstack.process_instance.resource_id</code>.
	 */
	@javax.persistence.Column(name = "resource_id", length = 128)
	@Override
	public java.lang.String getResourceId() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>dstack.process_instance.result</code>.
	 */
	@Override
	public void setResult(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dstack.process_instance.result</code>.
	 */
	@javax.persistence.Column(name = "result", length = 128)
	@Override
	public java.lang.String getResult() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>dstack.process_instance.exit_reason</code>.
	 */
	@Override
	public void setExitReason(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dstack.process_instance.exit_reason</code>.
	 */
	@javax.persistence.Column(name = "exit_reason", length = 128)
	@Override
	public java.lang.String getExitReason() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>dstack.process_instance.phase</code>.
	 */
	@Override
	public void setPhase(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>dstack.process_instance.phase</code>.
	 */
	@javax.persistence.Column(name = "phase", length = 128)
	@Override
	public java.lang.String getPhase() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>dstack.process_instance.start_process_server_id</code>.
	 */
	@Override
	public void setStartProcessServerId(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>dstack.process_instance.start_process_server_id</code>.
	 */
	@javax.persistence.Column(name = "start_process_server_id", length = 128)
	@Override
	public java.lang.String getStartProcessServerId() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>dstack.process_instance.running_process_server_id</code>.
	 */
	@Override
	public void setRunningProcessServerId(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>dstack.process_instance.running_process_server_id</code>.
	 */
	@javax.persistence.Column(name = "running_process_server_id", length = 128)
	@Override
	public java.lang.String getRunningProcessServerId() {
		return (java.lang.String) getValue(12);
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
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.Long, java.util.Date, java.util.Date, java.util.Map<String,Object>, java.util.Map<String,Object>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.Long, java.util.Date, java.util.Date, java.util.Map<String,Object>, java.util.Map<String,Object>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Date> field2() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE.START_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Date> field3() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE.END_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Map<String,Object>> field4() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE.LOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Map<String,Object>> field5() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE.PROCESS_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE.RESOURCE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE.RESOURCE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE.RESULT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE.EXIT_REASON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE.PHASE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE.START_PROCESS_SERVER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE.RUNNING_PROCESS_SERVER_ID;
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
	public java.util.Date value2() {
		return getStartTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Date value3() {
		return getEndTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Map<String,Object> value4() {
		return getLog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Map<String,Object> value5() {
		return getData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getProcessName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getResourceType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getResourceId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getResult();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getExitReason();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getPhase();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getStartProcessServerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getRunningProcessServerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcessInstanceRecord value1(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcessInstanceRecord value2(java.util.Date value) {
		setStartTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcessInstanceRecord value3(java.util.Date value) {
		setEndTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcessInstanceRecord value4(java.util.Map<String,Object> value) {
		setLog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcessInstanceRecord value5(java.util.Map<String,Object> value) {
		setData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcessInstanceRecord value6(java.lang.String value) {
		setProcessName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcessInstanceRecord value7(java.lang.String value) {
		setResourceType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcessInstanceRecord value8(java.lang.String value) {
		setResourceId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcessInstanceRecord value9(java.lang.String value) {
		setResult(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcessInstanceRecord value10(java.lang.String value) {
		setExitReason(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcessInstanceRecord value11(java.lang.String value) {
		setPhase(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcessInstanceRecord value12(java.lang.String value) {
		setStartProcessServerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcessInstanceRecord value13(java.lang.String value) {
		setRunningProcessServerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcessInstanceRecord values(java.lang.Long value1, java.util.Date value2, java.util.Date value3, java.util.Map<String,Object> value4, java.util.Map<String,Object> value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.String value10, java.lang.String value11, java.lang.String value12, java.lang.String value13) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.github.ibuildthecloud.dstack.core.model.ProcessInstance from) {
		setId(from.getId());
		setStartTime(from.getStartTime());
		setEndTime(from.getEndTime());
		setLog(from.getLog());
		setData(from.getData());
		setProcessName(from.getProcessName());
		setResourceType(from.getResourceType());
		setResourceId(from.getResourceId());
		setResult(from.getResult());
		setExitReason(from.getExitReason());
		setPhase(from.getPhase());
		setStartProcessServerId(from.getStartProcessServerId());
		setRunningProcessServerId(from.getRunningProcessServerId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.github.ibuildthecloud.dstack.core.model.ProcessInstance> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProcessInstanceRecord
	 */
	public ProcessInstanceRecord() {
		super(io.github.ibuildthecloud.dstack.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE);
	}

	/**
	 * Create a detached, initialised ProcessInstanceRecord
	 */
	public ProcessInstanceRecord(java.lang.Long id, java.util.Date startTime, java.util.Date endTime, java.util.Map<String,Object> log, java.util.Map<String,Object> data, java.lang.String processName, java.lang.String resourceType, java.lang.String resourceId, java.lang.String result, java.lang.String exitReason, java.lang.String phase, java.lang.String startProcessServerId, java.lang.String runningProcessServerId) {
		super(io.github.ibuildthecloud.dstack.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE);

		setValue(0, id);
		setValue(1, startTime);
		setValue(2, endTime);
		setValue(3, log);
		setValue(4, data);
		setValue(5, processName);
		setValue(6, resourceType);
		setValue(7, resourceId);
		setValue(8, result);
		setValue(9, exitReason);
		setValue(10, phase);
		setValue(11, startProcessServerId);
		setValue(12, runningProcessServerId);
	}
}
