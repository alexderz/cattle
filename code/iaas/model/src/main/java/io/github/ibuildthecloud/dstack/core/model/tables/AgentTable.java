/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AgentTable extends org.jooq.impl.TableImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord> {

	private static final long serialVersionUID = -640016454;

	/**
	 * The singleton instance of <code>dstack.agent</code>
	 */
	public static final io.github.ibuildthecloud.dstack.core.model.tables.AgentTable AGENT = new io.github.ibuildthecloud.dstack.core.model.tables.AgentTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord> getRecordType() {
		return io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord.class;
	}

	/**
	 * The column <code>dstack.agent.id</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>dstack.agent.name</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>dstack.agent.description</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>dstack.agent.kind</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>dstack.agent.data</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(16777215).asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>dstack.agent.agent_group_id</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, java.lang.Long> AGENT_GROUP_ID = createField("agent_group_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>dstack.agent.state</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>dstack.agent.uri</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, java.lang.String> URI = createField("uri", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>dstack.agent.account_id</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>dstack.agent.created</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>dstack.agent.uuid</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>dstack.agent.removed</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>dstack.agent.managed_config</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, java.lang.Boolean> MANAGED_CONFIG = createField("managed_config", org.jooq.impl.SQLDataType.BIT.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>dstack.agent</code> table reference
	 */
	public AgentTable() {
		this("agent", null);
	}

	/**
	 * Create an aliased <code>dstack.agent</code> table reference
	 */
	public AgentTable(java.lang.String alias) {
		this(alias, io.github.ibuildthecloud.dstack.core.model.tables.AgentTable.AGENT);
	}

	private AgentTable(java.lang.String alias, org.jooq.Table<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord> aliased) {
		this(alias, aliased, null);
	}

	private AgentTable(java.lang.String alias, org.jooq.Table<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.github.ibuildthecloud.dstack.core.model.DstackTable.DSTACK, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, java.lang.Long> getIdentity() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.IDENTITY_AGENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord> getPrimaryKey() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.KEY_AGENT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord>>asList(io.github.ibuildthecloud.dstack.core.model.Keys.KEY_AGENT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord, ?>>asList(io.github.ibuildthecloud.dstack.core.model.Keys.AGENT_IBFK_1, io.github.ibuildthecloud.dstack.core.model.Keys.AGENT_IBFK_2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.github.ibuildthecloud.dstack.core.model.tables.AgentTable as(java.lang.String alias) {
		return new io.github.ibuildthecloud.dstack.core.model.tables.AgentTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.github.ibuildthecloud.dstack.core.model.tables.AgentTable rename(java.lang.String name) {
		return new io.github.ibuildthecloud.dstack.core.model.tables.AgentTable(name, null);
	}
}
