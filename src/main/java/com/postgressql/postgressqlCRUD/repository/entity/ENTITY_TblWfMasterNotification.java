package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "TBL_WF_MASTER_NOTIFICATION", schema = "dbo", catalog = "master")
public class ENTITY_TblWfMasterNotification {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NOTIFICATIONID", nullable = false, precision = 0)
    private int notificationid;
    @Basic
    @Column(name = "NOTIFICATIONNAME1", nullable = false, length = 100)
    private String notificationname1;
    @Basic
    @Column(name = "NOTIFICATIONNAME2", nullable = true, length = 100)
    private String notificationname2;
    @Basic
    @Column(name = "NOTIFICATIONNAME3", nullable = true, length = 100)
    private String notificationname3;
    @Basic
    @Column(name = "FINANCIERID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int financierid;
    @Basic
    @Column(name = "TEMPLATE1", nullable = true, length = 4000)
    private String template1;
    @Basic
    @Column(name = "TEMPLATE2", nullable = true, length = 4000)
    private String template2;
    @Basic
    @Column(name = "TEMPLATE3", nullable = true, length = 4000)
    private String template3;
    @Basic
    @Column(name = "VB_NOTIFICATIONTYPE", nullable = false, precision = 0)
    private int vbNotificationtype;
    @Basic
    @Column(name = "PARAMETERDEFINITION", nullable = true, length = 1000)
    private String parameterdefinition;
    @Basic
    @Column(name = "PARAMETERVALUEMAP", nullable = true, length = 1000)
    private String parametervaluemap;
    @Basic
    @Column(name = "VB_NOTIFICATIONRECEPIENT", nullable = true, precision = 0)
    private Integer vbNotificationrecepient;
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
    @OneToMany(mappedBy = "tblWfMasterNotificationByNotificationid")
    private Collection<ENTITY_TblWfWorkflowNotifications> tblWfWorkflowNotificationsByNotificationid;

    public int getNotificationid() {
        return notificationid;
    }

    public void setNotificationid(int notificationid) {
        this.notificationid = notificationid;
    }

    public String getNotificationname1() {
        return notificationname1;
    }

    public void setNotificationname1(String notificationname1) {
        this.notificationname1 = notificationname1;
    }

    public String getNotificationname2() {
        return notificationname2;
    }

    public void setNotificationname2(String notificationname2) {
        this.notificationname2 = notificationname2;
    }

    public String getNotificationname3() {
        return notificationname3;
    }

    public void setNotificationname3(String notificationname3) {
        this.notificationname3 = notificationname3;
    }

    public int getFinancierid() {
        return financierid;
    }

    public void setFinancierid(int financierid) {
        this.financierid = financierid;
    }

    public String getTemplate1() {
        return template1;
    }

    public void setTemplate1(String template1) {
        this.template1 = template1;
    }

    public String getTemplate2() {
        return template2;
    }

    public void setTemplate2(String template2) {
        this.template2 = template2;
    }

    public String getTemplate3() {
        return template3;
    }

    public void setTemplate3(String template3) {
        this.template3 = template3;
    }

    public int getVbNotificationtype() {
        return vbNotificationtype;
    }

    public void setVbNotificationtype(int vbNotificationtype) {
        this.vbNotificationtype = vbNotificationtype;
    }

    public String getParameterdefinition() {
        return parameterdefinition;
    }

    public void setParameterdefinition(String parameterdefinition) {
        this.parameterdefinition = parameterdefinition;
    }

    public String getParametervaluemap() {
        return parametervaluemap;
    }

    public void setParametervaluemap(String parametervaluemap) {
        this.parametervaluemap = parametervaluemap;
    }

    public Integer getVbNotificationrecepient() {
        return vbNotificationrecepient;
    }

    public void setVbNotificationrecepient(Integer vbNotificationrecepient) {
        this.vbNotificationrecepient = vbNotificationrecepient;
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

        ENTITY_TblWfMasterNotification that = (ENTITY_TblWfMasterNotification) o;

        if (notificationid != that.notificationid) return false;
        if (financierid != that.financierid) return false;
        if (vbNotificationtype != that.vbNotificationtype) return false;
        if (recstatus != that.recstatus) return false;
        if (notificationname1 != null ? !notificationname1.equals(that.notificationname1) : that.notificationname1 != null)
            return false;
        if (notificationname2 != null ? !notificationname2.equals(that.notificationname2) : that.notificationname2 != null)
            return false;
        if (notificationname3 != null ? !notificationname3.equals(that.notificationname3) : that.notificationname3 != null)
            return false;
        if (template1 != null ? !template1.equals(that.template1) : that.template1 != null) return false;
        if (template2 != null ? !template2.equals(that.template2) : that.template2 != null) return false;
        if (template3 != null ? !template3.equals(that.template3) : that.template3 != null) return false;
        if (parameterdefinition != null ? !parameterdefinition.equals(that.parameterdefinition) : that.parameterdefinition != null)
            return false;
        if (parametervaluemap != null ? !parametervaluemap.equals(that.parametervaluemap) : that.parametervaluemap != null)
            return false;
        if (vbNotificationrecepient != null ? !vbNotificationrecepient.equals(that.vbNotificationrecepient) : that.vbNotificationrecepient != null)
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
        int result = notificationid;
        result = 31 * result + (notificationname1 != null ? notificationname1.hashCode() : 0);
        result = 31 * result + (notificationname2 != null ? notificationname2.hashCode() : 0);
        result = 31 * result + (notificationname3 != null ? notificationname3.hashCode() : 0);
        result = 31 * result + financierid;
        result = 31 * result + (template1 != null ? template1.hashCode() : 0);
        result = 31 * result + (template2 != null ? template2.hashCode() : 0);
        result = 31 * result + (template3 != null ? template3.hashCode() : 0);
        result = 31 * result + vbNotificationtype;
        result = 31 * result + (parameterdefinition != null ? parameterdefinition.hashCode() : 0);
        result = 31 * result + (parametervaluemap != null ? parametervaluemap.hashCode() : 0);
        result = 31 * result + (vbNotificationrecepient != null ? vbNotificationrecepient.hashCode() : 0);
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

    public Collection<ENTITY_TblWfWorkflowNotifications> getTblWfWorkflowNotificationsByNotificationid() {
        return tblWfWorkflowNotificationsByNotificationid;
    }

    public void setTblWfWorkflowNotificationsByNotificationid(Collection<ENTITY_TblWfWorkflowNotifications> tblWfWorkflowNotificationsByNotificationid) {
        this.tblWfWorkflowNotificationsByNotificationid = tblWfWorkflowNotificationsByNotificationid;
    }
}
