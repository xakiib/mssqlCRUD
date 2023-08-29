package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblWfWorkflowTemplates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblWfWorkflowTemplatesRepository extends JpaRepository<ENTITY_TblWfWorkflowTemplates, Integer>, JpaSpecificationExecutor<ENTITY_TblWfWorkflowTemplates> {
}