package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "TBL_UM_ROLE_MASTER", schema = "dbo", catalog = "master")
public class ENTITY_TblUmRoleMaster {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ROLEID", nullable = false, precision = 0)
    private int roleid;
    @Basic
    @Column(name = "ROLENAME1", nullable = false, length = 150)
    private String rolename1;
    @Basic
    @Column(name = "ROLENAME2", nullable = true, length = 150)
    private String rolename2;
    @Basic
    @Column(name = "ROLENAME3", nullable = true, length = 150)
    private String rolename3;
    @Basic
    @Column(name = "VB_ALLOCATIONMETHOD", nullable = false, precision = 0)
    private int vbAllocationmethod;
    @Basic
    @Column(name = "VB_ROLEASSIGNEETYPE", nullable = false, precision = 0)
    private int vbRoleassigneetype;
    @Basic
    @Column(name = "FINANCIERID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int financierid;
    @Basic
    @Column(name = "PRODUCTCODE", nullable = true, length = 10)
    private String productcode;
    @Basic
    @Column(name = "SUBPRODUCTCODE", nullable = true, length = 10)
    private String subproductcode;
    @Basic
    @Column(name = "RULEID", nullable = true, precision = 0)
    private Integer ruleid;
    @Basic
    @Column(name = "SLA1", nullable = true)
    private Integer sla1;
    @Basic
    @Column(name = "SLA2", nullable = true)
    private Integer sla2;
    @Basic
    @Column(name = "SLA3", nullable = true)
    private Integer sla3;
    @Basic
    @Column(name = "SLA4", nullable = true)
    private Integer sla4;
    @Basic
    @Column(name = "SLA5", nullable = true)
    private Integer sla5;
    @Basic
    @Column(name = "MAXCASES", nullable = true)
    private Long maxcases;
    @Basic
    @Column(name = "ALLOWDOCEDIT", nullable = false)
    private boolean allowdocedit;
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
    @OneToMany(mappedBy = "tblUmRoleMasterByRoleid")
    private Collection<ENTITY_TblUmCommiteeRole> tblUmCommiteeRolesByRoleid;
    @ManyToOne
    @JoinColumn(name = "FINANCIERID", referencedColumnName = "FINANCIERID", nullable = false)
    private ENTITY_TblCnfgMstFinanciers tblCnfgMstFinanciersByFinancierid;
    @OneToMany(mappedBy = "tblUmRoleMasterByRoleid")
    private Collection<ENTITY_TblUmRoleMenu> tblUmRoleMenusByRoleid;
    @OneToMany(mappedBy = "tblUmRoleMasterByRoleid")
    private Collection<ENTITY_TblUmUserRole> tblUmUserRolesByRoleid;
    @OneToMany(mappedBy = "tblUmRoleMasterByRoleid")
    private Collection<ENTITY_TblWfWorkflowDetails> tblWfWorkflowDetailsByRoleid;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRolename1() {
        return rolename1;
    }

    public void setRolename1(String rolename1) {
        this.rolename1 = rolename1;
    }

    public String getRolename2() {
        return rolename2;
    }

    public void setRolename2(String rolename2) {
        this.rolename2 = rolename2;
    }

    public String getRolename3() {
        return rolename3;
    }

    public void setRolename3(String rolename3) {
        this.rolename3 = rolename3;
    }

    public int getVbAllocationmethod() {
        return vbAllocationmethod;
    }

    public void setVbAllocationmethod(int vbAllocationmethod) {
        this.vbAllocationmethod = vbAllocationmethod;
    }

    public int getVbRoleassigneetype() {
        return vbRoleassigneetype;
    }

    public void setVbRoleassigneetype(int vbRoleassigneetype) {
        this.vbRoleassigneetype = vbRoleassigneetype;
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

    public Integer getRuleid() {
        return ruleid;
    }

    public void setRuleid(Integer ruleid) {
        this.ruleid = ruleid;
    }

    public Integer getSla1() {
        return sla1;
    }

    public void setSla1(Integer sla1) {
        this.sla1 = sla1;
    }

    public Integer getSla2() {
        return sla2;
    }

    public void setSla2(Integer sla2) {
        this.sla2 = sla2;
    }

    public Integer getSla3() {
        return sla3;
    }

    public void setSla3(Integer sla3) {
        this.sla3 = sla3;
    }

    public Integer getSla4() {
        return sla4;
    }

    public void setSla4(Integer sla4) {
        this.sla4 = sla4;
    }

    public Integer getSla5() {
        return sla5;
    }

    public void setSla5(Integer sla5) {
        this.sla5 = sla5;
    }

    public Long getMaxcases() {
        return maxcases;
    }

    public void setMaxcases(Long maxcases) {
        this.maxcases = maxcases;
    }

    public boolean isAllowdocedit() {
        return allowdocedit;
    }

    public void setAllowdocedit(boolean allowdocedit) {
        this.allowdocedit = allowdocedit;
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

        ENTITY_TblUmRoleMaster that = (ENTITY_TblUmRoleMaster) o;

        if (roleid != that.roleid) return false;
        if (vbAllocationmethod != that.vbAllocationmethod) return false;
        if (vbRoleassigneetype != that.vbRoleassigneetype) return false;
        if (financierid != that.financierid) return false;
        if (allowdocedit != that.allowdocedit) return false;
        if (recstatus != that.recstatus) return false;
        if (rolename1 != null ? !rolename1.equals(that.rolename1) : that.rolename1 != null) return false;
        if (rolename2 != null ? !rolename2.equals(that.rolename2) : that.rolename2 != null) return false;
        if (rolename3 != null ? !rolename3.equals(that.rolename3) : that.rolename3 != null) return false;
        if (productcode != null ? !productcode.equals(that.productcode) : that.productcode != null) return false;
        if (subproductcode != null ? !subproductcode.equals(that.subproductcode) : that.subproductcode != null)
            return false;
        if (ruleid != null ? !ruleid.equals(that.ruleid) : that.ruleid != null) return false;
        if (sla1 != null ? !sla1.equals(that.sla1) : that.sla1 != null) return false;
        if (sla2 != null ? !sla2.equals(that.sla2) : that.sla2 != null) return false;
        if (sla3 != null ? !sla3.equals(that.sla3) : that.sla3 != null) return false;
        if (sla4 != null ? !sla4.equals(that.sla4) : that.sla4 != null) return false;
        if (sla5 != null ? !sla5.equals(that.sla5) : that.sla5 != null) return false;
        if (maxcases != null ? !maxcases.equals(that.maxcases) : that.maxcases != null) return false;
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
        int result = roleid;
        result = 31 * result + (rolename1 != null ? rolename1.hashCode() : 0);
        result = 31 * result + (rolename2 != null ? rolename2.hashCode() : 0);
        result = 31 * result + (rolename3 != null ? rolename3.hashCode() : 0);
        result = 31 * result + vbAllocationmethod;
        result = 31 * result + vbRoleassigneetype;
        result = 31 * result + financierid;
        result = 31 * result + (productcode != null ? productcode.hashCode() : 0);
        result = 31 * result + (subproductcode != null ? subproductcode.hashCode() : 0);
        result = 31 * result + (ruleid != null ? ruleid.hashCode() : 0);
        result = 31 * result + (sla1 != null ? sla1.hashCode() : 0);
        result = 31 * result + (sla2 != null ? sla2.hashCode() : 0);
        result = 31 * result + (sla3 != null ? sla3.hashCode() : 0);
        result = 31 * result + (sla4 != null ? sla4.hashCode() : 0);
        result = 31 * result + (sla5 != null ? sla5.hashCode() : 0);
        result = 31 * result + (maxcases != null ? maxcases.hashCode() : 0);
        result = 31 * result + (allowdocedit ? 1 : 0);
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

    public Collection<ENTITY_TblUmCommiteeRole> getTblUmCommiteeRolesByRoleid() {
        return tblUmCommiteeRolesByRoleid;
    }

    public void setTblUmCommiteeRolesByRoleid(Collection<ENTITY_TblUmCommiteeRole> tblUmCommiteeRolesByRoleid) {
        this.tblUmCommiteeRolesByRoleid = tblUmCommiteeRolesByRoleid;
    }

    public ENTITY_TblCnfgMstFinanciers getTblCnfgMstFinanciersByFinancierid() {
        return tblCnfgMstFinanciersByFinancierid;
    }

    public void setTblCnfgMstFinanciersByFinancierid(ENTITY_TblCnfgMstFinanciers tblCnfgMstFinanciersByFinancierid) {
        this.tblCnfgMstFinanciersByFinancierid = tblCnfgMstFinanciersByFinancierid;
    }

    public Collection<ENTITY_TblUmRoleMenu> getTblUmRoleMenusByRoleid() {
        return tblUmRoleMenusByRoleid;
    }

    public void setTblUmRoleMenusByRoleid(Collection<ENTITY_TblUmRoleMenu> tblUmRoleMenusByRoleid) {
        this.tblUmRoleMenusByRoleid = tblUmRoleMenusByRoleid;
    }

    public Collection<ENTITY_TblUmUserRole> getTblUmUserRolesByRoleid() {
        return tblUmUserRolesByRoleid;
    }

    public void setTblUmUserRolesByRoleid(Collection<ENTITY_TblUmUserRole> tblUmUserRolesByRoleid) {
        this.tblUmUserRolesByRoleid = tblUmUserRolesByRoleid;
    }

    public Collection<ENTITY_TblWfWorkflowDetails> getTblWfWorkflowDetailsByRoleid() {
        return tblWfWorkflowDetailsByRoleid;
    }

    public void setTblWfWorkflowDetailsByRoleid(Collection<ENTITY_TblWfWorkflowDetails> tblWfWorkflowDetailsByRoleid) {
        this.tblWfWorkflowDetailsByRoleid = tblWfWorkflowDetailsByRoleid;
    }
}
