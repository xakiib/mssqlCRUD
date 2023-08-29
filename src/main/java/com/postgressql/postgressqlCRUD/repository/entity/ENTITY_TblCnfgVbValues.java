package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TBL_CNFG_VB_VALUES", schema = "dbo", catalog = "master")
@IdClass(ENTITY_TblCnfgVbValuesPK.class)
public class ENTITY_TblCnfgVbValues {
    @Basic
    @Column(name = "RECID", nullable = false, precision = 0)
    private int recid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "VALCODE", nullable = false, length = 50)
    private String valcode;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "KEYCODE", nullable = false, length = 50)
    private String keycode;
    @Basic
    @Column(name = "VALDESC1", nullable = false, length = 150)
    private String valdesc1;
    @Basic
    @Column(name = "VALDESC2", nullable = true, length = 150)
    private String valdesc2;
    @Basic
    @Column(name = "VALDESC3", nullable = true, length = 150)
    private String valdesc3;
    @Basic
    @Column(name = "PARENTRECID", nullable = true, precision = 0)
    private Integer parentrecid;
    @Basic
    @Column(name = "ISDEFAULTVALUE", nullable = false)
    private boolean isdefaultvalue;
    @Basic
    @Column(name = "FINANCIERID", nullable = true, precision = 0)
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
    @JoinColumn(name = "KEYCODE", referencedColumnName = "KEYCODE", nullable = false)
    private ENTITY_TblCnfgVbKeys tblCnfgVbKeysByKeycode;

    public int getRecid() {
        return recid;
    }

    public void setRecid(int recid) {
        this.recid = recid;
    }

    public String getValcode() {
        return valcode;
    }

    public void setValcode(String valcode) {
        this.valcode = valcode;
    }

    public String getKeycode() {
        return keycode;
    }

    public void setKeycode(String keycode) {
        this.keycode = keycode;
    }

    public String getValdesc1() {
        return valdesc1;
    }

    public void setValdesc1(String valdesc1) {
        this.valdesc1 = valdesc1;
    }

    public String getValdesc2() {
        return valdesc2;
    }

    public void setValdesc2(String valdesc2) {
        this.valdesc2 = valdesc2;
    }

    public String getValdesc3() {
        return valdesc3;
    }

    public void setValdesc3(String valdesc3) {
        this.valdesc3 = valdesc3;
    }

    public Integer getParentrecid() {
        return parentrecid;
    }

    public void setParentrecid(Integer parentrecid) {
        this.parentrecid = parentrecid;
    }

    public boolean isIsdefaultvalue() {
        return isdefaultvalue;
    }

    public void setIsdefaultvalue(boolean isdefaultvalue) {
        this.isdefaultvalue = isdefaultvalue;
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

        ENTITY_TblCnfgVbValues that = (ENTITY_TblCnfgVbValues) o;

        if (recid != that.recid) return false;
        if (isdefaultvalue != that.isdefaultvalue) return false;
        if (recstatus != that.recstatus) return false;
        if (valcode != null ? !valcode.equals(that.valcode) : that.valcode != null) return false;
        if (keycode != null ? !keycode.equals(that.keycode) : that.keycode != null) return false;
        if (valdesc1 != null ? !valdesc1.equals(that.valdesc1) : that.valdesc1 != null) return false;
        if (valdesc2 != null ? !valdesc2.equals(that.valdesc2) : that.valdesc2 != null) return false;
        if (valdesc3 != null ? !valdesc3.equals(that.valdesc3) : that.valdesc3 != null) return false;
        if (parentrecid != null ? !parentrecid.equals(that.parentrecid) : that.parentrecid != null) return false;
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
        int result = recid;
        result = 31 * result + (valcode != null ? valcode.hashCode() : 0);
        result = 31 * result + (keycode != null ? keycode.hashCode() : 0);
        result = 31 * result + (valdesc1 != null ? valdesc1.hashCode() : 0);
        result = 31 * result + (valdesc2 != null ? valdesc2.hashCode() : 0);
        result = 31 * result + (valdesc3 != null ? valdesc3.hashCode() : 0);
        result = 31 * result + (parentrecid != null ? parentrecid.hashCode() : 0);
        result = 31 * result + (isdefaultvalue ? 1 : 0);
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

    public ENTITY_TblCnfgVbKeys getTblCnfgVbKeysByKeycode() {
        return tblCnfgVbKeysByKeycode;
    }

    public void setTblCnfgVbKeysByKeycode(ENTITY_TblCnfgVbKeys tblCnfgVbKeysByKeycode) {
        this.tblCnfgVbKeysByKeycode = tblCnfgVbKeysByKeycode;
    }
}
