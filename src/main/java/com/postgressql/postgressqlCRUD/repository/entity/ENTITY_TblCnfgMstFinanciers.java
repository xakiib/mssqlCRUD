package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Table(name = "TBL_CNFG_MST_FINANCIERS", schema = "dbo", catalog = "master")
public class ENTITY_TblCnfgMstFinanciers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "FINANCIERID", nullable = false, precision = 0)
    private int financierid;
    @Basic
    @Column(name = "FINANCIERNAME1", nullable = false, length = 150)
    private String financiername1;
    @Basic
    @Column(name = "FINANCIERNAME2", nullable = true, length = 150)
    private String financiername2;
    @Basic
    @Column(name = "FINANCIERNAME3", nullable = true, length = 150)
    private String financiername3;
    @Basic
    @Column(name = "CRNUMBER", nullable = true, length = 50)
    private String crnumber;
    @Basic
    @Column(name = "VATNUMBER", nullable = true, length = 50)
    private String vatnumber;
    @Basic
    @Column(name = "FINLOGO", nullable = true)
    private byte[] finlogo;
    @Basic
    @Column(name = "ADDRESS1", nullable = true, length = 1000)
    private String address1;
    @Basic
    @Column(name = "ADDRESS2", nullable = true, length = 1000)
    private String address2;
    @Basic
    @Column(name = "VB_COUNTRY", nullable = true, precision = 0)
    private Integer vbCountry;
    @Basic
    @Column(name = "VB_REGION", nullable = true, precision = 0)
    private Integer vbRegion;
    @Basic
    @Column(name = "VB_CITY", nullable = true, precision = 0)
    private Integer vbCity;
    @Basic
    @Column(name = "POBOX", nullable = true, length = 50)
    private String pobox;
    @Basic
    @Column(name = "ZIPCODE", nullable = true, length = 50)
    private String zipcode;
    @Basic
    @Column(name = "CONTACT1", nullable = true, length = 20)
    private String contact1;
    @Basic
    @Column(name = "CONTACT2", nullable = true, length = 20)
    private String contact2;
    @Basic
    @Column(name = "EMAIL", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "WEBSITE", nullable = true, length = 50)
    private String website;
    @Basic
    @Column(name = "HEADER1", nullable = true, length = 1000)
    private String header1;
    @Basic
    @Column(name = "HEADER2", nullable = true, length = 1000)
    private String header2;
    @Basic
    @Column(name = "HEADER3", nullable = true, length = 1000)
    private String header3;
    @Basic
    @Column(name = "FOOTER1", nullable = true, length = 1000)
    private String footer1;
    @Basic
    @Column(name = "FOOTER2", nullable = true, length = 1000)
    private String footer2;
    @Basic
    @Column(name = "FOOTER3", nullable = true, length = 1000)
    private String footer3;
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
    @OneToMany(mappedBy = "tblCnfgMstFinanciersByFinancierid")
    private Collection<ENTITY_TblCnfgCreditDbrmaster> tblCnfgCreditDbrmastersByFinancierid;
    @OneToMany(mappedBy = "tblCnfgMstFinanciersByFinancierid")
    private Collection<ENTITY_TblCnfgCreditException> tblCnfgCreditExceptionsByFinancierid;
    @OneToMany(mappedBy = "tblCnfgMstFinanciersByFinancierid")
    private Collection<ENTITY_TblCnfgCreditPolicymaster> tblCnfgCreditPolicymastersByFinancierid;
    @OneToMany(mappedBy = "tblCnfgMstFinanciersByFinancierid")
    private Collection<ENTITY_TblCnfgCreditPolicyrules> tblCnfgCreditPolicyrulesByFinancierid;
    @OneToMany(mappedBy = "tblCnfgMstFinanciersByFinancierid")
    private Collection<ENTITY_TblCnfgMstCharges> tblCnfgMstChargesByFinancierid;
    @OneToMany(mappedBy = "tblCnfgMstFinanciersByFinancierid")
    private Collection<ENTITY_TblCnfgSchemeMaster> tblCnfgSchemeMastersByFinancierid;
    @OneToMany(mappedBy = "tblCnfgMstFinanciersByFinancierid")
    private Collection<ENTITY_TblUmCommiteeMaster> tblUmCommiteeMastersByFinancierid;
    @OneToMany(mappedBy = "tblCnfgMstFinanciersByFinancierid")
    private Collection<ENTITY_TblUmRoleMaster> tblUmRoleMastersByFinancierid;
    @OneToMany(mappedBy = "tblCnfgMstFinanciersByFinancierid")
    private Collection<ENTITY_TblUmUserMaster> tblUmUserMastersByFinancierid;
    @OneToMany(mappedBy = "tblCnfgMstFinanciersByFinancierid")
    private Collection<ENTITY_TblWfMasterChecklist> tblWfMasterChecklistsByFinancierid;
    @OneToMany(mappedBy = "tblCnfgMstFinanciersByFinancierid")
    private Collection<ENTITY_TblWfMasterDocument> tblWfMasterDocumentsByFinancierid;
    @OneToMany(mappedBy = "tblCnfgMstFinanciersByFinancierid")
    private Collection<ENTITY_TblWfMasterNotification> tblWfMasterNotificationsByFinancierid;
    @OneToMany(mappedBy = "tblCnfgMstFinanciersByFinancierid")
    private Collection<ENTITY_TblWfMasterProcess> tblWfMasterProcessesByFinancierid;
    @OneToMany(mappedBy = "tblCnfgMstFinanciersByFinancierid")
    private Collection<ENTITY_TblWfMasterTemplate> tblWfMasterTemplatesByFinancierid;

    public int getFinancierid() {
        return financierid;
    }

    public void setFinancierid(int financierid) {
        this.financierid = financierid;
    }

    public String getFinanciername1() {
        return financiername1;
    }

    public void setFinanciername1(String financiername1) {
        this.financiername1 = financiername1;
    }

    public String getFinanciername2() {
        return financiername2;
    }

    public void setFinanciername2(String financiername2) {
        this.financiername2 = financiername2;
    }

    public String getFinanciername3() {
        return financiername3;
    }

    public void setFinanciername3(String financiername3) {
        this.financiername3 = financiername3;
    }

    public String getCrnumber() {
        return crnumber;
    }

    public void setCrnumber(String crnumber) {
        this.crnumber = crnumber;
    }

    public String getVatnumber() {
        return vatnumber;
    }

    public void setVatnumber(String vatnumber) {
        this.vatnumber = vatnumber;
    }

    public byte[] getFinlogo() {
        return finlogo;
    }

    public void setFinlogo(byte[] finlogo) {
        this.finlogo = finlogo;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Integer getVbCountry() {
        return vbCountry;
    }

    public void setVbCountry(Integer vbCountry) {
        this.vbCountry = vbCountry;
    }

    public Integer getVbRegion() {
        return vbRegion;
    }

    public void setVbRegion(Integer vbRegion) {
        this.vbRegion = vbRegion;
    }

    public Integer getVbCity() {
        return vbCity;
    }

    public void setVbCity(Integer vbCity) {
        this.vbCity = vbCity;
    }

    public String getPobox() {
        return pobox;
    }

    public void setPobox(String pobox) {
        this.pobox = pobox;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getHeader1() {
        return header1;
    }

    public void setHeader1(String header1) {
        this.header1 = header1;
    }

    public String getHeader2() {
        return header2;
    }

    public void setHeader2(String header2) {
        this.header2 = header2;
    }

    public String getHeader3() {
        return header3;
    }

    public void setHeader3(String header3) {
        this.header3 = header3;
    }

    public String getFooter1() {
        return footer1;
    }

    public void setFooter1(String footer1) {
        this.footer1 = footer1;
    }

    public String getFooter2() {
        return footer2;
    }

    public void setFooter2(String footer2) {
        this.footer2 = footer2;
    }

    public String getFooter3() {
        return footer3;
    }

    public void setFooter3(String footer3) {
        this.footer3 = footer3;
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

        ENTITY_TblCnfgMstFinanciers that = (ENTITY_TblCnfgMstFinanciers) o;

        if (financierid != that.financierid) return false;
        if (recstatus != that.recstatus) return false;
        if (financiername1 != null ? !financiername1.equals(that.financiername1) : that.financiername1 != null)
            return false;
        if (financiername2 != null ? !financiername2.equals(that.financiername2) : that.financiername2 != null)
            return false;
        if (financiername3 != null ? !financiername3.equals(that.financiername3) : that.financiername3 != null)
            return false;
        if (crnumber != null ? !crnumber.equals(that.crnumber) : that.crnumber != null) return false;
        if (vatnumber != null ? !vatnumber.equals(that.vatnumber) : that.vatnumber != null) return false;
        if (!Arrays.equals(finlogo, that.finlogo)) return false;
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (vbCountry != null ? !vbCountry.equals(that.vbCountry) : that.vbCountry != null) return false;
        if (vbRegion != null ? !vbRegion.equals(that.vbRegion) : that.vbRegion != null) return false;
        if (vbCity != null ? !vbCity.equals(that.vbCity) : that.vbCity != null) return false;
        if (pobox != null ? !pobox.equals(that.pobox) : that.pobox != null) return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) return false;
        if (contact1 != null ? !contact1.equals(that.contact1) : that.contact1 != null) return false;
        if (contact2 != null ? !contact2.equals(that.contact2) : that.contact2 != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (website != null ? !website.equals(that.website) : that.website != null) return false;
        if (header1 != null ? !header1.equals(that.header1) : that.header1 != null) return false;
        if (header2 != null ? !header2.equals(that.header2) : that.header2 != null) return false;
        if (header3 != null ? !header3.equals(that.header3) : that.header3 != null) return false;
        if (footer1 != null ? !footer1.equals(that.footer1) : that.footer1 != null) return false;
        if (footer2 != null ? !footer2.equals(that.footer2) : that.footer2 != null) return false;
        if (footer3 != null ? !footer3.equals(that.footer3) : that.footer3 != null) return false;
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
        int result = financierid;
        result = 31 * result + (financiername1 != null ? financiername1.hashCode() : 0);
        result = 31 * result + (financiername2 != null ? financiername2.hashCode() : 0);
        result = 31 * result + (financiername3 != null ? financiername3.hashCode() : 0);
        result = 31 * result + (crnumber != null ? crnumber.hashCode() : 0);
        result = 31 * result + (vatnumber != null ? vatnumber.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(finlogo);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (vbCountry != null ? vbCountry.hashCode() : 0);
        result = 31 * result + (vbRegion != null ? vbRegion.hashCode() : 0);
        result = 31 * result + (vbCity != null ? vbCity.hashCode() : 0);
        result = 31 * result + (pobox != null ? pobox.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (contact1 != null ? contact1.hashCode() : 0);
        result = 31 * result + (contact2 != null ? contact2.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (website != null ? website.hashCode() : 0);
        result = 31 * result + (header1 != null ? header1.hashCode() : 0);
        result = 31 * result + (header2 != null ? header2.hashCode() : 0);
        result = 31 * result + (header3 != null ? header3.hashCode() : 0);
        result = 31 * result + (footer1 != null ? footer1.hashCode() : 0);
        result = 31 * result + (footer2 != null ? footer2.hashCode() : 0);
        result = 31 * result + (footer3 != null ? footer3.hashCode() : 0);
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

    public Collection<ENTITY_TblCnfgCreditDbrmaster> getTblCnfgCreditDbrmastersByFinancierid() {
        return tblCnfgCreditDbrmastersByFinancierid;
    }

    public void setTblCnfgCreditDbrmastersByFinancierid(Collection<ENTITY_TblCnfgCreditDbrmaster> tblCnfgCreditDbrmastersByFinancierid) {
        this.tblCnfgCreditDbrmastersByFinancierid = tblCnfgCreditDbrmastersByFinancierid;
    }

    public Collection<ENTITY_TblCnfgCreditException> getTblCnfgCreditExceptionsByFinancierid() {
        return tblCnfgCreditExceptionsByFinancierid;
    }

    public void setTblCnfgCreditExceptionsByFinancierid(Collection<ENTITY_TblCnfgCreditException> tblCnfgCreditExceptionsByFinancierid) {
        this.tblCnfgCreditExceptionsByFinancierid = tblCnfgCreditExceptionsByFinancierid;
    }

    public Collection<ENTITY_TblCnfgCreditPolicymaster> getTblCnfgCreditPolicymastersByFinancierid() {
        return tblCnfgCreditPolicymastersByFinancierid;
    }

    public void setTblCnfgCreditPolicymastersByFinancierid(Collection<ENTITY_TblCnfgCreditPolicymaster> tblCnfgCreditPolicymastersByFinancierid) {
        this.tblCnfgCreditPolicymastersByFinancierid = tblCnfgCreditPolicymastersByFinancierid;
    }

    public Collection<ENTITY_TblCnfgCreditPolicyrules> getTblCnfgCreditPolicyrulesByFinancierid() {
        return tblCnfgCreditPolicyrulesByFinancierid;
    }

    public void setTblCnfgCreditPolicyrulesByFinancierid(Collection<ENTITY_TblCnfgCreditPolicyrules> tblCnfgCreditPolicyrulesByFinancierid) {
        this.tblCnfgCreditPolicyrulesByFinancierid = tblCnfgCreditPolicyrulesByFinancierid;
    }

    public Collection<ENTITY_TblCnfgMstCharges> getTblCnfgMstChargesByFinancierid() {
        return tblCnfgMstChargesByFinancierid;
    }

    public void setTblCnfgMstChargesByFinancierid(Collection<ENTITY_TblCnfgMstCharges> tblCnfgMstChargesByFinancierid) {
        this.tblCnfgMstChargesByFinancierid = tblCnfgMstChargesByFinancierid;
    }

    public Collection<ENTITY_TblCnfgSchemeMaster> getTblCnfgSchemeMastersByFinancierid() {
        return tblCnfgSchemeMastersByFinancierid;
    }

    public void setTblCnfgSchemeMastersByFinancierid(Collection<ENTITY_TblCnfgSchemeMaster> tblCnfgSchemeMastersByFinancierid) {
        this.tblCnfgSchemeMastersByFinancierid = tblCnfgSchemeMastersByFinancierid;
    }

    public Collection<ENTITY_TblUmCommiteeMaster> getTblUmCommiteeMastersByFinancierid() {
        return tblUmCommiteeMastersByFinancierid;
    }

    public void setTblUmCommiteeMastersByFinancierid(Collection<ENTITY_TblUmCommiteeMaster> tblUmCommiteeMastersByFinancierid) {
        this.tblUmCommiteeMastersByFinancierid = tblUmCommiteeMastersByFinancierid;
    }

    public Collection<ENTITY_TblUmRoleMaster> getTblUmRoleMastersByFinancierid() {
        return tblUmRoleMastersByFinancierid;
    }

    public void setTblUmRoleMastersByFinancierid(Collection<ENTITY_TblUmRoleMaster> tblUmRoleMastersByFinancierid) {
        this.tblUmRoleMastersByFinancierid = tblUmRoleMastersByFinancierid;
    }

    public Collection<ENTITY_TblUmUserMaster> getTblUmUserMastersByFinancierid() {
        return tblUmUserMastersByFinancierid;
    }

    public void setTblUmUserMastersByFinancierid(Collection<ENTITY_TblUmUserMaster> tblUmUserMastersByFinancierid) {
        this.tblUmUserMastersByFinancierid = tblUmUserMastersByFinancierid;
    }

    public Collection<ENTITY_TblWfMasterChecklist> getTblWfMasterChecklistsByFinancierid() {
        return tblWfMasterChecklistsByFinancierid;
    }

    public void setTblWfMasterChecklistsByFinancierid(Collection<ENTITY_TblWfMasterChecklist> tblWfMasterChecklistsByFinancierid) {
        this.tblWfMasterChecklistsByFinancierid = tblWfMasterChecklistsByFinancierid;
    }

    public Collection<ENTITY_TblWfMasterDocument> getTblWfMasterDocumentsByFinancierid() {
        return tblWfMasterDocumentsByFinancierid;
    }

    public void setTblWfMasterDocumentsByFinancierid(Collection<ENTITY_TblWfMasterDocument> tblWfMasterDocumentsByFinancierid) {
        this.tblWfMasterDocumentsByFinancierid = tblWfMasterDocumentsByFinancierid;
    }

    public Collection<ENTITY_TblWfMasterNotification> getTblWfMasterNotificationsByFinancierid() {
        return tblWfMasterNotificationsByFinancierid;
    }

    public void setTblWfMasterNotificationsByFinancierid(Collection<ENTITY_TblWfMasterNotification> tblWfMasterNotificationsByFinancierid) {
        this.tblWfMasterNotificationsByFinancierid = tblWfMasterNotificationsByFinancierid;
    }

    public Collection<ENTITY_TblWfMasterProcess> getTblWfMasterProcessesByFinancierid() {
        return tblWfMasterProcessesByFinancierid;
    }

    public void setTblWfMasterProcessesByFinancierid(Collection<ENTITY_TblWfMasterProcess> tblWfMasterProcessesByFinancierid) {
        this.tblWfMasterProcessesByFinancierid = tblWfMasterProcessesByFinancierid;
    }

    public Collection<ENTITY_TblWfMasterTemplate> getTblWfMasterTemplatesByFinancierid() {
        return tblWfMasterTemplatesByFinancierid;
    }

    public void setTblWfMasterTemplatesByFinancierid(Collection<ENTITY_TblWfMasterTemplate> tblWfMasterTemplatesByFinancierid) {
        this.tblWfMasterTemplatesByFinancierid = tblWfMasterTemplatesByFinancierid;
    }
}
