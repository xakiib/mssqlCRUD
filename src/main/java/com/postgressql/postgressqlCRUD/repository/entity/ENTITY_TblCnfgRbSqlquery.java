//package com.postgressql.postgressqlCRUD.repository.entity;
//
//import jakarta.persistence.Basic;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
//
//import java.sql.Date;
//
//@Entity
//@Table(name = "TBL_CNFG_RB_SQLQUERY", schema = "dbo", catalog = "master")
//public class ENTITY_TblCnfgRbSqlquery {
//    @Basic
//    @Column(name = "QUERYID", nullable = false, precision = 0)
//    private int queryid;
//    @Basic
//    @Column(name = "QUERYNAME1", nullable = false, length = 150)
//    private String queryname1;
//    @Basic
//    @Column(name = "QUERYNAME2", nullable = false, length = 150)
//    private String queryname2;
//    @Basic
//    @Column(name = "QUERYNAME3", nullable = false, length = 150)
//    private String queryname3;
//    @Basic
//    @Column(name = "QUERYDESCRIPTION", nullable = true, length = 500)
//    private String querydescription;
//    @Basic
//    @Column(name = "VB_SQLQUERYTYPE", nullable = false, precision = 0)
//    private int vbSqlquerytype;
//    @Basic
//    @Column(name = "QUERYTEXT1", nullable = true, length = 4000)
//    private String querytext1;
//    @Basic
//    @Column(name = "QUERYTEXT2", nullable = true, length = 4000)
//    private String querytext2;
//    @Basic
//    @Column(name = "QUERYTEXT3", nullable = true, length = 4000)
//    private String querytext3;
//    @Basic
//    @Column(name = "QUERYTEXT4", nullable = true, length = 4000)
//    private String querytext4;
//    @Basic
//    @Column(name = "QUERYTEXT5", nullable = true, length = 4000)
//    private String querytext5;
//    @Basic
//    @Column(name = "OTHDESC1", nullable = true, length = 100)
//    private String othdesc1;
//    @Basic
//    @Column(name = "OTHDESC2", nullable = true, length = 100)
//    private String othdesc2;
//    @Basic
//    @Column(name = "OTHDESC3", nullable = true, length = 100)
//    private String othdesc3;
//    @Basic
//    @Column(name = "OTHDESC4", nullable = true, length = 100)
//    private String othdesc4;
//    @Basic
//    @Column(name = "MAKER", nullable = false, length = 50)
//    private String maker;
//    @Basic
//    @Column(name = "MAKEDATE", nullable = false)
//    private Date makedate;
//    @Basic
//    @Column(name = "CHECKER", nullable = true, length = 50)
//    private String checker;
//    @Basic
//    @Column(name = "CHECKDATE", nullable = true)
//    private Date checkdate;
//    @Basic
//    @Column(name = "UPDATEBY", nullable = true, length = 50)
//    private String updateby;
//    @Basic
//    @Column(name = "UPDATEDATE", nullable = true)
//    private Date updatedate;
//    @Basic
//    @Column(name = "RECSTATUS", nullable = false)
//    private boolean recstatus;
//
//    public int getQueryid() {
//        return queryid;
//    }
//
//    public void setQueryid(int queryid) {
//        this.queryid = queryid;
//    }
//
//    public String getQueryname1() {
//        return queryname1;
//    }
//
//    public void setQueryname1(String queryname1) {
//        this.queryname1 = queryname1;
//    }
//
//    public String getQueryname2() {
//        return queryname2;
//    }
//
//    public void setQueryname2(String queryname2) {
//        this.queryname2 = queryname2;
//    }
//
//    public String getQueryname3() {
//        return queryname3;
//    }
//
//    public void setQueryname3(String queryname3) {
//        this.queryname3 = queryname3;
//    }
//
//    public String getQuerydescription() {
//        return querydescription;
//    }
//
//    public void setQuerydescription(String querydescription) {
//        this.querydescription = querydescription;
//    }
//
//    public int getVbSqlquerytype() {
//        return vbSqlquerytype;
//    }
//
//    public void setVbSqlquerytype(int vbSqlquerytype) {
//        this.vbSqlquerytype = vbSqlquerytype;
//    }
//
//    public String getQuerytext1() {
//        return querytext1;
//    }
//
//    public void setQuerytext1(String querytext1) {
//        this.querytext1 = querytext1;
//    }
//
//    public String getQuerytext2() {
//        return querytext2;
//    }
//
//    public void setQuerytext2(String querytext2) {
//        this.querytext2 = querytext2;
//    }
//
//    public String getQuerytext3() {
//        return querytext3;
//    }
//
//    public void setQuerytext3(String querytext3) {
//        this.querytext3 = querytext3;
//    }
//
//    public String getQuerytext4() {
//        return querytext4;
//    }
//
//    public void setQuerytext4(String querytext4) {
//        this.querytext4 = querytext4;
//    }
//
//    public String getQuerytext5() {
//        return querytext5;
//    }
//
//    public void setQuerytext5(String querytext5) {
//        this.querytext5 = querytext5;
//    }
//
//    public String getOthdesc1() {
//        return othdesc1;
//    }
//
//    public void setOthdesc1(String othdesc1) {
//        this.othdesc1 = othdesc1;
//    }
//
//    public String getOthdesc2() {
//        return othdesc2;
//    }
//
//    public void setOthdesc2(String othdesc2) {
//        this.othdesc2 = othdesc2;
//    }
//
//    public String getOthdesc3() {
//        return othdesc3;
//    }
//
//    public void setOthdesc3(String othdesc3) {
//        this.othdesc3 = othdesc3;
//    }
//
//    public String getOthdesc4() {
//        return othdesc4;
//    }
//
//    public void setOthdesc4(String othdesc4) {
//        this.othdesc4 = othdesc4;
//    }
//
//    public String getMaker() {
//        return maker;
//    }
//
//    public void setMaker(String maker) {
//        this.maker = maker;
//    }
//
//    public Date getMakedate() {
//        return makedate;
//    }
//
//    public void setMakedate(Date makedate) {
//        this.makedate = makedate;
//    }
//
//    public String getChecker() {
//        return checker;
//    }
//
//    public void setChecker(String checker) {
//        this.checker = checker;
//    }
//
//    public Date getCheckdate() {
//        return checkdate;
//    }
//
//    public void setCheckdate(Date checkdate) {
//        this.checkdate = checkdate;
//    }
//
//    public String getUpdateby() {
//        return updateby;
//    }
//
//    public void setUpdateby(String updateby) {
//        this.updateby = updateby;
//    }
//
//    public Date getUpdatedate() {
//        return updatedate;
//    }
//
//    public void setUpdatedate(Date updatedate) {
//        this.updatedate = updatedate;
//    }
//
//    public boolean isRecstatus() {
//        return recstatus;
//    }
//
//    public void setRecstatus(boolean recstatus) {
//        this.recstatus = recstatus;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ENTITY_TblCnfgRbSqlquery that = (ENTITY_TblCnfgRbSqlquery) o;
//
//        if (queryid != that.queryid) return false;
//        if (vbSqlquerytype != that.vbSqlquerytype) return false;
//        if (recstatus != that.recstatus) return false;
//        if (queryname1 != null ? !queryname1.equals(that.queryname1) : that.queryname1 != null) return false;
//        if (queryname2 != null ? !queryname2.equals(that.queryname2) : that.queryname2 != null) return false;
//        if (queryname3 != null ? !queryname3.equals(that.queryname3) : that.queryname3 != null) return false;
//        if (querydescription != null ? !querydescription.equals(that.querydescription) : that.querydescription != null)
//            return false;
//        if (querytext1 != null ? !querytext1.equals(that.querytext1) : that.querytext1 != null) return false;
//        if (querytext2 != null ? !querytext2.equals(that.querytext2) : that.querytext2 != null) return false;
//        if (querytext3 != null ? !querytext3.equals(that.querytext3) : that.querytext3 != null) return false;
//        if (querytext4 != null ? !querytext4.equals(that.querytext4) : that.querytext4 != null) return false;
//        if (querytext5 != null ? !querytext5.equals(that.querytext5) : that.querytext5 != null) return false;
//        if (othdesc1 != null ? !othdesc1.equals(that.othdesc1) : that.othdesc1 != null) return false;
//        if (othdesc2 != null ? !othdesc2.equals(that.othdesc2) : that.othdesc2 != null) return false;
//        if (othdesc3 != null ? !othdesc3.equals(that.othdesc3) : that.othdesc3 != null) return false;
//        if (othdesc4 != null ? !othdesc4.equals(that.othdesc4) : that.othdesc4 != null) return false;
//        if (maker != null ? !maker.equals(that.maker) : that.maker != null) return false;
//        if (makedate != null ? !makedate.equals(that.makedate) : that.makedate != null) return false;
//        if (checker != null ? !checker.equals(that.checker) : that.checker != null) return false;
//        if (checkdate != null ? !checkdate.equals(that.checkdate) : that.checkdate != null) return false;
//        if (updateby != null ? !updateby.equals(that.updateby) : that.updateby != null) return false;
//        if (updatedate != null ? !updatedate.equals(that.updatedate) : that.updatedate != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = queryid;
//        result = 31 * result + (queryname1 != null ? queryname1.hashCode() : 0);
//        result = 31 * result + (queryname2 != null ? queryname2.hashCode() : 0);
//        result = 31 * result + (queryname3 != null ? queryname3.hashCode() : 0);
//        result = 31 * result + (querydescription != null ? querydescription.hashCode() : 0);
//        result = 31 * result + vbSqlquerytype;
//        result = 31 * result + (querytext1 != null ? querytext1.hashCode() : 0);
//        result = 31 * result + (querytext2 != null ? querytext2.hashCode() : 0);
//        result = 31 * result + (querytext3 != null ? querytext3.hashCode() : 0);
//        result = 31 * result + (querytext4 != null ? querytext4.hashCode() : 0);
//        result = 31 * result + (querytext5 != null ? querytext5.hashCode() : 0);
//        result = 31 * result + (othdesc1 != null ? othdesc1.hashCode() : 0);
//        result = 31 * result + (othdesc2 != null ? othdesc2.hashCode() : 0);
//        result = 31 * result + (othdesc3 != null ? othdesc3.hashCode() : 0);
//        result = 31 * result + (othdesc4 != null ? othdesc4.hashCode() : 0);
//        result = 31 * result + (maker != null ? maker.hashCode() : 0);
//        result = 31 * result + (makedate != null ? makedate.hashCode() : 0);
//        result = 31 * result + (checker != null ? checker.hashCode() : 0);
//        result = 31 * result + (checkdate != null ? checkdate.hashCode() : 0);
//        result = 31 * result + (updateby != null ? updateby.hashCode() : 0);
//        result = 31 * result + (updatedate != null ? updatedate.hashCode() : 0);
//        result = 31 * result + (recstatus ? 1 : 0);
//        return result;
//    }
//}
