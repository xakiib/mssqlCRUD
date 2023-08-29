package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgSchemeDueday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgSchemeDuedayRepository extends JpaRepository<ENTITY_TblCnfgSchemeDueday, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgSchemeDueday> {
}