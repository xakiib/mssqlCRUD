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
//@Table(name = "spt_fallback_db", schema = "dbo", catalog = "master")
//public class ENTITY_SptFallbackDb {
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
//    @Column(name = "xfallback_dbid", nullable = true)
//    private Short xfallbackDbid;
//    @Basic
//    @Column(name = "name", nullable = false, length = 30)
//    private String name;
//    @Basic
//    @Column(name = "dbid", nullable = false)
//    private short dbid;
//    @Basic
//    @Column(name = "status", nullable = false)
//    private short status;
//    @Basic
//    @Column(name = "version", nullable = false)
//    private short version;
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
//    public Short getXfallbackDbid() {
//        return xfallbackDbid;
//    }
//
//    public void setXfallbackDbid(Short xfallbackDbid) {
//        this.xfallbackDbid = xfallbackDbid;
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
//    public short getDbid() {
//        return dbid;
//    }
//
//    public void setDbid(short dbid) {
//        this.dbid = dbid;
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
//    public short getVersion() {
//        return version;
//    }
//
//    public void setVersion(short version) {
//        this.version = version;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ENTITY_SptFallbackDb that = (ENTITY_SptFallbackDb) o;
//
//        if (dbid != that.dbid) return false;
//        if (status != that.status) return false;
//        if (version != that.version) return false;
//        if (xserverName != null ? !xserverName.equals(that.xserverName) : that.xserverName != null) return false;
//        if (xdttmIns != null ? !xdttmIns.equals(that.xdttmIns) : that.xdttmIns != null) return false;
//        if (xdttmLastInsUpd != null ? !xdttmLastInsUpd.equals(that.xdttmLastInsUpd) : that.xdttmLastInsUpd != null)
//            return false;
//        if (xfallbackDbid != null ? !xfallbackDbid.equals(that.xfallbackDbid) : that.xfallbackDbid != null)
//            return false;
//        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = xserverName != null ? xserverName.hashCode() : 0;
//        result = 31 * result + (xdttmIns != null ? xdttmIns.hashCode() : 0);
//        result = 31 * result + (xdttmLastInsUpd != null ? xdttmLastInsUpd.hashCode() : 0);
//        result = 31 * result + (xfallbackDbid != null ? xfallbackDbid.hashCode() : 0);
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (int) dbid;
//        result = 31 * result + (int) status;
//        result = 31 * result + (int) version;
//        return result;
//    }
//}
