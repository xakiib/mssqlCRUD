package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblWfWorkflowProcesses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblWfWorkflowProcessesRepository extends JpaRepository<ENTITY_TblWfWorkflowProcesses, Integer>, JpaSpecificationExecutor<ENTITY_TblWfWorkflowProcesses> {
}