package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Table(name = "TBL_CNFG_MST_MENU", schema = "dbo", catalog = "master")
public class ENTITY_TblCnfgMstMenu {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MENUID", nullable = false, precision = 0)
    private int menuid;
    @Basic
    @Column(name = "MODULEID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int moduleid;
    @Basic
    @Column(name = "MENUNAME1", nullable = false, length = 100)
    private String menuname1;
    @Basic
    @Column(name = "MENUNAME2", nullable = true, length = 100)
    private String menuname2;
    @Basic
    @Column(name = "MENUNAME3", nullable = true, length = 100)
    private String menuname3;
    @Basic
    @Column(name = "VB_MENUTYPE", nullable = false, precision = 0)
    private int vbMenutype;
    @Basic
    @Column(name = "PARENTMENU", nullable = true, precision = 0)
    private Integer parentmenu;
    @Basic
    @Column(name = "SCREENVALUE", nullable = true, length = 50)
    private String screenvalue;
    @Basic
    @Column(name = "PAGENAME", nullable = true, length = 50)
    private String pagename;
    @Basic
    @Column(name = "CLASSNAME", nullable = true, length = 50)
    private String classname;
    @Basic
    @Column(name = "FUNCTIONNAME", nullable = true, length = 50)
    private String functionname;
    @Basic
    @Column(name = "PROCESSNAME", nullable = true, length = 50)
    private String processname;
    @Basic
    @Column(name = "APINAME", nullable = true, length = 50)
    private String apiname;
    @Basic
    @Column(name = "PARAMETERDEFINITION", nullable = true, length = 500)
    private String parameterdefinition;
    @Basic
    @Column(name = "PARAMETERMAPPING", nullable = true, length = 500)
    private String parametermapping;
    @Basic
    @Column(name = "MENUICON", nullable = true)
    private byte[] menuicon;
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
    @JoinColumn(name = "MODULEID", referencedColumnName = "MODULEID", nullable = false)
    private ENTITY_TblCnfgMstModules tblCnfgMstModulesByModuleid;
    @OneToMany(mappedBy = "tblCnfgMstMenuByMenuid")
    private Collection<ENTITY_TblUmRoleMenu> tblUmRoleMenusByMenuid;

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public int getModuleid() {
        return moduleid;
    }

    public void setModuleid(int moduleid) {
        this.moduleid = moduleid;
    }

    public String getMenuname1() {
        return menuname1;
    }

    public void setMenuname1(String menuname1) {
        this.menuname1 = menuname1;
    }

    public String getMenuname2() {
        return menuname2;
    }

    public void setMenuname2(String menuname2) {
        this.menuname2 = menuname2;
    }

    public String getMenuname3() {
        return menuname3;
    }

    public void setMenuname3(String menuname3) {
        this.menuname3 = menuname3;
    }

    public int getVbMenutype() {
        return vbMenutype;
    }

    public void setVbMenutype(int vbMenutype) {
        this.vbMenutype = vbMenutype;
    }

    public Integer getParentmenu() {
        return parentmenu;
    }

    public void setParentmenu(Integer parentmenu) {
        this.parentmenu = parentmenu;
    }

    public String getScreenvalue() {
        return screenvalue;
    }

    public void setScreenvalue(String screenvalue) {
        this.screenvalue = screenvalue;
    }

    public String getPagename() {
        return pagename;
    }

    public void setPagename(String pagename) {
        this.pagename = pagename;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getFunctionname() {
        return functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname;
    }

    public String getProcessname() {
        return processname;
    }

    public void setProcessname(String processname) {
        this.processname = processname;
    }

    public String getApiname() {
        return apiname;
    }

    public void setApiname(String apiname) {
        this.apiname = apiname;
    }

    public String getParameterdefinition() {
        return parameterdefinition;
    }

    public void setParameterdefinition(String parameterdefinition) {
        this.parameterdefinition = parameterdefinition;
    }

    public String getParametermapping() {
        return parametermapping;
    }

    public void setParametermapping(String parametermapping) {
        this.parametermapping = parametermapping;
    }

    public byte[] getMenuicon() {
        return menuicon;
    }

    public void setMenuicon(byte[] menuicon) {
        this.menuicon = menuicon;
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

        ENTITY_TblCnfgMstMenu that = (ENTITY_TblCnfgMstMenu) o;

        if (menuid != that.menuid) return false;
        if (moduleid != that.moduleid) return false;
        if (vbMenutype != that.vbMenutype) return false;
        if (recstatus != that.recstatus) return false;
        if (menuname1 != null ? !menuname1.equals(that.menuname1) : that.menuname1 != null) return false;
        if (menuname2 != null ? !menuname2.equals(that.menuname2) : that.menuname2 != null) return false;
        if (menuname3 != null ? !menuname3.equals(that.menuname3) : that.menuname3 != null) return false;
        if (parentmenu != null ? !parentmenu.equals(that.parentmenu) : that.parentmenu != null) return false;
        if (screenvalue != null ? !screenvalue.equals(that.screenvalue) : that.screenvalue != null) return false;
        if (pagename != null ? !pagename.equals(that.pagename) : that.pagename != null) return false;
        if (classname != null ? !classname.equals(that.classname) : that.classname != null) return false;
        if (functionname != null ? !functionname.equals(that.functionname) : that.functionname != null) return false;
        if (processname != null ? !processname.equals(that.processname) : that.processname != null) return false;
        if (apiname != null ? !apiname.equals(that.apiname) : that.apiname != null) return false;
        if (parameterdefinition != null ? !parameterdefinition.equals(that.parameterdefinition) : that.parameterdefinition != null)
            return false;
        if (parametermapping != null ? !parametermapping.equals(that.parametermapping) : that.parametermapping != null)
            return false;
        if (!Arrays.equals(menuicon, that.menuicon)) return false;
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
        int result = menuid;
        result = 31 * result + moduleid;
        result = 31 * result + (menuname1 != null ? menuname1.hashCode() : 0);
        result = 31 * result + (menuname2 != null ? menuname2.hashCode() : 0);
        result = 31 * result + (menuname3 != null ? menuname3.hashCode() : 0);
        result = 31 * result + vbMenutype;
        result = 31 * result + (parentmenu != null ? parentmenu.hashCode() : 0);
        result = 31 * result + (screenvalue != null ? screenvalue.hashCode() : 0);
        result = 31 * result + (pagename != null ? pagename.hashCode() : 0);
        result = 31 * result + (classname != null ? classname.hashCode() : 0);
        result = 31 * result + (functionname != null ? functionname.hashCode() : 0);
        result = 31 * result + (processname != null ? processname.hashCode() : 0);
        result = 31 * result + (apiname != null ? apiname.hashCode() : 0);
        result = 31 * result + (parameterdefinition != null ? parameterdefinition.hashCode() : 0);
        result = 31 * result + (parametermapping != null ? parametermapping.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(menuicon);
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

    public ENTITY_TblCnfgMstModules getTblCnfgMstModulesByModuleid() {
        return tblCnfgMstModulesByModuleid;
    }

    public void setTblCnfgMstModulesByModuleid(ENTITY_TblCnfgMstModules tblCnfgMstModulesByModuleid) {
        this.tblCnfgMstModulesByModuleid = tblCnfgMstModulesByModuleid;
    }

    public Collection<ENTITY_TblUmRoleMenu> getTblUmRoleMenusByMenuid() {
        return tblUmRoleMenusByMenuid;
    }

    public void setTblUmRoleMenusByMenuid(Collection<ENTITY_TblUmRoleMenu> tblUmRoleMenusByMenuid) {
        this.tblUmRoleMenusByMenuid = tblUmRoleMenusByMenuid;
    }
}
