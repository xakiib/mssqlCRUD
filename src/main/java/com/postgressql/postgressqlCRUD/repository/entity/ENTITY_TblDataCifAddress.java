package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TBL_DATA_CIF_ADDRESS", schema = "dbo", catalog = "master")
public class ENTITY_TblDataCifAddress {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RECID", nullable = false, precision = 0)
    private int recid;
    @Basic
    @Column(name = "CIFID", nullable = true, precision = 0, insertable=false, updatable=false)
    private Integer cifid;
    @Basic
    @Column(name = "BUILDINGNO", nullable = true)
    private Integer buildingno;
    @Basic
    @Column(name = "ADDITIONALNO", nullable = true)
    private Integer additionalno;
    @Basic
    @Column(name = "UNITNO", nullable = true)
    private Integer unitno;
    @Basic
    @Column(name = "GPSCOORDINATESLA", nullable = true, length = 50)
    private String gpscoordinatesla;
    @Basic
    @Column(name = "GPSCOORDINATESLO", nullable = true, length = 50)
    private String gpscoordinateslo;
    @Basic
    @Column(name = "NATIONALADDRESS", nullable = true, length = 1000)
    private String nationaladdress;
    @Basic
    @Column(name = "ADDRESS1EAR", nullable = true, length = 200)
    private String address1Ear;
    @Basic
    @Column(name = "ADDRESS2EAR", nullable = true, length = 200)
    private String address2Ear;
    @Basic
    @Column(name = "VB_ADDRESSTYPE", nullable = true, precision = 0)
    private Integer vbAddresstype;
    @Basic
    @Column(name = "VB_ADDRSTATUS", nullable = true, precision = 0)
    private Integer vbAddrstatus;
    @Basic
    @Column(name = "VB_RESIDENCETYPE", nullable = true, precision = 0)
    private Integer vbResidencetype;
    @Basic
    @Column(name = "ADDRESS1", nullable = true, length = 200)
    private String address1;
    @Basic
    @Column(name = "ADDRESS2", nullable = true, length = 200)
    private String address2;
    @Basic
    @Column(name = "ADDRESS3", nullable = true, length = 200)
    private String address3;
    @Basic
    @Column(name = "VB_COUNTRY", nullable = true, precision = 0)
    private Integer vbCountry;
    @Basic
    @Column(name = "VB_REGION", nullable = true, precision = 0)
    private Integer vbRegion;
    @Basic
    @Column(name = "REGION", nullable = true, length = 200)
    private String region;
    @Basic
    @Column(name = "VB_DISTRICT", nullable = true, precision = 0)
    private Integer vbDistrict;
    @Basic
    @Column(name = "DISTRICT", nullable = true, length = 200)
    private String district;
    @Basic
    @Column(name = "VB_CITY", nullable = true, precision = 0)
    private Integer vbCity;
    @Basic
    @Column(name = "CITYNAME", nullable = true, length = 200)
    private String cityname;
    @Basic
    @Column(name = "POBOX", nullable = true)
    private Integer pobox;
    @Basic
    @Column(name = "ZIPCODE", nullable = true, length = 50)
    private String zipcode;
    @Basic
    @Column(name = "LANDMARK", nullable = true, length = 200)
    private String landmark;
    @Basic
    @Column(name = "OCCUPANCYSINCE", nullable = true)
    private Date occupancysince;
    @Basic
    @Column(name = "VB_CONTACTPERSONTYPE", nullable = true, precision = 0)
    private Integer vbContactpersontype;
    @Basic
    @Column(name = "CONTACTPERSON", nullable = true, length = 200)
    private String contactperson;
    @Basic
    @Column(name = "VB_CONTACTMETHOD", nullable = true, precision = 0)
    private Integer vbContactmethod;
    @Basic
    @Column(name = "VB_PREFCONTACTTIME", nullable = true, precision = 0)
    private Integer vbPrefcontacttime;
    @Basic
    @Column(name = "PHONE1", nullable = true, length = 50)
    private String phone1;
    @Basic
    @Column(name = "PHONE1EXTN", nullable = true, length = 50)
    private String phone1Extn;
    @Basic
    @Column(name = "PHONE2", nullable = true, length = 50)
    private String phone2;
    @Basic
    @Column(name = "PHONE2EXTN", nullable = true, length = 50)
    private String phone2Extn;
    @Basic
    @Column(name = "FAX", nullable = true, length = 50)
    private String fax;
    @Basic
    @Column(name = "MOBILE1", nullable = true, length = 50)
    private String mobile1;
    @Basic
    @Column(name = "MOBILE2", nullable = true, length = 50)
    private String mobile2;
    @Basic
    @Column(name = "EMAIL", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "LINKEDLN", nullable = true, length = 100)
    private String linkedln;
    @Basic
    @Column(name = "FACEBOOK", nullable = true, length = 200)
    private String facebook;
    @Basic
    @Column(name = "TWITTER", nullable = true, length = 100)
    private String twitter;
    @Basic
    @Column(name = "ISPRIMARY", nullable = false)
    private boolean isprimary;
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
    @JoinColumn(name = "CIFID", referencedColumnName = "CIFID")
    private ENTITY_TblDataCifCustomerdetails tblDataCifCustomerdetailsByCifid;

