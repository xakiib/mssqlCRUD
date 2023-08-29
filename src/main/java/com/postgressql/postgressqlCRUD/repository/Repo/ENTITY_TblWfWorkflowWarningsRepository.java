package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblWfWorkflowWarnings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblWfWorkflowWarningsRepository extends JpaRepository<ENTITY_TblWfWorkflowWarnings, Integer>, JpaSpecificationExecutor<ENTITY_TblWfWorkflowWarnings> {
}