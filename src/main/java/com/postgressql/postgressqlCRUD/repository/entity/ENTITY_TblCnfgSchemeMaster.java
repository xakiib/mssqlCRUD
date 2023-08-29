package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "TBL_CNFG_SCHEME_MASTER", schema = "dbo", catalog = "master")
public class ENTITY_TblCnfgSchemeMaster {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SCHEMEID", nullable = false, precision = 0)
    private int schemeid;
    @Basic
    @Column(name = "SCHEMENAME1", nullable = true, length = 150)
    private String schemename1;
    @Basic
    @Column(name = "SCHEMENAME2", nullable = true, length = 150)
    private String schemename2;
    @Basic
    @Column(name = "SCHEMENAME3", nullable = true, length = 150)
    private String schemename3;
    @Basic
    @Column(name = "FINANCIERID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int financierid;
    @Basic
    @Column(name = "PRODUCTCODE", nullable = false, length = 10, insertable=false, updatable=false)
    private String productcode;
    @Basic
    @Column(name = "SUBPRODUCTCODE", nullable = false, length = 50)
    private String subproductcode;
    @Basic
    @Column(name = "VALIDFROM", nullable = true)
    private Date validfrom;
    @Basic
    @Column(name = "VALIDTO", nullable = true)
    private Date validto;
    @Basic
    @Column(name = "MINLOANAMOUNT", nullable = false, precision = 2)
    private BigDecimal minloanamount;
    @Basic
    @Column(name = "MAXLOANAMOUNT", nullable = false, precision = 2)
    private BigDecimal maxloanamount;
    @Basic
    @Column(name = "MINTENURE", nullable = false)
    private int mintenure;
    @Basic
    @Column(name = "MAXTENURE", nullable = false)
    private int maxtenure;
    @Basic
    @Column(name = "MAXPROFITRATE", nullable = false, precision = 2)
    private BigDecimal maxprofitrate;
    @Basic
    @Column(name = "RESIDUALALLOWED", nullable = false)
    private boolean residualallowed;
    @Basic
    @Column(name = "DOWNPAYMENTALLOWED", nullable = false)
    private boolean downpaymentallowed;
    @Basic
    @Column(name = "MINDOWNPAYMENT", nullable = false, precision = 2)
    private BigDecimal mindownpayment;
    @Basic
    @Column(name = "MAXRESIDUAL", nullable = false, precision = 2)
    private BigDecimal maxresidual;
    @Basic
    @Column(name = "VB_RESIDUALREPAYMENT", nullable = false, precision = 0)
    private int vbResidualrepayment;
    @Basic
    @Column(name = "VB_CURRENCY", nullable = false, precision = 0)
    private int vbCurrency;
    @Basic
    @Column(name = "VB_REPAYMENTTYPE", nullable = false, precision = 0)
    private int vbRepaymenttype;
    @Basic
    @Column(name = "VB_REPAYFREQUENCY_PRINCIPAL", nullable = false, precision = 0)
    private int vbRepayfrequencyPrincipal;
    @Basic
    @Column(name = "VB_REPAYFREQUENCY_PROFIT", nullable = false, precision = 0)
    private int vbRepayfrequencyProfit;
    @Basic
    @Column(name = "VB_REPAYFREQUENCY_INSURANCE", nullable = true, precision = 0)
    private Integer vbRepayfrequencyInsurance;
    @Basic
    @Column(name = "VB_REPAYFREQUENCY_CAPITALCHARGES", nullable = true, precision = 0)
    private Integer vbRepayfrequencyCapitalcharges;
    @Basic
    @Column(name = "VB_REPAYFREQUENCY_AMORTCHARGES", nullable = true, precision = 0)
    private Integer vbRepayfrequencyAmortcharges;
    @Basic
    @Column(name = "VB_AMORTIZATIONMETHOD_PROFIT", nullable = false, precision = 0)
    private int vbAmortizationmethodProfit;
    @Basic
    @Column(name = "VB_AMORTIZATIONMETHOD_INSURANCE", nullable = true, precision = 0)
    private Integer vbAmortizationmethodInsurance;
    @Basic
    @Column(name = "VB_AMORTIZATIONMETHOD_AMORTCHARGES", nullable = false, precision = 0)
    private int vbAmortizationmethodAmortcharges;
    @Basic
    @Column(name = "ISASSETFINANCE", nullable = false)
    private boolean isassetfinance;
    @Basic
    @Column(name = "MAXASSETSALLOWED", nullable = false)
    private int maxassetsallowed;
    @Basic
    @Column(name = "ISGRACEPERIOD", nullable = false)
    private boolean isgraceperiod;
    @Basic
    @Column(name = "GRACEPERIODINMONTHS", nullable = true)
    private Integer graceperiodinmonths;
    @Basic
    @Column(name = "VB_GRACEPERIODTYPE", nullable = true, precision = 0)
    private Integer vbGraceperiodtype;
    @Basic
    @Column(name = "REVENUEINGRACEPERIOD", nullable = false)
    private boolean revenueingraceperiod;
    @Basic
    @Column(name = "INSURANCEINGRACEPERIOD", nullable = false)
    private boolean insuranceingraceperiod;
    @Basic
    @Column(name = "PROFITHOLIDAY", nullable = true)
    private Integer profitholiday;
    @Basic
    @Column(name = "PRINCIPALHOLIDAY", nullable = true)
    private Integer principalholiday;
    @Basic
    @Column(name = "VB_DUEDAY_DEFAULT", nullable = false, precision = 0)
    private int vbDuedayDefault;
    @Basic
    @Column(name = "DUEDAYCUTOFFDAYS_DEFAULT", nullable = false)
    private int duedaycutoffdaysDefault;
    @Basic
    @Column(name = "CUTOFFDAYSINGRACE", nullable = false)
    private boolean cutoffdaysingrace;
    @Basic
    @Column(name = "VB_CUTOFFSHIFTAPPROVAL", nullable = false, precision = 0)
    private int vbCutoffshiftapproval;
    @Basic
    @Column(name = "LOANROUNDING", nullable = false)
    private int loanrounding;
    @Basic
    @Column(name = "INSTALLMENTROUNDING", nullable = false)
    private int installmentrounding;
    @Basic
    @Column(name = "MINNOOFCOAPPL", nullable = true)
    private Integer minnoofcoappl;
    @Basic
    @Column(name = "MAXNOOFCOAPPL", nullable = true)
    private Integer maxnoofcoappl;
    @Basic
    @Column(name = "MINNOOFGUARANTOR", nullable = true)
    private Integer minnoofguarantor;
    @Basic
    @Column(name = "MAXNOOFGUARANTOR", nullable = true)
    private Integer maxnoofguarantor;
    @Basic
    @Column(name = "TOPUPLOCKMONTHS", nullable = true)
    private Integer topuplockmonths;
    @Basic
    @Column(name = "RESCHEDULELOCKMONTHS", nullable = true)
    private Integer reschedulelockmonths;
    @Basic
    @Column(name = "FORECLOSURELOCKMONTHS", nullable = true)
    private Integer foreclosurelockmonths;
    @Basic
    @Column(name = "FORECLOSUREPENALTY", nullable = true, precision = 2)
    private BigDecimal foreclosurepenalty;
    @Basic
    @Column(name = "RESTRUCTURELOCKMONTHS", nullable = true)
    private Integer restructurelockmonths;
    @Basic
    @Column(name = "PREPAYMENTLOCKMONTHS", nullable = true)
    private Integer prepaymentlockmonths;
    @Basic
    @Column(name = "PREPAYMENTPENALTY", nullable = true, precision = 2)
    private BigDecimal prepaymentpenalty;
    @Basic
    @Column(name = "MINPERIODBETWEENPREPAY", nullable = true)
    private Integer minperiodbetweenprepay;
    @Basic
    @Column(name = "PREPAYMENTMINALLOW", nullable = true, precision = 2)
    private BigDecimal prepaymentminallow;
    @Basic
    @Column(name = "PREPAYMENTMAXALLOW", nullable = true, precision = 2)
    private BigDecimal prepaymentmaxallow;
    @Basic
    @Column(name = "PREPAYMENTINAYEAR", nullable = true)
    private Integer prepaymentinayear;
    @Basic
    @Column(name = "PROFITBASIS", nullable = true, precision = 2)
    private BigDecimal profitbasis;
    @Basic
    @Column(name = "DAYSINYEAR", nullable = true, precision = 0)
    private Integer daysinyear;
    @Basic
    @Column(name = "VB_COMPOUNDINGFREQ", nullable = true, precision = 0)
    private Integer vbCompoundingfreq;
    @Basic
    @Column(name = "VB_CARDCATG", nullable = true, precision = 0)
    private Integer vbCardcatg;
    @Basic
    @Column(name = "VB_CARDTYPE", nullable = true, precision = 0)
    private Integer vbCardtype;
    @Basic
    @Column(name = "ISSTEPUPALLOWED", nullable = true)
    private Boolean isstepupallowed;
    @Basic
    @Column(name = "MAXNOOFSTEPUP", nullable = true)
    private Integer maxnoofstepup;
    @Basic
    @Column(name = "VB_STEPUPELIGIBILITYTYPE", nullable = true, precision = 0)
    private Integer vbStepupeligibilitytype;
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
    @OneToMany(mappedBy = "tblCnfgSchemeMasterBySchemeid")
    private Collection<ENTITY_TblCnfgSchemeChargemaster> tblCnfgSchemeChargemastersBySchemeid;
    @OneToMany(mappedBy = "tblCnfgSchemeMasterBySchemeid")
    private Collection<ENTITY_TblCnfgSchemeCriteria> tblCnfgSchemeCriteriaBySchemeid;
    @OneToMany(mappedBy = "tblCnfgSchemeMasterBySchemeid")
    private Collection<ENTITY_TblCnfgSchemeDownpayment> tblCnfgSchemeDownpaymentsBySchemeid;
    @OneToMany(mappedBy = "tblCnfgSchemeMasterBySchemeid")
    private Collection<ENTITY_TblCnfgSchemeDueday> tblCnfgSchemeDuedaysBySchemeid;
    @ManyToOne
    @JoinColumn(name = "FINANCIERID", referencedColumnName = "FINANCIERID", nullable = false)
    private ENTITY_TblCnfgMstFinanciers tblCnfgMstFinanciersByFinancierid;
    @ManyToOne
    @JoinColumn(name = "PRODUCTCODE", referencedColumnName = "PRODUCTCODE", nullable = false)
    private ENTITY_TblCnfgMstProducts tblCnfgMstProductsByProductcode;
    @OneToMany(mappedBy = "tblCnfgSchemeMasterBySchemeid")
    private Collection<ENTITY_TblCnfgSchemeProfitrate> tblCnfgSchemeProfitratesBySchemeid;
    @OneToMany(mappedBy = "tblCnfgSchemeMasterBySchemeid")
    private Collection<ENTITY_TblCnfgSchemeResidual> tblCnfgSchemeResidualsBySchemeid;

    public int getSchemeid() {
        return schemeid;
    }

    public void setSchemeid(int schemeid) {
        this.schemeid = schemeid;
    }

    public String getSchemename1() {
        return schemename1;
    }

    public void setSchemename1(String schemename1) {
        this.schemename1 = schemename1;
    }

    public String getSchemename2() {
        return schemename2;
    }

    public void setSchemename2(String schemename2) {
        this.schemename2 = schemename2;
    }

    public String getSchemename3() {
        return schemename3;
    }

    public void setSchemename3(String schemename3) {
        this.schemename3 = schemename3;
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

    public Date getValidfrom() {
        return validfrom;
    }

    public void setValidfrom(Date validfrom) {
        this.validfrom = validfrom;
    }

    public Date getValidto() {
        return validto;
    }

    public void setValidto(Date validto) {
        this.validto = validto;
    }

    public BigDecimal getMinloanamount() {
        return minloanamount;
    }

    public void setMinloanamount(BigDecimal minloanamount) {
        this.minloanamount = minloanamount;
    }

    public BigDecimal getMaxloanamount() {
        return maxloanamount;
    }

    public void setMaxloanamount(BigDecimal maxloanamount) {
        this.maxloanamount = maxloanamount;
    }

    public int getMintenure() {
        return mintenure;
    }

    public void setMintenure(int mintenure) {
        this.mintenure = mintenure;
    }

    public int getMaxtenure() {
        return maxtenure;
    }

    public void setMaxtenure(int maxtenure) {
        this.maxtenure = maxtenure;
    }

    public BigDecimal getMaxprofitrate() {
        return maxprofitrate;
    }

    public void setMaxprofitrate(BigDecimal maxprofitrate) {
        this.maxprofitrate = maxprofitrate;
    }

    public boolean isResidualallowed() {
        return residualallowed;
    }

    public void setResidualallowed(boolean residualallowed) {
        this.residualallowed = residualallowed;
    }

    public boolean isDownpaymentallowed() {
        return downpaymentallowed;
    }

    public void setDownpaymentallowed(boolean downpaymentallowed) {
        this.downpaymentallowed = downpaymentallowed;
    }

    public BigDecimal getMindownpayment() {
        return mindownpayment;
    }

    public void setMindownpayment(BigDecimal mindownpayment) {
        this.mindownpayment = mindownpayment;
    }

    public BigDecimal getMaxresidual() {
        return maxresidual;
    }

    public void setMaxresidual(BigDecimal maxresidual) {
        this.maxresidual = maxresidual;
    }

    public int getVbResidualrepayment() {
        return vbResidualrepayment;
    }

    public void setVbResidualrepayment(int vbResidualrepayment) {
        this.vbResidualrepayment = vbResidualrepayment;
    }

    public int getVbCurrency() {
        return vbCurrency;
    }

    public void setVbCurrency(int vbCurrency) {
        this.vbCurrency = vbCurrency;
    }

    public int getVbRepaymenttype() {
        return vbRepaymenttype;
    }

    public void setVbRepaymenttype(int vbRepaymenttype) {
        this.vbRepaymenttype = vbRepaymenttype;
    }

    public int getVbRepayfrequencyPrincipal() {
        return vbRepayfrequencyPrincipal;
    }

    public void setVbRepayfrequencyPrincipal(int vbRepayfrequencyPrincipal) {
        this.vbRepayfrequencyPrincipal = vbRepayfrequencyPrincipal;
    }

    public int getVbRepayfrequencyProfit() {
        return vbRepayfrequencyProfit;
    }

    public void setVbRepayfrequencyProfit(int vbRepayfrequencyProfit) {
        this.vbRepayfrequencyProfit = vbRepayfrequencyProfit;
    }

    public Integer getVbRepayfrequencyInsurance() {
        return vbRepayfrequencyInsurance;
    }

    public void setVbRepayfrequencyInsurance(Integer vbRepayfrequencyInsurance) {
        this.vbRepayfrequencyInsurance = vbRepayfrequencyInsurance;
    }

    public Integer getVbRepayfrequencyCapitalcharges() {
        return vbRepayfrequencyCapitalcharges;
    }

    public void setVbRepayfrequencyCapitalcharges(Integer vbRepayfrequencyCapitalcharges) {
        this.vbRepayfrequencyCapitalcharges = vbRepayfrequencyCapitalcharges;
    }

    public Integer getVbRepayfrequencyAmortcharges() {
        return vbRepayfrequencyAmortcharges;
    }

    public void setVbRepayfrequencyAmortcharges(Integer vbRepayfrequencyAmortcharges) {
        this.vbRepayfrequencyAmortcharges = vbRepayfrequencyAmortcharges;
    }

    public int getVbAmortizationmethodProfit() {
        return vbAmortizationmethodProfit;
    }

    public void setVbAmortizationmethodProfit(int vbAmortizationmethodProfit) {
        this.vbAmortizationmethodProfit = vbAmortizationmethodProfit;
    }

    public Integer getVbAmortizationmethodInsurance() {
        return vbAmortizationmethodInsurance;
    }

    public void setVbAmortizationmethodInsurance(Integer vbAmortizationmethodInsurance) {
        this.vbAmortizationmethodInsurance = vbAmortizationmethodInsurance;
    }

    public int getVbAmortizationmethodAmortcharges() {
        return vbAmortizationmethodAmortcharges;
    }

    public void setVbAmortizationmethodAmortcharges(int vbAmortizationmethodAmortcharges) {
        this.vbAmortizationmethodAmortcharges = vbAmortizationmethodAmortcharges;
    }

    public boolean isIsassetfinance() {
        return isassetfinance;
    }

    public void setIsassetfinance(boolean isassetfinance) {
        this.isassetfinance = isassetfinance;
    }

    public int getMaxassetsallowed() {
        return maxassetsallowed;
    }

    public void setMaxassetsallowed(int maxassetsallowed) {
        this.maxassetsallowed = maxassetsallowed;
    }

    public boolean isIsgraceperiod() {
        return isgraceperiod;
    }

    public void setIsgraceperiod(boolean isgraceperiod) {
        this.isgraceperiod = isgraceperiod;
    }

    public Integer getGraceperiodinmonths() {
        return graceperiodinmonths;
    }

    public void setGraceperiodinmonths(Integer graceperiodinmonths) {
        this.graceperiodinmonths = graceperiodinmonths;
    }

    public Integer getVbGraceperiodtype() {
        return vbGraceperiodtype;
    }

    public void setVbGraceperiodtype(Integer vbGraceperiodtype) {
        this.vbGraceperiodtype = vbGraceperiodtype;
    }

    public boolean isRevenueingraceperiod() {
        return revenueingraceperiod;
    }

    public void setRevenueingraceperiod(boolean revenueingraceperiod) {
        this.revenueingraceperiod = revenueingraceperiod;
    }

    public boolean isInsuranceingraceperiod() {
        return insuranceingraceperiod;
    }

    public void setInsuranceingraceperiod(boolean insuranceingraceperiod) {
        this.insuranceingraceperiod = insuranceingraceperiod;
    }

    public Integer getProfitholiday() {
        return profitholiday;
    }

    public void setProfitholiday(Integer profitholiday) {
        this.profitholiday = profitholiday;
    }

    public Integer getPrincipalholiday() {
        return principalholiday;
    }

    public void setPrincipalholiday(Integer principalholiday) {
        this.principalholiday = principalholiday;
    }

    public int getVbDuedayDefault() {
        return vbDuedayDefault;
    }

    public void setVbDuedayDefault(int vbDuedayDefault) {
        this.vbDuedayDefault = vbDuedayDefault;
    }

    public int getDuedaycutoffdaysDefault() {
        return duedaycutoffdaysDefault;
    }

    public void setDuedaycutoffdaysDefault(int duedaycutoffdaysDefault) {
        this.duedaycutoffdaysDefault = duedaycutoffdaysDefault;
    }

    public boolean isCutoffdaysingrace() {
        return cutoffdaysingrace;
    }

    public void setCutoffdaysingrace(boolean cutoffdaysingrace) {
        this.cutoffdaysingrace = cutoffdaysingrace;
    }

    public int getVbCutoffshiftapproval() {
        return vbCutoffshiftapproval;
    }

    public void setVbCutoffshiftapproval(int vbCutoffshiftapproval) {
        this.vbCutoffshiftapproval = vbCutoffshiftapproval;
    }

    public int getLoanrounding() {
        return loanrounding;
    }

    public void setLoanrounding(int loanrounding) {
        this.loanrounding = loanrounding;
    }

    public int getInstallmentrounding() {
        return installmentrounding;
    }

    public void setInstallmentrounding(int installmentrounding) {
        this.installmentrounding = installmentrounding;
    }

    public Integer getMinnoofcoappl() {
        return minnoofcoappl;
    }

    public void setMinnoofcoappl(Integer minnoofcoappl) {
        this.minnoofcoappl = minnoofcoappl;
    }

    public Integer getMaxnoofcoappl() {
        return maxnoofcoappl;
    }

    public void setMaxnoofcoappl(Integer maxnoofcoappl) {
        this.maxnoofcoappl = maxnoofcoappl;
    }

    public Integer getMinnoofguarantor() {
        return minnoofguarantor;
    }

    public void setMinnoofguarantor(Integer minnoofguarantor) {
        this.minnoofguarantor = minnoofguarantor;
    }

    public Integer getMaxnoofguarantor() {
        return maxnoofguarantor;
    }

    public void setMaxnoofguarantor(Integer maxnoofguarantor) {
        this.maxnoofguarantor = maxnoofguarantor;
    }

    public Integer getTopuplockmonths() {
        return topuplockmonths;
    }

    public void setTopuplockmonths(Integer topuplockmonths) {
        this.topuplockmonths = topuplockmonths;
    }

    public Integer getReschedulelockmonths() {
        return reschedulelockmonths;
    }

    public void setReschedulelockmonths(Integer reschedulelockmonths) {
        this.reschedulelockmonths = reschedulelockmonths;
    }

    public Integer getForeclosurelockmonths() {
        return foreclosurelockmonths;
    }

    public void setForeclosurelockmonths(Integer foreclosurelockmonths) {
        this.foreclosurelockmonths = foreclosurelockmonths;
    }

    public BigDecimal getForeclosurepenalty() {
        return foreclosurepenalty;
    }

    public void setForeclosurepenalty(BigDecimal foreclosurepenalty) {
        this.foreclosurepenalty = foreclosurepenalty;
    }

    public Integer getRestructurelockmonths() {
        return restructurelockmonths;
    }

    public void setRestructurelockmonths(Integer restructurelockmonths) {
        this.restructurelockmonths = restructurelockmonths;
    }

    public Integer getPrepaymentlockmonths() {
        return prepaymentlockmonths;
    }

    public void setPrepaymentlockmonths(Integer prepaymentlockmonths) {
        this.prepaymentlockmonths = prepaymentlockmonths;
    }

    public BigDecimal getPrepaymentpenalty() {
        return prepaymentpenalty;
    }

    public void setPrepaymentpenalty(BigDecimal prepaymentpenalty) {
        this.prepaymentpenalty = prepaymentpenalty;
    }

    public Integer getMinperiodbetweenprepay() {
        return minperiodbetweenprepay;
    }

    public void setMinperiodbetweenprepay(Integer minperiodbetweenprepay) {
        this.minperiodbetweenprepay = minperiodbetweenprepay;
    }

    public BigDecimal getPrepaymentminallow() {
        return prepaymentminallow;
    }

    public void setPrepaymentminallow(BigDecimal prepaymentminallow) {
        this.prepaymentminallow = prepaymentminallow;
    }

    public BigDecimal getPrepaymentmaxallow() {
        return prepaymentmaxallow;
    }

    public void setPrepaymentmaxallow(BigDecimal prepaymentmaxallow) {
        this.prepaymentmaxallow = prepaymentmaxallow;
    }

    public Integer getPrepaymentinayear() {
        return prepaymentinayear;
    }

    public void setPrepaymentinayear(Integer prepaymentinayear) {
        this.prepaymentinayear = prepaymentinayear;
    }

    public BigDecimal getProfitbasis() {
        return profitbasis;
    }

    public void setProfitbasis(BigDecimal profitbasis) {
        this.profitbasis = profitbasis;
    }

    public Integer getDaysinyear() {
        return daysinyear;
    }

    public void setDaysinyear(Integer daysinyear) {
        this.daysinyear = daysinyear;
    }

    public Integer getVbCompoundingfreq() {
        return vbCompoundingfreq;
    }

    public void setVbCompoundingfreq(Integer vbCompoundingfreq) {
        this.vbCompoundingfreq = vbCompoundingfreq;
    }

    public Integer getVbCardcatg() {
        return vbCardcatg;
    }

    public void setVbCardcatg(Integer vbCardcatg) {
        this.vbCardcatg = vbCardcatg;
    }

    public Integer getVbCardtype() {
        return vbCardtype;
    }

    public void setVbCardtype(Integer vbCardtype) {
        this.vbCardtype = vbCardtype;
    }

    public Boolean getIsstepupallowed() {
        return isstepupallowed;
    }

    public void setIsstepupallowed(Boolean isstepupallowed) {
        this.isstepupallowed = isstepupallowed;
    }

    public Integer getMaxnoofstepup() {
        return maxnoofstepup;
    }

    public void setMaxnoofstepup(Integer maxnoofstepup) {
        this.maxnoofstepup = maxnoofstepup;
    }

    public Integer getVbStepupeligibilitytype() {
        return vbStepupeligibilitytype;
    }

    public void setVbStepupeligibilitytype(Integer vbStepupeligibilitytype) {
        this.vbStepupeligibilitytype = vbStepupeligibilitytype;
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

        ENTITY_TblCnfgSchemeMaster that = (ENTITY_TblCnfgSchemeMaster) o;

        if (schemeid != that.schemeid) return false;
        if (financierid != that.financierid) return false;
        if (mintenure != that.mintenure) return false;
        if (maxtenure != that.maxtenure) return false;
        if (residualallowed != that.residualallowed) return false;
        if (downpaymentallowed != that.downpaymentallowed) return false;
        if (vbResidualrepayment != that.vbResidualrepayment) return false;
        if (vbCurrency != that.vbCurrency) return false;
        if (vbRepaymenttype != that.vbRepaymenttype) return false;
        if (vbRepayfrequencyPrincipal != that.vbRepayfrequencyPrincipal) return false;
        if (vbRepayfrequencyProfit != that.vbRepayfrequencyProfit) return false;
        if (vbAmortizationmethodProfit != that.vbAmortizationmethodProfit) return false;
        if (vbAmortizationmethodAmortcharges != that.vbAmortizationmethodAmortcharges) return false;
        if (isassetfinance != that.isassetfinance) return false;
        if (maxassetsallowed != that.maxassetsallowed) return false;
        if (isgraceperiod != that.isgraceperiod) return false;
        if (revenueingraceperiod != that.revenueingraceperiod) return false;
        if (insuranceingraceperiod != that.insuranceingraceperiod) return false;
        if (vbDuedayDefault != that.vbDuedayDefault) return false;
        if (duedaycutoffdaysDefault != that.duedaycutoffdaysDefault) return false;
        if (cutoffdaysingrace != that.cutoffdaysingrace) return false;
        if (vbCutoffshiftapproval != that.vbCutoffshiftapproval) return false;
        if (loanrounding != that.loanrounding) return false;
        if (installmentrounding != that.installmentrounding) return false;
        if (recstatus != that.recstatus) return false;
        if (schemename1 != null ? !schemename1.equals(that.schemename1) : that.schemename1 != null) return false;
        if (schemename2 != null ? !schemename2.equals(that.schemename2) : that.schemename2 != null) return false;
        if (schemename3 != null ? !schemename3.equals(that.schemename3) : that.schemename3 != null) return false;
        if (productcode != null ? !productcode.equals(that.productcode) : that.productcode != null) return false;
        if (subproductcode != null ? !subproductcode.equals(that.subproductcode) : that.subproductcode != null)
            return false;
        if (validfrom != null ? !validfrom.equals(that.validfrom) : that.validfrom != null) return false;
        if (validto != null ? !validto.equals(that.validto) : that.validto != null) return false;
        if (minloanamount != null ? !minloanamount.equals(that.minloanamount) : that.minloanamount != null)
            return false;
        if (maxloanamount != null ? !maxloanamount.equals(that.maxloanamount) : that.maxloanamount != null)
            return false;
        if (maxprofitrate != null ? !maxprofitrate.equals(that.maxprofitrate) : that.maxprofitrate != null)
            return false;
        if (mindownpayment != null ? !mindownpayment.equals(that.mindownpayment) : that.mindownpayment != null)
            return false;
        if (maxresidual != null ? !maxresidual.equals(that.maxresidual) : that.maxresidual != null) return false;
        if (vbRepayfrequencyInsurance != null ? !vbRepayfrequencyInsurance.equals(that.vbRepayfrequencyInsurance) : that.vbRepayfrequencyInsurance != null)
            return false;
        if (vbRepayfrequencyCapitalcharges != null ? !vbRepayfrequencyCapitalcharges.equals(that.vbRepayfrequencyCapitalcharges) : that.vbRepayfrequencyCapitalcharges != null)
            return false;
        if (vbRepayfrequencyAmortcharges != null ? !vbRepayfrequencyAmortcharges.equals(that.vbRepayfrequencyAmortcharges) : that.vbRepayfrequencyAmortcharges != null)
            return false;
        if (vbAmortizationmethodInsurance != null ? !vbAmortizationmethodInsurance.equals(that.vbAmortizationmethodInsurance) : that.vbAmortizationmethodInsurance != null)
            return false;
        if (graceperiodinmonths != null ? !graceperiodinmonths.equals(that.graceperiodinmonths) : that.graceperiodinmonths != null)
            return false;
        if (vbGraceperiodtype != null ? !vbGraceperiodtype.equals(that.vbGraceperiodtype) : that.vbGraceperiodtype != null)
            return false;
        if (profitholiday != null ? !profitholiday.equals(that.profitholiday) : that.profitholiday != null)
            return false;
        if (principalholiday != null ? !principalholiday.equals(that.principalholiday) : that.principalholiday != null)
            return false;
        if (minnoofcoappl != null ? !minnoofcoappl.equals(that.minnoofcoappl) : that.minnoofcoappl != null)
            return false;
        if (maxnoofcoappl != null ? !maxnoofcoappl.equals(that.maxnoofcoappl) : that.maxnoofcoappl != null)
            return false;
        if (minnoofguarantor != null ? !minnoofguarantor.equals(that.minnoofguarantor) : that.minnoofguarantor != null)
            return false;
        if (maxnoofguarantor != null ? !maxnoofguarantor.equals(that.maxnoofguarantor) : that.maxnoofguarantor != null)
            return false;
        if (topuplockmonths != null ? !topuplockmonths.equals(that.topuplockmonths) : that.topuplockmonths != null)
            return false;
        if (reschedulelockmonths != null ? !reschedulelockmonths.equals(that.reschedulelockmonths) : that.reschedulelockmonths != null)
            return false;
        if (foreclosurelockmonths != null ? !foreclosurelockmonths.equals(that.foreclosurelockmonths) : that.foreclosurelockmonths != null)
            return false;
        if (foreclosurepenalty != null ? !foreclosurepenalty.equals(that.foreclosurepenalty) : that.foreclosurepenalty != null)
            return false;
        if (restructurelockmonths != null ? !restructurelockmonths.equals(that.restructurelockmonths) : that.restructurelockmonths != null)
            return false;
        if (prepaymentlockmonths != null ? !prepaymentlockmonths.equals(that.prepaymentlockmonths) : that.prepaymentlockmonths != null)
            return false;
        if (prepaymentpenalty != null ? !prepaymentpenalty.equals(that.prepaymentpenalty) : that.prepaymentpenalty != null)
            return false;
        if (minperiodbetweenprepay != null ? !minperiodbetweenprepay.equals(that.minperiodbetweenprepay) : that.minperiodbetweenprepay != null)
            return false;
        if (prepaymentminallow != null ? !prepaymentminallow.equals(that.prepaymentminallow) : that.prepaymentminallow != null)
            return false;
        if (prepaymentmaxallow != null ? !prepaymentmaxallow.equals(that.prepaymentmaxallow) : that.prepaymentmaxallow != null)
            return false;
        if (prepaymentinayear != null ? !prepaymentinayear.equals(that.prepaymentinayear) : that.prepaymentinayear != null)
            return false;
        if (profitbasis != null ? !profitbasis.equals(that.profitbasis) : that.profitbasis != null) return false;
        if (daysinyear != null ? !daysinyear.equals(that.daysinyear) : that.daysinyear != null) return false;
        if (vbCompoundingfreq != null ? !vbCompoundingfreq.equals(that.vbCompoundingfreq) : that.vbCompoundingfreq != null)
            return false;
        if (vbCardcatg != null ? !vbCardcatg.equals(that.vbCardcatg) : that.vbCardcatg != null) return false;
        if (vbCardtype != null ? !vbCardtype.equals(that.vbCardtype) : that.vbCardtype != null) return false;
        if (isstepupallowed != null ? !isstepupallowed.equals(that.isstepupallowed) : that.isstepupallowed != null)
            return false;
        if (maxnoofstepup != null ? !maxnoofstepup.equals(that.maxnoofstepup) : that.maxnoofstepup != null)
            return false;
        if (vbStepupeligibilitytype != null ? !vbStepupeligibilitytype.equals(that.vbStepupeligibilitytype) : that.vbStepupeligibilitytype != null)
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
        int result = schemeid;
        result = 31 * result + (schemename1 != null ? schemename1.hashCode() : 0);
        result = 31 * result + (schemename2 != null ? schemename2.hashCode() : 0);
        result = 31 * result + (schemename3 != null ? schemename3.hashCode() : 0);
        result = 31 * result + financierid;
        result = 31 * result + (productcode != null ? productcode.hashCode() : 0);
        result = 31 * result + (subproductcode != null ? subproductcode.hashCode() : 0);
        result = 31 * result + (validfrom != null ? validfrom.hashCode() : 0);
        result = 31 * result + (validto != null ? validto.hashCode() : 0);
        result = 31 * result + (minloanamount != null ? minloanamount.hashCode() : 0);
        result = 31 * result + (maxloanamount != null ? maxloanamount.hashCode() : 0);
        result = 31 * result + mintenure;
        result = 31 * result + maxtenure;
        result = 31 * result + (maxprofitrate != null ? maxprofitrate.hashCode() : 0);
        result = 31 * result + (residualallowed ? 1 : 0);
        result = 31 * result + (downpaymentallowed ? 1 : 0);
        result = 31 * result + (mindownpayment != null ? mindownpayment.hashCode() : 0);
        result = 31 * result + (maxresidual != null ? maxresidual.hashCode() : 0);
        result = 31 * result + vbResidualrepayment;
        result = 31 * result + vbCurrency;
        result = 31 * result + vbRepaymenttype;
        result = 31 * result + vbRepayfrequencyPrincipal;
        result = 31 * result + vbRepayfrequencyProfit;
        result = 31 * result + (vbRepayfrequencyInsurance != null ? vbRepayfrequencyInsurance.hashCode() : 0);
        result = 31 * result + (vbRepayfrequencyCapitalcharges != null ? vbRepayfrequencyCapitalcharges.hashCode() : 0);
        result = 31 * result + (vbRepayfrequencyAmortcharges != null ? vbRepayfrequencyAmortcharges.hashCode() : 0);
        result = 31 * result + vbAmortizationmethodProfit;
        result = 31 * result + (vbAmortizationmethodInsurance != null ? vbAmortizationmethodInsurance.hashCode() : 0);
        result = 31 * result + vbAmortizationmethodAmortcharges;
        result = 31 * result + (isassetfinance ? 1 : 0);
        result = 31 * result + maxassetsallowed;
        result = 31 * result + (isgraceperiod ? 1 : 0);
        result = 31 * result + (graceperiodinmonths != null ? graceperiodinmonths.hashCode() : 0);
        result = 31 * result + (vbGraceperiodtype != null ? vbGraceperiodtype.hashCode() : 0);
        result = 31 * result + (revenueingraceperiod ? 1 : 0);
        result = 31 * result + (insuranceingraceperiod ? 1 : 0);
        result = 31 * result + (profitholiday != null ? profitholiday.hashCode() : 0);
        result = 31 * result + (principalholiday != null ? principalholiday.hashCode() : 0);
        result = 31 * result + vbDuedayDefault;
        result = 31 * result + duedaycutoffdaysDefault;
        result = 31 * result + (cutoffdaysingrace ? 1 : 0);
        result = 31 * result + vbCutoffshiftapproval;
        result = 31 * result + loanrounding;
        result = 31 * result + installmentrounding;
        result = 31 * result + (minnoofcoappl != null ? minnoofcoappl.hashCode() : 0);
        result = 31 * result + (maxnoofcoappl != null ? maxnoofcoappl.hashCode() : 0);
        result = 31 * result + (minnoofguarantor != null ? minnoofguarantor.hashCode() : 0);
        result = 31 * result + (maxnoofguarantor != null ? maxnoofguarantor.hashCode() : 0);
        result = 31 * result + (topuplockmonths != null ? topuplockmonths.hashCode() : 0);
        result = 31 * result + (reschedulelockmonths != null ? reschedulelockmonths.hashCode() : 0);
        result = 31 * result + (foreclosurelockmonths != null ? foreclosurelockmonths.hashCode() : 0);
        result = 31 * result + (foreclosurepenalty != null ? foreclosurepenalty.hashCode() : 0);
        result = 31 * result + (restructurelockmonths != null ? restructurelockmonths.hashCode() : 0);
        result = 31 * result + (prepaymentlockmonths != null ? prepaymentlockmonths.hashCode() : 0);
        result = 31 * result + (prepaymentpenalty != null ? prepaymentpenalty.hashCode() : 0);
        result = 31 * result + (minperiodbetweenprepay != null ? minperiodbetweenprepay.hashCode() : 0);
        result = 31 * result + (prepaymentminallow != null ? prepaymentminallow.hashCode() : 0);
        result = 31 * result + (prepaymentmaxallow != null ? prepaymentmaxallow.hashCode() : 0);
        result = 31 * result + (prepaymentinayear != null ? prepaymentinayear.hashCode() : 0);
        result = 31 * result + (profitbasis != null ? profitbasis.hashCode() : 0);
        result = 31 * result + (daysinyear != null ? daysinyear.hashCode() : 0);
        result = 31 * result + (vbCompoundingfreq != null ? vbCompoundingfreq.hashCode() : 0);
        result = 31 * result + (vbCardcatg != null ? vbCardcatg.hashCode() : 0);
        result = 31 * result + (vbCardtype != null ? vbCardtype.hashCode() : 0);
        result = 31 * result + (isstepupallowed != null ? isstepupallowed.hashCode() : 0);
        result = 31 * result + (maxnoofstepup != null ? maxnoofstepup.hashCode() : 0);
        result = 31 * result + (vbStepupeligibilitytype != null ? vbStepupeligibilitytype.hashCode() : 0);
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

    public Collection<ENTITY_TblCnfgSchemeChargemaster> getTblCnfgSchemeChargemastersBySchemeid() {
        return tblCnfgSchemeChargemastersBySchemeid;
    }

    public void setTblCnfgSchemeChargemastersBySchemeid(Collection<ENTITY_TblCnfgSchemeChargemaster> tblCnfgSchemeChargemastersBySchemeid) {
        this.tblCnfgSchemeChargemastersBySchemeid = tblCnfgSchemeChargemastersBySchemeid;
    }

    public Collection<ENTITY_TblCnfgSchemeCriteria> getTblCnfgSchemeCriteriaBySchemeid() {
        return tblCnfgSchemeCriteriaBySchemeid;
    }

    public void setTblCnfgSchemeCriteriaBySchemeid(Collection<ENTITY_TblCnfgSchemeCriteria> tblCnfgSchemeCriteriaBySchemeid) {
        this.tblCnfgSchemeCriteriaBySchemeid = tblCnfgSchemeCriteriaBySchemeid;
    }

    public Collection<ENTITY_TblCnfgSchemeDownpayment> getTblCnfgSchemeDownpaymentsBySchemeid() {
        return tblCnfgSchemeDownpaymentsBySchemeid;
    }

    public void setTblCnfgSchemeDownpaymentsBySchemeid(Collection<ENTITY_TblCnfgSchemeDownpayment> tblCnfgSchemeDownpaymentsBySchemeid) {
        this.tblCnfgSchemeDownpaymentsBySchemeid = tblCnfgSchemeDownpaymentsBySchemeid;
    }

    public Collection<ENTITY_TblCnfgSchemeDueday> getTblCnfgSchemeDuedaysBySchemeid() {
        return tblCnfgSchemeDuedaysBySchemeid;
    }

    public void setTblCnfgSchemeDuedaysBySchemeid(Collection<ENTITY_TblCnfgSchemeDueday> tblCnfgSchemeDuedaysBySchemeid) {
        this.tblCnfgSchemeDuedaysBySchemeid = tblCnfgSchemeDuedaysBySchemeid;
    }

    public ENTITY_TblCnfgMstFinanciers getTblCnfgMstFinanciersByFinancierid() {
        return tblCnfgMstFinanciersByFinancierid;
    }

    public void setTblCnfgMstFinanciersByFinancierid(ENTITY_TblCnfgMstFinanciers tblCnfgMstFinanciersByFinancierid) {
        this.tblCnfgMstFinanciersByFinancierid = tblCnfgMstFinanciersByFinancierid;
    }

    public ENTITY_TblCnfgMstProducts getTblCnfgMstProductsByProductcode() {
        return tblCnfgMstProductsByProductcode;
    }

    public void setTblCnfgMstProductsByProductcode(ENTITY_TblCnfgMstProducts tblCnfgMstProductsByProductcode) {
        this.tblCnfgMstProductsByProductcode = tblCnfgMstProductsByProductcode;
    }

    public Collection<ENTITY_TblCnfgSchemeProfitrate> getTblCnfgSchemeProfitratesBySchemeid() {
        return tblCnfgSchemeProfitratesBySchemeid;
    }

    public void setTblCnfgSchemeProfitratesBySchemeid(Collection<ENTITY_TblCnfgSchemeProfitrate> tblCnfgSchemeProfitratesBySchemeid) {
        this.tblCnfgSchemeProfitratesBySchemeid = tblCnfgSchemeProfitratesBySchemeid;
    }

    public Collection<ENTITY_TblCnfgSchemeResidual> getTblCnfgSchemeResidualsBySchemeid() {
        return tblCnfgSchemeResidualsBySchemeid;
    }

    public void setTblCnfgSchemeResidualsBySchemeid(Collection<ENTITY_TblCnfgSchemeResidual> tblCnfgSchemeResidualsBySchemeid) {
        this.tblCnfgSchemeResidualsBySchemeid = tblCnfgSchemeResidualsBySchemeid;
    }
}