    public int getRecid() {
        return recid;
    }

    public void setRecid(int recid) {
        this.recid = recid;
    }

    public Integer getCifid() {
        return cifid;
    }

    public void setCifid(Integer cifid) {
        this.cifid = cifid;
    }

    public Integer getBuildingno() {
        return buildingno;
    }

    public void setBuildingno(Integer buildingno) {
        this.buildingno = buildingno;
    }

    public Integer getAdditionalno() {
        return additionalno;
    }

    public void setAdditionalno(Integer additionalno) {
        this.additionalno = additionalno;
    }

    public Integer getUnitno() {
        return unitno;
    }

    public void setUnitno(Integer unitno) {
        this.unitno = unitno;
    }

    public String getGpscoordinatesla() {
        return gpscoordinatesla;
    }

    public void setGpscoordinatesla(String gpscoordinatesla) {
        this.gpscoordinatesla = gpscoordinatesla;
    }

    public String getGpscoordinateslo() {
        return gpscoordinateslo;
    }

    public void setGpscoordinateslo(String gpscoordinateslo) {
        this.gpscoordinateslo = gpscoordinateslo;
    }

    public String getNationaladdress() {
        return nationaladdress;
    }

    public void setNationaladdress(String nationaladdress) {
        this.nationaladdress = nationaladdress;
    }

    public String getAddress1Ear() {
        return address1Ear;
    }

    public void setAddress1Ear(String address1Ear) {
        this.address1Ear = address1Ear;
    }

    public String getAddress2Ear() {
        return address2Ear;
    }

    public void setAddress2Ear(String address2Ear) {
        this.address2Ear = address2Ear;
    }

    public Integer getVbAddresstype() {
        return vbAddresstype;
    }

    public void setVbAddresstype(Integer vbAddresstype) {
        this.vbAddresstype = vbAddresstype;
    }

    public Integer getVbAddrstatus() {
        return vbAddrstatus;
    }

    public void setVbAddrstatus(Integer vbAddrstatus) {
        this.vbAddrstatus = vbAddrstatus;
    }

    public Integer getVbResidencetype() {
        return vbResidencetype;
    }

