package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgCreditException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgCreditExceptionRepository extends JpaRepository<ENTITY_TblCnfgCreditException, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgCreditException> {
}