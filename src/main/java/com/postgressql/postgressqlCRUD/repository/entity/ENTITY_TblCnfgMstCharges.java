package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "TBL_CNFG_MST_CHARGES", schema = "dbo", catalog = "master")
public class ENTITY_TblCnfgMstCharges {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CHARGEID", nullable = false, precision = 0)
    private int chargeid;
    @Basic
    @Column(name = "CHARGENAME1", nullable = true, length = 100)
    private String chargename1;
    @Basic
    @Column(name = "CHARGENAME2", nullable = true, length = 100)
    private String chargename2;
    @Basic
    @Column(name = "CHARGENAME3", nullable = true, length = 100)
    private String chargename3;
    @Basic
    @Column(name = "FINANCIERID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int financierid;
    @Basic
    @Column(name = "MODULEID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int moduleid;
    @Basic
    @Column(name = "VB_CHARGECALCULATETYPE_DEFAULT", nullable = false, precision = 0)
    private int vbChargecalculatetypeDefault;
    @Basic
    @Column(name = "PERCENTAGE_DEFAULT", nullable = true, precision = 2)
    private BigDecimal percentageDefault;
    @Basic
    @Column(name = "AMOUNT_DEFAULT", nullable = true, precision = 2)
    private BigDecimal amountDefault;
    @Basic
    @Column(name = "VB_CHARGECALCULATEON_DEFAULT", nullable = true, precision = 0)
    private Integer vbChargecalculateonDefault;
    @Basic
    @Column(name = "VB_CHARGEPAYMENTTYPE", nullable = false, precision = 0)
    private int vbChargepaymenttype;
    @Basic
    @Column(name = "AMORTIZEFORREVENUE", nullable = false)
    private boolean amortizeforrevenue;
    @Basic
    @Column(name = "VB_AMORTIZATIONMETHOD", nullable = true, precision = 0)
    private Integer vbAmortizationmethod;
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
    @ManyToOne
    @JoinColumn(name = "MODULEID", referencedColumnName = "MODULEID", nullable = false)
    private ENTITY_TblCnfgMstModules tblCnfgMstModulesByModuleid;
    @OneToMany(mappedBy = "tblCnfgMstChargesByChargeid")
    private Collection<ENTITY_TblCnfgSchemeChargemaster> tblCnfgSchemeChargemastersByChargeid;

    public int getChargeid() {
        return chargeid;
    }

    public void setChargeid(int chargeid) {
        this.chargeid = chargeid;
    }

    public String getChargename1() {
        return chargename1;
    }

    public void setChargename1(String chargename1) {
        this.chargename1 = chargename1;
    }

    public String getChargename2() {
        return chargename2;
    }

    public void setChargename2(String chargename2) {
        this.chargename2 = chargename2;
    }

    public String getChargename3() {
        return chargename3;
    }

    public void setChargename3(String chargename3) {
        this.chargename3 = chargename3;
    }

    public int getFinancierid() {
        return financierid;
    }

    public void setFinancierid(int financierid) {
        this.financierid = financierid;
    }

    public int getModuleid() {
        return moduleid;
    }

    public void setModuleid(int moduleid) {
        this.moduleid = moduleid;
    }

    public int getVbChargecalculatetypeDefault() {
        return vbChargecalculatetypeDefault;
    }

    public void setVbChargecalculatetypeDefault(int vbChargecalculatetypeDefault) {
        this.vbChargecalculatetypeDefault = vbChargecalculatetypeDefault;
    }

    public BigDecimal getPercentageDefault() {
        return percentageDefault;
    }

    public void setPercentageDefault(BigDecimal percentageDefault) {
        this.percentageDefault = percentageDefault;
    }

    public BigDecimal getAmountDefault() {
        return amountDefault;
    }

    public void setAmountDefault(BigDecimal amountDefault) {
        this.amountDefault = amountDefault;
    }

    public Integer getVbChargecalculateonDefault() {
        return vbChargecalculateonDefault;
    }

    public void setVbChargecalculateonDefault(Integer vbChargecalculateonDefault) {
        this.vbChargecalculateonDefault = vbChargecalculateonDefault;
    }

    public int getVbChargepaymenttype() {
        return vbChargepaymenttype;
    }

    public void setVbChargepaymenttype(int vbChargepaymenttype) {
        this.vbChargepaymenttype = vbChargepaymenttype;
    }

    public boolean isAmortizeforrevenue() {
        return amortizeforrevenue;
    }

    public void setAmortizeforrevenue(boolean amortizeforrevenue) {
        this.amortizeforrevenue = amortizeforrevenue;
    }

    public Integer getVbAmortizationmethod() {
        return vbAmortizationmethod;
    }

    public void setVbAmortizationmethod(Integer vbAmortizationmethod) {
        this.vbAmortizationmethod = vbAmortizationmethod;
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

        ENTITY_TblCnfgMstCharges that = (ENTITY_TblCnfgMstCharges) o;

        if (chargeid != that.chargeid) return false;
        if (financierid != that.financierid) return false;
        if (moduleid != that.moduleid) return false;
        if (vbChargecalculatetypeDefault != that.vbChargecalculatetypeDefault) return false;
        if (vbChargepaymenttype != that.vbChargepaymenttype) return false;
        if (amortizeforrevenue != that.amortizeforrevenue) return false;
        if (recstatus != that.recstatus) return false;
        if (chargename1 != null ? !chargename1.equals(that.chargename1) : that.chargename1 != null) return false;
        if (chargename2 != null ? !chargename2.equals(that.chargename2) : that.chargename2 != null) return false;
        if (chargename3 != null ? !chargename3.equals(that.chargename3) : that.chargename3 != null) return false;
        if (percentageDefault != null ? !percentageDefault.equals(that.percentageDefault) : that.percentageDefault != null)
            return false;
        if (amountDefault != null ? !amountDefault.equals(that.amountDefault) : that.amountDefault != null)
            return false;
        if (vbChargecalculateonDefault != null ? !vbChargecalculateonDefault.equals(that.vbChargecalculateonDefault) : that.vbChargecalculateonDefault != null)
            return false;
        if (vbAmortizationmethod != null ? !vbAmortizationmethod.equals(that.vbAmortizationmethod) : that.vbAmortizationmethod != null)
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
        int result = chargeid;
        result = 31 * result + (chargename1 != null ? chargename1.hashCode() : 0);
        result = 31 * result + (chargename2 != null ? chargename2.hashCode() : 0);
        result = 31 * result + (chargename3 != null ? chargename3.hashCode() : 0);
        result = 31 * result + financierid;
        result = 31 * result + moduleid;
        result = 31 * result + vbChargecalculatetypeDefault;
        result = 31 * result + (percentageDefault != null ? percentageDefault.hashCode() : 0);
        result = 31 * result + (amountDefault != null ? amountDefault.hashCode() : 0);
        result = 31 * result + (vbChargecalculateonDefault != null ? vbChargecalculateonDefault.hashCode() : 0);
        result = 31 * result + vbChargepaymenttype;
        result = 31 * result + (amortizeforrevenue ? 1 : 0);
        result = 31 * result + (vbAmortizationmethod != null ? vbAmortizationmethod.hashCode() : 0);
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

    public ENTITY_TblCnfgMstModules getTblCnfgMstModulesByModuleid() {
        return tblCnfgMstModulesByModuleid;
    }

    public void setTblCnfgMstModulesByModuleid(ENTITY_TblCnfgMstModules tblCnfgMstModulesByModuleid) {
        this.tblCnfgMstModulesByModuleid = tblCnfgMstModulesByModuleid;
    }

    public Collection<ENTITY_TblCnfgSchemeChargemaster> getTblCnfgSchemeChargemastersByChargeid() {
        return tblCnfgSchemeChargemastersByChargeid;
    }

    public void setTblCnfgSchemeChargemastersByChargeid(Collection<ENTITY_TblCnfgSchemeChargemaster> tblCnfgSchemeChargemastersByChargeid) {
        this.tblCnfgSchemeChargemastersByChargeid = tblCnfgSchemeChargemastersByChargeid;
    }
}
