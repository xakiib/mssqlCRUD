package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "TBL_WF_MASTER_EVENTS", schema = "dbo", catalog = "master")
public class ENTITY_TblWfMasterEvents {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EVENTID", nullable = false, precision = 0)
    private int eventid;
    @Basic
    @Column(name = "MODULEID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int moduleid;
    @Basic
    @Column(name = "EVENTNAME1", nullable = false, length = 150)
    private String eventname1;
    @Basic
    @Column(name = "EVENTNAME2", nullable = true, length = 150)
    private String eventname2;
    @Basic
    @Column(name = "EVENTNAME3", nullable = true, length = 150)
    private String eventname3;
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
    @JoinColumn(name = "MODULEID", referencedColumnName = "MODULEID", nullable = false)
    private ENTITY_TblCnfgMstModules tblCnfgMstModulesByModuleid;
    @OneToMany(mappedBy = "tblWfMasterEventsByEventid")
    private Collection<ENTITY_TblWfWorkflowMaster> tblWfWorkflowMastersByEventid;

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    public int getModuleid() {
        return moduleid;
    }

    public void setModuleid(int moduleid) {
        this.moduleid = moduleid;
    }

    public String getEventname1() {
        return eventname1;
    }

    public void setEventname1(String eventname1) {
        this.eventname1 = eventname1;
    }

    public String getEventname2() {
        return eventname2;
    }

    public void setEventname2(String eventname2) {
        this.eventname2 = eventname2;
    }

    public String getEventname3() {
        return eventname3;
    }

    public void setEventname3(String eventname3) {
        this.eventname3 = eventname3;
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

        ENTITY_TblWfMasterEvents that = (ENTITY_TblWfMasterEvents) o;

        if (eventid != that.eventid) return false;
        if (moduleid != that.moduleid) return false;
        if (recstatus != that.recstatus) return false;
        if (eventname1 != null ? !eventname1.equals(that.eventname1) : that.eventname1 != null) return false;
        if (eventname2 != null ? !eventname2.equals(that.eventname2) : that.eventname2 != null) return false;
        if (eventname3 != null ? !eventname3.equals(that.eventname3) : that.eventname3 != null) return false;
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
        int result = eventid;
        result = 31 * result + moduleid;
        result = 31 * result + (eventname1 != null ? eventname1.hashCode() : 0);
        result = 31 * result + (eventname2 != null ? eventname2.hashCode() : 0);
        result = 31 * result + (eventname3 != null ? eventname3.hashCode() : 0);
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

    public ENTITY_TblCnfgMstModules getTblCnfgMstModulesByModuleid() {
        return tblCnfgMstModulesByModuleid;
    }

    public void setTblCnfgMstModulesByModuleid(ENTITY_TblCnfgMstModules tblCnfgMstModulesByModuleid) {
        this.tblCnfgMstModulesByModuleid = tblCnfgMstModulesByModuleid;
    }

    public Collection<ENTITY_TblWfWorkflowMaster> getTblWfWorkflowMastersByEventid() {
        return tblWfWorkflowMastersByEventid;
    }

    public void setTblWfWorkflowMastersByEventid(Collection<ENTITY_TblWfWorkflowMaster> tblWfWorkflowMastersByEventid) {
        this.tblWfWorkflowMastersByEventid = tblWfWorkflowMastersByEventid;
    }
}
