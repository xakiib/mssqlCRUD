package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "TBL_CNFG_MST_MODULES", schema = "dbo", catalog = "master")
public class ENTITY_TblCnfgMstModules {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MODULEID", nullable = false, precision = 0)
    private int moduleid;
    @Basic
    @Column(name = "MODULENAME1", nullable = false, length = 150)
    private String modulename1;
    @Basic
    @Column(name = "MODULENAME2", nullable = true, length = 150)
    private String modulename2;
    @Basic
    @Column(name = "MODULENAME3", nullable = true, length = 150)
    private String modulename3;
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
    @OneToMany(mappedBy = "tblCnfgMstModulesByModuleid")
    private Collection<ENTITY_TblCnfgMstCharges> tblCnfgMstChargesByModuleid;
    @OneToMany(mappedBy = "tblCnfgMstModulesByModuleid")
    private Collection<ENTITY_TblCnfgMstMenu> tblCnfgMstMenusByModuleid;
    @OneToMany(mappedBy = "tblCnfgMstModulesByModuleid")
    private Collection<ENTITY_TblWfMasterEvents> tblWfMasterEventsByModuleid;
    @OneToMany(mappedBy = "tblCnfgMstModulesByModuleid")
    private Collection<ENTITY_TblWfWorkflowDetails> tblWfWorkflowDetailsByModuleid;

    public int getModuleid() {
        return moduleid;
    }

    public void setModuleid(int moduleid) {
        this.moduleid = moduleid;
    }

    public String getModulename1() {
        return modulename1;
    }

    public void setModulename1(String modulename1) {
        this.modulename1 = modulename1;
    }

    public String getModulename2() {
        return modulename2;
    }

    public void setModulename2(String modulename2) {
        this.modulename2 = modulename2;
    }

    public String getModulename3() {
        return modulename3;
    }

    public void setModulename3(String modulename3) {
        this.modulename3 = modulename3;
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

        ENTITY_TblCnfgMstModules that = (ENTITY_TblCnfgMstModules) o;

        if (moduleid != that.moduleid) return false;
        if (recstatus != that.recstatus) return false;
        if (modulename1 != null ? !modulename1.equals(that.modulename1) : that.modulename1 != null) return false;
        if (modulename2 != null ? !modulename2.equals(that.modulename2) : that.modulename2 != null) return false;
        if (modulename3 != null ? !modulename3.equals(that.modulename3) : that.modulename3 != null) return false;
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
        int result = moduleid;
        result = 31 * result + (modulename1 != null ? modulename1.hashCode() : 0);
        result = 31 * result + (modulename2 != null ? modulename2.hashCode() : 0);
        result = 31 * result + (modulename3 != null ? modulename3.hashCode() : 0);
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

    public Collection<ENTITY_TblCnfgMstCharges> getTblCnfgMstChargesByModuleid() {
        return tblCnfgMstChargesByModuleid;
    }

    public void setTblCnfgMstChargesByModuleid(Collection<ENTITY_TblCnfgMstCharges> tblCnfgMstChargesByModuleid) {
        this.tblCnfgMstChargesByModuleid = tblCnfgMstChargesByModuleid;
    }

    public Collection<ENTITY_TblCnfgMstMenu> getTblCnfgMstMenusByModuleid() {
        return tblCnfgMstMenusByModuleid;
    }

    public void setTblCnfgMstMenusByModuleid(Collection<ENTITY_TblCnfgMstMenu> tblCnfgMstMenusByModuleid) {
        this.tblCnfgMstMenusByModuleid = tblCnfgMstMenusByModuleid;
    }

    public Collection<ENTITY_TblWfMasterEvents> getTblWfMasterEventsByModuleid() {
        return tblWfMasterEventsByModuleid;
    }

    public void setTblWfMasterEventsByModuleid(Collection<ENTITY_TblWfMasterEvents> tblWfMasterEventsByModuleid) {
        this.tblWfMasterEventsByModuleid = tblWfMasterEventsByModuleid;
    }

    public Collection<ENTITY_TblWfWorkflowDetails> getTblWfWorkflowDetailsByModuleid() {
        return tblWfWorkflowDetailsByModuleid;
    }

    public void setTblWfWorkflowDetailsByModuleid(Collection<ENTITY_TblWfWorkflowDetails> tblWfWorkflowDetailsByModuleid) {
        this.tblWfWorkflowDetailsByModuleid = tblWfWorkflowDetailsByModuleid;
    }
}
