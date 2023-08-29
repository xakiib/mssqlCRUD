package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "TBL_DATA_CIF_CUSTOMERDETAILS", schema = "dbo", catalog = "master")
public class ENTITY_TblDataCifCustomerdetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CIFID", nullable = false, precision = 0)
    private int cifid;
    @Basic
    @Column(name = "FINANCIERID", nullable = true, precision = 0)
    private Integer financierid;
    @Basic
    @Column(name = "VB_BRANCH", nullable = true, precision = 0)
    private Integer vbBranch;
    @Basic
    @Column(name = "CUSTOMERFULLNAME", nullable = false, length = 200)
    private String customerfullname;
    @Basic
    @Column(name = "CUSTOMERFULLNAME1", nullable = true, length = 200)
    private String customerfullname1;
    @Basic
    @Column(name = "CUSTOMERFULLNAME2", nullable = true, length = 200)
    private String customerfullname2;
    @Basic
    @Column(name = "VB_SALUTATION", nullable = true, precision = 0)
    private Integer vbSalutation;
    @Basic
    @Column(name = "CUSTFIRSTNAME", nullable = true, length = 50)
    private String custfirstname;
    @Basic
    @Column(name = "CUSTFIRSTNAME1", nullable = true, length = 50)
    private String custfirstname1;
    @Basic
    @Column(name = "CUSTFIRSTNAME2", nullable = true, length = 50)
    private String custfirstname2;
    @Basic
    @Column(name = "CUSTMIDDLENAME", nullable = true, length = 50)
    private String custmiddlename;
    @Basic
    @Column(name = "CUSTMIDDLENAME1", nullable = true, length = 50)
    private String custmiddlename1;
    @Basic
    @Column(name = "CUSTMIDDLENAME2", nullable = true, length = 50)
    private String custmiddlename2;
    @Basic
    @Column(name = "CUSTLASTNAME", nullable = true, length = 50)
    private String custlastname;
    @Basic
    @Column(name = "CUSTLASTNAME1", nullable = true, length = 50)
    private String custlastname1;
    @Basic
    @Column(name = "CUSTLASTNAME2", nullable = true, length = 50)
    private String custlastname2;
    @Basic
    @Column(name = "CUSTFAMILYNAME", nullable = true, length = 50)
    private String custfamilyname;
    @Basic
    @Column(name = "CUSTFAMILYNAME1", nullable = true, length = 50)
    private String custfamilyname1;
    @Basic
    @Column(name = "CUSTFAMILYNAME2", nullable = true, length = 50)
    private String custfamilyname2;
    @Basic
    @Column(name = "VB_CUSTOMERTYPE", nullable = false, precision = 0)
    private int vbCustomertype;
    @Basic
    @Column(name = "DOB_G", nullable = true)
    private Date dobG;
    @Basic
    @Column(name = "DOB_H", nullable = true, length = 50)
    private String dobH;
    @Basic
    @Column(name = "AGE_G", nullable = true)
    private Integer ageG;
    @Basic
    @Column(name = "AGE_H", nullable = true)
    private Integer ageH;
    @Basic
    @Column(name = "VB_GENDER", nullable = true, precision = 0)
    private Integer vbGender;
    @Basic
    @Column(name = "VB_NATIONALITY", nullable = true, precision = 0)
    private Integer vbNationality;
    @Basic
    @Column(name = "VB_MARITALSTATUS", nullable = true, precision = 0)
    private Integer vbMaritalstatus;
    @Basic
    @Column(name = "NOOFDEPENDENTS", nullable = true)
    private Integer noofdependents;
    @Basic
    @Column(name = "VB_QUALIFICATIONTYPE", nullable = true, precision = 0)
    private Integer vbQualificationtype;
    @Basic
    @Column(name = "VB_CUSTOMERCATEGORY", nullable = true, precision = 0)
    private Integer vbCustomercategory;
    @Basic
    @Column(name = "VB_RESIDENTIALSTATUS", nullable = true, precision = 0)
    private Integer vbResidentialstatus;
    @Basic
    @Column(name = "MOTHERSNAME", nullable = true, length = 50)
    private String mothersname;
    @Basic
    @Column(name = "VB_BASICGROUP", nullable = true, precision = 0)
    private Integer vbBasicgroup;
    @Basic
    @Column(name = "VB_RELIGION", nullable = true, precision = 0)
    private Integer vbReligion;
    @Basic
    @Column(name = "VB_LANGUAGE", nullable = true, precision = 0)
    private Integer vbLanguage;
    @Basic
    @Column(name = "VB_ETHNIC", nullable = true, precision = 0)
    private Integer vbEthnic;
    @Basic
    @Column(name = "VB_INCOMEBRACKET", nullable = true, precision = 0)
    private Integer vbIncomebracket;
    @Basic
    @Column(name = "VB_COMPREGCATEGORY", nullable = true, precision = 0)
    private Integer vbCompregcategory;
    @Basic
    @Column(name = "VB_CUSTOMERSEGMENT", nullable = true, precision = 0)
    private Integer vbCustomersegment;
    @Basic
    @Column(name = "VB_ECONOMYSECTOR", nullable = true, precision = 0)
    private Integer vbEconomysector;
    @Basic
    @Column(name = "VB_COMPANYINDUSTRY", nullable = true, precision = 0)
    private Integer vbCompanyindustry;
    @Basic
    @Column(name = "VB_BUSINESSACTIVITY", nullable = true, precision = 0)
    private Integer vbBusinessactivity;
    @Basic
    @Column(name = "VB_REGISTRATIONCOUNTRY", nullable = true, precision = 0)
    private Integer vbRegistrationcountry;
    @Basic
    @Column(name = "VB_REGISTRATIONCITY", nullable = true, precision = 0)
    private Integer vbRegistrationcity;
    @Basic
    @Column(name = "BUSINESSVATNO", nullable = true, length = 20)
    private String businessvatno;
    @Basic
    @Column(name = "BUSGROUPVATNO", nullable = true, length = 20)
    private String busgroupvatno;
    @Basic
    @Column(name = "PAIDUPCAPITAL", nullable = true, precision = 0)
    private Integer paidupcapital;
    @Basic
    @Column(name = "ESTABLISHMENTDATE_G", nullable = true)
    private Date establishmentdateG;
    @Basic
    @Column(name = "ESTABLISHMENTDATE_H", nullable = true, length = 20)
    private String establishmentdateH;
    @Basic
    @Column(name = "VB_REVENUECATEGORY", nullable = true, precision = 0)
    private Integer vbRevenuecategory;
    @Basic
    @Column(name = "ANNUALREVENUE", nullable = true, precision = 0)
    private Integer annualrevenue;
    @Basic
    @Column(name = "CUSTOMERRATING", nullable = true, length = 50)
    private String customerrating;
    @Basic
    @Column(name = "SALARYCREDITTOBANK", nullable = true)
    private Boolean salarycredittobank;
    @Basic
    @Column(name = "VB_REFERREDBY", nullable = true, precision = 0)
    private Integer vbReferredby;
    @Basic
    @Column(name = "REFERALCODE", nullable = true, length = 50)
    private String referalcode;
    @Basic
    @Column(name = "BLACKLISTED", nullable = false)
    private boolean blacklisted;
    @Basic
    @Column(name = "RELATEDCIFID", nullable = true, precision = 0)
    private Integer relatedcifid;
    @Basic
    @Column(name = "VB_RELATIONSHIPTYPE", nullable = true, precision = 0)
    private Integer vbRelationshiptype;
    @Basic
    @Column(name = "REMARKS", nullable = true, length = 1000)
    private String remarks;
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
    @OneToMany(mappedBy = "tblDataCifCustomerdetailsByCifid")
    private Collection<ENTITY_TblDataCifAddress> tblDataCifAddressesByCifid;
    @OneToMany(mappedBy = "tblDataCifCustomerdetailsByCifid")
    private Collection<ENTITY_TblDataCifBank> tblDataCifBanksByCifid;
    @OneToMany(mappedBy = "tblDataCifCustomerdetailsByCifid")
    private Collection<ENTITY_TblDataCifBanktransdtl> tblDataCifBanktransdtlsByCifid;
    @OneToMany(mappedBy = "tblDataCifCustomerdetailsByCifid")
    private Collection<ENTITY_TblDataCifEmployment> tblDataCifEmploymentsByCifid;
    @OneToMany(mappedBy = "tblDataCifCustomerdetailsByCifid")
    private Collection<ENTITY_TblDataCifIdentification> tblDataCifIdentificationsByCifid;
    @OneToMany(mappedBy = "tblDataCifCustomerdetailsByCifid")
    private Collection<ENTITY_TblDataCifIncome> tblDataCifIncomesByCifid;
    @OneToMany(mappedBy = "tblDataCifCustomerdetailsByCifid")
    private Collection<ENTITY_TblDataCifLiabilities> tblDataCifLiabilitiesByCifid;

    public int getCifid() {
        return cifid;
    }

    public void setCifid(int cifid) {
        this.cifid = cifid;
    }

    public Integer getFinancierid() {
        return financierid;
    }

    public void setFinancierid(Integer financierid) {
        this.financierid = financierid;
    }

    public Integer getVbBranch() {
        return vbBranch;
    }

    public void setVbBranch(Integer vbBranch) {
        this.vbBranch = vbBranch;
    }

    public String getCustomerfullname() {
        return customerfullname;
    }

    public void setCustomerfullname(String customerfullname) {
        this.customerfullname = customerfullname;
    }

    public String getCustomerfullname1() {
        return customerfullname1;
    }

    public void setCustomerfullname1(String customerfullname1) {
        this.customerfullname1 = customerfullname1;
    }

    public String getCustomerfullname2() {
        return customerfullname2;
    }

    public void setCustomerfullname2(String customerfullname2) {
        this.customerfullname2 = customerfullname2;
    }

    public Integer getVbSalutation() {
        return vbSalutation;
    }

    public void setVbSalutation(Integer vbSalutation) {
        this.vbSalutation = vbSalutation;
    }

    public String getCustfirstname() {
        return custfirstname;
    }

    public void setCustfirstname(String custfirstname) {
        this.custfirstname = custfirstname;
    }

    public String getCustfirstname1() {
        return custfirstname1;
    }

    public void setCustfirstname1(String custfirstname1) {
        this.custfirstname1 = custfirstname1;
    }

    public String getCustfirstname2() {
        return custfirstname2;
    }

    public void setCustfirstname2(String custfirstname2) {
        this.custfirstname2 = custfirstname2;
    }

    public String getCustmiddlename() {
        return custmiddlename;
    }

    public void setCustmiddlename(String custmiddlename) {
        this.custmiddlename = custmiddlename;
    }

    public String getCustmiddlename1() {
        return custmiddlename1;
    }

    public void setCustmiddlename1(String custmiddlename1) {
        this.custmiddlename1 = custmiddlename1;
    }

    public String getCustmiddlename2() {
        return custmiddlename2;
    }

    public void setCustmiddlename2(String custmiddlename2) {
        this.custmiddlename2 = custmiddlename2;
    }

    public String getCustlastname() {
        return custlastname;
    }

    public void setCustlastname(String custlastname) {
        this.custlastname = custlastname;
    }

    public String getCustlastname1() {
        return custlastname1;
    }

    public void setCustlastname1(String custlastname1) {
        this.custlastname1 = custlastname1;
    }

    public String getCustlastname2() {
        return custlastname2;
    }

    public void setCustlastname2(String custlastname2) {
        this.custlastname2 = custlastname2;
    }

    public String getCustfamilyname() {
        return custfamilyname;
    }

    public void setCustfamilyname(String custfamilyname) {
        this.custfamilyname = custfamilyname;
    }

    public String getCustfamilyname1() {
        return custfamilyname1;
    }

    public void setCustfamilyname1(String custfamilyname1) {
        this.custfamilyname1 = custfamilyname1;
    }

    public String getCustfamilyname2() {
        return custfamilyname2;
    }

    public void setCustfamilyname2(String custfamilyname2) {
        this.custfamilyname2 = custfamilyname2;
    }

    public int getVbCustomertype() {
        return vbCustomertype;
    }

    public void setVbCustomertype(int vbCustomertype) {
        this.vbCustomertype = vbCustomertype;
    }

    public Date getDobG() {
        return dobG;
    }

    public void setDobG(Date dobG) {
        this.dobG = dobG;
    }

    public String getDobH() {
        return dobH;
    }

    public void setDobH(String dobH) {
        this.dobH = dobH;
    }

    public Integer getAgeG() {
        return ageG;
    }

    public void setAgeG(Integer ageG) {
        this.ageG = ageG;
    }

    public Integer getAgeH() {
        return ageH;
    }

    public void setAgeH(Integer ageH) {
        this.ageH = ageH;
    }

    public Integer getVbGender() {
        return vbGender;
    }

    public void setVbGender(Integer vbGender) {
        this.vbGender = vbGender;
    }

    public Integer getVbNationality() {
        return vbNationality;
    }

    public void setVbNationality(Integer vbNationality) {
        this.vbNationality = vbNationality;
    }

    public Integer getVbMaritalstatus() {
        return vbMaritalstatus;
    }

    public void setVbMaritalstatus(Integer vbMaritalstatus) {
        this.vbMaritalstatus = vbMaritalstatus;
    }

    public Integer getNoofdependents() {
        return noofdependents;
    }

    public void setNoofdependents(Integer noofdependents) {
        this.noofdependents = noofdependents;
    }

    public Integer getVbQualificationtype() {
        return vbQualificationtype;
    }

    public void setVbQualificationtype(Integer vbQualificationtype) {
        this.vbQualificationtype = vbQualificationtype;
    }

    public Integer getVbCustomercategory() {
        return vbCustomercategory;
    }

    public void setVbCustomercategory(Integer vbCustomercategory) {
        this.vbCustomercategory = vbCustomercategory;
    }

    public Integer getVbResidentialstatus() {
        return vbResidentialstatus;
    }

    public void setVbResidentialstatus(Integer vbResidentialstatus) {
        this.vbResidentialstatus = vbResidentialstatus;
    }

    public String getMothersname() {
        return mothersname;
    }

    public void setMothersname(String mothersname) {
        this.mothersname = mothersname;
    }

    public Integer getVbBasicgroup() {
        return vbBasicgroup;
    }

    public void setVbBasicgroup(Integer vbBasicgroup) {
        this.vbBasicgroup = vbBasicgroup;
    }

    public Integer getVbReligion() {
        return vbReligion;
    }

    public void setVbReligion(Integer vbReligion) {
        this.vbReligion = vbReligion;
    }

    public Integer getVbLanguage() {
        return vbLanguage;
    }

    public void setVbLanguage(Integer vbLanguage) {
        this.vbLanguage = vbLanguage;
    }

    public Integer getVbEthnic() {
        return vbEthnic;
    }

    public void setVbEthnic(Integer vbEthnic) {
        this.vbEthnic = vbEthnic;
    }

    public Integer getVbIncomebracket() {
        return vbIncomebracket;
    }

    public void setVbIncomebracket(Integer vbIncomebracket) {
        this.vbIncomebracket = vbIncomebracket;
    }

    public Integer getVbCompregcategory() {
        return vbCompregcategory;
    }

    public void setVbCompregcategory(Integer vbCompregcategory) {
        this.vbCompregcategory = vbCompregcategory;
    }

    public Integer getVbCustomersegment() {
        return vbCustomersegment;
    }

    public void setVbCustomersegment(Integer vbCustomersegment) {
        this.vbCustomersegment = vbCustomersegment;
    }

    public Integer getVbEconomysector() {
        return vbEconomysector;
    }

    public void setVbEconomysector(Integer vbEconomysector) {
        this.vbEconomysector = vbEconomysector;
    }

    public Integer getVbCompanyindustry() {
        return vbCompanyindustry;
    }

    public void setVbCompanyindustry(Integer vbCompanyindustry) {
        this.vbCompanyindustry = vbCompanyindustry;
    }

    public Integer getVbBusinessactivity() {
        return vbBusinessactivity;
    }

    public void setVbBusinessactivity(Integer vbBusinessactivity) {
        this.vbBusinessactivity = vbBusinessactivity;
    }

    public Integer getVbRegistrationcountry() {
        return vbRegistrationcountry;
    }

    public void setVbRegistrationcountry(Integer vbRegistrationcountry) {
        this.vbRegistrationcountry = vbRegistrationcountry;
    }

    public Integer getVbRegistrationcity() {
        return vbRegistrationcity;
    }

    public void setVbRegistrationcity(Integer vbRegistrationcity) {
        this.vbRegistrationcity = vbRegistrationcity;
    }

    public String getBusinessvatno() {
        return businessvatno;
    }

    public void setBusinessvatno(String businessvatno) {
        this.businessvatno = businessvatno;
    }

    public String getBusgroupvatno() {
        return busgroupvatno;
    }

    public void setBusgroupvatno(String busgroupvatno) {
        this.busgroupvatno = busgroupvatno;
    }

    public Integer getPaidupcapital() {
        return paidupcapital;
    }

    public void setPaidupcapital(Integer paidupcapital) {
        this.paidupcapital = paidupcapital;
    }

    public Date getEstablishmentdateG() {
        return establishmentdateG;
    }

    public void setEstablishmentdateG(Date establishmentdateG) {
        this.establishmentdateG = establishmentdateG;
    }

    public String getEstablishmentdateH() {
        return establishmentdateH;
    }

    public void setEstablishmentdateH(String establishmentdateH) {
        this.establishmentdateH = establishmentdateH;
    }

    public Integer getVbRevenuecategory() {
        return vbRevenuecategory;
    }

    public void setVbRevenuecategory(Integer vbRevenuecategory) {
        this.vbRevenuecategory = vbRevenuecategory;
    }

    public Integer getAnnualrevenue() {
        return annualrevenue;
    }

    public void setAnnualrevenue(Integer annualrevenue) {
        this.annualrevenue = annualrevenue;
    }

    public String getCustomerrating() {
        return customerrating;
    }

    public void setCustomerrating(String customerrating) {
        this.customerrating = customerrating;
    }

    public Boolean getSalarycredittobank() {
        return salarycredittobank;
    }

    public void setSalarycredittobank(Boolean salarycredittobank) {
        this.salarycredittobank = salarycredittobank;
    }

    public Integer getVbReferredby() {
        return vbReferredby;
    }

    public void setVbReferredby(Integer vbReferredby) {
        this.vbReferredby = vbReferredby;
    }

    public String getReferalcode() {
        return referalcode;
    }

    public void setReferalcode(String referalcode) {
        this.referalcode = referalcode;
    }

    public boolean isBlacklisted() {
        return blacklisted;
    }

    public void setBlacklisted(boolean blacklisted) {
        this.blacklisted = blacklisted;
    }

    public Integer getRelatedcifid() {
        return relatedcifid;
    }

    public void setRelatedcifid(Integer relatedcifid) {
        this.relatedcifid = relatedcifid;
    }

    public Integer getVbRelationshiptype() {
        return vbRelationshiptype;
    }

    public void setVbRelationshiptype(Integer vbRelationshiptype) {
        this.vbRelationshiptype = vbRelationshiptype;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

        ENTITY_TblDataCifCustomerdetails that = (ENTITY_TblDataCifCustomerdetails) o;

        if (cifid != that.cifid) return false;
        if (vbCustomertype != that.vbCustomertype) return false;
        if (blacklisted != that.blacklisted) return false;
        if (recstatus != that.recstatus) return false;
        if (financierid != null ? !financierid.equals(that.financierid) : that.financierid != null) return false;
        if (vbBranch != null ? !vbBranch.equals(that.vbBranch) : that.vbBranch != null) return false;
        if (customerfullname != null ? !customerfullname.equals(that.customerfullname) : that.customerfullname != null)
            return false;
        if (customerfullname1 != null ? !customerfullname1.equals(that.customerfullname1) : that.customerfullname1 != null)
            return false;
        if (customerfullname2 != null ? !customerfullname2.equals(that.customerfullname2) : that.customerfullname2 != null)
            return false;
        if (vbSalutation != null ? !vbSalutation.equals(that.vbSalutation) : that.vbSalutation != null) return false;
        if (custfirstname != null ? !custfirstname.equals(that.custfirstname) : that.custfirstname != null)
            return false;
        if (custfirstname1 != null ? !custfirstname1.equals(that.custfirstname1) : that.custfirstname1 != null)
            return false;
        if (custfirstname2 != null ? !custfirstname2.equals(that.custfirstname2) : that.custfirstname2 != null)
            return false;
        if (custmiddlename != null ? !custmiddlename.equals(that.custmiddlename) : that.custmiddlename != null)
            return false;
        if (custmiddlename1 != null ? !custmiddlename1.equals(that.custmiddlename1) : that.custmiddlename1 != null)
            return false;
        if (custmiddlename2 != null ? !custmiddlename2.equals(that.custmiddlename2) : that.custmiddlename2 != null)
            return false;
        if (custlastname != null ? !custlastname.equals(that.custlastname) : that.custlastname != null) return false;
        if (custlastname1 != null ? !custlastname1.equals(that.custlastname1) : that.custlastname1 != null)
            return false;
        if (custlastname2 != null ? !custlastname2.equals(that.custlastname2) : that.custlastname2 != null)
            return false;
        if (custfamilyname != null ? !custfamilyname.equals(that.custfamilyname) : that.custfamilyname != null)
            return false;
        if (custfamilyname1 != null ? !custfamilyname1.equals(that.custfamilyname1) : that.custfamilyname1 != null)
            return false;
        if (custfamilyname2 != null ? !custfamilyname2.equals(that.custfamilyname2) : that.custfamilyname2 != null)
            return false;
        if (dobG != null ? !dobG.equals(that.dobG) : that.dobG != null) return false;
        if (dobH != null ? !dobH.equals(that.dobH) : that.dobH != null) return false;
        if (ageG != null ? !ageG.equals(that.ageG) : that.ageG != null) return false;
        if (ageH != null ? !ageH.equals(that.ageH) : that.ageH != null) return false;
        if (vbGender != null ? !vbGender.equals(that.vbGender) : that.vbGender != null) return false;
        if (vbNationality != null ? !vbNationality.equals(that.vbNationality) : that.vbNationality != null)
            return false;
        if (vbMaritalstatus != null ? !vbMaritalstatus.equals(that.vbMaritalstatus) : that.vbMaritalstatus != null)
            return false;
        if (noofdependents != null ? !noofdependents.equals(that.noofdependents) : that.noofdependents != null)
            return false;
        if (vbQualificationtype != null ? !vbQualificationtype.equals(that.vbQualificationtype) : that.vbQualificationtype != null)
            return false;
        if (vbCustomercategory != null ? !vbCustomercategory.equals(that.vbCustomercategory) : that.vbCustomercategory != null)
            return false;
        if (vbResidentialstatus != null ? !vbResidentialstatus.equals(that.vbResidentialstatus) : that.vbResidentialstatus != null)
            return false;
        if (mothersname != null ? !mothersname.equals(that.mothersname) : that.mothersname != null) return false;
        if (vbBasicgroup != null ? !vbBasicgroup.equals(that.vbBasicgroup) : that.vbBasicgroup != null) return false;
        if (vbReligion != null ? !vbReligion.equals(that.vbReligion) : that.vbReligion != null) return false;
        if (vbLanguage != null ? !vbLanguage.equals(that.vbLanguage) : that.vbLanguage != null) return false;
        if (vbEthnic != null ? !vbEthnic.equals(that.vbEthnic) : that.vbEthnic != null) return false;
        if (vbIncomebracket != null ? !vbIncomebracket.equals(that.vbIncomebracket) : that.vbIncomebracket != null)
            return false;
        if (vbCompregcategory != null ? !vbCompregcategory.equals(that.vbCompregcategory) : that.vbCompregcategory != null)
            return false;
        if (vbCustomersegment != null ? !vbCustomersegment.equals(that.vbCustomersegment) : that.vbCustomersegment != null)
            return false;
        if (vbEconomysector != null ? !vbEconomysector.equals(that.vbEconomysector) : that.vbEconomysector != null)
            return false;
        if (vbCompanyindustry != null ? !vbCompanyindustry.equals(that.vbCompanyindustry) : that.vbCompanyindustry != null)
            return false;
        if (vbBusinessactivity != null ? !vbBusinessactivity.equals(that.vbBusinessactivity) : that.vbBusinessactivity != null)
            return false;
        if (vbRegistrationcountry != null ? !vbRegistrationcountry.equals(that.vbRegistrationcountry) : that.vbRegistrationcountry != null)
            return false;
        if (vbRegistrationcity != null ? !vbRegistrationcity.equals(that.vbRegistrationcity) : that.vbRegistrationcity != null)
            return false;
        if (businessvatno != null ? !businessvatno.equals(that.businessvatno) : that.businessvatno != null)
            return false;
        if (busgroupvatno != null ? !busgroupvatno.equals(that.busgroupvatno) : that.busgroupvatno != null)
            return false;
        if (paidupcapital != null ? !paidupcapital.equals(that.paidupcapital) : that.paidupcapital != null)
            return false;
        if (establishmentdateG != null ? !establishmentdateG.equals(that.establishmentdateG) : that.establishmentdateG != null)
            return false;
        if (establishmentdateH != null ? !establishmentdateH.equals(that.establishmentdateH) : that.establishmentdateH != null)
            return false;
        if (vbRevenuecategory != null ? !vbRevenuecategory.equals(that.vbRevenuecategory) : that.vbRevenuecategory != null)
            return false;
        if (annualrevenue != null ? !annualrevenue.equals(that.annualrevenue) : that.annualrevenue != null)
            return false;
        if (customerrating != null ? !customerrating.equals(that.customerrating) : that.customerrating != null)
            return false;
        if (salarycredittobank != null ? !salarycredittobank.equals(that.salarycredittobank) : that.salarycredittobank != null)
            return false;
        if (vbReferredby != null ? !vbReferredby.equals(that.vbReferredby) : that.vbReferredby != null) return false;
        if (referalcode != null ? !referalcode.equals(that.referalcode) : that.referalcode != null) return false;
        if (relatedcifid != null ? !relatedcifid.equals(that.relatedcifid) : that.relatedcifid != null) return false;
        if (vbRelationshiptype != null ? !vbRelationshiptype.equals(that.vbRelationshiptype) : that.vbRelationshiptype != null)
            return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
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
        int result = cifid;
        result = 31 * result + (financierid != null ? financierid.hashCode() : 0);
        result = 31 * result + (vbBranch != null ? vbBranch.hashCode() : 0);
        result = 31 * result + (customerfullname != null ? customerfullname.hashCode() : 0);
        result = 31 * result + (customerfullname1 != null ? customerfullname1.hashCode() : 0);
        result = 31 * result + (customerfullname2 != null ? customerfullname2.hashCode() : 0);
        result = 31 * result + (vbSalutation != null ? vbSalutation.hashCode() : 0);
        result = 31 * result + (custfirstname != null ? custfirstname.hashCode() : 0);
        result = 31 * result + (custfirstname1 != null ? custfirstname1.hashCode() : 0);
        result = 31 * result + (custfirstname2 != null ? custfirstname2.hashCode() : 0);
        result = 31 * result + (custmiddlename != null ? custmiddlename.hashCode() : 0);
        result = 31 * result + (custmiddlename1 != null ? custmiddlename1.hashCode() : 0);
        result = 31 * result + (custmiddlename2 != null ? custmiddlename2.hashCode() : 0);
        result = 31 * result + (custlastname != null ? custlastname.hashCode() : 0);
        result = 31 * result + (custlastname1 != null ? custlastname1.hashCode() : 0);
        result = 31 * result + (custlastname2 != null ? custlastname2.hashCode() : 0);
        result = 31 * result + (custfamilyname != null ? custfamilyname.hashCode() : 0);
        result = 31 * result + (custfamilyname1 != null ? custfamilyname1.hashCode() : 0);
        result = 31 * result + (custfamilyname2 != null ? custfamilyname2.hashCode() : 0);
        result = 31 * result + vbCustomertype;
        result = 31 * result + (dobG != null ? dobG.hashCode() : 0);
        result = 31 * result + (dobH != null ? dobH.hashCode() : 0);
        result = 31 * result + (ageG != null ? ageG.hashCode() : 0);
        result = 31 * result + (ageH != null ? ageH.hashCode() : 0);
        result = 31 * result + (vbGender != null ? vbGender.hashCode() : 0);
        result = 31 * result + (vbNationality != null ? vbNationality.hashCode() : 0);
        result = 31 * result + (vbMaritalstatus != null ? vbMaritalstatus.hashCode() : 0);
        result = 31 * result + (noofdependents != null ? noofdependents.hashCode() : 0);
        result = 31 * result + (vbQualificationtype != null ? vbQualificationtype.hashCode() : 0);
        result = 31 * result + (vbCustomercategory != null ? vbCustomercategory.hashCode() : 0);
        result = 31 * result + (vbResidentialstatus != null ? vbResidentialstatus.hashCode() : 0);
        result = 31 * result + (mothersname != null ? mothersname.hashCode() : 0);
        result = 31 * result + (vbBasicgroup != null ? vbBasicgroup.hashCode() : 0);
        result = 31 * result + (vbReligion != null ? vbReligion.hashCode() : 0);
        result = 31 * result + (vbLanguage != null ? vbLanguage.hashCode() : 0);
        result = 31 * result + (vbEthnic != null ? vbEthnic.hashCode() : 0);
        result = 31 * result + (vbIncomebracket != null ? vbIncomebracket.hashCode() : 0);
        result = 31 * result + (vbCompregcategory != null ? vbCompregcategory.hashCode() : 0);
        result = 31 * result + (vbCustomersegment != null ? vbCustomersegment.hashCode() : 0);
        result = 31 * result + (vbEconomysector != null ? vbEconomysector.hashCode() : 0);
        result = 31 * result + (vbCompanyindustry != null ? vbCompanyindustry.hashCode() : 0);
        result = 31 * result + (vbBusinessactivity != null ? vbBusinessactivity.hashCode() : 0);
        result = 31 * result + (vbRegistrationcountry != null ? vbRegistrationcountry.hashCode() : 0);
        result = 31 * result + (vbRegistrationcity != null ? vbRegistrationcity.hashCode() : 0);
        result = 31 * result + (businessvatno != null ? businessvatno.hashCode() : 0);
        result = 31 * result + (busgroupvatno != null ? busgroupvatno.hashCode() : 0);
        result = 31 * result + (paidupcapital != null ? paidupcapital.hashCode() : 0);
        result = 31 * result + (establishmentdateG != null ? establishmentdateG.hashCode() : 0);
        result = 31 * result + (establishmentdateH != null ? establishmentdateH.hashCode() : 0);
        result = 31 * result + (vbRevenuecategory != null ? vbRevenuecategory.hashCode() : 0);
        result = 31 * result + (annualrevenue != null ? annualrevenue.hashCode() : 0);
        result = 31 * result + (customerrating != null ? customerrating.hashCode() : 0);
        result = 31 * result + (salarycredittobank != null ? salarycredittobank.hashCode() : 0);
        result = 31 * result + (vbReferredby != null ? vbReferredby.hashCode() : 0);
        result = 31 * result + (referalcode != null ? referalcode.hashCode() : 0);
        result = 31 * result + (blacklisted ? 1 : 0);
        result = 31 * result + (relatedcifid != null ? relatedcifid.hashCode() : 0);
        result = 31 * result + (vbRelationshiptype != null ? vbRelationshiptype.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
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

    public Collection<ENTITY_TblDataCifAddress> getTblDataCifAddressesByCifid() {
        return tblDataCifAddressesByCifid;
    }

    public void setTblDataCifAddressesByCifid(Collection<ENTITY_TblDataCifAddress> tblDataCifAddressesByCifid) {
        this.tblDataCifAddressesByCifid = tblDataCifAddressesByCifid;
    }

    public Collection<ENTITY_TblDataCifBank> getTblDataCifBanksByCifid() {
        return tblDataCifBanksByCifid;
    }

    public void setTblDataCifBanksByCifid(Collection<ENTITY_TblDataCifBank> tblDataCifBanksByCifid) {
        this.tblDataCifBanksByCifid = tblDataCifBanksByCifid;
    }

    public Collection<ENTITY_TblDataCifBanktransdtl> getTblDataCifBanktransdtlsByCifid() {
        return tblDataCifBanktransdtlsByCifid;
    }

    public void setTblDataCifBanktransdtlsByCifid(Collection<ENTITY_TblDataCifBanktransdtl> tblDataCifBanktransdtlsByCifid) {
        this.tblDataCifBanktransdtlsByCifid = tblDataCifBanktransdtlsByCifid;
    }

    public Collection<ENTITY_TblDataCifEmployment> getTblDataCifEmploymentsByCifid() {
        return tblDataCifEmploymentsByCifid;
    }

    public void setTblDataCifEmploymentsByCifid(Collection<ENTITY_TblDataCifEmployment> tblDataCifEmploymentsByCifid) {
        this.tblDataCifEmploymentsByCifid = tblDataCifEmploymentsByCifid;
    }

    public Collection<ENTITY_TblDataCifIdentification> getTblDataCifIdentificationsByCifid() {
        return tblDataCifIdentificationsByCifid;
    }

    public void setTblDataCifIdentificationsByCifid(Collection<ENTITY_TblDataCifIdentification> tblDataCifIdentificationsByCifid) {
        this.tblDataCifIdentificationsByCifid = tblDataCifIdentificationsByCifid;
    }

    public Collection<ENTITY_TblDataCifIncome> getTblDataCifIncomesByCifid() {
        return tblDataCifIncomesByCifid;
    }

    public void setTblDataCifIncomesByCifid(Collection<ENTITY_TblDataCifIncome> tblDataCifIncomesByCifid) {
        this.tblDataCifIncomesByCifid = tblDataCifIncomesByCifid;
    }

    public Collection<ENTITY_TblDataCifLiabilities> getTblDataCifLiabilitiesByCifid() {
        return tblDataCifLiabilitiesByCifid;
    }

    public void setTblDataCifLiabilitiesByCifid(Collection<ENTITY_TblDataCifLiabilities> tblDataCifLiabilitiesByCifid) {
        this.tblDataCifLiabilitiesByCifid = tblDataCifLiabilitiesByCifid;
    }
}
