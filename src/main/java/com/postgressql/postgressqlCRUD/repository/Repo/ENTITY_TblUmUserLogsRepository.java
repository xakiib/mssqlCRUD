package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblUmUserLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblUmUserLogsRepository extends JpaRepository<ENTITY_TblUmUserLogs, Integer>, JpaSpecificationExecutor<ENTITY_TblUmUserLogs> {
}