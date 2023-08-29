package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgVbValues;
import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgVbValuesPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgVbValuesRepository extends JpaRepository<ENTITY_TblCnfgVbValues, ENTITY_TblCnfgVbValuesPK>, JpaSpecificationExecutor<ENTITY_TblCnfgVbValues> {
}