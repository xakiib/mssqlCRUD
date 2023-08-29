package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "TBL_DATA_CIF_BANK", schema = "dbo", catalog = "master")
public class ENTITY_TblDataCifBank {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RECID", nullable = false, precision = 0)
    private int recid;
    @Basic
    @Column(name = "CIFID", nullable = true, precision = 0, insertable=false, updatable=false)
    private Integer cifid;
    @Basic
    @Column(name = "VB_BANKCODE", nullable = true, precision = 0)
    private Integer vbBankcode;
    @Basic
    @Column(name = "BANKBRANCH", nullable = true, length = 50)
    private String bankbranch;
    @Basic
    @Column(name = "VB_COUNTRY", nullable = true, precision = 0)
    private Integer vbCountry;
    @Basic
    @Column(name = "VB_CITY", nullable = true, precision = 0)
    private Integer vbCity;
    @Basic
    @Column(name = "VB_BANKACCOUNTTYPE", nullable = true, precision = 0)
    private Integer vbBankaccounttype;
    @Basic
    @Column(name = "ACCOUNTTITLE", nullable = true, length = 100)
    private String accounttitle;
    @Basic
    @Column(name = "ACCOUNTNUMBER", nullable = true, length = 20)
    private String accountnumber;
    @Basic
    @Column(name = "IBAN", nullable = true, length = 20)
    private String iban;
    @Basic
    @Column(name = "SWIFTCODE", nullable = true, length = 15)
    private String swiftcode;
    @Basic
    @Column(name = "VB_CURRENCY", nullable = true, precision = 0)
    private Integer vbCurrency;
    @Basic
    @Column(name = "VB_SOURCESOFFUNDS", nullable = true, precision = 0)
    private Integer vbSourcesoffunds;
    @Basic
    @Column(name = "ACCOUNTSINCE", nullable = true, length = 50)
    private String accountsince;
    @Basic
    @Column(name = "NOOFCHEQUEBOUNCED", nullable = true)
    private Integer noofchequebounced;
    @Basic
    @Column(name = "NOOFSALARYCREDITED", nullable = true)
    private Integer noofsalarycredited;
    @Basic
    @Column(name = "AVERAGEMONTHLYBALANCE", nullable = true, precision = 2)
    private BigDecimal averagemonthlybalance;
    @Basic
    @Column(name = "NETCREDITS", nullable = true, precision = 2)
    private BigDecimal netcredits;
    @Basic
    @Column(name = "NETDEBITS", nullable = true, precision = 2)
    private BigDecimal netdebits;
    @Basic
    @Column(name = "REMARKS", nullable = true, length = 200)
    private String remarks;
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
    @JoinColumn(name = "CIFID", referencedColumnName = "CIFID")
    private ENTITY_TblDataCifCustomerdetails tblDataCifCustomerdetailsByCifid;
    @OneToMany(mappedBy = "tblDataCifBankByBankrecid")
    private Collection<ENTITY_TblDataCifBanktransdtl> tblDataCifBanktransdtlsByRecid;

    public int getRecid() {
        return recid;
    }

    public void setRecid(int recid) {
        this.recid = recid;
    }

    public Integer getCifid() {
        return cifid;
    }

    public void setCifid(Integer cifid) {
        this.cifid = cifid;
    }

    public Integer getVbBankcode() {
        return vbBankcode;
    }

    public void setVbBankcode(Integer vbBankcode) {
        this.vbBankcode = vbBankcode;
    }

    public String getBankbranch() {
        return bankbranch;
    }

    public void setBankbranch(String bankbranch) {
        this.bankbranch = bankbranch;
    }

    public Integer getVbCountry() {
        return vbCountry;
    }

    public void setVbCountry(Integer vbCountry) {
        this.vbCountry = vbCountry;
    }

    public Integer getVbCity() {
        return vbCity;
    }

    public void setVbCity(Integer vbCity) {
        this.vbCity = vbCity;
    }

    public Integer getVbBankaccounttype() {
        return vbBankaccounttype;
    }

    public void setVbBankaccounttype(Integer vbBankaccounttype) {
        this.vbBankaccounttype = vbBankaccounttype;
    }

    public String getAccounttitle() {
        return accounttitle;
    }

