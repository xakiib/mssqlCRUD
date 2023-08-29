package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Table(name = "TBL_CNFG_MST_BRANCH", schema = "dbo", catalog = "master")
public class ENTITY_TblCnfgMstBranch {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BRANCHID", nullable = false, precision = 0)
    private int branchid;
    @Basic
    @Column(name = "BRANCHNAME1", nullable = false, length = 150)
    private String branchname1;
    @Basic
    @Column(name = "BRANCHNAME2", nullable = true, length = 150)
    private String branchname2;
    @Basic
    @Column(name = "BRANCHNAME3", nullable = true, length = 150)
    private String branchname3;
    @Basic
    @Column(name = "FINANCIERID", nullable = false, precision = 0)
    private int financierid;
    @Basic
    @Column(name = "VB_BRANCHTYPE", nullable = false, precision = 0)
    private int vbBranchtype;
    @Basic
    @Column(name = "BRANCHLOGO", nullable = true)
    private byte[] branchlogo;
    @Basic
    @Column(name = "ADDRESS1", nullable = true, length = 1000)
    private String address1;
    @Basic
    @Column(name = "ADDRESS2", nullable = true, length = 1000)
    private String address2;
    @Basic
    @Column(name = "VB_COUNTRY", nullable = true, precision = 0)
    private Integer vbCountry;
    @Basic
    @Column(name = "VB_REGION", nullable = true, precision = 0)
    private Integer vbRegion;
    @Basic
    @Column(name = "VB_CITY", nullable = true, precision = 0)
    private Integer vbCity;
    @Basic
    @Column(name = "POBOX", nullable = true, length = 50)
    private String pobox;
    @Basic
    @Column(name = "ZIPCODE", nullable = true, length = 50)
    private String zipcode;
    @Basic
    @Column(name = "CONTACT1", nullable = true, length = 20)
    private String contact1;
    @Basic
    @Column(name = "CONTACT2", nullable = true, length = 20)
    private String contact2;
    @Basic
    @Column(name = "EMAIL", nullable = true, length = 50)
    private String email;
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
    @OneToMany(mappedBy = "tblCnfgMstBranchByBranchid")
    private Collection<ENTITY_TblUmUserBranch> tblUmUserBranchesByBranchid;

    public int getBranchid() {
        return branchid;
    }

    public void setBranchid(int branchid) {
        this.branchid = branchid;
    }

    public String getBranchname1() {
        return branchname1;
    }

    public void setBranchname1(String branchname1) {
        this.branchname1 = branchname1;
    }

    public String getBranchname2() {
        return branchname2;
    }

    public void setBranchname2(String branchname2) {
        this.branchname2 = branchname2;
    }

    public String getBranchname3() {
        return branchname3;
    }

    public void setBranchname3(String branchname3) {
        this.branchname3 = branchname3;
    }

    public int getFinancierid() {
        return financierid;
    }

    public void setFinancierid(int financierid) {
        this.financierid = financierid;
    }

    public int getVbBranchtype() {
        return vbBranchtype;
    }

    public void setVbBranchtype(int vbBranchtype) {
        this.vbBranchtype = vbBranchtype;
    }

    public byte[] getBranchlogo() {
        return branchlogo;
    }

    public void setBranchlogo(byte[] branchlogo) {
        this.branchlogo = branchlogo;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Integer getVbCountry() {
        return vbCountry;
    }

    public void setVbCountry(Integer vbCountry) {
        this.vbCountry = vbCountry;
    }

    public Integer getVbRegion() {
        return vbRegion;
    }

    public void setVbRegion(Integer vbRegion) {
        this.vbRegion = vbRegion;
    }

    public Integer getVbCity() {
        return vbCity;
    }

    public void setVbCity(Integer vbCity) {
        this.vbCity = vbCity;
    }

    public String getPobox() {
        return pobox;
    }

    public void setPobox(String pobox) {
        this.pobox = pobox;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

        ENTITY_TblCnfgMstBranch that = (ENTITY_TblCnfgMstBranch) o;

        if (branchid != that.branchid) return false;
        if (financierid != that.financierid) return false;
        if (vbBranchtype != that.vbBranchtype) return false;
        if (recstatus != that.recstatus) return false;
        if (branchname1 != null ? !branchname1.equals(that.branchname1) : that.branchname1 != null) return false;
        if (branchname2 != null ? !branchname2.equals(that.branchname2) : that.branchname2 != null) return false;
        if (branchname3 != null ? !branchname3.equals(that.branchname3) : that.branchname3 != null) return false;
        if (!Arrays.equals(branchlogo, that.branchlogo)) return false;
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (vbCountry != null ? !vbCountry.equals(that.vbCountry) : that.vbCountry != null) return false;
        if (vbRegion != null ? !vbRegion.equals(that.vbRegion) : that.vbRegion != null) return false;
        if (vbCity != null ? !vbCity.equals(that.vbCity) : that.vbCity != null) return false;
        if (pobox != null ? !pobox.equals(that.pobox) : that.pobox != null) return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) return false;
        if (contact1 != null ? !contact1.equals(that.contact1) : that.contact1 != null) return false;
        if (contact2 != null ? !contact2.equals(that.contact2) : that.contact2 != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
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
        int result = branchid;
        result = 31 * result + (branchname1 != null ? branchname1.hashCode() : 0);
        result = 31 * result + (branchname2 != null ? branchname2.hashCode() : 0);
        result = 31 * result + (branchname3 != null ? branchname3.hashCode() : 0);
        result = 31 * result + financierid;
        result = 31 * result + vbBranchtype;
        result = 31 * result + Arrays.hashCode(branchlogo);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (vbCountry != null ? vbCountry.hashCode() : 0);
        result = 31 * result + (vbRegion != null ? vbRegion.hashCode() : 0);
        result = 31 * result + (vbCity != null ? vbCity.hashCode() : 0);
        result = 31 * result + (pobox != null ? pobox.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (contact1 != null ? contact1.hashCode() : 0);
        result = 31 * result + (contact2 != null ? contact2.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
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

    public Collection<ENTITY_TblUmUserBranch> getTblUmUserBranchesByBranchid() {
        return tblUmUserBranchesByBranchid;
    }

    public void setTblUmUserBranchesByBranchid(Collection<ENTITY_TblUmUserBranch> tblUmUserBranchesByBranchid) {
        this.tblUmUserBranchesByBranchid = tblUmUserBranchesByBranchid;
    }
}
