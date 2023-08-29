package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblWfWorkflowNotifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblWfWorkflowNotificationsRepository extends JpaRepository<ENTITY_TblWfWorkflowNotifications, Integer>, JpaSpecificationExecutor<ENTITY_TblWfWorkflowNotifications> {
}