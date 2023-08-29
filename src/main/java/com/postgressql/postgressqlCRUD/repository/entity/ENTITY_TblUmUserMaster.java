package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Table(name = "TBL_UM_USER_MASTER", schema = "dbo", catalog = "master")
public class ENTITY_TblUmUserMaster {
    @Basic
    @Column(name = "RECID", nullable = false, precision = 0)
    private int recid;
    @Basic
    @Column(name = "FINANCIERID", nullable = true, precision = 0, insertable=false, updatable=false)
    private Integer financierid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "USERID", nullable = false, length = 20)
    private String userid;
    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 150)
    private String password;
    @Basic
    @Column(name = "LDAPENABLED", nullable = false)
    private boolean ldapenabled;
    @Basic
    @Column(name = "ADUSERID", nullable = true, length = 50)
    private String aduserid;
    @Basic
    @Column(name = "USERNAME1", nullable = false, length = 150)
    private String username1;
    @Basic
    @Column(name = "USERNAME2", nullable = true, length = 150)
    private String username2;
    @Basic
    @Column(name = "USERNAME3", nullable = true, length = 150)
    private String username3;
    @Basic
    @Column(name = "EMAIL", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "MOBILE", nullable = true, length = 50)
    private String mobile;
    @Basic
    @Column(name = "IDNUMBER", nullable = true, length = 50)
    private String idnumber;
    @Basic
    @Column(name = "VB_IDTYPE", nullable = true, precision = 0)
    private Integer vbIdtype;
    @Basic
    @Column(name = "DATEOFBIRTH_G", nullable = true)
    private Date dateofbirthG;
    @Basic
    @Column(name = "DATEOFBIRTH_H", nullable = true, length = 50)
    private String dateofbirthH;
    @Basic
    @Column(name = "USERPIC", nullable = true)
    private byte[] userpic;
    @Basic
    @Column(name = "VB_USERDESIGNATION", nullable = true, precision = 0)
    private Integer vbUserdesignation;
    @Basic
    @Column(name = "VB_BRANCHCODE", nullable = false, precision = 0)
    private int vbBranchcode;
    @Basic
    @Column(name = "INITIALIZEPASSWORD", nullable = false)
    private boolean initializepassword;
    @Basic
    @Column(name = "INITIALIZEPWDATE", nullable = true)
    private Date initializepwdate;
    @Basic
    @Column(name = "ACTIVEDATE", nullable = false)
    private Date activedate;
    @Basic
    @Column(name = "EXPIRYDATE", nullable = false)
    private Date expirydate;
    @Basic
    @Column(name = "LOGINTIME", nullable = true)
    private Date logintime;
    @Basic
    @Column(name = "LOGOUTTIME", nullable = true)
    private Date logouttime;
    @Basic
    @Column(name = "LASTLOGINTIME", nullable = true)
    private Date lastlogintime;
    @Basic
    @Column(name = "LASTLOGOUTTIME", nullable = true)
    private Date lastlogouttime;
    @Basic
    @Column(name = "CONCURRENTLOGIN", nullable = true)
    private Integer concurrentlogin;
    @Basic
    @Column(name = "INVALIDLOGIN", nullable = true)
    private Integer invalidlogin;
    @Basic
    @Column(name = "L1MANAGER", nullable = false, length = 20)
    private String l1Manager;
    @Basic
    @Column(name = "L2MANAGER", nullable = true, length = 20)
    private String l2Manager;
    @Basic
    @Column(name = "L3MANAGER", nullable = true, length = 20)
    private String l3Manager;
    @Basic
    @Column(name = "L4MANAGER", nullable = true, length = 20)
    private String l4Manager;
    @Basic
    @Column(name = "L5MANAGER", nullable = true, length = 20)
    private String l5Manager;
    @Basic
    @Column(name = "PORTALUSERID", nullable = true, length = 50)
    private String portaluserid;
    @Basic
    @Column(name = "VB_LANGUAGE", nullable = true, precision = 0)
    private Integer vbLanguage;
    @Basic
    @Column(name = "VB_OTPCHANNEL", nullable = true, precision = 0)
    private Integer vbOtpchannel;
    @Basic
    @Column(name = "DEVICEID", nullable = true, length = 50)
    private String deviceid;
    @Basic
    @Column(name = "DEVICENAME", nullable = true, length = 50)
    private String devicename;
    @Basic
    @Column(name = "VB_USERDEVICETYPE", nullable = true, precision = 0)
    private Integer vbUserdevicetype;
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
    @OneToMany(mappedBy = "tblUmUserMasterByUserid")
    private Collection<ENTITY_TblUmCommiteeMembers> tblUmCommiteeMembersByUserid;
    @OneToMany(mappedBy = "tblUmUserMasterByUserid")
    private Collection<ENTITY_TblUmUserBranch> tblUmUserBranchesByUserid;
    @ManyToOne
    @JoinColumn(name = "FINANCIERID", referencedColumnName = "FINANCIERID")
    private ENTITY_TblCnfgMstFinanciers tblCnfgMstFinanciersByFinancierid;
    @OneToMany(mappedBy = "tblUmUserMasterByUserid")
    private Collection<ENTITY_TblUmUserProduct> tblUmUserProductsByUserid;
    @OneToMany(mappedBy = "tblUmUserMasterByUserid")
    private Collection<ENTITY_TblUmUserRole> tblUmUserRolesByUserid;

    public int getRecid() {
        return recid;
    }

    public void setRecid(int recid) {
        this.recid = recid;
    }

    public Integer getFinancierid() {
        return financierid;
    }

    public void setFinancierid(Integer financierid) {
        this.financierid = financierid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLdapenabled() {
        return ldapenabled;
    }

    public void setLdapenabled(boolean ldapenabled) {
        this.ldapenabled = ldapenabled;
    }

    public String getAduserid() {
        return aduserid;
    }

    public void setAduserid(String aduserid) {
        this.aduserid = aduserid;
    }

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public String getUsername2() {
        return username2;
    }

    public void setUsername2(String username2) {
        this.username2 = username2;
    }

    public String getUsername3() {
        return username3;
    }

    public void setUsername3(String username3) {
        this.username3 = username3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public Integer getVbIdtype() {
        return vbIdtype;
    }

    public void setVbIdtype(Integer vbIdtype) {
        this.vbIdtype = vbIdtype;
    }

    public Date getDateofbirthG() {
        return dateofbirthG;
    }

    public void setDateofbirthG(Date dateofbirthG) {
        this.dateofbirthG = dateofbirthG;
    }

    public String getDateofbirthH() {
        return dateofbirthH;
    }

    public void setDateofbirthH(String dateofbirthH) {
        this.dateofbirthH = dateofbirthH;
    }

    public byte[] getUserpic() {
        return userpic;
    }

    public void setUserpic(byte[] userpic) {
        this.userpic = userpic;
    }

    public Integer getVbUserdesignation() {
        return vbUserdesignation;
    }

    public void setVbUserdesignation(Integer vbUserdesignation) {
        this.vbUserdesignation = vbUserdesignation;
    }

    public int getVbBranchcode() {
        return vbBranchcode;
    }

    public void setVbBranchcode(int vbBranchcode) {
        this.vbBranchcode = vbBranchcode;
    }

    public boolean isInitializepassword() {
        return initializepassword;
    }

    public void setInitializepassword(boolean initializepassword) {
        this.initializepassword = initializepassword;
    }

    public Date getInitializepwdate() {
        return initializepwdate;
    }

    public void setInitializepwdate(Date initializepwdate) {
        this.initializepwdate = initializepwdate;
    }

    public Date getActivedate() {
        return activedate;
    }

    public void setActivedate(Date activedate) {
        this.activedate = activedate;
    }

    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Date getLogouttime() {
        return logouttime;
    }

    public void setLogouttime(Date logouttime) {
        this.logouttime = logouttime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Date getLastlogouttime() {
        return lastlogouttime;
    }

    public void setLastlogouttime(Date lastlogouttime) {
        this.lastlogouttime = lastlogouttime;
    }

    public Integer getConcurrentlogin() {
        return concurrentlogin;
    }

    public void setConcurrentlogin(Integer concurrentlogin) {
        this.concurrentlogin = concurrentlogin;
    }

    public Integer getInvalidlogin() {
        return invalidlogin;
    }

    public void setInvalidlogin(Integer invalidlogin) {
        this.invalidlogin = invalidlogin;
    }

    public String getL1Manager() {
        return l1Manager;
    }

    public void setL1Manager(String l1Manager) {
        this.l1Manager = l1Manager;
    }

    public String getL2Manager() {
        return l2Manager;
    }

    public void setL2Manager(String l2Manager) {
        this.l2Manager = l2Manager;
    }

    public String getL3Manager() {
        return l3Manager;
    }

    public void setL3Manager(String l3Manager) {
        this.l3Manager = l3Manager;
    }

    public String getL4Manager() {
        return l4Manager;
    }

    public void setL4Manager(String l4Manager) {
        this.l4Manager = l4Manager;
    }

    public String getL5Manager() {
        return l5Manager;
    }

    public void setL5Manager(String l5Manager) {
        this.l5Manager = l5Manager;
    }

    public String getPortaluserid() {
        return portaluserid;
    }

    public void setPortaluserid(String portaluserid) {
        this.portaluserid = portaluserid;
    }

    public Integer getVbLanguage() {
        return vbLanguage;
    }

    public void setVbLanguage(Integer vbLanguage) {
        this.vbLanguage = vbLanguage;
    }

    public Integer getVbOtpchannel() {
        return vbOtpchannel;
    }

    public void setVbOtpchannel(Integer vbOtpchannel) {
        this.vbOtpchannel = vbOtpchannel;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    public Integer getVbUserdevicetype() {
        return vbUserdevicetype;
    }

    public void setVbUserdevicetype(Integer vbUserdevicetype) {
        this.vbUserdevicetype = vbUserdevicetype;
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

        ENTITY_TblUmUserMaster that = (ENTITY_TblUmUserMaster) o;

        if (recid != that.recid) return false;
        if (ldapenabled != that.ldapenabled) return false;
        if (vbBranchcode != that.vbBranchcode) return false;
        if (initializepassword != that.initializepassword) return false;
        if (recstatus != that.recstatus) return false;
        if (financierid != null ? !financierid.equals(that.financierid) : that.financierid != null) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (aduserid != null ? !aduserid.equals(that.aduserid) : that.aduserid != null) return false;
        if (username1 != null ? !username1.equals(that.username1) : that.username1 != null) return false;
        if (username2 != null ? !username2.equals(that.username2) : that.username2 != null) return false;
        if (username3 != null ? !username3.equals(that.username3) : that.username3 != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (idnumber != null ? !idnumber.equals(that.idnumber) : that.idnumber != null) return false;
        if (vbIdtype != null ? !vbIdtype.equals(that.vbIdtype) : that.vbIdtype != null) return false;
        if (dateofbirthG != null ? !dateofbirthG.equals(that.dateofbirthG) : that.dateofbirthG != null) return false;
        if (dateofbirthH != null ? !dateofbirthH.equals(that.dateofbirthH) : that.dateofbirthH != null) return false;
        if (!Arrays.equals(userpic, that.userpic)) return false;
        if (vbUserdesignation != null ? !vbUserdesignation.equals(that.vbUserdesignation) : that.vbUserdesignation != null)
            return false;
        if (initializepwdate != null ? !initializepwdate.equals(that.initializepwdate) : that.initializepwdate != null)
            return false;
        if (activedate != null ? !activedate.equals(that.activedate) : that.activedate != null) return false;
        if (expirydate != null ? !expirydate.equals(that.expirydate) : that.expirydate != null) return false;
        if (logintime != null ? !logintime.equals(that.logintime) : that.logintime != null) return false;
        if (logouttime != null ? !logouttime.equals(that.logouttime) : that.logouttime != null) return false;
        if (lastlogintime != null ? !lastlogintime.equals(that.lastlogintime) : that.lastlogintime != null)
            return false;
        if (lastlogouttime != null ? !lastlogouttime.equals(that.lastlogouttime) : that.lastlogouttime != null)
            return false;
        if (concurrentlogin != null ? !concurrentlogin.equals(that.concurrentlogin) : that.concurrentlogin != null)
            return false;
        if (invalidlogin != null ? !invalidlogin.equals(that.invalidlogin) : that.invalidlogin != null) return false;
        if (l1Manager != null ? !l1Manager.equals(that.l1Manager) : that.l1Manager != null) return false;
        if (l2Manager != null ? !l2Manager.equals(that.l2Manager) : that.l2Manager != null) return false;
        if (l3Manager != null ? !l3Manager.equals(that.l3Manager) : that.l3Manager != null) return false;
        if (l4Manager != null ? !l4Manager.equals(that.l4Manager) : that.l4Manager != null) return false;
        if (l5Manager != null ? !l5Manager.equals(that.l5Manager) : that.l5Manager != null) return false;
        if (portaluserid != null ? !portaluserid.equals(that.portaluserid) : that.portaluserid != null) return false;
        if (vbLanguage != null ? !vbLanguage.equals(that.vbLanguage) : that.vbLanguage != null) return false;
        if (vbOtpchannel != null ? !vbOtpchannel.equals(that.vbOtpchannel) : that.vbOtpchannel != null) return false;
        if (deviceid != null ? !deviceid.equals(that.deviceid) : that.deviceid != null) return false;
        if (devicename != null ? !devicename.equals(that.devicename) : that.devicename != null) return false;
        if (vbUserdevicetype != null ? !vbUserdevicetype.equals(that.vbUserdevicetype) : that.vbUserdevicetype != null)
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
        int result = recid;
        result = 31 * result + (financierid != null ? financierid.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (ldapenabled ? 1 : 0);
        result = 31 * result + (aduserid != null ? aduserid.hashCode() : 0);
        result = 31 * result + (username1 != null ? username1.hashCode() : 0);
        result = 31 * result + (username2 != null ? username2.hashCode() : 0);
        result = 31 * result + (username3 != null ? username3.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (idnumber != null ? idnumber.hashCode() : 0);
        result = 31 * result + (vbIdtype != null ? vbIdtype.hashCode() : 0);
        result = 31 * result + (dateofbirthG != null ? dateofbirthG.hashCode() : 0);
        result = 31 * result + (dateofbirthH != null ? dateofbirthH.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(userpic);
        result = 31 * result + (vbUserdesignation != null ? vbUserdesignation.hashCode() : 0);
        result = 31 * result + vbBranchcode;
        result = 31 * result + (initializepassword ? 1 : 0);
        result = 31 * result + (initializepwdate != null ? initializepwdate.hashCode() : 0);
        result = 31 * result + (activedate != null ? activedate.hashCode() : 0);
        result = 31 * result + (expirydate != null ? expirydate.hashCode() : 0);
        result = 31 * result + (logintime != null ? logintime.hashCode() : 0);
        result = 31 * result + (logouttime != null ? logouttime.hashCode() : 0);
        result = 31 * result + (lastlogintime != null ? lastlogintime.hashCode() : 0);
        result = 31 * result + (lastlogouttime != null ? lastlogouttime.hashCode() : 0);
        result = 31 * result + (concurrentlogin != null ? concurrentlogin.hashCode() : 0);
        result = 31 * result + (invalidlogin != null ? invalidlogin.hashCode() : 0);
        result = 31 * result + (l1Manager != null ? l1Manager.hashCode() : 0);
        result = 31 * result + (l2Manager != null ? l2Manager.hashCode() : 0);
        result = 31 * result + (l3Manager != null ? l3Manager.hashCode() : 0);
        result = 31 * result + (l4Manager != null ? l4Manager.hashCode() : 0);
        result = 31 * result + (l5Manager != null ? l5Manager.hashCode() : 0);
        result = 31 * result + (portaluserid != null ? portaluserid.hashCode() : 0);
        result = 31 * result + (vbLanguage != null ? vbLanguage.hashCode() : 0);
        result = 31 * result + (vbOtpchannel != null ? vbOtpchannel.hashCode() : 0);
        result = 31 * result + (deviceid != null ? deviceid.hashCode() : 0);
        result = 31 * result + (devicename != null ? devicename.hashCode() : 0);
        result = 31 * result + (vbUserdevicetype != null ? vbUserdevicetype.hashCode() : 0);
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

    public Collection<ENTITY_TblUmCommiteeMembers> getTblUmCommiteeMembersByUserid() {
        return tblUmCommiteeMembersByUserid;
    }

    public void setTblUmCommiteeMembersByUserid(Collection<ENTITY_TblUmCommiteeMembers> tblUmCommiteeMembersByUserid) {
        this.tblUmCommiteeMembersByUserid = tblUmCommiteeMembersByUserid;
    }

    public Collection<ENTITY_TblUmUserBranch> getTblUmUserBranchesByUserid() {
        return tblUmUserBranchesByUserid;
    }

    public void setTblUmUserBranchesByUserid(Collection<ENTITY_TblUmUserBranch> tblUmUserBranchesByUserid) {
        this.tblUmUserBranchesByUserid = tblUmUserBranchesByUserid;
    }

    public ENTITY_TblCnfgMstFinanciers getTblCnfgMstFinanciersByFinancierid() {
        return tblCnfgMstFinanciersByFinancierid;
    }

    public void setTblCnfgMstFinanciersByFinancierid(ENTITY_TblCnfgMstFinanciers tblCnfgMstFinanciersByFinancierid) {
        this.tblCnfgMstFinanciersByFinancierid = tblCnfgMstFinanciersByFinancierid;
    }

    public Collection<ENTITY_TblUmUserProduct> getTblUmUserProductsByUserid() {
        return tblUmUserProductsByUserid;
    }

    public void setTblUmUserProductsByUserid(Collection<ENTITY_TblUmUserProduct> tblUmUserProductsByUserid) {
        this.tblUmUserProductsByUserid = tblUmUserProductsByUserid;
    }

    public Collection<ENTITY_TblUmUserRole> getTblUmUserRolesByUserid() {
        return tblUmUserRolesByUserid;
    }

    public void setTblUmUserRolesByUserid(Collection<ENTITY_TblUmUserRole> tblUmUserRolesByUserid) {
        this.tblUmUserRolesByUserid = tblUmUserRolesByUserid;
    }
}
