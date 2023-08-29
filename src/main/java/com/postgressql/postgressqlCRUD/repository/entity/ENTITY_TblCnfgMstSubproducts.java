package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TBL_CNFG_MST_SUBPRODUCTS", schema = "dbo", catalog = "master")
@IdClass(ENTITY_TblCnfgMstSubproductsPK.class)
public class ENTITY_TblCnfgMstSubproducts {
    @Basic
    @Column(name = "RECID", nullable = false, precision = 0)
    private int recid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SUBPRODUCTCODE", nullable = false, length = 10)
    private String subproductcode;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PRODUCTCODE", nullable = false, length = 10)
    private String productcode;
    @Basic
    @Column(name = "SUBPRODUCTNAME1", nullable = false, length = 150)
    private String subproductname1;
    @Basic
    @Column(name = "SUBPRODUCTNAME2", nullable = true, length = 150)
    private String subproductname2;
    @Basic
    @Column(name = "SUBPRODUCTNAME3", nullable = true, length = 150)
    private String subproductname3;
    @Basic
    @Column(name = "ISASSETFINANCE", nullable = false)
    private boolean isassetfinance;
    @Basic
    @Column(name = "VB_ASSETCAT", nullable = true, precision = 0)
    private Integer vbAssetcat;
    @Basic
    @Column(name = "VB_ASSETSUBCAT", nullable = true, precision = 0)
    private Integer vbAssetsubcat;
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
    @JoinColumn(name = "PRODUCTCODE", referencedColumnName = "PRODUCTCODE", nullable = false)
    private ENTITY_TblCnfgMstProducts tblCnfgMstProductsByProductcode;

    public int getRecid() {
        return recid;
    }

    public void setRecid(int recid) {
        this.recid = recid;
    }

    public String getSubproductcode() {
        return subproductcode;
    }

    public void setSubproductcode(String subproductcode) {
        this.subproductcode = subproductcode;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getSubproductname1() {
        return subproductname1;
    }

    public void setSubproductname1(String subproductname1) {
        this.subproductname1 = subproductname1;
    }

    public String getSubproductname2() {
        return subproductname2;
    }

    public void setSubproductname2(String subproductname2) {
        this.subproductname2 = subproductname2;
    }

    public String getSubproductname3() {
        return subproductname3;
    }

    public void setSubproductname3(String subproductname3) {
        this.subproductname3 = subproductname3;
    }

    public boolean isIsassetfinance() {
        return isassetfinance;
    }

    public void setIsassetfinance(boolean isassetfinance) {
        this.isassetfinance = isassetfinance;
    }

    public Integer getVbAssetcat() {
        return vbAssetcat;
    }

    public void setVbAssetcat(Integer vbAssetcat) {
        this.vbAssetcat = vbAssetcat;
    }

    public Integer getVbAssetsubcat() {
        return vbAssetsubcat;
    }

    public void setVbAssetsubcat(Integer vbAssetsubcat) {
        this.vbAssetsubcat = vbAssetsubcat;
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

        ENTITY_TblCnfgMstSubproducts that = (ENTITY_TblCnfgMstSubproducts) o;

        if (recid != that.recid) return false;
        if (isassetfinance != that.isassetfinance) return false;
        if (recstatus != that.recstatus) return false;
        if (subproductcode != null ? !subproductcode.equals(that.subproductcode) : that.subproductcode != null)
            return false;
        if (productcode != null ? !productcode.equals(that.productcode) : that.productcode != null) return false;
        if (subproductname1 != null ? !subproductname1.equals(that.subproductname1) : that.subproductname1 != null)
            return false;
        if (subproductname2 != null ? !subproductname2.equals(that.subproductname2) : that.subproductname2 != null)
            return false;
        if (subproductname3 != null ? !subproductname3.equals(that.subproductname3) : that.subproductname3 != null)
            return false;
        if (vbAssetcat != null ? !vbAssetcat.equals(that.vbAssetcat) : that.vbAssetcat != null) return false;
        if (vbAssetsubcat != null ? !vbAssetsubcat.equals(that.vbAssetsubcat) : that.vbAssetsubcat != null)
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
        result = 31 * result + (subproductcode != null ? subproductcode.hashCode() : 0);
        result = 31 * result + (productcode != null ? productcode.hashCode() : 0);
        result = 31 * result + (subproductname1 != null ? subproductname1.hashCode() : 0);
        result = 31 * result + (subproductname2 != null ? subproductname2.hashCode() : 0);
        result = 31 * result + (subproductname3 != null ? subproductname3.hashCode() : 0);
        result = 31 * result + (isassetfinance ? 1 : 0);
        result = 31 * result + (vbAssetcat != null ? vbAssetcat.hashCode() : 0);
        result = 31 * result + (vbAssetsubcat != null ? vbAssetsubcat.hashCode() : 0);
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

    public ENTITY_TblCnfgMstProducts getTblCnfgMstProductsByProductcode() {
        return tblCnfgMstProductsByProductcode;
    }

    public void setTblCnfgMstProductsByProductcode(ENTITY_TblCnfgMstProducts tblCnfgMstProductsByProductcode) {
        this.tblCnfgMstProductsByProductcode = tblCnfgMstProductsByProductcode;
    }
}
