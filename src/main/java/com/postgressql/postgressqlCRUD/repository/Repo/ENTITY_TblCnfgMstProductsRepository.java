package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgMstProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgMstProductsRepository extends JpaRepository<ENTITY_TblCnfgMstProducts, String>, JpaSpecificationExecutor<ENTITY_TblCnfgMstProducts> {
}