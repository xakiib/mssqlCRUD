//package com.postgressql.postgressqlCRUD.repository.entity;
//
//import jakarta.persistence.Basic;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "MSreplication_options", schema = "dbo", catalog = "master")
//public class ENTITY_MSreplicationOptions {
//    @Basic
//    @Column(name = "optname", nullable = false)
//    private Object optname;
//    @Basic
//    @Column(name = "value", nullable = false)
//    private boolean value;
//    @Basic
//    @Column(name = "major_version", nullable = false)
//    private int majorVersion;
//    @Basic
//    @Column(name = "minor_version", nullable = false)
//    private int minorVersion;
//    @Basic
//    @Column(name = "revision", nullable = false)
//    private int revision;
//    @Basic
//    @Column(name = "install_failures", nullable = false)
//    private int installFailures;
//
//    public Object getOptname() {
//        return optname;
//    }
//
//    public void setOptname(Object optname) {
//        this.optname = optname;
//    }
//
//    public boolean isValue() {
//        return value;
//    }
//
//    public void setValue(boolean value) {
//        this.value = value;
//    }
//
//    public int getMajorVersion() {
//        return majorVersion;
//    }
//
//    public void setMajorVersion(int majorVersion) {
//        this.majorVersion = majorVersion;
//    }
//
//    public int getMinorVersion() {
//        return minorVersion;
//    }
//
//    public void setMinorVersion(int minorVersion) {
//        this.minorVersion = minorVersion;
//    }
//
//    public int getRevision() {
//        return revision;
//    }
//
//    public void setRevision(int revision) {
//        this.revision = revision;
//    }
//
//    public int getInstallFailures() {
//        return installFailures;
//    }
//
//    public void setInstallFailures(int installFailures) {
//        this.installFailures = installFailures;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ENTITY_MSreplicationOptions that = (ENTITY_MSreplicationOptions) o;
//
//        if (value != that.value) return false;
//        if (majorVersion != that.majorVersion) return false;
//        if (minorVersion != that.minorVersion) return false;
//        if (revision != that.revision) return false;
//        if (installFailures != that.installFailures) return false;
//        if (optname != null ? !optname.equals(that.optname) : that.optname != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = optname != null ? optname.hashCode() : 0;
//        result = 31 * result + (value ? 1 : 0);
//        result = 31 * result + majorVersion;
//        result = 31 * result + minorVersion;
//        result = 31 * result + revision;
//        result = 31 * result + installFailures;
//        return result;
//    }
//}
