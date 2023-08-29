package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblWfMasterProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblWfMasterProcessRepository extends JpaRepository<ENTITY_TblWfMasterProcess, Integer>, JpaSpecificationExecutor<ENTITY_TblWfMasterProcess> {
}