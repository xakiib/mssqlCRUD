package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgSchemeProfitrate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgSchemeProfitrateRepository extends JpaRepository<ENTITY_TblCnfgSchemeProfitrate, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgSchemeProfitrate> {
}