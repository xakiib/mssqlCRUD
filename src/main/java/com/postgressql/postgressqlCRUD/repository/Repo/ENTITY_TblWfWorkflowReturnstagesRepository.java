package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblWfWorkflowReturnstages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblWfWorkflowReturnstagesRepository extends JpaRepository<ENTITY_TblWfWorkflowReturnstages, Integer>, JpaSpecificationExecutor<ENTITY_TblWfWorkflowReturnstages> {
}