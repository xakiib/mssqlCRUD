package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgMstModules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgMstModulesRepository extends JpaRepository<ENTITY_TblCnfgMstModules, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgMstModules> {
}