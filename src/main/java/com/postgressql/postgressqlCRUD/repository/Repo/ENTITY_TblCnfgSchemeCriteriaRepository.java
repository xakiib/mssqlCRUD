package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgSchemeCriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgSchemeCriteriaRepository extends JpaRepository<ENTITY_TblCnfgSchemeCriteria, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgSchemeCriteria> {
}