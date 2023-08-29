package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TBL_CNFG_MST_EMPLOYER", schema = "dbo", catalog = "master")
public class ENTITY_TblCnfgMstEmployer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EMPLOYERID", nullable = false, precision = 0)
    private int employerid;
    @Basic
    @Column(name = "EMPLOYERNAME1", nullable = true, length = 200)
    private String employername1;
    @Basic
    @Column(name = "EMPLOYERNAME2", nullable = true, length = 200)
    private String employername2;
    @Basic
    @Column(name = "EMPLOYERNAME3", nullable = true, length = 200)
    private String employername3;
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
    @Column(name = "VB_COMPANYTYPE", nullable = true, precision = 0)
    private Integer vbCompanytype;
    @Basic
    @Column(name = "VB_COMPANYCATEGORY", nullable = true, precision = 0)
    private Integer vbCompanycategory;
    @Basic
    @Column(name = "VB_SALARYDAY", nullable = true, precision = 0)
    private Integer vbSalaryday;
    @Basic
    @Column(name = "CONTACTPERSON", nullable = true, length = 50)
    private String contactperson;
    @Basic
    @Column(name = "CONTACTNO", nullable = true, length = 50)
    private String contactno;
    @Basic
    @Column(name = "EXTNNO", nullable = true, length = 50)
    private String extnno;
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

    public int getEmployerid() {
        return employerid;
    }

    public void setEmployerid(int employerid) {
        this.employerid = employerid;
    }

    public String getEmployername1() {
        return employername1;
    }

    public void setEmployername1(String employername1) {
        this.employername1 = employername1;
    }

    public String getEmployername2() {
        return employername2;
    }

    public void setEmployername2(String employername2) {
        this.employername2 = employername2;
    }

    public String getEmployername3() {
        return employername3;
    }

    public void setEmployername3(String employername3) {
        this.employername3 = employername3;
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

    public Integer getVbCompanytype() {
        return vbCompanytype;
    }

    public void setVbCompanytype(Integer vbCompanytype) {
        this.vbCompanytype = vbCompanytype;
    }

    public Integer getVbCompanycategory() {
        return vbCompanycategory;
    }

    public void setVbCompanycategory(Integer vbCompanycategory) {
        this.vbCompanycategory = vbCompanycategory;
    }

    public Integer getVbSalaryday() {
        return vbSalaryday;
    }

    public void setVbSalaryday(Integer vbSalaryday) {
        this.vbSalaryday = vbSalaryday;
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
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

        ENTITY_TblCnfgMstEmployer that = (ENTITY_TblCnfgMstEmployer) o;

        if (employerid != that.employerid) return false;
        if (recstatus != that.recstatus) return false;
        if (employername1 != null ? !employername1.equals(that.employername1) : that.employername1 != null)
            return false;
        if (employername2 != null ? !employername2.equals(that.employername2) : that.employername2 != null)
            return false;
        if (employername3 != null ? !employername3.equals(that.employername3) : that.employername3 != null)
            return false;
        if (vbEconomysector != null ? !vbEconomysector.equals(that.vbEconomysector) : that.vbEconomysector != null)
            return false;
        if (vbBusinessactivity != null ? !vbBusinessactivity.equals(that.vbBusinessactivity) : that.vbBusinessactivity != null)
            return false;
        if (vbMilitarycivil != null ? !vbMilitarycivil.equals(that.vbMilitarycivil) : that.vbMilitarycivil != null)
            return false;
        if (vbCompanytype != null ? !vbCompanytype.equals(that.vbCompanytype) : that.vbCompanytype != null)
            return false;
        if (vbCompanycategory != null ? !vbCompanycategory.equals(that.vbCompanycategory) : that.vbCompanycategory != null)
            return false;
        if (vbSalaryday != null ? !vbSalaryday.equals(that.vbSalaryday) : that.vbSalaryday != null) return false;
        if (contactperson != null ? !contactperson.equals(that.contactperson) : that.contactperson != null)
            return false;
        if (contactno != null ? !contactno.equals(that.contactno) : that.contactno != null) return false;
        if (extnno != null ? !extnno.equals(that.extnno) : that.extnno != null) return false;
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
        int result = employerid;
        result = 31 * result + (employername1 != null ? employername1.hashCode() : 0);
        result = 31 * result + (employername2 != null ? employername2.hashCode() : 0);
        result = 31 * result + (employername3 != null ? employername3.hashCode() : 0);
        result = 31 * result + (vbEconomysector != null ? vbEconomysector.hashCode() : 0);
        result = 31 * result + (vbBusinessactivity != null ? vbBusinessactivity.hashCode() : 0);
        result = 31 * result + (vbMilitarycivil != null ? vbMilitarycivil.hashCode() : 0);
        result = 31 * result + (vbCompanytype != null ? vbCompanytype.hashCode() : 0);
        result = 31 * result + (vbCompanycategory != null ? vbCompanycategory.hashCode() : 0);
        result = 31 * result + (vbSalaryday != null ? vbSalaryday.hashCode() : 0);
        result = 31 * result + (contactperson != null ? contactperson.hashCode() : 0);
        result = 31 * result + (contactno != null ? contactno.hashCode() : 0);
        result = 31 * result + (extnno != null ? extnno.hashCode() : 0);
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
}
