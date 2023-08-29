package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "TBL_DATA_CIF_LIABILITIES", schema = "dbo", catalog = "master")
public class ENTITY_TblDataCifLiabilities {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RECID", nullable = false, precision = 0)
    private int recid;
    @Basic
    @Column(name = "CIFID", nullable = true, precision = 0, insertable=false, updatable=false)
    private Integer cifid;
    @Basic
    @Column(name = "VB_FINANCETYPE", nullable = true, precision = 0)
    private Integer vbFinancetype;
    @Basic
    @Column(name = "FACILITYTYPECODE", nullable = true, length = 50)
    private String facilitytypecode;
    @Basic
    @Column(name = "VB_PRODUCTID", nullable = true, precision = 0)
    private Integer vbProductid;
    @Basic
    @Column(name = "PRODUCTCODE", nullable = true, length = 50)
    private String productcode;
    @Basic
    @Column(name = "VB_SUBPRODUCTID", nullable = true, precision = 0)
    private Integer vbSubproductid;
    @Basic
    @Column(name = "PRODSUBTYPECODE", nullable = true, length = 50)
    private String prodsubtypecode;
    @Basic
    @Column(name = "VB_FINANCIERID", nullable = true, precision = 0)
    private Integer vbFinancierid;
    @Basic
    @Column(name = "FINANCIERNAME", nullable = true, length = 400)
    private String financiername;
    @Basic
    @Column(name = "ACCOUNTNUMBER", nullable = true, length = 50)
    private String accountnumber;
    @Basic
    @Column(name = "SANCTIONAMOUNT", nullable = true, precision = 2)
    private BigDecimal sanctionamount;
    @Basic
    @Column(name = "SANCTIONDATE", nullable = true)
    private Date sanctiondate;
    @Basic
    @Column(name = "MATURITYDATE", nullable = true)
    private Date maturitydate;
    @Basic
    @Column(name = "VB_ACCOUNTSTATUS", nullable = true, precision = 0)
    private Integer vbAccountstatus;
    @Basic
    @Column(name = "ACCOUNTSTATUS", nullable = true, length = 5)
    private String accountstatus;
    @Basic
    @Column(name = "CLOSEDDATE", nullable = true)
    private Date closeddate;
    @Basic
    @Column(name = "CONTRACTTENURE", nullable = true)
    private Integer contracttenure;
    @Basic
    @Column(name = "FREQUENCY", nullable = true)
    private Integer frequency;
    @Basic
    @Column(name = "INSTALLMENTAMOUNT", nullable = true, precision = 2)
    private BigDecimal installmentamount;
    @Basic
    @Column(name = "SALARYASSIGNED", nullable = true, length = 5)
    private String salaryassigned;
    @Basic
    @Column(name = "ISSECURED", nullable = true, length = 5)
    private String issecured;
    @Basic
    @Column(name = "OUTSTANDINGBALANCE", nullable = true, precision = 2)
    private BigDecimal outstandingbalance;
    @Basic
    @Column(name = "OVERDUEBALANCE", nullable = true, precision = 2)
    private BigDecimal overduebalance;
    @Basic
    @Column(name = "LASTPAYMENTAMOUNT", nullable = true, precision = 2)
    private BigDecimal lastpaymentamount;
    @Basic
    @Column(name = "LASTPAYMENTDATE", nullable = true)
    private Date lastpaymentdate;
    @Basic
    @Column(name = "ASOFDATE", nullable = true)
    private Date asofdate;
    @Basic
    @Column(name = "NEXTDUEDATE", nullable = true)
    private Date nextduedate;
    @Basic
    @Column(name = "CREDITHISTORY", nullable = true, length = 50)
    private String credithistory;
    @Basic
    @Column(name = "AVERAGEINSTALLMENT", nullable = true, precision = 2)
    private BigDecimal averageinstallment;
    @Basic
    @Column(name = "BALLOONPAYMENT", nullable = true, precision = 2)
    private BigDecimal balloonpayment;
    @Basic
    @Column(name = "DOWNPAYMENT", nullable = true, precision = 2)
    private BigDecimal downpayment;
    @Basic
    @Column(name = "DAMOUNT", nullable = true, precision = 2)
    private BigDecimal damount;
    @Basic
    @Column(name = "MAXINSTAMOUNT", nullable = true, precision = 2)
    private BigDecimal maxinstamount;
    @Basic
    @Column(name = "JOINTAPP", nullable = true, length = 50)
    private String jointapp;
    @Basic
    @Column(name = "SUBPROD", nullable = true, length = 50)
    private String subprod;
    @Basic
    @Column(name = "NOOFAPPLICANTS", nullable = true)
    private Integer noofapplicants;
    @Basic
    @Column(name = "PERCENTAGE", nullable = true, precision = 2)
    private BigDecimal percentage;
    @Basic
    @Column(name = "PCUB", nullable = true, precision = 2)
    private BigDecimal pcub;
    @Basic
    @Column(name = "PLIMIT", nullable = true, precision = 2)
    private BigDecimal plimit;
    @Basic
    @Column(name = "PINSTAL", nullable = true, precision = 2)
    private BigDecimal pinstal;
    @Basic
    @Column(name = "PLAST_AMT_PD", nullable = true, precision = 2)
    private BigDecimal plastAmtPd;
    @Basic
    @Column(name = "PPAST_DUE_AMT", nullable = true, precision = 2)
    private BigDecimal ppastDueAmt;
    @Basic
    @Column(name = "LPD", nullable = true, length = 100)
    private String lpd;
    @Basic
    @Column(name = "APAY", nullable = true, length = 500)
    private String apay;
    @Basic
    @Column(name = "LASTPAYDATE", nullable = true)
    private Date lastpaydate;
    @Basic
    @Column(name = "ISMULTIINSTALLMENT", nullable = true)
    private Boolean ismultiinstallment;
    @Basic
    @Column(name = "MULTIINSTPREVIOUSDATE", nullable = true)
    private Date multiinstpreviousdate;
    @Basic
    @Column(name = "MULTIINSTCURRENTDATE", nullable = true)
    private Date multiinstcurrentdate;
    @Basic
    @Column(name = "MULTIINSTNEXTDATE", nullable = true)
    private Date multiinstnextdate;
    @Basic
    @Column(name = "MULTIINSTPREVIOUSAMOUNT", nullable = true, precision = 2)
    private BigDecimal multiinstpreviousamount;
    @Basic
    @Column(name = "MULTIINSTCURRENTAMOUNT", nullable = true, precision = 2)
    private BigDecimal multiinstcurrentamount;
    @Basic
    @Column(name = "MULTIINSTNEXTAMOUNT", nullable = true, precision = 2)
    private BigDecimal multiinstnextamount;
    @Basic
    @Column(name = "ISDEFAULTED", nullable = true)
    private Boolean isdefaulted;
    @Basic
    @Column(name = "DEFAULTMONTHS", nullable = true)
    private Integer defaultmonths;
    @Basic
    @Column(name = "DEFAULTAMOUNT", nullable = true, precision = 2)
    private BigDecimal defaultamount;
    @Basic
    @Column(name = "DEFAULTOSAMOUNT", nullable = true, precision = 2)
    private BigDecimal defaultosamount;
    @Basic
    @Column(name = "INCLUDEINDBR", nullable = false)
    private boolean includeindbr;
    @Basic
    @Column(name = "VB_CURRENCY", nullable = true, precision = 0)
    private Integer vbCurrency;
    @Basic
    @Column(name = "VB_CREDITSOURCE", nullable = true, precision = 0)
    private Integer vbCreditsource;
    @Basic
    @Column(name = "REMARKS", nullable = true, length = 1000)
    private String remarks;
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

