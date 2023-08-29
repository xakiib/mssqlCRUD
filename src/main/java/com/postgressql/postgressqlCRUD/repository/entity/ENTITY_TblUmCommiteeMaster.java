package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "TBL_UM_COMMITEE_MASTER", schema = "dbo", catalog = "master")
public class ENTITY_TblUmCommiteeMaster {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "COMMITEEID", nullable = false, precision = 0)
    private int commiteeid;
    @Basic
    @Column(name = "COMMITEENAME1", nullable = false, length = 150)
    private String commiteename1;
    @Basic
    @Column(name = "COMMITEENAME2", nullable = true, length = 150)
    private String commiteename2;
    @Basic
    @Column(name = "COMMITEENAME3", nullable = true, length = 150)
    private String commiteename3;
    @Basic
    @Column(name = "VB_COMMITEEALLOCATIONMETHOD", nullable = false, precision = 0)
    private int vbCommiteeallocationmethod;
    @Basic
    @Column(name = "VB_COMMITEEAPPROVALMETHOD", nullable = false, precision = 0)
    private int vbCommiteeapprovalmethod;
    @Basic
    @Column(name = "FINANCIERID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int financierid;
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
    @OneToMany(mappedBy = "tblUmCommiteeMasterByCommiteeid")
    private Collection<ENTITY_TblUmCommiteeMembers> tblUmCommiteeMembersByCommiteeid;
    @OneToMany(mappedBy = "tblUmCommiteeMasterByCommiteeid")
    private Collection<ENTITY_TblUmCommiteeRole> tblUmCommiteeRolesByCommiteeid;

    public int getCommiteeid() {
        return commiteeid;
    }

    public void setCommiteeid(int commiteeid) {
        this.commiteeid = commiteeid;
    }

    public String getCommiteename1() {
        return commiteename1;
    }

    public void setCommiteename1(String commiteename1) {
        this.commiteename1 = commiteename1;
    }

    public String getCommiteename2() {
        return commiteename2;
    }

    public void setCommiteename2(String commiteename2) {
        this.commiteename2 = commiteename2;
    }

    public String getCommiteename3() {
        return commiteename3;
    }

    public void setCommiteename3(String commiteename3) {
        this.commiteename3 = commiteename3;
    }

    public int getVbCommiteeallocationmethod() {
        return vbCommiteeallocationmethod;
    }

    public void setVbCommiteeallocationmethod(int vbCommiteeallocationmethod) {
        this.vbCommiteeallocationmethod = vbCommiteeallocationmethod;
    }

    public int getVbCommiteeapprovalmethod() {
        return vbCommiteeapprovalmethod;
    }

    public void setVbCommiteeapprovalmethod(int vbCommiteeapprovalmethod) {
        this.vbCommiteeapprovalmethod = vbCommiteeapprovalmethod;
    }

    public int getFinancierid() {
        return financierid;
    }

    public void setFinancierid(int financierid) {
        this.financierid = financierid;
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

        ENTITY_TblUmCommiteeMaster that = (ENTITY_TblUmCommiteeMaster) o;

        if (commiteeid != that.commiteeid) return false;
        if (vbCommiteeallocationmethod != that.vbCommiteeallocationmethod) return false;
        if (vbCommiteeapprovalmethod != that.vbCommiteeapprovalmethod) return false;
        if (financierid != that.financierid) return false;
        if (recstatus != that.recstatus) return false;
        if (commiteename1 != null ? !commiteename1.equals(that.commiteename1) : that.commiteename1 != null)
            return false;
        if (commiteename2 != null ? !commiteename2.equals(that.commiteename2) : that.commiteename2 != null)
            return false;
        if (commiteename3 != null ? !commiteename3.equals(that.commiteename3) : that.commiteename3 != null)
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
        int result = commiteeid;
        result = 31 * result + (commiteename1 != null ? commiteename1.hashCode() : 0);
        result = 31 * result + (commiteename2 != null ? commiteename2.hashCode() : 0);
        result = 31 * result + (commiteename3 != null ? commiteename3.hashCode() : 0);
        result = 31 * result + vbCommiteeallocationmethod;
        result = 31 * result + vbCommiteeapprovalmethod;
        result = 31 * result + financierid;
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

    public Collection<ENTITY_TblUmCommiteeMembers> getTblUmCommiteeMembersByCommiteeid() {
        return tblUmCommiteeMembersByCommiteeid;
    }

    public void setTblUmCommiteeMembersByCommiteeid(Collection<ENTITY_TblUmCommiteeMembers> tblUmCommiteeMembersByCommiteeid) {
        this.tblUmCommiteeMembersByCommiteeid = tblUmCommiteeMembersByCommiteeid;
    }

    public Collection<ENTITY_TblUmCommiteeRole> getTblUmCommiteeRolesByCommiteeid() {
        return tblUmCommiteeRolesByCommiteeid;
    }

    public void setTblUmCommiteeRolesByCommiteeid(Collection<ENTITY_TblUmCommiteeRole> tblUmCommiteeRolesByCommiteeid) {
        this.tblUmCommiteeRolesByCommiteeid = tblUmCommiteeRolesByCommiteeid;
    }
}
