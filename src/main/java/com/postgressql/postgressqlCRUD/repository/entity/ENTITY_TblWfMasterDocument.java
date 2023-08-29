package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "TBL_WF_MASTER_DOCUMENT", schema = "dbo", catalog = "master")
public class ENTITY_TblWfMasterDocument {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DOCUMENTID", nullable = false, precision = 0)
    private int documentid;
    @Basic
    @Column(name = "DOCUMENTNAME1", nullable = false, length = 100)
    private String documentname1;
    @Basic
    @Column(name = "DOCUMENTNAME2", nullable = true, length = 100)
    private String documentname2;
    @Basic
    @Column(name = "DOCUMENTNAME3", nullable = true, length = 100)
    private String documentname3;
    @Basic
    @Column(name = "VB_DOCUMENTTYPE", nullable = false, precision = 0)
    private int vbDocumenttype;
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
    @OneToMany(mappedBy = "tblWfMasterDocumentByDocumentid")
    private Collection<ENTITY_TblWfWorkflowDocuments> tblWfWorkflowDocumentsByDocumentid;

    public int getDocumentid() {
        return documentid;
    }

    public void setDocumentid(int documentid) {
        this.documentid = documentid;
    }

    public String getDocumentname1() {
        return documentname1;
    }

    public void setDocumentname1(String documentname1) {
        this.documentname1 = documentname1;
    }

    public String getDocumentname2() {
        return documentname2;
    }

    public void setDocumentname2(String documentname2) {
        this.documentname2 = documentname2;
    }

    public String getDocumentname3() {
        return documentname3;
    }

    public void setDocumentname3(String documentname3) {
        this.documentname3 = documentname3;
    }

    public int getVbDocumenttype() {
        return vbDocumenttype;
    }

    public void setVbDocumenttype(int vbDocumenttype) {
        this.vbDocumenttype = vbDocumenttype;
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

        ENTITY_TblWfMasterDocument that = (ENTITY_TblWfMasterDocument) o;

        if (documentid != that.documentid) return false;
        if (vbDocumenttype != that.vbDocumenttype) return false;
        if (recstatus != that.recstatus) return false;
        if (documentname1 != null ? !documentname1.equals(that.documentname1) : that.documentname1 != null)
            return false;
        if (documentname2 != null ? !documentname2.equals(that.documentname2) : that.documentname2 != null)
            return false;
        if (documentname3 != null ? !documentname3.equals(that.documentname3) : that.documentname3 != null)
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
        int result = documentid;
        result = 31 * result + (documentname1 != null ? documentname1.hashCode() : 0);
        result = 31 * result + (documentname2 != null ? documentname2.hashCode() : 0);
        result = 31 * result + (documentname3 != null ? documentname3.hashCode() : 0);
        result = 31 * result + vbDocumenttype;
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

    public Collection<ENTITY_TblWfWorkflowDocuments> getTblWfWorkflowDocumentsByDocumentid() {
        return tblWfWorkflowDocumentsByDocumentid;
    }

    public void setTblWfWorkflowDocumentsByDocumentid(Collection<ENTITY_TblWfWorkflowDocuments> tblWfWorkflowDocumentsByDocumentid) {
        this.tblWfWorkflowDocumentsByDocumentid = tblWfWorkflowDocumentsByDocumentid;
    }
}
