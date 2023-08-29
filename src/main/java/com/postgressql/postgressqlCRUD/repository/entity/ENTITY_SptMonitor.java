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
//@Table(name = "spt_monitor", schema = "dbo", catalog = "master")
//public class ENTITY_SptMonitor {
//    @Basic
//    @Column(name = "lastrun", nullable = false)
//    private Date lastrun;
//    @Basic
//    @Column(name = "cpu_busy", nullable = false)
//    private int cpuBusy;
//    @Basic
//    @Column(name = "io_busy", nullable = false)
//    private int ioBusy;
//    @Basic
//    @Column(name = "idle", nullable = false)
//    private int idle;
//    @Basic
//    @Column(name = "pack_received", nullable = false)
//    private int packReceived;
//    @Basic
//    @Column(name = "pack_sent", nullable = false)
//    private int packSent;
//    @Basic
//    @Column(name = "connections", nullable = false)
//    private int connections;
//    @Basic
//    @Column(name = "pack_errors", nullable = false)
//    private int packErrors;
//    @Basic
//    @Column(name = "total_read", nullable = false)
//    private int totalRead;
//    @Basic
//    @Column(name = "total_write", nullable = false)
//    private int totalWrite;
//    @Basic
//    @Column(name = "total_errors", nullable = false)
//    private int totalErrors;
//
//    public Date getLastrun() {
//        return lastrun;
//    }
//
//    public void setLastrun(Date lastrun) {
//        this.lastrun = lastrun;
//    }
//
//    public int getCpuBusy() {
//        return cpuBusy;
//    }
//
//    public void setCpuBusy(int cpuBusy) {
//        this.cpuBusy = cpuBusy;
//    }
//
//    public int getIoBusy() {
//        return ioBusy;
//    }
//
//    public void setIoBusy(int ioBusy) {
//        this.ioBusy = ioBusy;
//    }
//
//    public int getIdle() {
//        return idle;
//    }
//
//    public void setIdle(int idle) {
//        this.idle = idle;
//    }
//
//    public int getPackReceived() {
//        return packReceived;
//    }
//
//    public void setPackReceived(int packReceived) {
//        this.packReceived = packReceived;
//    }
//
//    public int getPackSent() {
//        return packSent;
//    }
//
//    public void setPackSent(int packSent) {
//        this.packSent = packSent;
//    }
//
//    public int getConnections() {
//        return connections;
//    }
//
//    public void setConnections(int connections) {
//        this.connections = connections;
//    }
//
//    public int getPackErrors() {
//        return packErrors;
//    }
//
//    public void setPackErrors(int packErrors) {
//        this.packErrors = packErrors;
//    }
//
//    public int getTotalRead() {
//        return totalRead;
//    }
//
//    public void setTotalRead(int totalRead) {
//        this.totalRead = totalRead;
//    }
//
//    public int getTotalWrite() {
//        return totalWrite;
//    }
//
//    public void setTotalWrite(int totalWrite) {
//        this.totalWrite = totalWrite;
//    }
//
//    public int getTotalErrors() {
//        return totalErrors;
//    }
//
//    public void setTotalErrors(int totalErrors) {
//        this.totalErrors = totalErrors;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ENTITY_SptMonitor that = (ENTITY_SptMonitor) o;
//
//        if (cpuBusy != that.cpuBusy) return false;
//        if (ioBusy != that.ioBusy) return false;
//        if (idle != that.idle) return false;
//        if (packReceived != that.packReceived) return false;
//        if (packSent != that.packSent) return false;
//        if (connections != that.connections) return false;
//        if (packErrors != that.packErrors) return false;
//        if (totalRead != that.totalRead) return false;
//        if (totalWrite != that.totalWrite) return false;
//        if (totalErrors != that.totalErrors) return false;
//        if (lastrun != null ? !lastrun.equals(that.lastrun) : that.lastrun != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = lastrun != null ? lastrun.hashCode() : 0;
//        result = 31 * result + cpuBusy;
//        result = 31 * result + ioBusy;
//        result = 31 * result + idle;
//        result = 31 * result + packReceived;
//        result = 31 * result + packSent;
//        result = 31 * result + connections;
//        result = 31 * result + packErrors;
//        result = 31 * result + totalRead;
//        result = 31 * result + totalWrite;
//        result = 31 * result + totalErrors;
//        return result;
//    }
//}