    public void setVbResidencetype(Integer vbResidencetype) {
        this.vbResidencetype = vbResidencetype;
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

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getVbDistrict() {
        return vbDistrict;
    }

    public void setVbDistrict(Integer vbDistrict) {
        this.vbDistrict = vbDistrict;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getVbCity() {
        return vbCity;
    }

    public void setVbCity(Integer vbCity) {
        this.vbCity = vbCity;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Integer getPobox() {
        return pobox;
    }

    public void setPobox(Integer pobox) {
        this.pobox = pobox;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public Date getOccupancysince() {
        return occupancysince;
    }

    public void setOccupancysince(Date occupancysince) {
        this.occupancysince = occupancysince;
    }

    public Integer getVbContactpersontype() {
        return vbContactpersontype;
    }

    public void setVbContactpersontype(Integer vbContactpersontype) {
        this.vbContactpersontype = vbContactpersontype;
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }

    public Integer getVbContactmethod() {
        return vbContactmethod;
    }

    public void setVbContactmethod(Integer vbContactmethod) {
        this.vbContactmethod = vbContactmethod;
    }

    public Integer getVbPrefcontacttime() {
        return vbPrefcontacttime;
    }

    public void setVbPrefcontacttime(Integer vbPrefcontacttime) {
        this.vbPrefcontacttime = vbPrefcontacttime;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone1Extn() {
        return phone1Extn;
    }

    public void setPhone1Extn(String phone1Extn) {
        this.phone1Extn = phone1Extn;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhone2Extn() {
        return phone2Extn;
    }

    public void setPhone2Extn(String phone2Extn) {
        this.phone2Extn = phone2Extn;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkedln() {
        return linkedln;
    }

    public void setLinkedln(String linkedln) {
        this.linkedln = linkedln;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public boolean isIsprimary() {
        return isprimary;
    }

    public void setIsprimary(boolean isprimary) {
        this.isprimary = isprimary;
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

        ENTITY_TblDataCifAddress that = (ENTITY_TblDataCifAddress) o;

        if (recid != that.recid) return false;
        if (isprimary != that.isprimary) return false;
        if (recstatus != that.recstatus) return false;
        if (cifid != null ? !cifid.equals(that.cifid) : that.cifid != null) return false;
        if (buildingno != null ? !buildingno.equals(that.buildingno) : that.buildingno != null) return false;
        if (additionalno != null ? !additionalno.equals(that.additionalno) : that.additionalno != null) return false;
        if (unitno != null ? !unitno.equals(that.unitno) : that.unitno != null) return false;
        if (gpscoordinatesla != null ? !gpscoordinatesla.equals(that.gpscoordinatesla) : that.gpscoordinatesla != null)
            return false;
        if (gpscoordinateslo != null ? !gpscoordinateslo.equals(that.gpscoordinateslo) : that.gpscoordinateslo != null)
            return false;
        if (nationaladdress != null ? !nationaladdress.equals(that.nationaladdress) : that.nationaladdress != null)
            return false;
        if (address1Ear != null ? !address1Ear.equals(that.address1Ear) : that.address1Ear != null) return false;
        if (address2Ear != null ? !address2Ear.equals(that.address2Ear) : that.address2Ear != null) return false;
        if (vbAddresstype != null ? !vbAddresstype.equals(that.vbAddresstype) : that.vbAddresstype != null)
            return false;
        if (vbAddrstatus != null ? !vbAddrstatus.equals(that.vbAddrstatus) : that.vbAddrstatus != null) return false;
        if (vbResidencetype != null ? !vbResidencetype.equals(that.vbResidencetype) : that.vbResidencetype != null)
            return false;
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (address3 != null ? !address3.equals(that.address3) : that.address3 != null) return false;
        if (vbCountry != null ? !vbCountry.equals(that.vbCountry) : that.vbCountry != null) return false;
        if (vbRegion != null ? !vbRegion.equals(that.vbRegion) : that.vbRegion != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (vbDistrict != null ? !vbDistrict.equals(that.vbDistrict) : that.vbDistrict != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (vbCity != null ? !vbCity.equals(that.vbCity) : that.vbCity != null) return false;
        if (cityname != null ? !cityname.equals(that.cityname) : that.cityname != null) return false;
        if (pobox != null ? !pobox.equals(that.pobox) : that.pobox != null) return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) return false;
        if (landmark != null ? !landmark.equals(that.landmark) : that.landmark != null) return false;
        if (occupancysince != null ? !occupancysince.equals(that.occupancysince) : that.occupancysince != null)
            return false;
        if (vbContactpersontype != null ? !vbContactpersontype.equals(that.vbContactpersontype) : that.vbContactpersontype != null)
            return false;
        if (contactperson != null ? !contactperson.equals(that.contactperson) : that.contactperson != null)
            return false;
        if (vbContactmethod != null ? !vbContactmethod.equals(that.vbContactmethod) : that.vbContactmethod != null)
            return false;
        if (vbPrefcontacttime != null ? !vbPrefcontacttime.equals(that.vbPrefcontacttime) : that.vbPrefcontacttime != null)
            return false;
        if (phone1 != null ? !phone1.equals(that.phone1) : that.phone1 != null) return false;
        if (phone1Extn != null ? !phone1Extn.equals(that.phone1Extn) : that.phone1Extn != null) return false;
        if (phone2 != null ? !phone2.equals(that.phone2) : that.phone2 != null) return false;
        if (phone2Extn != null ? !phone2Extn.equals(that.phone2Extn) : that.phone2Extn != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (mobile1 != null ? !mobile1.equals(that.mobile1) : that.mobile1 != null) return false;
        if (mobile2 != null ? !mobile2.equals(that.mobile2) : that.mobile2 != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (linkedln != null ? !linkedln.equals(that.linkedln) : that.linkedln != null) return false;
        if (facebook != null ? !facebook.equals(that.facebook) : that.facebook != null) return false;
        if (twitter != null ? !twitter.equals(that.twitter) : that.twitter != null) return false;
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
        result = 31 * result + (cifid != null ? cifid.hashCode() : 0);
        result = 31 * result + (buildingno != null ? buildingno.hashCode() : 0);
        result = 31 * result + (additionalno != null ? additionalno.hashCode() : 0);
        result = 31 * result + (unitno != null ? unitno.hashCode() : 0);
        result = 31 * result + (gpscoordinatesla != null ? gpscoordinatesla.hashCode() : 0);
        result = 31 * result + (gpscoordinateslo != null ? gpscoordinateslo.hashCode() : 0);
        result = 31 * result + (nationaladdress != null ? nationaladdress.hashCode() : 0);
        result = 31 * result + (address1Ear != null ? address1Ear.hashCode() : 0);
        result = 31 * result + (address2Ear != null ? address2Ear.hashCode() : 0);
        result = 31 * result + (vbAddresstype != null ? vbAddresstype.hashCode() : 0);
        result = 31 * result + (vbAddrstatus != null ? vbAddrstatus.hashCode() : 0);
        result = 31 * result + (vbResidencetype != null ? vbResidencetype.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (address3 != null ? address3.hashCode() : 0);
        result = 31 * result + (vbCountry != null ? vbCountry.hashCode() : 0);
        result = 31 * result + (vbRegion != null ? vbRegion.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (vbDistrict != null ? vbDistrict.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (vbCity != null ? vbCity.hashCode() : 0);
        result = 31 * result + (cityname != null ? cityname.hashCode() : 0);
        result = 31 * result + (pobox != null ? pobox.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (landmark != null ? landmark.hashCode() : 0);
        result = 31 * result + (occupancysince != null ? occupancysince.hashCode() : 0);
        result = 31 * result + (vbContactpersontype != null ? vbContactpersontype.hashCode() : 0);
        result = 31 * result + (contactperson != null ? contactperson.hashCode() : 0);
        result = 31 * result + (vbContactmethod != null ? vbContactmethod.hashCode() : 0);
        result = 31 * result + (vbPrefcontacttime != null ? vbPrefcontacttime.hashCode() : 0);
        result = 31 * result + (phone1 != null ? phone1.hashCode() : 0);
        result = 31 * result + (phone1Extn != null ? phone1Extn.hashCode() : 0);
        result = 31 * result + (phone2 != null ? phone2.hashCode() : 0);
        result = 31 * result + (phone2Extn != null ? phone2Extn.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (mobile1 != null ? mobile1.hashCode() : 0);
        result = 31 * result + (mobile2 != null ? mobile2.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (linkedln != null ? linkedln.hashCode() : 0);
        result = 31 * result + (facebook != null ? facebook.hashCode() : 0);
        result = 31 * result + (twitter != null ? twitter.hashCode() : 0);
        result = 31 * result + (isprimary ? 1 : 0);
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

    public ENTITY_TblDataCifCustomerdetails getTblDataCifCustomerdetailsByCifid() {
        return tblDataCifCustomerdetailsByCifid;
    }

    public void setTblDataCifCustomerdetailsByCifid(ENTITY_TblDataCifCustomerdetails tblDataCifCustomerdetailsByCifid) {
        this.tblDataCifCustomerdetailsByCifid = tblDataCifCustomerdetailsByCifid;
    }
}
