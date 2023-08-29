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
//@Table(name = "spt_fallback_usg", schema = "dbo", catalog = "master")
//public class ENTITY_SptFallbackUsg {
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
//    @Column(name = "xfallback_vstart", nullable = true)
//    private Integer xfallbackVstart;
//    @Basic
//    @Column(name = "dbid", nullable = false)
//    private short dbid;
//    @Basic
//    @Column(name = "segmap", nullable = false)
//    private int segmap;
//    @Basic
//    @Column(name = "lstart", nullable = false)
//    private int lstart;
//    @Basic
//    @Column(name = "sizepg", nullable = false)
//    private int sizepg;
//    @Basic
//    @Column(name = "vstart", nullable = false)
//    private int vstart;
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
//    public Integer getXfallbackVstart() {
//        return xfallbackVstart;
//    }
//
//    public void setXfallbackVstart(Integer xfallbackVstart) {
//        this.xfallbackVstart = xfallbackVstart;
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
//    public int getSegmap() {
//        return segmap;
//    }
//
//    public void setSegmap(int segmap) {
//        this.segmap = segmap;
//    }
//
//    public int getLstart() {
//        return lstart;
//    }
//
//    public void setLstart(int lstart) {
//        this.lstart = lstart;
//    }
//
//    public int getSizepg() {
//        return sizepg;
//    }
//
//    public void setSizepg(int sizepg) {
//        this.sizepg = sizepg;
//    }
//
//    public int getVstart() {
//        return vstart;
//    }
//
//    public void setVstart(int vstart) {
//        this.vstart = vstart;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ENTITY_SptFallbackUsg that = (ENTITY_SptFallbackUsg) o;
//
//        if (dbid != that.dbid) return false;
//        if (segmap != that.segmap) return false;
//        if (lstart != that.lstart) return false;
//        if (sizepg != that.sizepg) return false;
//        if (vstart != that.vstart) return false;
//        if (xserverName != null ? !xserverName.equals(that.xserverName) : that.xserverName != null) return false;
//        if (xdttmIns != null ? !xdttmIns.equals(that.xdttmIns) : that.xdttmIns != null) return false;
//        if (xdttmLastInsUpd != null ? !xdttmLastInsUpd.equals(that.xdttmLastInsUpd) : that.xdttmLastInsUpd != null)
//            return false;
//        if (xfallbackVstart != null ? !xfallbackVstart.equals(that.xfallbackVstart) : that.xfallbackVstart != null)
//            return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = xserverName != null ? xserverName.hashCode() : 0;
//        result = 31 * result + (xdttmIns != null ? xdttmIns.hashCode() : 0);
//        result = 31 * result + (xdttmLastInsUpd != null ? xdttmLastInsUpd.hashCode() : 0);
//        result = 31 * result + (xfallbackVstart != null ? xfallbackVstart.hashCode() : 0);
//        result = 31 * result + (int) dbid;
//        result = 31 * result + segmap;
//        result = 31 * result + lstart;
//        result = 31 * result + sizepg;
//        result = 31 * result + vstart;
//        return result;
//    }
//}
