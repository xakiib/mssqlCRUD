package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TBL_CNFG_CREDIT_EXCEPTION", schema = "dbo", catalog = "master")
public class ENTITY_TblCnfgCreditException {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RECID", nullable = false, precision = 0)
    private int recid;
    @Basic
    @Column(name = "FINANCIERID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int financierid;
    @Basic
    @Column(name = "PRODUCTCODE", nullable = true, length = 10)
    private String productcode;
    @Basic
    @Column(name = "SUBPRODUCTCODE", nullable = true, length = 50)
    private String subproductcode;
    @Basic
    @Column(name = "EXCEPTIONNAME1", nullable = false, length = 150)
    private String exceptionname1;
    @Basic
    @Column(name = "EXCEPTIONNAME2", nullable = false, length = 150)
    private String exceptionname2;
    @Basic
    @Column(name = "EXCEPTIONNAME3", nullable = false, length = 150)
    private String exceptionname3;
    @Basic
    @Column(name = "RULEID", nullable = true, precision = 0)
    private Integer ruleid;
    @Basic
    @Column(name = "VB_CREDITEXCEPTIONTYPE", nullable = false, precision = 0)
    private int vbCreditexceptiontype;
    @Basic
    @Column(name = "ISDOCUMENT", nullable = false)
    private boolean isdocument;
    @Basic
    @Column(name = "ISGUARANTOR", nullable = false)
    private boolean isguarantor;
    @Basic
    @Column(name = "ISADDITIONALAPPROVER", nullable = false)
    private boolean isadditionalapprover;
    @Basic
    @Column(name = "ISCOLLATERAL", nullable = false)
    private boolean iscollateral;
    @Basic
    @Column(name = "DOCID", nullable = true, precision = 0)
    private Integer docid;
    @Basic
    @Column(name = "ROLEID", nullable = true, precision = 0)
    private Integer roleid;
    @Basic
    @Column(name = "COLLATERALID", nullable = true, precision = 0)
    private Integer collateralid;
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
    @JoinColumn(name = "FINANCIERID", referencedColumnName = "FINANCIERID", nullable = false)
    private ENTITY_TblCnfgMstFinanciers tblCnfgMstFinanciersByFinancierid;

    public int getRecid() {
        return recid;
    }

    public void setRecid(int recid) {
        this.recid = recid;
    }

    public int getFinancierid() {
        return financierid;
    }

    public void setFinancierid(int financierid) {
        this.financierid = financierid;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getSubproductcode() {
        return subproductcode;
    }

    public void setSubproductcode(String subproductcode) {
        this.subproductcode = subproductcode;
    }

    public String getExceptionname1() {
        return exceptionname1;
    }

    public void setExceptionname1(String exceptionname1) {
        this.exceptionname1 = exceptionname1;
    }

    public String getExceptionname2() {
        return exceptionname2;
    }

    public void setExceptionname2(String exceptionname2) {
        this.exceptionname2 = exceptionname2;
    }

    public String getExceptionname3() {
        return exceptionname3;
    }

    public void setExceptionname3(String exceptionname3) {
        this.exceptionname3 = exceptionname3;
    }

    public Integer getRuleid() {
        return ruleid;
    }

    public void setRuleid(Integer ruleid) {
        this.ruleid = ruleid;
    }

    public int getVbCreditexceptiontype() {
        return vbCreditexceptiontype;
    }

    public void setVbCreditexceptiontype(int vbCreditexceptiontype) {
        this.vbCreditexceptiontype = vbCreditexceptiontype;
    }

    public boolean isIsdocument() {
        return isdocument;
    }

    public void setIsdocument(boolean isdocument) {
        this.isdocument = isdocument;
    }

    public boolean isIsguarantor() {
        return isguarantor;
    }

    public void setIsguarantor(boolean isguarantor) {
        this.isguarantor = isguarantor;
    }

    public boolean isIsadditionalapprover() {
        return isadditionalapprover;
    }

    public void setIsadditionalapprover(boolean isadditionalapprover) {
        this.isadditionalapprover = isadditionalapprover;
    }

    public boolean isIscollateral() {
        return iscollateral;
    }

    public void setIscollateral(boolean iscollateral) {
        this.iscollateral = iscollateral;
    }

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getCollateralid() {
        return collateralid;
    }

    public void setCollateralid(Integer collateralid) {
        this.collateralid = collateralid;
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

        ENTITY_TblCnfgCreditException that = (ENTITY_TblCnfgCreditException) o;

        if (recid != that.recid) return false;
        if (financierid != that.financierid) return false;
        if (vbCreditexceptiontype != that.vbCreditexceptiontype) return false;
        if (isdocument != that.isdocument) return false;
        if (isguarantor != that.isguarantor) return false;
        if (isadditionalapprover != that.isadditionalapprover) return false;
        if (iscollateral != that.iscollateral) return false;
        if (recstatus != that.recstatus) return false;
        if (productcode != null ? !productcode.equals(that.productcode) : that.productcode != null) return false;
        if (subproductcode != null ? !subproductcode.equals(that.subproductcode) : that.subproductcode != null)
            return false;
        if (exceptionname1 != null ? !exceptionname1.equals(that.exceptionname1) : that.exceptionname1 != null)
            return false;
        if (exceptionname2 != null ? !exceptionname2.equals(that.exceptionname2) : that.exceptionname2 != null)
            return false;
        if (exceptionname3 != null ? !exceptionname3.equals(that.exceptionname3) : that.exceptionname3 != null)
            return false;
        if (ruleid != null ? !ruleid.equals(that.ruleid) : that.ruleid != null) return false;
        if (docid != null ? !docid.equals(that.docid) : that.docid != null) return false;
        if (roleid != null ? !roleid.equals(that.roleid) : that.roleid != null) return false;
        if (collateralid != null ? !collateralid.equals(that.collateralid) : that.collateralid != null) return false;
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
        result = 31 * result + financierid;
        result = 31 * result + (productcode != null ? productcode.hashCode() : 0);
        result = 31 * result + (subproductcode != null ? subproductcode.hashCode() : 0);
        result = 31 * result + (exceptionname1 != null ? exceptionname1.hashCode() : 0);
        result = 31 * result + (exceptionname2 != null ? exceptionname2.hashCode() : 0);
        result = 31 * result + (exceptionname3 != null ? exceptionname3.hashCode() : 0);
        result = 31 * result + (ruleid != null ? ruleid.hashCode() : 0);
        result = 31 * result + vbCreditexceptiontype;
        result = 31 * result + (isdocument ? 1 : 0);
        result = 31 * result + (isguarantor ? 1 : 0);
        result = 31 * result + (isadditionalapprover ? 1 : 0);
        result = 31 * result + (iscollateral ? 1 : 0);
        result = 31 * result + (docid != null ? docid.hashCode() : 0);
        result = 31 * result + (roleid != null ? roleid.hashCode() : 0);
        result = 31 * result + (collateralid != null ? collateralid.hashCode() : 0);
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
}
