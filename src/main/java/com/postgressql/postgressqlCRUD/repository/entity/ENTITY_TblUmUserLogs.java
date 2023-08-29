package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TBL_UM_USER_LOGS", schema = "dbo", catalog = "master")
public class ENTITY_TblUmUserLogs {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RECID", nullable = false, precision = 0)
    private int recid;
    @Basic
    @Column(name = "USERID", nullable = false, length = 20)
    private String userid;
    @Basic
    @Column(name = "EVENT", nullable = false, length = 50)
    private String event;
    @Basic
    @Column(name = "LOGDATETIME", nullable = false)
    private Date logdatetime;
    @Basic
    @Column(name = "IPADDRESS", nullable = true, length = 20)
    private String ipaddress;
    @Basic
    @Column(name = "MACADDRESS", nullable = true, length = 50)
    private String macaddress;
    @Basic
    @Column(name = "SESSIONID", nullable = true, length = 50)
    private String sessionid;
    @Basic
    @Column(name = "DEVICEID", nullable = true, length = 50)
    private String deviceid;
    @Basic
    @Column(name = "DEVICENAME", nullable = true, length = 50)
    private String devicename;
    @Basic
    @Column(name = "USERDEVICETYPE", nullable = true, length = 50)
    private String userdevicetype;

    public int getRecid() {
        return recid;
    }

    public void setRecid(int recid) {
        this.recid = recid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getLogdatetime() {
        return logdatetime;
    }

    public void setLogdatetime(Date logdatetime) {
        this.logdatetime = logdatetime;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
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

    public String getUserdevicetype() {
        return userdevicetype;
    }

    public void setUserdevicetype(String userdevicetype) {
        this.userdevicetype = userdevicetype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ENTITY_TblUmUserLogs that = (ENTITY_TblUmUserLogs) o;

        if (recid != that.recid) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (event != null ? !event.equals(that.event) : that.event != null) return false;
        if (logdatetime != null ? !logdatetime.equals(that.logdatetime) : that.logdatetime != null) return false;
        if (ipaddress != null ? !ipaddress.equals(that.ipaddress) : that.ipaddress != null) return false;
        if (macaddress != null ? !macaddress.equals(that.macaddress) : that.macaddress != null) return false;
        if (sessionid != null ? !sessionid.equals(that.sessionid) : that.sessionid != null) return false;
        if (deviceid != null ? !deviceid.equals(that.deviceid) : that.deviceid != null) return false;
        if (devicename != null ? !devicename.equals(that.devicename) : that.devicename != null) return false;
        if (userdevicetype != null ? !userdevicetype.equals(that.userdevicetype) : that.userdevicetype != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recid;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (event != null ? event.hashCode() : 0);
        result = 31 * result + (logdatetime != null ? logdatetime.hashCode() : 0);
        result = 31 * result + (ipaddress != null ? ipaddress.hashCode() : 0);
        result = 31 * result + (macaddress != null ? macaddress.hashCode() : 0);
        result = 31 * result + (sessionid != null ? sessionid.hashCode() : 0);
        result = 31 * result + (deviceid != null ? deviceid.hashCode() : 0);
        result = 31 * result + (devicename != null ? devicename.hashCode() : 0);
        result = 31 * result + (userdevicetype != null ? userdevicetype.hashCode() : 0);
        return result;
    }
}
