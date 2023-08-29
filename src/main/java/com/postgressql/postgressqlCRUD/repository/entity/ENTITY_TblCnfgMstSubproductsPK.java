package com.postgressql.postgressqlCRUD.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class ENTITY_TblCnfgMstSubproductsPK implements Serializable {
    @Column(name = "SUBPRODUCTCODE", nullable = false, length = 10)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String subproductcode;
    @Column(name = "PRODUCTCODE", nullable = false, length = 10)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productcode;

    public String getSubproductcode() {
        return subproductcode;
    }

    public void setSubproductcode(String subproductcode) {
        this.subproductcode = subproductcode;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ENTITY_TblCnfgMstSubproductsPK that = (ENTITY_TblCnfgMstSubproductsPK) o;

        if (subproductcode != null ? !subproductcode.equals(that.subproductcode) : that.subproductcode != null)
            return false;
        if (productcode != null ? !productcode.equals(that.productcode) : that.productcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subproductcode != null ? subproductcode.hashCode() : 0;
        result = 31 * result + (productcode != null ? productcode.hashCode() : 0);
        return result;
    }
}
