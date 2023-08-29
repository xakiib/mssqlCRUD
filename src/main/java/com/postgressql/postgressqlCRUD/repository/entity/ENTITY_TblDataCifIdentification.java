package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TBL_DATA_CIF_IDENTIFICATION", schema = "dbo", catalog = "master")
public class ENTITY_TblDataCifIdentification {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RECID", nullable = false, precision = 0)
    private int recid;
    @Basic
    @Column(name = "CIFID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int cifid;
    @Basic
    @Column(name = "VB_IDTYPE", nullable = false, precision = 0)
    private int vbIdtype;
    @Basic
    @Column(name = "IDSERIES", nullable = true, length = 50)
    private String idseries;
    @Basic
    @Column(name = "IDNUMBER", nullable = false, length = 50)
    private String idnumber;
    @Basic
    @Column(name = "IDVERSIONNO", nullable = true)
    private Integer idversionno;
    @Basic
    @Column(name = "DATE_OF_ISSUE_G", nullable = true)
    private Date dateOfIssueG;
    @Basic
    @Column(name = "DATE_OF_EXPIRY_G", nullable = true)
    private Date dateOfExpiryG;
    @Basic
    @Column(name = "DATE_OF_ISSUE_H", nullable = true, length = 20)
    private String dateOfIssueH;
    @Basic
    @Column(name = "DATE_OF_EXPIRY_H", nullable = true, length = 20)
    private String dateOfExpiryH;
    @Basic
    @Column(name = "VB_ISSUEAUTHORITY", nullable = true, precision = 0)
    private Integer vbIssueauthority;
    @Basic
    @Column(name = "VB_PLACEOFISSUE", nullable = true, precision = 0)
    private Integer vbPlaceofissue;
    @Basic
    @Column(name = "ISPRIMARY", nullable = false)
    private boolean isprimary;
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
    @JoinColumn(name = "CIFID", referencedColumnName = "CIFID", nullable = false)
    private ENTITY_TblDataCifCustomerdetails tblDataCifCustomerdetailsByCifid;

    public int getRecid() {
        return recid;
    }

    public void setRecid(int recid) {
        this.recid = recid;
    }

    public int getCifid() {
        return cifid;
    }

    public void setCifid(int cifid) {
        this.cifid = cifid;
    }

    public int getVbIdtype() {
        return vbIdtype;
    }

    public void setVbIdtype(int vbIdtype) {
        this.vbIdtype = vbIdtype;
    }

    public String getIdseries() {
        return idseries;
    }

    public void setIdseries(String idseries) {
        this.idseries = idseries;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public Integer getIdversionno() {
        return idversionno;
    }

    public void setIdversionno(Integer idversionno) {
        this.idversionno = idversionno;
    }

    public Date getDateOfIssueG() {
        return dateOfIssueG;
    }

    public void setDateOfIssueG(Date dateOfIssueG) {
        this.dateOfIssueG = dateOfIssueG;
    }

    public Date getDateOfExpiryG() {
        return dateOfExpiryG;
    }

    public void setDateOfExpiryG(Date dateOfExpiryG) {
        this.dateOfExpiryG = dateOfExpiryG;
    }

    public String getDateOfIssueH() {
        return dateOfIssueH;
    }

    public void setDateOfIssueH(String dateOfIssueH) {
        this.dateOfIssueH = dateOfIssueH;
    }

    public String getDateOfExpiryH() {
        return dateOfExpiryH;
    }

    public void setDateOfExpiryH(String dateOfExpiryH) {
        this.dateOfExpiryH = dateOfExpiryH;
    }

    public Integer getVbIssueauthority() {
        return vbIssueauthority;
    }

    public void setVbIssueauthority(Integer vbIssueauthority) {
        this.vbIssueauthority = vbIssueauthority;
    }

    public Integer getVbPlaceofissue() {
        return vbPlaceofissue;
    }

    public void setVbPlaceofissue(Integer vbPlaceofissue) {
        this.vbPlaceofissue = vbPlaceofissue;
    }

    public boolean isIsprimary() {
        return isprimary;
    }

    public void setIsprimary(boolean isprimary) {
        this.isprimary = isprimary;
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

        ENTITY_TblDataCifIdentification that = (ENTITY_TblDataCifIdentification) o;

        if (recid != that.recid) return false;
        if (cifid != that.cifid) return false;
        if (vbIdtype != that.vbIdtype) return false;
        if (isprimary != that.isprimary) return false;
        if (recstatus != that.recstatus) return false;
        if (idseries != null ? !idseries.equals(that.idseries) : that.idseries != null) return false;
        if (idnumber != null ? !idnumber.equals(that.idnumber) : that.idnumber != null) return false;
        if (idversionno != null ? !idversionno.equals(that.idversionno) : that.idversionno != null) return false;
        if (dateOfIssueG != null ? !dateOfIssueG.equals(that.dateOfIssueG) : that.dateOfIssueG != null) return false;
        if (dateOfExpiryG != null ? !dateOfExpiryG.equals(that.dateOfExpiryG) : that.dateOfExpiryG != null)
            return false;
        if (dateOfIssueH != null ? !dateOfIssueH.equals(that.dateOfIssueH) : that.dateOfIssueH != null) return false;
        if (dateOfExpiryH != null ? !dateOfExpiryH.equals(that.dateOfExpiryH) : that.dateOfExpiryH != null)
            return false;
        if (vbIssueauthority != null ? !vbIssueauthority.equals(that.vbIssueauthority) : that.vbIssueauthority != null)
            return false;
        if (vbPlaceofissue != null ? !vbPlaceofissue.equals(that.vbPlaceofissue) : that.vbPlaceofissue != null)
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
        result = 31 * result + cifid;
        result = 31 * result + vbIdtype;
        result = 31 * result + (idseries != null ? idseries.hashCode() : 0);
        result = 31 * result + (idnumber != null ? idnumber.hashCode() : 0);
        result = 31 * result + (idversionno != null ? idversionno.hashCode() : 0);
        result = 31 * result + (dateOfIssueG != null ? dateOfIssueG.hashCode() : 0);
        result = 31 * result + (dateOfExpiryG != null ? dateOfExpiryG.hashCode() : 0);
        result = 31 * result + (dateOfIssueH != null ? dateOfIssueH.hashCode() : 0);
        result = 31 * result + (dateOfExpiryH != null ? dateOfExpiryH.hashCode() : 0);
        result = 31 * result + (vbIssueauthority != null ? vbIssueauthority.hashCode() : 0);
        result = 31 * result + (vbPlaceofissue != null ? vbPlaceofissue.hashCode() : 0);
        result = 31 * result + (isprimary ? 1 : 0);
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

    public ENTITY_TblDataCifCustomerdetails getTblDataCifCustomerdetailsByCifid() {
        return tblDataCifCustomerdetailsByCifid;
    }

    public void setTblDataCifCustomerdetailsByCifid(ENTITY_TblDataCifCustomerdetails tblDataCifCustomerdetailsByCifid) {
        this.tblDataCifCustomerdetailsByCifid = tblDataCifCustomerdetailsByCifid;
    }
}
