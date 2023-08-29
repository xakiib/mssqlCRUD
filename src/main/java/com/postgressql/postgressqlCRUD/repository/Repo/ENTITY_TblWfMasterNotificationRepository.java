package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblWfMasterNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblWfMasterNotificationRepository extends JpaRepository<ENTITY_TblWfMasterNotification, Integer>, JpaSpecificationExecutor<ENTITY_TblWfMasterNotification> {
}