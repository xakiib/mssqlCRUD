package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgMstCharges;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgMstChargesRepository extends JpaRepository<ENTITY_TblCnfgMstCharges, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgMstCharges> {
}