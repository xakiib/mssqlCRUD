//package com.postgressql.postgressqlCRUD.repository.entity;
//
//import jakarta.persistence.Basic;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
//
//import java.sql.Date;
//
//@Entity
//@Table(name = "spt_fallback_dev", schema = "dbo", catalog = "master")
//public class ENTITY_SptFallbackDev {
//    @Basic
//    @Column(name = "xserver_name", nullable = false, length = 30)
//    private String xserverName;
//    @Basic
//    @Column(name = "xdttm_ins", nullable = false)
//    private Date xdttmIns;
//    @Basic
//    @Column(name = "xdttm_last_ins_upd", nullable = false)
//    private Date xdttmLastInsUpd;
//    @Basic
//    @Column(name = "xfallback_low", nullable = true)
//    private Integer xfallbackLow;
//    @Basic
//    @Column(name = "xfallback_drive", nullable = true, length = 2)
//    private String xfallbackDrive;
//    @Basic
//    @Column(name = "low", nullable = false)
//    private int low;
//    @Basic
//    @Column(name = "high", nullable = false)
//    private int high;
//    @Basic
//    @Column(name = "status", nullable = false)
//    private short status;
//    @Basic
//    @Column(name = "name", nullable = false, length = 30)
//    private String name;
//    @Basic
//    @Column(name = "phyname", nullable = false, length = 127)
//    private String phyname;
//
//    public String getXserverName() {
//        return xserverName;
//    }
//
//    public void setXserverName(String xserverName) {
//        this.xserverName = xserverName;
//    }
//
//    public Date getXdttmIns() {
//        return xdttmIns;
//    }
//
//    public void setXdttmIns(Date xdttmIns) {
//        this.xdttmIns = xdttmIns;
//    }
//
//    public Date getXdttmLastInsUpd() {
//        return xdttmLastInsUpd;
//    }
//
//    public void setXdttmLastInsUpd(Date xdttmLastInsUpd) {
//        this.xdttmLastInsUpd = xdttmLastInsUpd;
//    }
//
//    public Integer getXfallbackLow() {
//        return xfallbackLow;
//    }
//
//    public void setXfallbackLow(Integer xfallbackLow) {
//        this.xfallbackLow = xfallbackLow;
//    }
//
//    public String getXfallbackDrive() {
//        return xfallbackDrive;
//    }
//
//    public void setXfallbackDrive(String xfallbackDrive) {
//        this.xfallbackDrive = xfallbackDrive;
//    }
//
//    public int getLow() {
//        return low;
//    }
//
//    public void setLow(int low) {
//        this.low = low;
//    }
//
//    public int getHigh() {
//        return high;
//    }
//
//    public void setHigh(int high) {
//        this.high = high;
//    }
//
//    public short getStatus() {
//        return status;
//    }
//
//    public void setStatus(short status) {
//        this.status = status;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPhyname() {
//        return phyname;
//    }
//
//    public void setPhyname(String phyname) {
//        this.phyname = phyname;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ENTITY_SptFallbackDev that = (ENTITY_SptFallbackDev) o;
//
//        if (low != that.low) return false;
//        if (high != that.high) return false;
//        if (status != that.status) return false;
//        if (xserverName != null ? !xserverName.equals(that.xserverName) : that.xserverName != null) return false;
//        if (xdttmIns != null ? !xdttmIns.equals(that.xdttmIns) : that.xdttmIns != null) return false;
//        if (xdttmLastInsUpd != null ? !xdttmLastInsUpd.equals(that.xdttmLastInsUpd) : that.xdttmLastInsUpd != null)
//            return false;
//        if (xfallbackLow != null ? !xfallbackLow.equals(that.xfallbackLow) : that.xfallbackLow != null) return false;
//        if (xfallbackDrive != null ? !xfallbackDrive.equals(that.xfallbackDrive) : that.xfallbackDrive != null)
//            return false;
//        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//        if (phyname != null ? !phyname.equals(that.phyname) : that.phyname != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = xserverName != null ? xserverName.hashCode() : 0;
//        result = 31 * result + (xdttmIns != null ? xdttmIns.hashCode() : 0);
//        result = 31 * result + (xdttmLastInsUpd != null ? xdttmLastInsUpd.hashCode() : 0);
//        result = 31 * result + (xfallbackLow != null ? xfallbackLow.hashCode() : 0);
//        result = 31 * result + (xfallbackDrive != null ? xfallbackDrive.hashCode() : 0);
//        result = 31 * result + low;
//        result = 31 * result + high;
//        result = 31 * result + (int) status;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (phyname != null ? phyname.hashCode() : 0);
//        return result;
//    }
//}
