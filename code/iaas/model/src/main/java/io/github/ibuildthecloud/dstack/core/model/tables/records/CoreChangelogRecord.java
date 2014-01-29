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
@javax.persistence.Table(name = "core_changelog", schema = "dstack")
public class CoreChangelogRecord extends org.jooq.impl.TableRecordImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.CoreChangelogRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record11<java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String>, io.github.ibuildthecloud.dstack.core.model.CoreChangelog {

	private static final long serialVersionUID = 1970815174;

	/**
	 * Setter for <code>dstack.core_changelog.ID</code>.
	 */
	@Override
	public void setId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.core_changelog.ID</code>.
	 */
	@javax.persistence.Column(name = "ID", nullable = false, length = 255)
	@Override
	public java.lang.String getId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>dstack.core_changelog.AUTHOR</code>.
	 */
	@Override
	public void setAuthor(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.core_changelog.AUTHOR</code>.
	 */
	@javax.persistence.Column(name = "AUTHOR", nullable = false, length = 255)
	@Override
	public java.lang.String getAuthor() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dstack.core_changelog.FILENAME</code>.
	 */
	@Override
	public void setFilename(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.core_changelog.FILENAME</code>.
	 */
	@javax.persistence.Column(name = "FILENAME", nullable = false, length = 255)
	@Override
	public java.lang.String getFilename() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dstack.core_changelog.DATEEXECUTED</code>.
	 */
	@Override
	public void setDateexecuted(java.util.Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.core_changelog.DATEEXECUTED</code>.
	 */
	@javax.persistence.Column(name = "DATEEXECUTED", nullable = false)
	@Override
	public java.util.Date getDateexecuted() {
		return (java.util.Date) getValue(3);
	}

	/**
	 * Setter for <code>dstack.core_changelog.ORDEREXECUTED</code>.
	 */
	@Override
	public void setOrderexecuted(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.core_changelog.ORDEREXECUTED</code>.
	 */
	@javax.persistence.Column(name = "ORDEREXECUTED", nullable = false, precision = 10)
	@Override
	public java.lang.Integer getOrderexecuted() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>dstack.core_changelog.EXECTYPE</code>.
	 */
	@Override
	public void setExectype(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dstack.core_changelog.EXECTYPE</code>.
	 */
	@javax.persistence.Column(name = "EXECTYPE", nullable = false, length = 10)
	@Override
	public java.lang.String getExectype() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>dstack.core_changelog.MD5SUM</code>.
	 */
	@Override
	public void setMd5sum(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dstack.core_changelog.MD5SUM</code>.
	 */
	@javax.persistence.Column(name = "MD5SUM", length = 35)
	@Override
	public java.lang.String getMd5sum() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>dstack.core_changelog.DESCRIPTION</code>.
	 */
	@Override
	public void setDescription(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dstack.core_changelog.DESCRIPTION</code>.
	 */
	@javax.persistence.Column(name = "DESCRIPTION", length = 255)
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>dstack.core_changelog.COMMENTS</code>.
	 */
	@Override
	public void setComments(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dstack.core_changelog.COMMENTS</code>.
	 */
	@javax.persistence.Column(name = "COMMENTS", length = 255)
	@Override
	public java.lang.String getComments() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>dstack.core_changelog.TAG</code>.
	 */
	@Override
	public void setTag(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dstack.core_changelog.TAG</code>.
	 */
	@javax.persistence.Column(name = "TAG", length = 255)
	@Override
	public java.lang.String getTag() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>dstack.core_changelog.LIQUIBASE</code>.
	 */
	@Override
	public void setLiquibase(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>dstack.core_changelog.LIQUIBASE</code>.
	 */
	@javax.persistence.Column(name = "LIQUIBASE", length = 20)
	@Override
	public java.lang.String getLiquibase() {
		return (java.lang.String) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable.CORE_CHANGELOG.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable.CORE_CHANGELOG.AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable.CORE_CHANGELOG.FILENAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Date> field4() {
		return io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable.CORE_CHANGELOG.DATEEXECUTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable.CORE_CHANGELOG.ORDEREXECUTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable.CORE_CHANGELOG.EXECTYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable.CORE_CHANGELOG.MD5SUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable.CORE_CHANGELOG.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable.CORE_CHANGELOG.COMMENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable.CORE_CHANGELOG.TAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable.CORE_CHANGELOG.LIQUIBASE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getAuthor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getFilename();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Date value4() {
		return getDateexecuted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getOrderexecuted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getExectype();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getMd5sum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getComments();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getTag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getLiquibase();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CoreChangelogRecord value1(java.lang.String value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CoreChangelogRecord value2(java.lang.String value) {
		setAuthor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CoreChangelogRecord value3(java.lang.String value) {
		setFilename(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CoreChangelogRecord value4(java.util.Date value) {
		setDateexecuted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CoreChangelogRecord value5(java.lang.Integer value) {
		setOrderexecuted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CoreChangelogRecord value6(java.lang.String value) {
		setExectype(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CoreChangelogRecord value7(java.lang.String value) {
		setMd5sum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CoreChangelogRecord value8(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CoreChangelogRecord value9(java.lang.String value) {
		setComments(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CoreChangelogRecord value10(java.lang.String value) {
		setTag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CoreChangelogRecord value11(java.lang.String value) {
		setLiquibase(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CoreChangelogRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.util.Date value4, java.lang.Integer value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.String value10, java.lang.String value11) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.github.ibuildthecloud.dstack.core.model.CoreChangelog from) {
		setId(from.getId());
		setAuthor(from.getAuthor());
		setFilename(from.getFilename());
		setDateexecuted(from.getDateexecuted());
		setOrderexecuted(from.getOrderexecuted());
		setExectype(from.getExectype());
		setMd5sum(from.getMd5sum());
		setDescription(from.getDescription());
		setComments(from.getComments());
		setTag(from.getTag());
		setLiquibase(from.getLiquibase());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.github.ibuildthecloud.dstack.core.model.CoreChangelog> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CoreChangelogRecord
	 */
	public CoreChangelogRecord() {
		super(io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable.CORE_CHANGELOG);
	}

	/**
	 * Create a detached, initialised CoreChangelogRecord
	 */
	public CoreChangelogRecord(java.lang.String id, java.lang.String author, java.lang.String filename, java.util.Date dateexecuted, java.lang.Integer orderexecuted, java.lang.String exectype, java.lang.String md5sum, java.lang.String description, java.lang.String comments, java.lang.String tag, java.lang.String liquibase) {
		super(io.github.ibuildthecloud.dstack.core.model.tables.CoreChangelogTable.CORE_CHANGELOG);

		setValue(0, id);
		setValue(1, author);
		setValue(2, filename);
		setValue(3, dateexecuted);
		setValue(4, orderexecuted);
		setValue(5, exectype);
		setValue(6, md5sum);
		setValue(7, description);
		setValue(8, comments);
		setValue(9, tag);
		setValue(10, liquibase);
	}
}
