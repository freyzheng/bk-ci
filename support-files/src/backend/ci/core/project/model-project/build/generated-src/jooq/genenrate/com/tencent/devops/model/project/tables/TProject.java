/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.project.tables;


import com.tencent.devops.model.project.DevopsProject;
import com.tencent.devops.model.project.Keys;
import com.tencent.devops.model.project.tables.records.TProjectRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TProject extends TableImpl<TProjectRecord> {

    private static final long serialVersionUID = 145955818;

    /**
     * The reference instance of <code>devops_project.t_project</code>
     */
    public static final TProject T_PROJECT = new TProject();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TProjectRecord> getRecordType() {
        return TProjectRecord.class;
    }

    /**
     * The column <code>devops_project.t_project.id</code>.
     */
    public final TableField<TProjectRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>devops_project.t_project.created_at</code>.
     */
    public final TableField<TProjectRecord, LocalDateTime> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>devops_project.t_project.updated_at</code>.
     */
    public final TableField<TProjectRecord, LocalDateTime> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>devops_project.t_project.deleted_at</code>.
     */
    public final TableField<TProjectRecord, LocalDateTime> DELETED_AT = createField("deleted_at", org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>devops_project.t_project.extra</code>.
     */
    public final TableField<TProjectRecord, String> EXTRA = createField("extra", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>devops_project.t_project.creator</code>.
     */
    public final TableField<TProjectRecord, String> CREATOR = createField("creator", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

    /**
     * The column <code>devops_project.t_project.description</code>.
     */
    public final TableField<TProjectRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>devops_project.t_project.kind</code>.
     */
    public final TableField<TProjectRecord, Integer> KIND = createField("kind", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>devops_project.t_project.cc_app_id</code>.
     */
    public final TableField<TProjectRecord, Long> CC_APP_ID = createField("cc_app_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>devops_project.t_project.cc_app_name</code>.
     */
    public final TableField<TProjectRecord, String> CC_APP_NAME = createField("cc_app_name", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>devops_project.t_project.is_offlined</code>.
     */
    public final TableField<TProjectRecord, Boolean> IS_OFFLINED = createField("is_offlined", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>devops_project.t_project.project_id</code>.
     */
    public final TableField<TProjectRecord, String> PROJECT_ID = createField("project_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>devops_project.t_project.project_name</code>.
     */
    public final TableField<TProjectRecord, String> PROJECT_NAME = createField("project_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_project.t_project.english_name</code>.
     */
    public final TableField<TProjectRecord, String> ENGLISH_NAME = createField("english_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_project.t_project.updator</code>.
     */
    public final TableField<TProjectRecord, String> UPDATOR = createField("updator", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

    /**
     * The column <code>devops_project.t_project.project_type</code>.
     */
    public final TableField<TProjectRecord, Integer> PROJECT_TYPE = createField("project_type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>devops_project.t_project.use_bk</code>.
     */
    public final TableField<TProjectRecord, Boolean> USE_BK = createField("use_bk", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'1'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>devops_project.t_project.deploy_type</code>.
     */
    public final TableField<TProjectRecord, String> DEPLOY_TYPE = createField("deploy_type", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>devops_project.t_project.bg_id</code>.
     */
    public final TableField<TProjectRecord, Long> BG_ID = createField("bg_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>devops_project.t_project.bg_name</code>.
     */
    public final TableField<TProjectRecord, String> BG_NAME = createField("bg_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>devops_project.t_project.dept_id</code>.
     */
    public final TableField<TProjectRecord, Long> DEPT_ID = createField("dept_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>devops_project.t_project.dept_name</code>.
     */
    public final TableField<TProjectRecord, String> DEPT_NAME = createField("dept_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>devops_project.t_project.center_id</code>.
     */
    public final TableField<TProjectRecord, Long> CENTER_ID = createField("center_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>devops_project.t_project.center_name</code>.
     */
    public final TableField<TProjectRecord, String> CENTER_NAME = createField("center_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>devops_project.t_project.data_id</code>.
     */
    public final TableField<TProjectRecord, Long> DATA_ID = createField("data_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>devops_project.t_project.is_secrecy</code>.
     */
    public final TableField<TProjectRecord, Boolean> IS_SECRECY = createField("is_secrecy", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>devops_project.t_project.is_helm_chart_enabled</code>.
     */
    public final TableField<TProjectRecord, Boolean> IS_HELM_CHART_ENABLED = createField("is_helm_chart_enabled", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>devops_project.t_project.approval_status</code>.
     */
    public final TableField<TProjectRecord, Integer> APPROVAL_STATUS = createField("approval_status", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>devops_project.t_project.logo_addr</code>.
     */
    public final TableField<TProjectRecord, String> LOGO_ADDR = createField("logo_addr", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>devops_project.t_project.approver</code>.
     */
    public final TableField<TProjectRecord, String> APPROVER = createField("approver", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

    /**
     * The column <code>devops_project.t_project.remark</code>.
     */
    public final TableField<TProjectRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>devops_project.t_project.approval_time</code>.
     */
    public final TableField<TProjectRecord, LocalDateTime> APPROVAL_TIME = createField("approval_time", org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>devops_project.t_project.creator_bg_name</code>.
     */
    public final TableField<TProjectRecord, String> CREATOR_BG_NAME = createField("creator_bg_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>devops_project.t_project.creator_dept_name</code>.
     */
    public final TableField<TProjectRecord, String> CREATOR_DEPT_NAME = createField("creator_dept_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>devops_project.t_project.creator_center_name</code>.
     */
    public final TableField<TProjectRecord, String> CREATOR_CENTER_NAME = createField("creator_center_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>devops_project.t_project.enabled</code>.
     */
    public final TableField<TProjectRecord, Boolean> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>devops_project.t_project.hybrid_cc_app_id</code>.
     */
    public final TableField<TProjectRecord, Long> HYBRID_CC_APP_ID = createField("hybrid_cc_app_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>devops_project.t_project.enable_external</code>.
     */
    public final TableField<TProjectRecord, Boolean> ENABLE_EXTERNAL = createField("enable_external", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>devops_project.t_project.enable_idc</code>.
     */
    public final TableField<TProjectRecord, Boolean> ENABLE_IDC = createField("enable_idc", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>devops_project.t_project.CHANNEL</code>.
     */
    public final TableField<TProjectRecord, String> CHANNEL = createField("CHANNEL", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("BS", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>devops_project.t_project</code> table reference
     */
    public TProject() {
        this("t_project", null);
    }

    /**
     * Create an aliased <code>devops_project.t_project</code> table reference
     */
    public TProject(String alias) {
        this(alias, T_PROJECT);
    }

    private TProject(String alias, Table<TProjectRecord> aliased) {
        this(alias, aliased, null);
    }

    private TProject(String alias, Table<TProjectRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsProject.DEVOPS_PROJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TProjectRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_PROJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TProjectRecord> getPrimaryKey() {
        return Keys.KEY_T_PROJECT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TProjectRecord>> getKeys() {
        return Arrays.<UniqueKey<TProjectRecord>>asList(Keys.KEY_T_PROJECT_PRIMARY, Keys.KEY_T_PROJECT_PROJECT_ID, Keys.KEY_T_PROJECT_PROJECT_NAME, Keys.KEY_T_PROJECT_ENGLISH_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProject as(String alias) {
        return new TProject(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TProject rename(String name) {
        return new TProject(name, null);
    }
}