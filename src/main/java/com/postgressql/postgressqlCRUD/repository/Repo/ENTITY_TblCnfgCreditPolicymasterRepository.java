package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgCreditPolicymaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgCreditPolicymasterRepository extends JpaRepository<ENTITY_TblCnfgCreditPolicymaster, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgCreditPolicymaster> {
}