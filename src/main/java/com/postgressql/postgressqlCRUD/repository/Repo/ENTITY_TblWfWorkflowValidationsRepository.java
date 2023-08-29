package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblWfWorkflowValidations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblWfWorkflowValidationsRepository extends JpaRepository<ENTITY_TblWfWorkflowValidations, Integer>, JpaSpecificationExecutor<ENTITY_TblWfWorkflowValidations> {
}