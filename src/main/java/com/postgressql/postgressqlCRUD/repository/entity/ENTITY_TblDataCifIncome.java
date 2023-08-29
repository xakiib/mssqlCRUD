package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "TBL_DATA_CIF_INCOME", schema = "dbo", catalog = "master")
public class ENTITY_TblDataCifIncome {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RECID", nullable = false, precision = 0)
    private int recid;
    @Basic
    @Column(name = "CIFID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int cifid;
    @Basic
    @Column(name = "VB_PAYROLLTYPE", nullable = false, precision = 0)
    private int vbPayrolltype;
    @Basic
    @Column(name = "VB_PAYROLLCATEGORY", nullable = false, precision = 0)
    private int vbPayrollcategory;
    @Basic
    @Column(name = "PAYROLLAMOUNT", nullable = false, precision = 2)
    private BigDecimal payrollamount;
    @Basic
    @Column(name = "ADJUSTMENTPERCENTAGE", nullable = false, precision = 2)
    private BigDecimal adjustmentpercentage;
    @Basic
    @Column(name = "NETPAYROLLAMOUNT", nullable = true, precision = 2)
    private BigDecimal netpayrollamount;
    @Basic
    @Column(name = "VB_CURRENCY", nullable = true, precision = 0)
    private Integer vbCurrency;
    @Basic
    @Column(name = "CONSIDERINDBR", nullable = false)
    private boolean considerindbr;
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

    public int getVbPayrolltype() {
        return vbPayrolltype;
    }

    public void setVbPayrolltype(int vbPayrolltype) {
        this.vbPayrolltype = vbPayrolltype;
    }

    public int getVbPayrollcategory() {
        return vbPayrollcategory;
    }

    public void setVbPayrollcategory(int vbPayrollcategory) {
        this.vbPayrollcategory = vbPayrollcategory;
    }

    public BigDecimal getPayrollamount() {
        return payrollamount;
    }

    public void setPayrollamount(BigDecimal payrollamount) {
        this.payrollamount = payrollamount;
    }

    public BigDecimal getAdjustmentpercentage() {
        return adjustmentpercentage;
    }

    public void setAdjustmentpercentage(BigDecimal adjustmentpercentage) {
        this.adjustmentpercentage = adjustmentpercentage;
    }

    public BigDecimal getNetpayrollamount() {
        return netpayrollamount;
    }

    public void setNetpayrollamount(BigDecimal netpayrollamount) {
        this.netpayrollamount = netpayrollamount;
    }

    public Integer getVbCurrency() {
        return vbCurrency;
    }

    public void setVbCurrency(Integer vbCurrency) {
        this.vbCurrency = vbCurrency;
    }

    public boolean isConsiderindbr() {
        return considerindbr;
    }

    public void setConsiderindbr(boolean considerindbr) {
        this.considerindbr = considerindbr;
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

        ENTITY_TblDataCifIncome that = (ENTITY_TblDataCifIncome) o;

        if (recid != that.recid) return false;
        if (cifid != that.cifid) return false;
        if (vbPayrolltype != that.vbPayrolltype) return false;
        if (vbPayrollcategory != that.vbPayrollcategory) return false;
        if (considerindbr != that.considerindbr) return false;
        if (recstatus != that.recstatus) return false;
        if (payrollamount != null ? !payrollamount.equals(that.payrollamount) : that.payrollamount != null)
            return false;
        if (adjustmentpercentage != null ? !adjustmentpercentage.equals(that.adjustmentpercentage) : that.adjustmentpercentage != null)
            return false;
        if (netpayrollamount != null ? !netpayrollamount.equals(that.netpayrollamount) : that.netpayrollamount != null)
            return false;
        if (vbCurrency != null ? !vbCurrency.equals(that.vbCurrency) : that.vbCurrency != null) return false;
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
        result = 31 * result + cifid;
        result = 31 * result + vbPayrolltype;
        result = 31 * result + vbPayrollcategory;
        result = 31 * result + (payrollamount != null ? payrollamount.hashCode() : 0);
        result = 31 * result + (adjustmentpercentage != null ? adjustmentpercentage.hashCode() : 0);
        result = 31 * result + (netpayrollamount != null ? netpayrollamount.hashCode() : 0);
        result = 31 * result + (vbCurrency != null ? vbCurrency.hashCode() : 0);
        result = 31 * result + (considerindbr ? 1 : 0);
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
