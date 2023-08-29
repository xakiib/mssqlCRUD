package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgMstAppropriation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgMstAppropriationRepository extends JpaRepository<ENTITY_TblCnfgMstAppropriation, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgMstAppropriation> {
}