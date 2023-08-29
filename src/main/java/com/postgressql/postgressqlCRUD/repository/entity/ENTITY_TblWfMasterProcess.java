package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "TBL_WF_MASTER_PROCESS", schema = "dbo", catalog = "master")
public class ENTITY_TblWfMasterProcess {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PROCESSID", nullable = false, precision = 0)
    private int processid;
    @Basic
    @Column(name = "PROCESSNAME1", nullable = false, length = 100)
    private String processname1;
    @Basic
    @Column(name = "PROCESSNAME2", nullable = true, length = 100)
    private String processname2;
    @Basic
    @Column(name = "PROCESSNAME3", nullable = true, length = 100)
    private String processname3;
    @Basic
    @Column(name = "VB_PROCESSTYPE", nullable = false, precision = 0)
    private int vbProcesstype;
    @Basic
    @Column(name = "FINANCIERID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int financierid;
    @Basic
    @Column(name = "PROCESSDEFINITION", nullable = true, length = 1000)
    private String processdefinition;
    @Basic
    @Column(name = "PARAMETERDEFINITION", nullable = true, length = 1000)
    private String parameterdefinition;
    @Basic
    @Column(name = "PARAMETERVALUES", nullable = true, length = 1000)
    private String parametervalues;
    @Basic
    @Column(name = "VB_PROCESSPARAMETER_MAIN", nullable = true, precision = 0)
    private Integer vbProcessparameterMain;
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
    @OneToMany(mappedBy = "tblWfMasterProcessByProcessid")
    private Collection<ENTITY_TblWfWorkflowProcesses> tblWfWorkflowProcessesByProcessid;

    public int getProcessid() {
        return processid;
    }

    public void setProcessid(int processid) {
        this.processid = processid;
    }

    public String getProcessname1() {
        return processname1;
    }

    public void setProcessname1(String processname1) {
        this.processname1 = processname1;
    }

    public String getProcessname2() {
        return processname2;
    }

    public void setProcessname2(String processname2) {
        this.processname2 = processname2;
    }

    public String getProcessname3() {
        return processname3;
    }

    public void setProcessname3(String processname3) {
        this.processname3 = processname3;
    }

    public int getVbProcesstype() {
        return vbProcesstype;
    }

    public void setVbProcesstype(int vbProcesstype) {
        this.vbProcesstype = vbProcesstype;
    }

    public int getFinancierid() {
        return financierid;
    }

    public void setFinancierid(int financierid) {
        this.financierid = financierid;
    }

    public String getProcessdefinition() {
        return processdefinition;
    }

    public void setProcessdefinition(String processdefinition) {
        this.processdefinition = processdefinition;
    }

    public String getParameterdefinition() {
        return parameterdefinition;
    }

    public void setParameterdefinition(String parameterdefinition) {
        this.parameterdefinition = parameterdefinition;
    }

    public String getParametervalues() {
        return parametervalues;
    }

    public void setParametervalues(String parametervalues) {
        this.parametervalues = parametervalues;
    }

    public Integer getVbProcessparameterMain() {
        return vbProcessparameterMain;
    }

    public void setVbProcessparameterMain(Integer vbProcessparameterMain) {
        this.vbProcessparameterMain = vbProcessparameterMain;
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

        ENTITY_TblWfMasterProcess that = (ENTITY_TblWfMasterProcess) o;

        if (processid != that.processid) return false;
        if (vbProcesstype != that.vbProcesstype) return false;
        if (financierid != that.financierid) return false;
        if (recstatus != that.recstatus) return false;
        if (processname1 != null ? !processname1.equals(that.processname1) : that.processname1 != null) return false;
        if (processname2 != null ? !processname2.equals(that.processname2) : that.processname2 != null) return false;
        if (processname3 != null ? !processname3.equals(that.processname3) : that.processname3 != null) return false;
        if (processdefinition != null ? !processdefinition.equals(that.processdefinition) : that.processdefinition != null)
            return false;
        if (parameterdefinition != null ? !parameterdefinition.equals(that.parameterdefinition) : that.parameterdefinition != null)
            return false;
        if (parametervalues != null ? !parametervalues.equals(that.parametervalues) : that.parametervalues != null)
            return false;
        if (vbProcessparameterMain != null ? !vbProcessparameterMain.equals(that.vbProcessparameterMain) : that.vbProcessparameterMain != null)
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
        int result = processid;
        result = 31 * result + (processname1 != null ? processname1.hashCode() : 0);
        result = 31 * result + (processname2 != null ? processname2.hashCode() : 0);
        result = 31 * result + (processname3 != null ? processname3.hashCode() : 0);
        result = 31 * result + vbProcesstype;
        result = 31 * result + financierid;
        result = 31 * result + (processdefinition != null ? processdefinition.hashCode() : 0);
        result = 31 * result + (parameterdefinition != null ? parameterdefinition.hashCode() : 0);
        result = 31 * result + (parametervalues != null ? parametervalues.hashCode() : 0);
        result = 31 * result + (vbProcessparameterMain != null ? vbProcessparameterMain.hashCode() : 0);
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

    public Collection<ENTITY_TblWfWorkflowProcesses> getTblWfWorkflowProcessesByProcessid() {
        return tblWfWorkflowProcessesByProcessid;
    }

    public void setTblWfWorkflowProcessesByProcessid(Collection<ENTITY_TblWfWorkflowProcesses> tblWfWorkflowProcessesByProcessid) {
        this.tblWfWorkflowProcessesByProcessid = tblWfWorkflowProcessesByProcessid;
    }
}
