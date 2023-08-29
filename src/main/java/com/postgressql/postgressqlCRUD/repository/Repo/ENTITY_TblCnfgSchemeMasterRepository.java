package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgSchemeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgSchemeMasterRepository extends JpaRepository<ENTITY_TblCnfgSchemeMaster, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgSchemeMaster> {
}