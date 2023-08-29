package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblWfWorkflowChecklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblWfWorkflowChecklistRepository extends JpaRepository<ENTITY_TblWfWorkflowChecklist, Integer>, JpaSpecificationExecutor<ENTITY_TblWfWorkflowChecklist> {
}