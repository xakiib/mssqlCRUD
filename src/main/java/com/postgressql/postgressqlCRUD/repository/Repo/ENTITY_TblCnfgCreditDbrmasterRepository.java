package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgCreditDbrmaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgCreditDbrmasterRepository extends JpaRepository<ENTITY_TblCnfgCreditDbrmaster, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgCreditDbrmaster> {
}