package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "TBL_CNFG_SCHEME_CHARGEDETAIL", schema = "dbo", catalog = "master")
public class ENTITY_TblCnfgSchemeChargedetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RECID", nullable = false, precision = 0)
    private int recid;
    @Basic
    @Column(name = "TCSCMRECID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int tcscmrecid;
    @Basic
    @Column(name = "RULEID", nullable = false, precision = 0)
    private int ruleid;
    @Basic
    @Column(name = "PERCENTAGE", nullable = true, precision = 2)
    private BigDecimal percentage;
    @Basic
    @Column(name = "AMOUNT", nullable = true, precision = 2)
    private BigDecimal amount;
    @Basic
    @Column(name = "VB_CHARGECALCULATETYPE", nullable = false, precision = 0)
    private int vbChargecalculatetype;
    @Basic
    @Column(name = "VB_CHARGECALCULATEON", nullable = false, precision = 0)
    private int vbChargecalculateon;
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
    @JoinColumn(name = "TCSCMRECID", referencedColumnName = "RECID", nullable = false)
    private ENTITY_TblCnfgSchemeChargemaster tblCnfgSchemeChargemasterByTcscmrecid;

    public int getRecid() {
        return recid;
    }

    public void setRecid(int recid) {
        this.recid = recid;
    }

    public int getTcscmrecid() {
        return tcscmrecid;
    }

    public void setTcscmrecid(int tcscmrecid) {
        this.tcscmrecid = tcscmrecid;
    }

    public int getRuleid() {
        return ruleid;
    }

    public void setRuleid(int ruleid) {
        this.ruleid = ruleid;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getVbChargecalculatetype() {
        return vbChargecalculatetype;
    }

    public void setVbChargecalculatetype(int vbChargecalculatetype) {
        this.vbChargecalculatetype = vbChargecalculatetype;
    }

    public int getVbChargecalculateon() {
        return vbChargecalculateon;
    }

    public void setVbChargecalculateon(int vbChargecalculateon) {
        this.vbChargecalculateon = vbChargecalculateon;
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

        ENTITY_TblCnfgSchemeChargedetail that = (ENTITY_TblCnfgSchemeChargedetail) o;

        if (recid != that.recid) return false;
        if (tcscmrecid != that.tcscmrecid) return false;
        if (ruleid != that.ruleid) return false;
        if (vbChargecalculatetype != that.vbChargecalculatetype) return false;
        if (vbChargecalculateon != that.vbChargecalculateon) return false;
        if (recstatus != that.recstatus) return false;
        if (percentage != null ? !percentage.equals(that.percentage) : that.percentage != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
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
        result = 31 * result + tcscmrecid;
        result = 31 * result + ruleid;
        result = 31 * result + (percentage != null ? percentage.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + vbChargecalculatetype;
        result = 31 * result + vbChargecalculateon;
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

    public ENTITY_TblCnfgSchemeChargemaster getTblCnfgSchemeChargemasterByTcscmrecid() {
        return tblCnfgSchemeChargemasterByTcscmrecid;
    }

    public void setTblCnfgSchemeChargemasterByTcscmrecid(ENTITY_TblCnfgSchemeChargemaster tblCnfgSchemeChargemasterByTcscmrecid) {
        this.tblCnfgSchemeChargemasterByTcscmrecid = tblCnfgSchemeChargemasterByTcscmrecid;
    }
}