    public Integer getVbFinancetype() {
        return vbFinancetype;
    }

    public void setVbFinancetype(Integer vbFinancetype) {
        this.vbFinancetype = vbFinancetype;
    }

    public String getFacilitytypecode() {
        return facilitytypecode;
    }

    public void setFacilitytypecode(String facilitytypecode) {
        this.facilitytypecode = facilitytypecode;
    }

    public Integer getVbProductid() {
        return vbProductid;
    }

    public void setVbProductid(Integer vbProductid) {
        this.vbProductid = vbProductid;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public Integer getVbSubproductid() {
        return vbSubproductid;
    }

    public void setVbSubproductid(Integer vbSubproductid) {
        this.vbSubproductid = vbSubproductid;
    }

    public String getProdsubtypecode() {
        return prodsubtypecode;
    }

    public void setProdsubtypecode(String prodsubtypecode) {
        this.prodsubtypecode = prodsubtypecode;
    }

    public Integer getVbFinancierid() {
        return vbFinancierid;
    }

    public void setVbFinancierid(Integer vbFinancierid) {
        this.vbFinancierid = vbFinancierid;
    }

    public String getFinanciername() {
        return financiername;
    }

    public void setFinanciername(String financiername) {
        this.financiername = financiername;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public BigDecimal getSanctionamount() {
        return sanctionamount;
    }

    public void setSanctionamount(BigDecimal sanctionamount) {
        this.sanctionamount = sanctionamount;
    }

    public Date getSanctiondate() {
        return sanctiondate;
    }

    public void setSanctiondate(Date sanctiondate) {
        this.sanctiondate = sanctiondate;
    }

    public Date getMaturitydate() {
        return maturitydate;
    }

    public void setMaturitydate(Date maturitydate) {
        this.maturitydate = maturitydate;
    }

    public Integer getVbAccountstatus() {
        return vbAccountstatus;
    }

    public void setVbAccountstatus(Integer vbAccountstatus) {
        this.vbAccountstatus = vbAccountstatus;
    }

    public String getAccountstatus() {
        return accountstatus;
    }

    public void setAccountstatus(String accountstatus) {
        this.accountstatus = accountstatus;
    }

    public Date getCloseddate() {
        return closeddate;
    }

    public void setCloseddate(Date closeddate) {
        this.closeddate = closeddate;
    }

    public Integer getContracttenure() {
        return contracttenure;
    }

    public void setContracttenure(Integer contracttenure) {
        this.contracttenure = contracttenure;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public BigDecimal getInstallmentamount() {
        return installmentamount;
    }

    public void setInstallmentamount(BigDecimal installmentamount) {
        this.installmentamount = installmentamount;
    }

    public String getSalaryassigned() {
        return salaryassigned;
    }

    public void setSalaryassigned(String salaryassigned) {
        this.salaryassigned = salaryassigned;
    }

    public String getIssecured() {
        return issecured;
    }

    public void setIssecured(String issecured) {
        this.issecured = issecured;
    }

    public BigDecimal getOutstandingbalance() {
        return outstandingbalance;
    }

    public void setOutstandingbalance(BigDecimal outstandingbalance) {
        this.outstandingbalance = outstandingbalance;
    }

    public BigDecimal getOverduebalance() {
        return overduebalance;
    }

    public void setOverduebalance(BigDecimal overduebalance) {
        this.overduebalance = overduebalance;
    }

    public BigDecimal getLastpaymentamount() {
        return lastpaymentamount;
    }

    public void setLastpaymentamount(BigDecimal lastpaymentamount) {
        this.lastpaymentamount = lastpaymentamount;
    }

    public Date getLastpaymentdate() {
        return lastpaymentdate;
    }

    public void setLastpaymentdate(Date lastpaymentdate) {
        this.lastpaymentdate = lastpaymentdate;
    }

    public Date getAsofdate() {
        return asofdate;
    }

    public void setAsofdate(Date asofdate) {
        this.asofdate = asofdate;
    }

    public Date getNextduedate() {
        return nextduedate;
    }

    public void setNextduedate(Date nextduedate) {
        this.nextduedate = nextduedate;
    }

    public String getCredithistory() {
        return credithistory;
    }

    public void setCredithistory(String credithistory) {
        this.credithistory = credithistory;
    }

    public BigDecimal getAverageinstallment() {
        return averageinstallment;
    }

    public void setAverageinstallment(BigDecimal averageinstallment) {
        this.averageinstallment = averageinstallment;
    }

    public BigDecimal getBalloonpayment() {
        return balloonpayment;
    }

    public void setBalloonpayment(BigDecimal balloonpayment) {
        this.balloonpayment = balloonpayment;
    }

    public BigDecimal getDownpayment() {
        return downpayment;
    }

    public void setDownpayment(BigDecimal downpayment) {
        this.downpayment = downpayment;
    }

    public BigDecimal getDamount() {
        return damount;
    }

    public void setDamount(BigDecimal damount) {
        this.damount = damount;
    }

    public BigDecimal getMaxinstamount() {
        return maxinstamount;
    }

    public void setMaxinstamount(BigDecimal maxinstamount) {
        this.maxinstamount = maxinstamount;
    }

    public String getJointapp() {
        return jointapp;
    }

    public void setJointapp(String jointapp) {
        this.jointapp = jointapp;
    }

    public String getSubprod() {
        return subprod;
    }

    public void setSubprod(String subprod) {
        this.subprod = subprod;
    }

    public Integer getNoofapplicants() {
        return noofapplicants;
    }

    public void setNoofapplicants(Integer noofapplicants) {
        this.noofapplicants = noofapplicants;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public BigDecimal getPcub() {
        return pcub;
    }

    public void setPcub(BigDecimal pcub) {
        this.pcub = pcub;
    }

    public BigDecimal getPlimit() {
        return plimit;
    }

    public void setPlimit(BigDecimal plimit) {
        this.plimit = plimit;
    }

    public BigDecimal getPinstal() {
        return pinstal;
    }

    public void setPinstal(BigDecimal pinstal) {
        this.pinstal = pinstal;
    }

    public BigDecimal getPlastAmtPd() {
        return plastAmtPd;
    }

    public void setPlastAmtPd(BigDecimal plastAmtPd) {
        this.plastAmtPd = plastAmtPd;
    }

    public BigDecimal getPpastDueAmt() {
        return ppastDueAmt;
    }

    public void setPpastDueAmt(BigDecimal ppastDueAmt) {
        this.ppastDueAmt = ppastDueAmt;
    }

    public String getLpd() {
        return lpd;
    }

    public void setLpd(String lpd) {
        this.lpd = lpd;
    }

    public String getApay() {
        return apay;
    }

    public void setApay(String apay) {
        this.apay = apay;
    }

    public Date getLastpaydate() {
        return lastpaydate;
    }

    public void setLastpaydate(Date lastpaydate) {
        this.lastpaydate = lastpaydate;
    }

    public Boolean getIsmultiinstallment() {
        return ismultiinstallment;
    }

    public void setIsmultiinstallment(Boolean ismultiinstallment) {
        this.ismultiinstallment = ismultiinstallment;
    }

    public Date getMultiinstpreviousdate() {
        return multiinstpreviousdate;
    }

    public void setMultiinstpreviousdate(Date multiinstpreviousdate) {
        this.multiinstpreviousdate = multiinstpreviousdate;
    }

    public Date getMultiinstcurrentdate() {
        return multiinstcurrentdate;
    }

    public void setMultiinstcurrentdate(Date multiinstcurrentdate) {
        this.multiinstcurrentdate = multiinstcurrentdate;
    }

    public Date getMultiinstnextdate() {
        return multiinstnextdate;
    }

    public void setMultiinstnextdate(Date multiinstnextdate) {
        this.multiinstnextdate = multiinstnextdate;
    }

    public BigDecimal getMultiinstpreviousamount() {
        return multiinstpreviousamount;
    }

    public void setMultiinstpreviousamount(BigDecimal multiinstpreviousamount) {
        this.multiinstpreviousamount = multiinstpreviousamount;
    }

    public BigDecimal getMultiinstcurrentamount() {
        return multiinstcurrentamount;
    }

    public void setMultiinstcurrentamount(BigDecimal multiinstcurrentamount) {
        this.multiinstcurrentamount = multiinstcurrentamount;
    }

    public BigDecimal getMultiinstnextamount() {
        return multiinstnextamount;
    }

    public void setMultiinstnextamount(BigDecimal multiinstnextamount) {
        this.multiinstnextamount = multiinstnextamount;
    }

    public Boolean getIsdefaulted() {
        return isdefaulted;
    }

    public void setIsdefaulted(Boolean isdefaulted) {
        this.isdefaulted = isdefaulted;
    }

    public Integer getDefaultmonths() {
        return defaultmonths;
    }

    public void setDefaultmonths(Integer defaultmonths) {
        this.defaultmonths = defaultmonths;
    }

    public BigDecimal getDefaultamount() {
        return defaultamount;
    }

    public void setDefaultamount(BigDecimal defaultamount) {
        this.defaultamount = defaultamount;
    }

    public BigDecimal getDefaultosamount() {
        return defaultosamount;
    }

    public void setDefaultosamount(BigDecimal defaultosamount) {
        this.defaultosamount = defaultosamount;
    }

    public boolean isIncludeindbr() {
        return includeindbr;
    }

    public void setIncludeindbr(boolean includeindbr) {
        this.includeindbr = includeindbr;
    }

    public Integer getVbCurrency() {
        return vbCurrency;
    }

    public void setVbCurrency(Integer vbCurrency) {
        this.vbCurrency = vbCurrency;
    }

    public Integer getVbCreditsource() {
        return vbCreditsource;
    }

    public void setVbCreditsource(Integer vbCreditsource) {
        this.vbCreditsource = vbCreditsource;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

        ENTITY_TblDataCifLiabilities that = (ENTITY_TblDataCifLiabilities) o;

        if (recid != that.recid) return false;
        if (includeindbr != that.includeindbr) return false;
        if (recstatus != that.recstatus) return false;
        if (cifid != null ? !cifid.equals(that.cifid) : that.cifid != null) return false;
        if (vbFinancetype != null ? !vbFinancetype.equals(that.vbFinancetype) : that.vbFinancetype != null)
            return false;
        if (facilitytypecode != null ? !facilitytypecode.equals(that.facilitytypecode) : that.facilitytypecode != null)
            return false;
        if (vbProductid != null ? !vbProductid.equals(that.vbProductid) : that.vbProductid != null) return false;
        if (productcode != null ? !productcode.equals(that.productcode) : that.productcode != null) return false;
        if (vbSubproductid != null ? !vbSubproductid.equals(that.vbSubproductid) : that.vbSubproductid != null)
            return false;
        if (prodsubtypecode != null ? !prodsubtypecode.equals(that.prodsubtypecode) : that.prodsubtypecode != null)
            return false;
        if (vbFinancierid != null ? !vbFinancierid.equals(that.vbFinancierid) : that.vbFinancierid != null)
            return false;
        if (financiername != null ? !financiername.equals(that.financiername) : that.financiername != null)
            return false;
        if (accountnumber != null ? !accountnumber.equals(that.accountnumber) : that.accountnumber != null)
            return false;
        if (sanctionamount != null ? !sanctionamount.equals(that.sanctionamount) : that.sanctionamount != null)
            return false;
        if (sanctiondate != null ? !sanctiondate.equals(that.sanctiondate) : that.sanctiondate != null) return false;
        if (maturitydate != null ? !maturitydate.equals(that.maturitydate) : that.maturitydate != null) return false;
        if (vbAccountstatus != null ? !vbAccountstatus.equals(that.vbAccountstatus) : that.vbAccountstatus != null)
            return false;
        if (accountstatus != null ? !accountstatus.equals(that.accountstatus) : that.accountstatus != null)
            return false;
        if (closeddate != null ? !closeddate.equals(that.closeddate) : that.closeddate != null) return false;
        if (contracttenure != null ? !contracttenure.equals(that.contracttenure) : that.contracttenure != null)
            return false;
        if (frequency != null ? !frequency.equals(that.frequency) : that.frequency != null) return false;
        if (installmentamount != null ? !installmentamount.equals(that.installmentamount) : that.installmentamount != null)
            return false;
        if (salaryassigned != null ? !salaryassigned.equals(that.salaryassigned) : that.salaryassigned != null)
            return false;
        if (issecured != null ? !issecured.equals(that.issecured) : that.issecured != null) return false;
        if (outstandingbalance != null ? !outstandingbalance.equals(that.outstandingbalance) : that.outstandingbalance != null)
            return false;
        if (overduebalance != null ? !overduebalance.equals(that.overduebalance) : that.overduebalance != null)
            return false;
        if (lastpaymentamount != null ? !lastpaymentamount.equals(that.lastpaymentamount) : that.lastpaymentamount != null)
            return false;
        if (lastpaymentdate != null ? !lastpaymentdate.equals(that.lastpaymentdate) : that.lastpaymentdate != null)
            return false;
        if (asofdate != null ? !asofdate.equals(that.asofdate) : that.asofdate != null) return false;
        if (nextduedate != null ? !nextduedate.equals(that.nextduedate) : that.nextduedate != null) return false;
        if (credithistory != null ? !credithistory.equals(that.credithistory) : that.credithistory != null)
            return false;
        if (averageinstallment != null ? !averageinstallment.equals(that.averageinstallment) : that.averageinstallment != null)
            return false;
        if (balloonpayment != null ? !balloonpayment.equals(that.balloonpayment) : that.balloonpayment != null)
            return false;
        if (downpayment != null ? !downpayment.equals(that.downpayment) : that.downpayment != null) return false;
        if (damount != null ? !damount.equals(that.damount) : that.damount != null) return false;
        if (maxinstamount != null ? !maxinstamount.equals(that.maxinstamount) : that.maxinstamount != null)
            return false;
        if (jointapp != null ? !jointapp.equals(that.jointapp) : that.jointapp != null) return false;
        if (subprod != null ? !subprod.equals(that.subprod) : that.subprod != null) return false;
        if (noofapplicants != null ? !noofapplicants.equals(that.noofapplicants) : that.noofapplicants != null)
            return false;
        if (percentage != null ? !percentage.equals(that.percentage) : that.percentage != null) return false;
        if (pcub != null ? !pcub.equals(that.pcub) : that.pcub != null) return false;
        if (plimit != null ? !plimit.equals(that.plimit) : that.plimit != null) return false;
        if (pinstal != null ? !pinstal.equals(that.pinstal) : that.pinstal != null) return false;
        if (plastAmtPd != null ? !plastAmtPd.equals(that.plastAmtPd) : that.plastAmtPd != null) return false;
        if (ppastDueAmt != null ? !ppastDueAmt.equals(that.ppastDueAmt) : that.ppastDueAmt != null) return false;
        if (lpd != null ? !lpd.equals(that.lpd) : that.lpd != null) return false;
        if (apay != null ? !apay.equals(that.apay) : that.apay != null) return false;
        if (lastpaydate != null ? !lastpaydate.equals(that.lastpaydate) : that.lastpaydate != null) return false;
        if (ismultiinstallment != null ? !ismultiinstallment.equals(that.ismultiinstallment) : that.ismultiinstallment != null)
            return false;
        if (multiinstpreviousdate != null ? !multiinstpreviousdate.equals(that.multiinstpreviousdate) : that.multiinstpreviousdate != null)
            return false;
        if (multiinstcurrentdate != null ? !multiinstcurrentdate.equals(that.multiinstcurrentdate) : that.multiinstcurrentdate != null)
            return false;
        if (multiinstnextdate != null ? !multiinstnextdate.equals(that.multiinstnextdate) : that.multiinstnextdate != null)
            return false;
        if (multiinstpreviousamount != null ? !multiinstpreviousamount.equals(that.multiinstpreviousamount) : that.multiinstpreviousamount != null)
            return false;
        if (multiinstcurrentamount != null ? !multiinstcurrentamount.equals(that.multiinstcurrentamount) : that.multiinstcurrentamount != null)
            return false;
        if (multiinstnextamount != null ? !multiinstnextamount.equals(that.multiinstnextamount) : that.multiinstnextamount != null)
            return false;
        if (isdefaulted != null ? !isdefaulted.equals(that.isdefaulted) : that.isdefaulted != null) return false;
        if (defaultmonths != null ? !defaultmonths.equals(that.defaultmonths) : that.defaultmonths != null)
            return false;
        if (defaultamount != null ? !defaultamount.equals(that.defaultamount) : that.defaultamount != null)
            return false;
        if (defaultosamount != null ? !defaultosamount.equals(that.defaultosamount) : that.defaultosamount != null)
            return false;
        if (vbCurrency != null ? !vbCurrency.equals(that.vbCurrency) : that.vbCurrency != null) return false;
        if (vbCreditsource != null ? !vbCreditsource.equals(that.vbCreditsource) : that.vbCreditsource != null)
            return false;
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
        result = 31 * result + (vbFinancetype != null ? vbFinancetype.hashCode() : 0);
        result = 31 * result + (facilitytypecode != null ? facilitytypecode.hashCode() : 0);
        result = 31 * result + (vbProductid != null ? vbProductid.hashCode() : 0);
        result = 31 * result + (productcode != null ? productcode.hashCode() : 0);
        result = 31 * result + (vbSubproductid != null ? vbSubproductid.hashCode() : 0);
        result = 31 * result + (prodsubtypecode != null ? prodsubtypecode.hashCode() : 0);
        result = 31 * result + (vbFinancierid != null ? vbFinancierid.hashCode() : 0);
        result = 31 * result + (financiername != null ? financiername.hashCode() : 0);
        result = 31 * result + (accountnumber != null ? accountnumber.hashCode() : 0);
        result = 31 * result + (sanctionamount != null ? sanctionamount.hashCode() : 0);
        result = 31 * result + (sanctiondate != null ? sanctiondate.hashCode() : 0);
        result = 31 * result + (maturitydate != null ? maturitydate.hashCode() : 0);
        result = 31 * result + (vbAccountstatus != null ? vbAccountstatus.hashCode() : 0);
        result = 31 * result + (accountstatus != null ? accountstatus.hashCode() : 0);
        result = 31 * result + (closeddate != null ? closeddate.hashCode() : 0);
        result = 31 * result + (contracttenure != null ? contracttenure.hashCode() : 0);
        result = 31 * result + (frequency != null ? frequency.hashCode() : 0);
        result = 31 * result + (installmentamount != null ? installmentamount.hashCode() : 0);
        result = 31 * result + (salaryassigned != null ? salaryassigned.hashCode() : 0);
        result = 31 * result + (issecured != null ? issecured.hashCode() : 0);
        result = 31 * result + (outstandingbalance != null ? outstandingbalance.hashCode() : 0);
        result = 31 * result + (overduebalance != null ? overduebalance.hashCode() : 0);
        result = 31 * result + (lastpaymentamount != null ? lastpaymentamount.hashCode() : 0);
        result = 31 * result + (lastpaymentdate != null ? lastpaymentdate.hashCode() : 0);
        result = 31 * result + (asofdate != null ? asofdate.hashCode() : 0);
        result = 31 * result + (nextduedate != null ? nextduedate.hashCode() : 0);
        result = 31 * result + (credithistory != null ? credithistory.hashCode() : 0);
        result = 31 * result + (averageinstallment != null ? averageinstallment.hashCode() : 0);
        result = 31 * result + (balloonpayment != null ? balloonpayment.hashCode() : 0);
        result = 31 * result + (downpayment != null ? downpayment.hashCode() : 0);
        result = 31 * result + (damount != null ? damount.hashCode() : 0);
        result = 31 * result + (maxinstamount != null ? maxinstamount.hashCode() : 0);
        result = 31 * result + (jointapp != null ? jointapp.hashCode() : 0);
        result = 31 * result + (subprod != null ? subprod.hashCode() : 0);
        result = 31 * result + (noofapplicants != null ? noofapplicants.hashCode() : 0);
        result = 31 * result + (percentage != null ? percentage.hashCode() : 0);
        result = 31 * result + (pcub != null ? pcub.hashCode() : 0);
        result = 31 * result + (plimit != null ? plimit.hashCode() : 0);
        result = 31 * result + (pinstal != null ? pinstal.hashCode() : 0);
        result = 31 * result + (plastAmtPd != null ? plastAmtPd.hashCode() : 0);
        result = 31 * result + (ppastDueAmt != null ? ppastDueAmt.hashCode() : 0);
        result = 31 * result + (lpd != null ? lpd.hashCode() : 0);
        result = 31 * result + (apay != null ? apay.hashCode() : 0);
        result = 31 * result + (lastpaydate != null ? lastpaydate.hashCode() : 0);
        result = 31 * result + (ismultiinstallment != null ? ismultiinstallment.hashCode() : 0);
        result = 31 * result + (multiinstpreviousdate != null ? multiinstpreviousdate.hashCode() : 0);
        result = 31 * result + (multiinstcurrentdate != null ? multiinstcurrentdate.hashCode() : 0);
        result = 31 * result + (multiinstnextdate != null ? multiinstnextdate.hashCode() : 0);
        result = 31 * result + (multiinstpreviousamount != null ? multiinstpreviousamount.hashCode() : 0);
        result = 31 * result + (multiinstcurrentamount != null ? multiinstcurrentamount.hashCode() : 0);
        result = 31 * result + (multiinstnextamount != null ? multiinstnextamount.hashCode() : 0);
        result = 31 * result + (isdefaulted != null ? isdefaulted.hashCode() : 0);
        result = 31 * result + (defaultmonths != null ? defaultmonths.hashCode() : 0);
        result = 31 * result + (defaultamount != null ? defaultamount.hashCode() : 0);
        result = 31 * result + (defaultosamount != null ? defaultosamount.hashCode() : 0);
        result = 31 * result + (includeindbr ? 1 : 0);
        result = 31 * result + (vbCurrency != null ? vbCurrency.hashCode() : 0);
        result = 31 * result + (vbCreditsource != null ? vbCreditsource.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
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
