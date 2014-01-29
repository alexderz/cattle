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
public class CoreChangelogTable extends org.jooq.impl.TableImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord> {

	private static final long serialVersionUID = -1658553359;

	/**
	 * The singleton instance of <code>dstack.core_changelog</code>
	 */
	public static final io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable CORE_CHANGELOG = new io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord> getRecordType() {
		return io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord.class;
	}

	/**
	 * The column <code>dstack.core_changelog.ID</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord, java.lang.String> ID = createField("ID", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>dstack.core_changelog.AUTHOR</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord, java.lang.String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>dstack.core_changelog.FILENAME</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord, java.lang.String> FILENAME = createField("FILENAME", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>dstack.core_changelog.DATEEXECUTED</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord, java.util.Date> DATEEXECUTED = createField("DATEEXECUTED", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>dstack.core_changelog.ORDEREXECUTED</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord, java.lang.Integer> ORDEREXECUTED = createField("ORDEREXECUTED", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>dstack.core_changelog.EXECTYPE</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord, java.lang.String> EXECTYPE = createField("EXECTYPE", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

	/**
	 * The column <code>dstack.core_changelog.MD5SUM</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord, java.lang.String> MD5SUM = createField("MD5SUM", org.jooq.impl.SQLDataType.VARCHAR.length(35), this, "");

	/**
	 * The column <code>dstack.core_changelog.DESCRIPTION</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord, java.lang.String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>dstack.core_changelog.COMMENTS</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord, java.lang.String> COMMENTS = createField("COMMENTS", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>dstack.core_changelog.TAG</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord, java.lang.String> TAG = createField("TAG", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>dstack.core_changelog.LIQUIBASE</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord, java.lang.String> LIQUIBASE = createField("LIQUIBASE", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * Create a <code>dstack.core_changelog</code> table reference
	 */
	public CoreChangelogTable() {
		this("core_changelog", null);
	}

	/**
	 * Create an aliased <code>dstack.core_changelog</code> table reference
	 */
	public CoreChangelogTable(java.lang.String alias) {
		this(alias, io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable.CORE_CHANGELOG);
	}

	private CoreChangelogTable(java.lang.String alias, org.jooq.Table<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord> aliased) {
		this(alias, aliased, null);
	}

	private CoreChangelogTable(java.lang.String alias, org.jooq.Table<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.github.ibuildthecloud.dstack.core.model.DstackTable.DSTACK, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable as(java.lang.String alias) {
		return new io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable rename(java.lang.String name) {
		return new io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable(name, null);
	}
}