    public void setAccounttitle(String accounttitle) {
        this.accounttitle = accounttitle;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getSwiftcode() {
        return swiftcode;
    }

    public void setSwiftcode(String swiftcode) {
        this.swiftcode = swiftcode;
    }

    public Integer getVbCurrency() {
        return vbCurrency;
    }

    public void setVbCurrency(Integer vbCurrency) {
        this.vbCurrency = vbCurrency;
    }

    public Integer getVbSourcesoffunds() {
        return vbSourcesoffunds;
    }

    public void setVbSourcesoffunds(Integer vbSourcesoffunds) {
        this.vbSourcesoffunds = vbSourcesoffunds;
    }

    public String getAccountsince() {
        return accountsince;
    }

    public void setAccountsince(String accountsince) {
        this.accountsince = accountsince;
    }

    public Integer getNoofchequebounced() {
        return noofchequebounced;
    }

    public void setNoofchequebounced(Integer noofchequebounced) {
        this.noofchequebounced = noofchequebounced;
    }

    public Integer getNoofsalarycredited() {
        return noofsalarycredited;
    }

    public void setNoofsalarycredited(Integer noofsalarycredited) {
        this.noofsalarycredited = noofsalarycredited;
    }

    public BigDecimal getAveragemonthlybalance() {
        return averagemonthlybalance;
    }

    public void setAveragemonthlybalance(BigDecimal averagemonthlybalance) {
        this.averagemonthlybalance = averagemonthlybalance;
    }

    public BigDecimal getNetcredits() {
        return netcredits;
    }

    public void setNetcredits(BigDecimal netcredits) {
        this.netcredits = netcredits;
    }

    public BigDecimal getNetdebits() {
        return netdebits;
    }

    public void setNetdebits(BigDecimal netdebits) {
        this.netdebits = netdebits;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

        ENTITY_TblDataCifBank that = (ENTITY_TblDataCifBank) o;

        if (recid != that.recid) return false;
        if (isprimary != that.isprimary) return false;
        if (recstatus != that.recstatus) return false;
        if (cifid != null ? !cifid.equals(that.cifid) : that.cifid != null) return false;
        if (vbBankcode != null ? !vbBankcode.equals(that.vbBankcode) : that.vbBankcode != null) return false;
        if (bankbranch != null ? !bankbranch.equals(that.bankbranch) : that.bankbranch != null) return false;
        if (vbCountry != null ? !vbCountry.equals(that.vbCountry) : that.vbCountry != null) return false;
        if (vbCity != null ? !vbCity.equals(that.vbCity) : that.vbCity != null) return false;
        if (vbBankaccounttype != null ? !vbBankaccounttype.equals(that.vbBankaccounttype) : that.vbBankaccounttype != null)
            return false;
        if (accounttitle != null ? !accounttitle.equals(that.accounttitle) : that.accounttitle != null) return false;
        if (accountnumber != null ? !accountnumber.equals(that.accountnumber) : that.accountnumber != null)
            return false;
        if (iban != null ? !iban.equals(that.iban) : that.iban != null) return false;
        if (swiftcode != null ? !swiftcode.equals(that.swiftcode) : that.swiftcode != null) return false;
        if (vbCurrency != null ? !vbCurrency.equals(that.vbCurrency) : that.vbCurrency != null) return false;
        if (vbSourcesoffunds != null ? !vbSourcesoffunds.equals(that.vbSourcesoffunds) : that.vbSourcesoffunds != null)
            return false;
        if (accountsince != null ? !accountsince.equals(that.accountsince) : that.accountsince != null) return false;
        if (noofchequebounced != null ? !noofchequebounced.equals(that.noofchequebounced) : that.noofchequebounced != null)
            return false;
        if (noofsalarycredited != null ? !noofsalarycredited.equals(that.noofsalarycredited) : that.noofsalarycredited != null)
            return false;
        if (averagemonthlybalance != null ? !averagemonthlybalance.equals(that.averagemonthlybalance) : that.averagemonthlybalance != null)
            return false;
        if (netcredits != null ? !netcredits.equals(that.netcredits) : that.netcredits != null) return false;
        if (netdebits != null ? !netdebits.equals(that.netdebits) : that.netdebits != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
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
        result = 31 * result + (cifid != null ? cifid.hashCode() : 0);
        result = 31 * result + (vbBankcode != null ? vbBankcode.hashCode() : 0);
        result = 31 * result + (bankbranch != null ? bankbranch.hashCode() : 0);
        result = 31 * result + (vbCountry != null ? vbCountry.hashCode() : 0);
        result = 31 * result + (vbCity != null ? vbCity.hashCode() : 0);
        result = 31 * result + (vbBankaccounttype != null ? vbBankaccounttype.hashCode() : 0);
        result = 31 * result + (accounttitle != null ? accounttitle.hashCode() : 0);
        result = 31 * result + (accountnumber != null ? accountnumber.hashCode() : 0);
        result = 31 * result + (iban != null ? iban.hashCode() : 0);
        result = 31 * result + (swiftcode != null ? swiftcode.hashCode() : 0);
        result = 31 * result + (vbCurrency != null ? vbCurrency.hashCode() : 0);
        result = 31 * result + (vbSourcesoffunds != null ? vbSourcesoffunds.hashCode() : 0);
        result = 31 * result + (accountsince != null ? accountsince.hashCode() : 0);
        result = 31 * result + (noofchequebounced != null ? noofchequebounced.hashCode() : 0);
        result = 31 * result + (noofsalarycredited != null ? noofsalarycredited.hashCode() : 0);
        result = 31 * result + (averagemonthlybalance != null ? averagemonthlybalance.hashCode() : 0);
        result = 31 * result + (netcredits != null ? netcredits.hashCode() : 0);
        result = 31 * result + (netdebits != null ? netdebits.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
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

    public Collection<ENTITY_TblDataCifBanktransdtl> getTblDataCifBanktransdtlsByRecid() {
        return tblDataCifBanktransdtlsByRecid;
    }

    public void setTblDataCifBanktransdtlsByRecid(Collection<ENTITY_TblDataCifBanktransdtl> tblDataCifBanktransdtlsByRecid) {
        this.tblDataCifBanktransdtlsByRecid = tblDataCifBanktransdtlsByRecid;
    }
}
