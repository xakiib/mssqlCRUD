package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblUmUserMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblUmUserMasterRepository extends JpaRepository<ENTITY_TblUmUserMaster, String>, JpaSpecificationExecutor<ENTITY_TblUmUserMaster> {
}