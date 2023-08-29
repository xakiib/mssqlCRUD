package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblWfWorkflowDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblWfWorkflowDetailsRepository extends JpaRepository<ENTITY_TblWfWorkflowDetails, Integer>, JpaSpecificationExecutor<ENTITY_TblWfWorkflowDetails> {
}