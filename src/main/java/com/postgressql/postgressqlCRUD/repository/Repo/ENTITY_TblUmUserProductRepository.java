package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblUmUserProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblUmUserProductRepository extends JpaRepository<ENTITY_TblUmUserProduct, Integer>, JpaSpecificationExecutor<ENTITY_TblUmUserProduct> {
}