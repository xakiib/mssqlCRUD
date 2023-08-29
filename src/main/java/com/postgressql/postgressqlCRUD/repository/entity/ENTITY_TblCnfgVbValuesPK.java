package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class ENTITY_TblCnfgVbValuesPK implements Serializable {
    @Column(name = "VALCODE", nullable = false, length = 50)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String valcode;
    @Column(name = "KEYCODE", nullable = false, length = 50)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String keycode;

    public String getValcode() {
        return valcode;
    }

    public void setValcode(String valcode) {
        this.valcode = valcode;
    }

    public String getKeycode() {
        return keycode;
    }

    public void setKeycode(String keycode) {
        this.keycode = keycode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ENTITY_TblCnfgVbValuesPK that = (ENTITY_TblCnfgVbValuesPK) o;

        if (valcode != null ? !valcode.equals(that.valcode) : that.valcode != null) return false;
        if (keycode != null ? !keycode.equals(that.keycode) : that.keycode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = valcode != null ? valcode.hashCode() : 0;
        result = 31 * result + (keycode != null ? keycode.hashCode() : 0);
        return result;
    }
}
