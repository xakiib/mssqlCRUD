package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblWfMasterTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblWfMasterTemplateRepository extends JpaRepository<ENTITY_TblWfMasterTemplate, Integer>, JpaSpecificationExecutor<ENTITY_TblWfMasterTemplate> {
}