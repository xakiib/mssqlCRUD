package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "TBL_WF_MASTER_TEMPLATE", schema = "dbo", catalog = "master")
public class ENTITY_TblWfMasterTemplate {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TEMPLATEID", nullable = false, precision = 0)
    private int templateid;
    @Basic
    @Column(name = "TEMPLATENAME1", nullable = false, length = 100)
    private String templatename1;
    @Basic
    @Column(name = "TEMPLATENAME2", nullable = true, length = 100)
    private String templatename2;
    @Basic
    @Column(name = "TEMPLATENAME3", nullable = true, length = 100)
    private String templatename3;
    @Basic
    @Column(name = "VB_TEMPLATETYPE", nullable = false, precision = 0)
    private int vbTemplatetype;
    @Basic
    @Column(name = "DOCUMENTID", nullable = true, precision = 0)
    private Integer documentid;
    @Basic
    @Column(name = "FINANCIERID", nullable = false, precision = 0, insertable=false, updatable=false)
    private int financierid;
    @Basic
    @Column(name = "TEMPLATEURL", nullable = true, length = 50)
    private String templateurl;
    @Basic
    @Column(name = "TEMPLATEQUERY", nullable = true, length = 2500)
    private String templatequery;
    @Basic
    @Column(name = "PARAMETERDEFINITION", nullable = true, length = 500)
    private String parameterdefinition;
    @Basic
    @Column(name = "PARAMETERVALUE", nullable = true, length = 500)
    private String parametervalue;
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
    @OneToMany(mappedBy = "tblWfMasterTemplateByTemplateid")
    private Collection<ENTITY_TblWfWorkflowTemplates> tblWfWorkflowTemplatesByTemplateid;

    public int getTemplateid() {
        return templateid;
    }

    public void setTemplateid(int templateid) {
        this.templateid = templateid;
    }

    public String getTemplatename1() {
        return templatename1;
    }

    public void setTemplatename1(String templatename1) {
        this.templatename1 = templatename1;
    }

    public String getTemplatename2() {
        return templatename2;
    }

    public void setTemplatename2(String templatename2) {
        this.templatename2 = templatename2;
    }

    public String getTemplatename3() {
        return templatename3;
    }

    public void setTemplatename3(String templatename3) {
        this.templatename3 = templatename3;
    }

    public int getVbTemplatetype() {
        return vbTemplatetype;
    }

    public void setVbTemplatetype(int vbTemplatetype) {
        this.vbTemplatetype = vbTemplatetype;
    }

    public Integer getDocumentid() {
        return documentid;
    }

    public void setDocumentid(Integer documentid) {
        this.documentid = documentid;
    }

    public int getFinancierid() {
        return financierid;
    }

    public void setFinancierid(int financierid) {
        this.financierid = financierid;
    }

    public String getTemplateurl() {
        return templateurl;
    }

    public void setTemplateurl(String templateurl) {
        this.templateurl = templateurl;
    }

    public String getTemplatequery() {
        return templatequery;
    }

    public void setTemplatequery(String templatequery) {
        this.templatequery = templatequery;
    }

    public String getParameterdefinition() {
        return parameterdefinition;
    }

    public void setParameterdefinition(String parameterdefinition) {
        this.parameterdefinition = parameterdefinition;
    }

    public String getParametervalue() {
        return parametervalue;
    }

    public void setParametervalue(String parametervalue) {
        this.parametervalue = parametervalue;
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

        ENTITY_TblWfMasterTemplate that = (ENTITY_TblWfMasterTemplate) o;

        if (templateid != that.templateid) return false;
        if (vbTemplatetype != that.vbTemplatetype) return false;
        if (financierid != that.financierid) return false;
        if (recstatus != that.recstatus) return false;
        if (templatename1 != null ? !templatename1.equals(that.templatename1) : that.templatename1 != null)
            return false;
        if (templatename2 != null ? !templatename2.equals(that.templatename2) : that.templatename2 != null)
            return false;
        if (templatename3 != null ? !templatename3.equals(that.templatename3) : that.templatename3 != null)
            return false;
        if (documentid != null ? !documentid.equals(that.documentid) : that.documentid != null) return false;
        if (templateurl != null ? !templateurl.equals(that.templateurl) : that.templateurl != null) return false;
        if (templatequery != null ? !templatequery.equals(that.templatequery) : that.templatequery != null)
            return false;
        if (parameterdefinition != null ? !parameterdefinition.equals(that.parameterdefinition) : that.parameterdefinition != null)
            return false;
        if (parametervalue != null ? !parametervalue.equals(that.parametervalue) : that.parametervalue != null)
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
        int result = templateid;
        result = 31 * result + (templatename1 != null ? templatename1.hashCode() : 0);
        result = 31 * result + (templatename2 != null ? templatename2.hashCode() : 0);
        result = 31 * result + (templatename3 != null ? templatename3.hashCode() : 0);
        result = 31 * result + vbTemplatetype;
        result = 31 * result + (documentid != null ? documentid.hashCode() : 0);
        result = 31 * result + financierid;
        result = 31 * result + (templateurl != null ? templateurl.hashCode() : 0);
        result = 31 * result + (templatequery != null ? templatequery.hashCode() : 0);
        result = 31 * result + (parameterdefinition != null ? parameterdefinition.hashCode() : 0);
        result = 31 * result + (parametervalue != null ? parametervalue.hashCode() : 0);
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

    public Collection<ENTITY_TblWfWorkflowTemplates> getTblWfWorkflowTemplatesByTemplateid() {
        return tblWfWorkflowTemplatesByTemplateid;
    }

    public void setTblWfWorkflowTemplatesByTemplateid(Collection<ENTITY_TblWfWorkflowTemplates> tblWfWorkflowTemplatesByTemplateid) {
        this.tblWfWorkflowTemplatesByTemplateid = tblWfWorkflowTemplatesByTemplateid;
    }
}
