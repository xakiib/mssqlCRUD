package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgCreditPolicyrules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgCreditPolicyrulesRepository extends JpaRepository<ENTITY_TblCnfgCreditPolicyrules, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgCreditPolicyrules> {
}