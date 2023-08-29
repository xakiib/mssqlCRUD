package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "TBL_WF_MASTER_CHECKLIST", schema = "dbo", catalog = "master")
public class ENTITY_TblWfMasterChecklist {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CHECKLISTID", nullable = false, precision = 0)
    private int checklistid;
    @Basic
    @Column(name = "CHECKLISTNAME1", nullable = false, length = 100)
    private String checklistname1;
    @Basic
    @Column(name = "CHECKLISTNAME2", nullable = true, length = 100)
    private String checklistname2;
    @Basic
    @Column(name = "CHECKLISTNAME3", nullable = true, length = 100)
    private String checklistname3;
    @Basic
    @Column(name = "VB_CHECKLISTTYPE", nullable = false, precision = 0)
    private int vbChecklisttype;
    @Basic
    @Column(name = "FINANCIERID", nullable = true, precision = 0, insertable=false, updatable=false)
    private Integer financierid;
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
    @JoinColumn(name = "FINANCIERID", referencedColumnName = "FINANCIERID")
    private ENTITY_TblCnfgMstFinanciers tblCnfgMstFinanciersByFinancierid;
    @OneToMany(mappedBy = "tblWfMasterChecklistByChecklistid")
    private Collection<ENTITY_TblWfWorkflowChecklist> tblWfWorkflowChecklistsByChecklistid;

    public int getChecklistid() {
        return checklistid;
    }

    public void setChecklistid(int checklistid) {
        this.checklistid = checklistid;
    }

    public String getChecklistname1() {
        return checklistname1;
    }

    public void setChecklistname1(String checklistname1) {
        this.checklistname1 = checklistname1;
    }

    public String getChecklistname2() {
        return checklistname2;
    }

    public void setChecklistname2(String checklistname2) {
        this.checklistname2 = checklistname2;
    }

    public String getChecklistname3() {
        return checklistname3;
    }

    public void setChecklistname3(String checklistname3) {
        this.checklistname3 = checklistname3;
    }

    public int getVbChecklisttype() {
        return vbChecklisttype;
    }

    public void setVbChecklisttype(int vbChecklisttype) {
        this.vbChecklisttype = vbChecklisttype;
    }

    public Integer getFinancierid() {
        return financierid;
    }

    public void setFinancierid(Integer financierid) {
        this.financierid = financierid;
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

        ENTITY_TblWfMasterChecklist that = (ENTITY_TblWfMasterChecklist) o;

        if (checklistid != that.checklistid) return false;
        if (vbChecklisttype != that.vbChecklisttype) return false;
        if (recstatus != that.recstatus) return false;
        if (checklistname1 != null ? !checklistname1.equals(that.checklistname1) : that.checklistname1 != null)
            return false;
        if (checklistname2 != null ? !checklistname2.equals(that.checklistname2) : that.checklistname2 != null)
            return false;
        if (checklistname3 != null ? !checklistname3.equals(that.checklistname3) : that.checklistname3 != null)
            return false;
        if (financierid != null ? !financierid.equals(that.financierid) : that.financierid != null) return false;
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
        int result = checklistid;
        result = 31 * result + (checklistname1 != null ? checklistname1.hashCode() : 0);
        result = 31 * result + (checklistname2 != null ? checklistname2.hashCode() : 0);
        result = 31 * result + (checklistname3 != null ? checklistname3.hashCode() : 0);
        result = 31 * result + vbChecklisttype;
        result = 31 * result + (financierid != null ? financierid.hashCode() : 0);
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

    public ENTITY_TblCnfgMstFinanciers getTblCnfgMstFinanciersByFinancierid() {
        return tblCnfgMstFinanciersByFinancierid;
    }

    public void setTblCnfgMstFinanciersByFinancierid(ENTITY_TblCnfgMstFinanciers tblCnfgMstFinanciersByFinancierid) {
        this.tblCnfgMstFinanciersByFinancierid = tblCnfgMstFinanciersByFinancierid;
    }

    public Collection<ENTITY_TblWfWorkflowChecklist> getTblWfWorkflowChecklistsByChecklistid() {
        return tblWfWorkflowChecklistsByChecklistid;
    }

    public void setTblWfWorkflowChecklistsByChecklistid(Collection<ENTITY_TblWfWorkflowChecklist> tblWfWorkflowChecklistsByChecklistid) {
        this.tblWfWorkflowChecklistsByChecklistid = tblWfWorkflowChecklistsByChecklistid;
    }
}
