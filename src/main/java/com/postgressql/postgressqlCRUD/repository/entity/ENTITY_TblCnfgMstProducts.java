package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "TBL_CNFG_MST_PRODUCTS", schema = "dbo", catalog = "master")
public class ENTITY_TblCnfgMstProducts {
    @Basic
    @Column(name = "RECID", nullable = false, precision = 0)
    private int recid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PRODUCTCODE", nullable = false, length = 10)
    private String productcode;
    @Basic
    @Column(name = "PRODUCTNAME1", nullable = false, length = 150)
    private String productname1;
    @Basic
    @Column(name = "PRODUCTNAME2", nullable = true, length = 150)
    private String productname2;
    @Basic
    @Column(name = "PRODUCTNAME3", nullable = true, length = 150)
    private String productname3;
    @Basic
    @Column(name = "VB_APPLICANTTYPE", nullable = false, precision = 0)
    private int vbApplicanttype;
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
    @OneToMany(mappedBy = "tblCnfgMstProductsByProductcode")
    private Collection<ENTITY_TblCnfgMstSubproducts> tblCnfgMstSubproductsByProductcode;
    @OneToMany(mappedBy = "tblCnfgMstProductsByProductcode")
    private Collection<ENTITY_TblCnfgSchemeMaster> tblCnfgSchemeMastersByProductcode;
    @OneToMany(mappedBy = "tblCnfgMstProductsByProductcode")
    private Collection<ENTITY_TblUmUserProduct> tblUmUserProductsByProductcode;
    @OneToMany(mappedBy = "tblCnfgMstProductsByProductcode")
    private Collection<ENTITY_TblWfWorkflowMaster> tblWfWorkflowMastersByProductcode;

    public int getRecid() {
        return recid;
    }

    public void setRecid(int recid) {
        this.recid = recid;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getProductname1() {
        return productname1;
    }

    public void setProductname1(String productname1) {
        this.productname1 = productname1;
    }

    public String getProductname2() {
        return productname2;
    }

    public void setProductname2(String productname2) {
        this.productname2 = productname2;
    }

    public String getProductname3() {
        return productname3;
    }

    public void setProductname3(String productname3) {
        this.productname3 = productname3;
    }

    public int getVbApplicanttype() {
        return vbApplicanttype;
    }

    public void setVbApplicanttype(int vbApplicanttype) {
        this.vbApplicanttype = vbApplicanttype;
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

        ENTITY_TblCnfgMstProducts that = (ENTITY_TblCnfgMstProducts) o;

        if (recid != that.recid) return false;
        if (vbApplicanttype != that.vbApplicanttype) return false;
        if (recstatus != that.recstatus) return false;
        if (productcode != null ? !productcode.equals(that.productcode) : that.productcode != null) return false;
        if (productname1 != null ? !productname1.equals(that.productname1) : that.productname1 != null) return false;
        if (productname2 != null ? !productname2.equals(that.productname2) : that.productname2 != null) return false;
        if (productname3 != null ? !productname3.equals(that.productname3) : that.productname3 != null) return false;
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
        result = 31 * result + (productcode != null ? productcode.hashCode() : 0);
        result = 31 * result + (productname1 != null ? productname1.hashCode() : 0);
        result = 31 * result + (productname2 != null ? productname2.hashCode() : 0);
        result = 31 * result + (productname3 != null ? productname3.hashCode() : 0);
        result = 31 * result + vbApplicanttype;
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

    public Collection<ENTITY_TblCnfgMstSubproducts> getTblCnfgMstSubproductsByProductcode() {
        return tblCnfgMstSubproductsByProductcode;
    }

    public void setTblCnfgMstSubproductsByProductcode(Collection<ENTITY_TblCnfgMstSubproducts> tblCnfgMstSubproductsByProductcode) {
        this.tblCnfgMstSubproductsByProductcode = tblCnfgMstSubproductsByProductcode;
    }

    public Collection<ENTITY_TblCnfgSchemeMaster> getTblCnfgSchemeMastersByProductcode() {
        return tblCnfgSchemeMastersByProductcode;
    }

    public void setTblCnfgSchemeMastersByProductcode(Collection<ENTITY_TblCnfgSchemeMaster> tblCnfgSchemeMastersByProductcode) {
        this.tblCnfgSchemeMastersByProductcode = tblCnfgSchemeMastersByProductcode;
    }

    public Collection<ENTITY_TblUmUserProduct> getTblUmUserProductsByProductcode() {
        return tblUmUserProductsByProductcode;
    }

    public void setTblUmUserProductsByProductcode(Collection<ENTITY_TblUmUserProduct> tblUmUserProductsByProductcode) {
        this.tblUmUserProductsByProductcode = tblUmUserProductsByProductcode;
    }

    public Collection<ENTITY_TblWfWorkflowMaster> getTblWfWorkflowMastersByProductcode() {
        return tblWfWorkflowMastersByProductcode;
    }

    public void setTblWfWorkflowMastersByProductcode(Collection<ENTITY_TblWfWorkflowMaster> tblWfWorkflowMastersByProductcode) {
        this.tblWfWorkflowMastersByProductcode = tblWfWorkflowMastersByProductcode;
    }
}
