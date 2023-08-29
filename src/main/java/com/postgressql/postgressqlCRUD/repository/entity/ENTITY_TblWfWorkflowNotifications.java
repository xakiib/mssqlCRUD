package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TBL_WF_WORKFLOW_NOTIFICATIONS", schema = "dbo", catalog = "master")
public class ENTITY_TblWfWorkflowNotifications {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RECID", nullable = false, precision = 0)
    private int recid;
    @Basic
    @Column(name = "WORKFLOWID", nullable = false, precision = 0)
    private int workflowid;
    @Basic
    @Column(name = "CURRENTWFDTLRECID", nullable = true, precision = 0, insertable=false, updatable=false)
    private Integer currentwfdtlrecid;
    @Basic
    @Column(name = "RULEID", nullable = true, precision = 0)
    private Integer ruleid;
    @Basic
    @Column(name = "NOTIFICATIONID", nullable = true, precision = 0, insertable=false, updatable=false)
    private Integer notificationid;
    @Basic
    @Column(name = "VB_NOTIFICATIONTRIGGER", nullable = true, precision = 0)
    private Integer vbNotificationtrigger;
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
    @ManyToOne
    @JoinColumn(name = "CURRENTWFDTLRECID", referencedColumnName = "RECID")
    private ENTITY_TblWfWorkflowDetails tblWfWorkflowDetailsByCurrentwfdtlrecid;
    @ManyToOne
    @JoinColumn(name = "NOTIFICATIONID", referencedColumnName = "NOTIFICATIONID")
    private ENTITY_TblWfMasterNotification tblWfMasterNotificationByNotificationid;

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

    public Integer getCurrentwfdtlrecid() {
        return currentwfdtlrecid;
    }

    public void setCurrentwfdtlrecid(Integer currentwfdtlrecid) {
        this.currentwfdtlrecid = currentwfdtlrecid;
    }

    public Integer getRuleid() {
        return ruleid;
    }

    public void setRuleid(Integer ruleid) {
        this.ruleid = ruleid;
    }

    public Integer getNotificationid() {
        return notificationid;
    }

    public void setNotificationid(Integer notificationid) {
        this.notificationid = notificationid;
    }

    public Integer getVbNotificationtrigger() {
        return vbNotificationtrigger;
    }

    public void setVbNotificationtrigger(Integer vbNotificationtrigger) {
        this.vbNotificationtrigger = vbNotificationtrigger;
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

        ENTITY_TblWfWorkflowNotifications that = (ENTITY_TblWfWorkflowNotifications) o;

        if (recid != that.recid) return false;
        if (workflowid != that.workflowid) return false;
        if (recstatus != that.recstatus) return false;
        if (currentwfdtlrecid != null ? !currentwfdtlrecid.equals(that.currentwfdtlrecid) : that.currentwfdtlrecid != null)
            return false;
        if (ruleid != null ? !ruleid.equals(that.ruleid) : that.ruleid != null) return false;
        if (notificationid != null ? !notificationid.equals(that.notificationid) : that.notificationid != null)
            return false;
        if (vbNotificationtrigger != null ? !vbNotificationtrigger.equals(that.vbNotificationtrigger) : that.vbNotificationtrigger != null)
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
        result = 31 * result + (currentwfdtlrecid != null ? currentwfdtlrecid.hashCode() : 0);
        result = 31 * result + (ruleid != null ? ruleid.hashCode() : 0);
        result = 31 * result + (notificationid != null ? notificationid.hashCode() : 0);
        result = 31 * result + (vbNotificationtrigger != null ? vbNotificationtrigger.hashCode() : 0);
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

    public ENTITY_TblWfWorkflowDetails getTblWfWorkflowDetailsByCurrentwfdtlrecid() {
        return tblWfWorkflowDetailsByCurrentwfdtlrecid;
    }

    public void setTblWfWorkflowDetailsByCurrentwfdtlrecid(ENTITY_TblWfWorkflowDetails tblWfWorkflowDetailsByCurrentwfdtlrecid) {
        this.tblWfWorkflowDetailsByCurrentwfdtlrecid = tblWfWorkflowDetailsByCurrentwfdtlrecid;
    }

    public ENTITY_TblWfMasterNotification getTblWfMasterNotificationByNotificationid() {
        return tblWfMasterNotificationByNotificationid;
    }

    public void setTblWfMasterNotificationByNotificationid(ENTITY_TblWfMasterNotification tblWfMasterNotificationByNotificationid) {
        this.tblWfMasterNotificationByNotificationid = tblWfMasterNotificationByNotificationid;
    }
}
