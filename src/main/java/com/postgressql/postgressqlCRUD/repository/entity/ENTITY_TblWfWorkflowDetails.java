package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "TBL_WF_WORKFLOW_DETAILS", schema = "dbo", catalog = "master")
public class ENTITY_TblWfWorkflowDetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RECID", nullable = false, precision = 0)
    private int recid;
    @Basic
    @Column(name = "WORKFLOWID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int workflowid;
    @Basic
    @Column(name = "SEQUENCE", nullable = false)
    private int sequence;
    @Basic
    @Column(name = "STAGENAME1", nullable = false, length = 250)
    private String stagename1;
    @Basic
    @Column(name = "STAGENAME2", nullable = true, length = 250)
    private String stagename2;
    @Basic
    @Column(name = "STAGENAME3", nullable = true, length = 250)
    private String stagename3;
    @Basic
    @Column(name = "MODULEID", nullable = false, precision = 0,insertable=false, updatable=false)
    private int moduleid;
    @Basic
    @Column(name = "ROLEID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int roleid;
    @Basic
    @Column(name = "RULEID", nullable = true, precision = 0)
    private Integer ruleid;
    @Basic
    @Column(name = "RETENTIONDAYS", nullable = true)
    private Integer retentiondays;
    @Basic
    @Column(name = "AUTOMATICFLAG", nullable = false)
    private boolean automaticflag;
    @Basic
    @Column(name = "VB_STAGEDECISION_FORSUBMIT", nullable = true, precision = 0)
    private Integer vbStagedecisionForsubmit;
    @Basic
    @Column(name = "MANDATORY", nullable = false)
    private boolean mandatory;
    @Basic
    @Column(name = "ALLOWREJECT", nullable = false)
    private boolean allowreject;
    @Basic
    @Column(name = "ALLOWREVIEW", nullable = false)
    private boolean allowreview;
    @Basic
    @Column(name = "ALLOWPRINT", nullable = false)
    private boolean allowprint;
    @Basic
    @Column(name = "ALLOWRETURN", nullable = false)
    private boolean allowreturn;
    @Basic
    @Column(name = "ALLOWSUBMIT", nullable = false)
    private boolean allowsubmit;
    @Basic
    @Column(name = "EXECUTECHILDWF", nullable = false)
    private boolean executechildwf;
    @Basic
    @Column(name = "CHILDWORKFLOWID", nullable = true, precision = 0)
    private Integer childworkflowid;
    @Basic
    @Column(name = "OTHDESC1", nullable = true, length = 100)
    private String othdesc1;
    @Basic
    @Column(name = "OTHDESC2", nullable = true, length = 100)
    private String othdesc2;
    @Basic
    @Column(name = "OTHDESC3", nullable = true, length = 100)
    private String othdesc3;
    @Basic
    @Column(name = "OTHDESC4", nullable = true, length = 100)
    private String othdesc4;
    @Basic
    @Column(name = "MAKER", nullable = false, length = 50)
    private String maker;
    @Basic
    @Column(name = "MAKEDATE", nullable = false)
    private Date makedate;
    @Basic
    @Column(name = "CHECKER", nullable = true, length = 50)
    private String checker;
    @Basic
    @Column(name = "CHECKDATE", nullable = true)
    private Date checkdate;
    @Basic
    @Column(name = "UPDATEBY", nullable = true, length = 50)
    private String updateby;
    @Basic
    @Column(name = "UPDATEDATE", nullable = true)
    private Date updatedate;
    @Basic
    @Column(name = "RECSTATUS", nullable = false)
    private boolean recstatus;
    @OneToMany(mappedBy = "tblWfWorkflowDetailsByCurrentwfdtlrecid")
    private Collection<ENTITY_TblWfWorkflowChecklist> tblWfWorkflowChecklistsByRecid;
    @ManyToOne
    @JoinColumn(name = "WORKFLOWID", referencedColumnName = "WORKFLOWID", nullable = false)
    private ENTITY_TblWfWorkflowMaster tblWfWorkflowMasterByWorkflowid;
    @ManyToOne
    @JoinColumn(name = "MODULEID", referencedColumnName = "MODULEID", nullable = false)
    private ENTITY_TblCnfgMstModules tblCnfgMstModulesByModuleid;
    @ManyToOne
    @JoinColumn(name = "ROLEID", referencedColumnName = "ROLEID", nullable = false)
    private ENTITY_TblUmRoleMaster tblUmRoleMasterByRoleid;
    @OneToMany(mappedBy = "tblWfWorkflowDetailsByCurrentwfdtlrecid")
    private Collection<ENTITY_TblWfWorkflowDocuments> tblWfWorkflowDocumentsByRecid;
    @OneToMany(mappedBy = "tblWfWorkflowDetailsByCurrentwfdtlrecid")
    private Collection<ENTITY_TblWfWorkflowNotifications> tblWfWorkflowNotificationsByRecid;
    @OneToMany(mappedBy = "tblWfWorkflowDetailsByCurrentwfdtlrecid")
    private Collection<ENTITY_TblWfWorkflowProcesses> tblWfWorkflowProcessesByRecid;
    @OneToMany(mappedBy = "tblWfWorkflowDetailsByCurrentwfdtlrecid")
    private Collection<ENTITY_TblWfWorkflowReturnstages> tblWfWorkflowReturnstagesByRecid;
    @OneToMany(mappedBy = "tblWfWorkflowDetailsByCurrentwfdtlrecid")
    private Collection<ENTITY_TblWfWorkflowStageautocomplete> tblWfWorkflowStageautocompletesByRecid;
    @OneToMany(mappedBy = "tblWfWorkflowDetailsByCurrentwfdtlrecid")
    private Collection<ENTITY_TblWfWorkflowTemplates> tblWfWorkflowTemplatesByRecid;
    @OneToMany(mappedBy = "tblWfWorkflowDetailsByCurrentwfdtlrecid")
    private Collection<ENTITY_TblWfWorkflowValidations> tblWfWorkflowValidationsByRecid;
    @OneToMany(mappedBy = "tblWfWorkflowDetailsByCurrentwfdtlrecid")
    private Collection<ENTITY_TblWfWorkflowWarnings> tblWfWorkflowWarningsByRecid;

    public int getRecid() {
        return recid;
    }

    public void setRecid(int recid) {
        this.recid = recid;
    }

    public int getWorkflowid() {
        return workflowid;
    }

    public void setWorkflowid(int workflowid) {
        this.workflowid = workflowid;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getStagename1() {
        return stagename1;
    }

    public void setStagename1(String stagename1) {
        this.stagename1 = stagename1;
    }

    public String getStagename2() {
        return stagename2;
    }

    public void setStagename2(String stagename2) {
        this.stagename2 = stagename2;
    }

    public String getStagename3() {
        return stagename3;
    }

    public void setStagename3(String stagename3) {
        this.stagename3 = stagename3;
    }

    public int getModuleid() {
        return moduleid;
    }

    public void setModuleid(int moduleid) {
        this.moduleid = moduleid;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public Integer getRuleid() {
        return ruleid;
    }

    public void setRuleid(Integer ruleid) {
        this.ruleid = ruleid;
    }

    public Integer getRetentiondays() {
        return retentiondays;
    }

    public void setRetentiondays(Integer retentiondays) {
        this.retentiondays = retentiondays;
    }

    public boolean isAutomaticflag() {
        return automaticflag;
    }

    public void setAutomaticflag(boolean automaticflag) {
        this.automaticflag = automaticflag;
    }

    public Integer getVbStagedecisionForsubmit() {
        return vbStagedecisionForsubmit;
    }

    public void setVbStagedecisionForsubmit(Integer vbStagedecisionForsubmit) {
        this.vbStagedecisionForsubmit = vbStagedecisionForsubmit;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public boolean isAllowreject() {
        return allowreject;
    }

    public void setAllowreject(boolean allowreject) {
        this.allowreject = allowreject;
    }

    public boolean isAllowreview() {
        return allowreview;
    }

    public void setAllowreview(boolean allowreview) {
        this.allowreview = allowreview;
    }

    public boolean isAllowprint() {
        return allowprint;
    }

    public void setAllowprint(boolean allowprint) {
        this.allowprint = allowprint;
    }

    public boolean isAllowreturn() {
        return allowreturn;
    }

    public void setAllowreturn(boolean allowreturn) {
        this.allowreturn = allowreturn;
    }

    public boolean isAllowsubmit() {
        return allowsubmit;
    }

    public void setAllowsubmit(boolean allowsubmit) {
        this.allowsubmit = allowsubmit;
    }

    public boolean isExecutechildwf() {
        return executechildwf;
    }

    public void setExecutechildwf(boolean executechildwf) {
        this.executechildwf = executechildwf;
    }

    public Integer getChildworkflowid() {
        return childworkflowid;
    }

    public void setChildworkflowid(Integer childworkflowid) {
        this.childworkflowid = childworkflowid;
    }

    public String getOthdesc1() {
        return othdesc1;
    }

    public void setOthdesc1(String othdesc1) {
        this.othdesc1 = othdesc1;
    }

    public String getOthdesc2() {
        return othdesc2;
    }

    public void setOthdesc2(String othdesc2) {
        this.othdesc2 = othdesc2;
    }

    public String getOthdesc3() {
        return othdesc3;
    }

    public void setOthdesc3(String othdesc3) {
        this.othdesc3 = othdesc3;
    }

    public String getOthdesc4() {
        return othdesc4;
    }

    public void setOthdesc4(String othdesc4) {
        this.othdesc4 = othdesc4;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public boolean isRecstatus() {
        return recstatus;
    }

    public void setRecstatus(boolean recstatus) {
        this.recstatus = recstatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ENTITY_TblWfWorkflowDetails that = (ENTITY_TblWfWorkflowDetails) o;

        if (recid != that.recid) return false;
        if (workflowid != that.workflowid) return false;
        if (sequence != that.sequence) return false;
        if (moduleid != that.moduleid) return false;
        if (roleid != that.roleid) return false;
        if (automaticflag != that.automaticflag) return false;
        if (mandatory != that.mandatory) return false;
        if (allowreject != that.allowreject) return false;
        if (allowreview != that.allowreview) return false;
        if (allowprint != that.allowprint) return false;
        if (allowreturn != that.allowreturn) return false;
        if (allowsubmit != that.allowsubmit) return false;
        if (executechildwf != that.executechildwf) return false;
        if (recstatus != that.recstatus) return false;
        if (stagename1 != null ? !stagename1.equals(that.stagename1) : that.stagename1 != null) return false;
        if (stagename2 != null ? !stagename2.equals(that.stagename2) : that.stagename2 != null) return false;
        if (stagename3 != null ? !stagename3.equals(that.stagename3) : that.stagename3 != null) return false;
        if (ruleid != null ? !ruleid.equals(that.ruleid) : that.ruleid != null) return false;
        if (retentiondays != null ? !retentiondays.equals(that.retentiondays) : that.retentiondays != null)
            return false;
        if (vbStagedecisionForsubmit != null ? !vbStagedecisionForsubmit.equals(that.vbStagedecisionForsubmit) : that.vbStagedecisionForsubmit != null)
            return false;
        if (childworkflowid != null ? !childworkflowid.equals(that.childworkflowid) : that.childworkflowid != null)
            return false;
        if (othdesc1 != null ? !othdesc1.equals(that.othdesc1) : that.othdesc1 != null) return false;
        if (othdesc2 != null ? !othdesc2.equals(that.othdesc2) : that.othdesc2 != null) return false;
        if (othdesc3 != null ? !othdesc3.equals(that.othdesc3) : that.othdesc3 != null) return false;
        if (othdesc4 != null ? !othdesc4.equals(that.othdesc4) : that.othdesc4 != null) return false;
        if (maker != null ? !maker.equals(that.maker) : that.maker != null) return false;
        if (makedate != null ? !makedate.equals(that.makedate) : that.makedate != null) return false;
        if (checker != null ? !checker.equals(that.checker) : that.checker != null) return false;
        if (checkdate != null ? !checkdate.equals(that.checkdate) : that.checkdate != null) return false;
        if (updateby != null ? !updateby.equals(that.updateby) : that.updateby != null) return false;
        if (updatedate != null ? !updatedate.equals(that.updatedate) : that.updatedate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recid;
        result = 31 * result + workflowid;
        result = 31 * result + sequence;
        result = 31 * result + (stagename1 != null ? stagename1.hashCode() : 0);
        result = 31 * result + (stagename2 != null ? stagename2.hashCode() : 0);
        result = 31 * result + (stagename3 != null ? stagename3.hashCode() : 0);
        result = 31 * result + moduleid;
        result = 31 * result + roleid;
        result = 31 * result + (ruleid != null ? ruleid.hashCode() : 0);
        result = 31 * result + (retentiondays != null ? retentiondays.hashCode() : 0);
        result = 31 * result + (automaticflag ? 1 : 0);
        result = 31 * result + (vbStagedecisionForsubmit != null ? vbStagedecisionForsubmit.hashCode() : 0);
        result = 31 * result + (mandatory ? 1 : 0);
        result = 31 * result + (allowreject ? 1 : 0);
        result = 31 * result + (allowreview ? 1 : 0);
        result = 31 * result + (allowprint ? 1 : 0);
        result = 31 * result + (allowreturn ? 1 : 0);
        result = 31 * result + (allowsubmit ? 1 : 0);
        result = 31 * result + (executechildwf ? 1 : 0);
        result = 31 * result + (childworkflowid != null ? childworkflowid.hashCode() : 0);
        result = 31 * result + (othdesc1 != null ? othdesc1.hashCode() : 0);
        result = 31 * result + (othdesc2 != null ? othdesc2.hashCode() : 0);
        result = 31 * result + (othdesc3 != null ? othdesc3.hashCode() : 0);
        result = 31 * result + (othdesc4 != null ? othdesc4.hashCode() : 0);
        result = 31 * result + (maker != null ? maker.hashCode() : 0);
        result = 31 * result + (makedate != null ? makedate.hashCode() : 0);
        result = 31 * result + (checker != null ? checker.hashCode() : 0);
        result = 31 * result + (checkdate != null ? checkdate.hashCode() : 0);
        result = 31 * result + (updateby != null ? updateby.hashCode() : 0);
        result = 31 * result + (updatedate != null ? updatedate.hashCode() : 0);
        result = 31 * result + (recstatus ? 1 : 0);
        return result;
    }

    public Collection<ENTITY_TblWfWorkflowChecklist> getTblWfWorkflowChecklistsByRecid() {
        return tblWfWorkflowChecklistsByRecid;
    }

    public void setTblWfWorkflowChecklistsByRecid(Collection<ENTITY_TblWfWorkflowChecklist> tblWfWorkflowChecklistsByRecid) {
        this.tblWfWorkflowChecklistsByRecid = tblWfWorkflowChecklistsByRecid;
    }

    public ENTITY_TblWfWorkflowMaster getTblWfWorkflowMasterByWorkflowid() {
        return tblWfWorkflowMasterByWorkflowid;
    }

    public void setTblWfWorkflowMasterByWorkflowid(ENTITY_TblWfWorkflowMaster tblWfWorkflowMasterByWorkflowid) {
        this.tblWfWorkflowMasterByWorkflowid = tblWfWorkflowMasterByWorkflowid;
    }

    public ENTITY_TblCnfgMstModules getTblCnfgMstModulesByModuleid() {
        return tblCnfgMstModulesByModuleid;
    }

    public void setTblCnfgMstModulesByModuleid(ENTITY_TblCnfgMstModules tblCnfgMstModulesByModuleid) {
        this.tblCnfgMstModulesByModuleid = tblCnfgMstModulesByModuleid;
    }

    public ENTITY_TblUmRoleMaster getTblUmRoleMasterByRoleid() {
        return tblUmRoleMasterByRoleid;
    }

    public void setTblUmRoleMasterByRoleid(ENTITY_TblUmRoleMaster tblUmRoleMasterByRoleid) {
        this.tblUmRoleMasterByRoleid = tblUmRoleMasterByRoleid;
    }

    public Collection<ENTITY_TblWfWorkflowDocuments> getTblWfWorkflowDocumentsByRecid() {
        return tblWfWorkflowDocumentsByRecid;
    }

    public void setTblWfWorkflowDocumentsByRecid(Collection<ENTITY_TblWfWorkflowDocuments> tblWfWorkflowDocumentsByRecid) {
        this.tblWfWorkflowDocumentsByRecid = tblWfWorkflowDocumentsByRecid;
    }

    public Collection<ENTITY_TblWfWorkflowNotifications> getTblWfWorkflowNotificationsByRecid() {
        return tblWfWorkflowNotificationsByRecid;
    }

    public void setTblWfWorkflowNotificationsByRecid(Collection<ENTITY_TblWfWorkflowNotifications> tblWfWorkflowNotificationsByRecid) {
        this.tblWfWorkflowNotificationsByRecid = tblWfWorkflowNotificationsByRecid;
    }

    public Collection<ENTITY_TblWfWorkflowProcesses> getTblWfWorkflowProcessesByRecid() {
        return tblWfWorkflowProcessesByRecid;
    }

    public void setTblWfWorkflowProcessesByRecid(Collection<ENTITY_TblWfWorkflowProcesses> tblWfWorkflowProcessesByRecid) {
        this.tblWfWorkflowProcessesByRecid = tblWfWorkflowProcessesByRecid;
    }

    public Collection<ENTITY_TblWfWorkflowReturnstages> getTblWfWorkflowReturnstagesByRecid() {
        return tblWfWorkflowReturnstagesByRecid;
    }

    public void setTblWfWorkflowReturnstagesByRecid(Collection<ENTITY_TblWfWorkflowReturnstages> tblWfWorkflowReturnstagesByRecid) {
        this.tblWfWorkflowReturnstagesByRecid = tblWfWorkflowReturnstagesByRecid;
    }

    public Collection<ENTITY_TblWfWorkflowStageautocomplete> getTblWfWorkflowStageautocompletesByRecid() {
        return tblWfWorkflowStageautocompletesByRecid;
    }

    public void setTblWfWorkflowStageautocompletesByRecid(Collection<ENTITY_TblWfWorkflowStageautocomplete> tblWfWorkflowStageautocompletesByRecid) {
        this.tblWfWorkflowStageautocompletesByRecid = tblWfWorkflowStageautocompletesByRecid;
    }

    public Collection<ENTITY_TblWfWorkflowTemplates> getTblWfWorkflowTemplatesByRecid() {
        return tblWfWorkflowTemplatesByRecid;
    }

    public void setTblWfWorkflowTemplatesByRecid(Collection<ENTITY_TblWfWorkflowTemplates> tblWfWorkflowTemplatesByRecid) {
        this.tblWfWorkflowTemplatesByRecid = tblWfWorkflowTemplatesByRecid;
    }

    public Collection<ENTITY_TblWfWorkflowValidations> getTblWfWorkflowValidationsByRecid() {
        return tblWfWorkflowValidationsByRecid;
    }

    public void setTblWfWorkflowValidationsByRecid(Collection<ENTITY_TblWfWorkflowValidations> tblWfWorkflowValidationsByRecid) {
        this.tblWfWorkflowValidationsByRecid = tblWfWorkflowValidationsByRecid;
    }

    public Collection<ENTITY_TblWfWorkflowWarnings> getTblWfWorkflowWarningsByRecid() {
        return tblWfWorkflowWarningsByRecid;
    }

    public void setTblWfWorkflowWarningsByRecid(Collection<ENTITY_TblWfWorkflowWarnings> tblWfWorkflowWarningsByRecid) {
        this.tblWfWorkflowWarningsByRecid = tblWfWorkflowWarningsByRecid;
    }
}
