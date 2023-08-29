package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblWfMasterEvents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblWfMasterEventsRepository extends JpaRepository<ENTITY_TblWfMasterEvents, Integer>, JpaSpecificationExecutor<ENTITY_TblWfMasterEvents> {
}