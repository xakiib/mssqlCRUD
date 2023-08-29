package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblWfWorkflowDocuments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblWfWorkflowDocumentsRepository extends JpaRepository<ENTITY_TblWfWorkflowDocuments, Integer>, JpaSpecificationExecutor<ENTITY_TblWfWorkflowDocuments> {
}