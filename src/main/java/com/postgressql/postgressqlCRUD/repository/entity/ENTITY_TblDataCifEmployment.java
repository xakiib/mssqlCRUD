package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "TBL_DATA_CIF_EMPLOYMENT", schema = "dbo", catalog = "master")
public class ENTITY_TblDataCifEmployment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RECID", nullable = false, precision = 0)
    private int recid;
    @Basic
    @Column(name = "CIFID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int cifid;
    @Basic
    @Column(name = "VB_EMPLOYMENTSTATUS", nullable = false, precision = 0)
    private int vbEmploymentstatus;
    @Basic
    @Column(name = "VB_EMPLOYMENTTYPE", nullable = true, precision = 0)
    private Integer vbEmploymenttype;
    @Basic
    @Column(name = "VB_DESIGNATION", nullable = true, precision = 0)
    private Integer vbDesignation;
    @Basic
    @Column(name = "VB_ECONOMYSECTOR", nullable = true, precision = 0)
    private Integer vbEconomysector;
    @Basic
    @Column(name = "VB_BUSINESSACTIVITY", nullable = true, precision = 0)
    private Integer vbBusinessactivity;
    @Basic
    @Column(name = "VB_MILITARYCIVIL", nullable = true, precision = 0)
    private Integer vbMilitarycivil;
    @Basic
    @Column(name = "VB_MILITARYRANK", nullable = true, precision = 0)
    private Integer vbMilitaryrank;
    @Basic
    @Column(name = "EMPLOYERID", nullable = true, precision = 0)
    private Integer employerid;
    @Basic
    @Column(name = "EMPLOYERNAME", nullable = true, length = 200)
    private String employername;
    @Basic
    @Column(name = "EMPLOYEENUMBER", nullable = true, length = 50)
    private String employeenumber;
    @Basic
    @Column(name = "DATEOFJOINING", nullable = true)
    private Date dateofjoining;
    @Basic
    @Column(name = "ENDDATE", nullable = true)
    private Date enddate;
    @Basic
    @Column(name = "YEARSATCURREMPL", nullable = true)
    private Integer yearsatcurrempl;
    @Basic
    @Column(name = "RETIREMENTAGE", nullable = true)
    private Integer retirementage;
    @Basic
    @Column(name = "RETIREMENTYEAR", nullable = true)
    private Integer retirementyear;
    @Basic
    @Column(name = "DEPARTMENT", nullable = true, length = 200)
    private String department;
    @Basic
    @Column(name = "CONTACTNO", nullable = true, length = 50)
    private String contactno;
    @Basic
    @Column(name = "EXTNNO", nullable = true, length = 50)
    private String extnno;
    @Basic
    @Column(name = "MANAGERNAME", nullable = false, length = 200)
    private String managername;
    @Basic
    @Column(name = "EMPPHNO", nullable = true, length = 50)
    private String empphno;
    @Basic
    @Column(name = "EMPPHNOEXTN", nullable = true, length = 50)
    private String empphnoextn;
    @Basic
    @Column(name = "BUSINESSNAME", nullable = true, length = 200)
    private String businessname;
    @Basic
    @Column(name = "BUSINESSREGNUMBER", nullable = true, length = 100)
    private String businessregnumber;
    @Basic
    @Column(name = "BUSINESSREGDATE", nullable = true)
    private Date businessregdate;
    @Basic
    @Column(name = "VB_BUSINESSREGAUTHORITY", nullable = true, precision = 0)
    private Integer vbBusinessregauthority;
    @Basic
    @Column(name = "NOOFPARTNERS", nullable = true)
    private Integer noofpartners;
    @Basic
    @Column(name = "SHAREPERCENT", nullable = true, precision = 3)
    private BigDecimal sharepercent;
    @Basic
    @Column(name = "NOOFEMPLOYEES", nullable = true)
    private Integer noofemployees;
    @Basic
    @Column(name = "VB_OFFICEOWNERSHIPTYPE", nullable = true, precision = 0)
    private Integer vbOfficeownershiptype;
    @Basic
    @Column(name = "VB_OFFICEPREMISESTYPE", nullable = true, precision = 0)
    private Integer vbOfficepremisestype;
    @Basic
    @Column(name = "OFFICEADDRESS", nullable = true, length = 250)
    private String officeaddress;
    @Basic
    @Column(name = "VB_COMPANYTYPE", nullable = true, precision = 0)
    private Integer vbCompanytype;
    @Basic
    @Column(name = "OFFICERENTPERMONTH", nullable = true)
    private Long officerentpermonth;
    @Basic
    @Column(name = "TOTALEXPERINCE", nullable = true)
    private Integer totalexperince;
    @Basic
    @Column(name = "REMARKS", nullable = true, length = 1000)
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

    public int getVbEmploymentstatus() {
        return vbEmploymentstatus;
    }

    public void setVbEmploymentstatus(int vbEmploymentstatus) {
        this.vbEmploymentstatus = vbEmploymentstatus;
    }

    public Integer getVbEmploymenttype() {
        return vbEmploymenttype;
    }

    public void setVbEmploymenttype(Integer vbEmploymenttype) {
        this.vbEmploymenttype = vbEmploymenttype;
    }

    public Integer getVbDesignation() {
        return vbDesignation;
    }

    public void setVbDesignation(Integer vbDesignation) {
        this.vbDesignation = vbDesignation;
    }

    public Integer getVbEconomysector() {
        return vbEconomysector;
    }

    public void setVbEconomysector(Integer vbEconomysector) {
        this.vbEconomysector = vbEconomysector;
    }

    public Integer getVbBusinessactivity() {
        return vbBusinessactivity;
    }

    public void setVbBusinessactivity(Integer vbBusinessactivity) {
        this.vbBusinessactivity = vbBusinessactivity;
    }

    public Integer getVbMilitarycivil() {
        return vbMilitarycivil;
    }

    public void setVbMilitarycivil(Integer vbMilitarycivil) {
        this.vbMilitarycivil = vbMilitarycivil;
    }

    public Integer getVbMilitaryrank() {
        return vbMilitaryrank;
    }

    public void setVbMilitaryrank(Integer vbMilitaryrank) {
        this.vbMilitaryrank = vbMilitaryrank;
    }

    public Integer getEmployerid() {
        return employerid;
    }

    public void setEmployerid(Integer employerid) {
        this.employerid = employerid;
    }

    public String getEmployername() {
        return employername;
    }

    public void setEmployername(String employername) {
        this.employername = employername;
    }

    public String getEmployeenumber() {
        return employeenumber;
    }

    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber;
    }

    public Date getDateofjoining() {
        return dateofjoining;
    }

    public void setDateofjoining(Date dateofjoining) {
        this.dateofjoining = dateofjoining;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getYearsatcurrempl() {
        return yearsatcurrempl;
    }

    public void setYearsatcurrempl(Integer yearsatcurrempl) {
        this.yearsatcurrempl = yearsatcurrempl;
    }

    public Integer getRetirementage() {
        return retirementage;
    }

    public void setRetirementage(Integer retirementage) {
        this.retirementage = retirementage;
    }

    public Integer getRetirementyear() {
        return retirementyear;
    }

    public void setRetirementyear(Integer retirementyear) {
        this.retirementyear = retirementyear;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getExtnno() {
        return extnno;
    }

    public void setExtnno(String extnno) {
        this.extnno = extnno;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public String getEmpphno() {
        return empphno;
    }

    public void setEmpphno(String empphno) {
        this.empphno = empphno;
    }

    public String getEmpphnoextn() {
        return empphnoextn;
    }

    public void setEmpphnoextn(String empphnoextn) {
        this.empphnoextn = empphnoextn;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public String getBusinessregnumber() {
        return businessregnumber;
    }

    public void setBusinessregnumber(String businessregnumber) {
        this.businessregnumber = businessregnumber;
    }

    public Date getBusinessregdate() {
        return businessregdate;
    }

    public void setBusinessregdate(Date businessregdate) {
        this.businessregdate = businessregdate;
    }

    public Integer getVbBusinessregauthority() {
        return vbBusinessregauthority;
    }

    public void setVbBusinessregauthority(Integer vbBusinessregauthority) {
        this.vbBusinessregauthority = vbBusinessregauthority;
    }

    public Integer getNoofpartners() {
        return noofpartners;
    }

    public void setNoofpartners(Integer noofpartners) {
        this.noofpartners = noofpartners;
    }

    public BigDecimal getSharepercent() {
        return sharepercent;
    }

    public void setSharepercent(BigDecimal sharepercent) {
        this.sharepercent = sharepercent;
    }

    public Integer getNoofemployees() {
        return noofemployees;
    }

    public void setNoofemployees(Integer noofemployees) {
        this.noofemployees = noofemployees;
    }

    public Integer getVbOfficeownershiptype() {
        return vbOfficeownershiptype;
    }

    public void setVbOfficeownershiptype(Integer vbOfficeownershiptype) {
        this.vbOfficeownershiptype = vbOfficeownershiptype;
    }

    public Integer getVbOfficepremisestype() {
        return vbOfficepremisestype;
    }

    public void setVbOfficepremisestype(Integer vbOfficepremisestype) {
        this.vbOfficepremisestype = vbOfficepremisestype;
    }

    public String getOfficeaddress() {
        return officeaddress;
    }

    public void setOfficeaddress(String officeaddress) {
        this.officeaddress = officeaddress;
    }

    public Integer getVbCompanytype() {
        return vbCompanytype;
    }

    public void setVbCompanytype(Integer vbCompanytype) {
        this.vbCompanytype = vbCompanytype;
    }

    public Long getOfficerentpermonth() {
        return officerentpermonth;
    }

    public void setOfficerentpermonth(Long officerentpermonth) {
        this.officerentpermonth = officerentpermonth;
    }

    public Integer getTotalexperince() {
        return totalexperince;
    }

    public void setTotalexperince(Integer totalexperince) {
        this.totalexperince = totalexperince;
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

        ENTITY_TblDataCifEmployment that = (ENTITY_TblDataCifEmployment) o;

        if (recid != that.recid) return false;
        if (cifid != that.cifid) return false;
        if (vbEmploymentstatus != that.vbEmploymentstatus) return false;
        if (isprimary != that.isprimary) return false;
        if (recstatus != that.recstatus) return false;
        if (vbEmploymenttype != null ? !vbEmploymenttype.equals(that.vbEmploymenttype) : that.vbEmploymenttype != null)
            return false;
        if (vbDesignation != null ? !vbDesignation.equals(that.vbDesignation) : that.vbDesignation != null)
            return false;
        if (vbEconomysector != null ? !vbEconomysector.equals(that.vbEconomysector) : that.vbEconomysector != null)
            return false;
        if (vbBusinessactivity != null ? !vbBusinessactivity.equals(that.vbBusinessactivity) : that.vbBusinessactivity != null)
            return false;
        if (vbMilitarycivil != null ? !vbMilitarycivil.equals(that.vbMilitarycivil) : that.vbMilitarycivil != null)
            return false;
        if (vbMilitaryrank != null ? !vbMilitaryrank.equals(that.vbMilitaryrank) : that.vbMilitaryrank != null)
            return false;
        if (employerid != null ? !employerid.equals(that.employerid) : that.employerid != null) return false;
        if (employername != null ? !employername.equals(that.employername) : that.employername != null) return false;
        if (employeenumber != null ? !employeenumber.equals(that.employeenumber) : that.employeenumber != null)
            return false;
        if (dateofjoining != null ? !dateofjoining.equals(that.dateofjoining) : that.dateofjoining != null)
            return false;
        if (enddate != null ? !enddate.equals(that.enddate) : that.enddate != null) return false;
        if (yearsatcurrempl != null ? !yearsatcurrempl.equals(that.yearsatcurrempl) : that.yearsatcurrempl != null)
            return false;
        if (retirementage != null ? !retirementage.equals(that.retirementage) : that.retirementage != null)
            return false;
        if (retirementyear != null ? !retirementyear.equals(that.retirementyear) : that.retirementyear != null)
            return false;
        if (department != null ? !department.equals(that.department) : that.department != null) return false;
        if (contactno != null ? !contactno.equals(that.contactno) : that.contactno != null) return false;
        if (extnno != null ? !extnno.equals(that.extnno) : that.extnno != null) return false;
        if (managername != null ? !managername.equals(that.managername) : that.managername != null) return false;
        if (empphno != null ? !empphno.equals(that.empphno) : that.empphno != null) return false;
        if (empphnoextn != null ? !empphnoextn.equals(that.empphnoextn) : that.empphnoextn != null) return false;
        if (businessname != null ? !businessname.equals(that.businessname) : that.businessname != null) return false;
        if (businessregnumber != null ? !businessregnumber.equals(that.businessregnumber) : that.businessregnumber != null)
            return false;
        if (businessregdate != null ? !businessregdate.equals(that.businessregdate) : that.businessregdate != null)
            return false;
        if (vbBusinessregauthority != null ? !vbBusinessregauthority.equals(that.vbBusinessregauthority) : that.vbBusinessregauthority != null)
            return false;
        if (noofpartners != null ? !noofpartners.equals(that.noofpartners) : that.noofpartners != null) return false;
        if (sharepercent != null ? !sharepercent.equals(that.sharepercent) : that.sharepercent != null) return false;
        if (noofemployees != null ? !noofemployees.equals(that.noofemployees) : that.noofemployees != null)
            return false;
        if (vbOfficeownershiptype != null ? !vbOfficeownershiptype.equals(that.vbOfficeownershiptype) : that.vbOfficeownershiptype != null)
            return false;
        if (vbOfficepremisestype != null ? !vbOfficepremisestype.equals(that.vbOfficepremisestype) : that.vbOfficepremisestype != null)
            return false;
        if (officeaddress != null ? !officeaddress.equals(that.officeaddress) : that.officeaddress != null)
            return false;
        if (vbCompanytype != null ? !vbCompanytype.equals(that.vbCompanytype) : that.vbCompanytype != null)
            return false;
        if (officerentpermonth != null ? !officerentpermonth.equals(that.officerentpermonth) : that.officerentpermonth != null)
            return false;
        if (totalexperince != null ? !totalexperince.equals(that.totalexperince) : that.totalexperince != null)
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
        result = 31 * result + cifid;
        result = 31 * result + vbEmploymentstatus;
        result = 31 * result + (vbEmploymenttype != null ? vbEmploymenttype.hashCode() : 0);
        result = 31 * result + (vbDesignation != null ? vbDesignation.hashCode() : 0);
        result = 31 * result + (vbEconomysector != null ? vbEconomysector.hashCode() : 0);
        result = 31 * result + (vbBusinessactivity != null ? vbBusinessactivity.hashCode() : 0);
        result = 31 * result + (vbMilitarycivil != null ? vbMilitarycivil.hashCode() : 0);
        result = 31 * result + (vbMilitaryrank != null ? vbMilitaryrank.hashCode() : 0);
        result = 31 * result + (employerid != null ? employerid.hashCode() : 0);
        result = 31 * result + (employername != null ? employername.hashCode() : 0);
        result = 31 * result + (employeenumber != null ? employeenumber.hashCode() : 0);
        result = 31 * result + (dateofjoining != null ? dateofjoining.hashCode() : 0);
        result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
        result = 31 * result + (yearsatcurrempl != null ? yearsatcurrempl.hashCode() : 0);
        result = 31 * result + (retirementage != null ? retirementage.hashCode() : 0);
        result = 31 * result + (retirementyear != null ? retirementyear.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (contactno != null ? contactno.hashCode() : 0);
        result = 31 * result + (extnno != null ? extnno.hashCode() : 0);
        result = 31 * result + (managername != null ? managername.hashCode() : 0);
        result = 31 * result + (empphno != null ? empphno.hashCode() : 0);
        result = 31 * result + (empphnoextn != null ? empphnoextn.hashCode() : 0);
        result = 31 * result + (businessname != null ? businessname.hashCode() : 0);
        result = 31 * result + (businessregnumber != null ? businessregnumber.hashCode() : 0);
        result = 31 * result + (businessregdate != null ? businessregdate.hashCode() : 0);
        result = 31 * result + (vbBusinessregauthority != null ? vbBusinessregauthority.hashCode() : 0);
        result = 31 * result + (noofpartners != null ? noofpartners.hashCode() : 0);
        result = 31 * result + (sharepercent != null ? sharepercent.hashCode() : 0);
        result = 31 * result + (noofemployees != null ? noofemployees.hashCode() : 0);
        result = 31 * result + (vbOfficeownershiptype != null ? vbOfficeownershiptype.hashCode() : 0);
        result = 31 * result + (vbOfficepremisestype != null ? vbOfficepremisestype.hashCode() : 0);
        result = 31 * result + (officeaddress != null ? officeaddress.hashCode() : 0);
        result = 31 * result + (vbCompanytype != null ? vbCompanytype.hashCode() : 0);
        result = 31 * result + (officerentpermonth != null ? officerentpermonth.hashCode() : 0);
        result = 31 * result + (totalexperince != null ? totalexperince.hashCode() : 0);
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
}
