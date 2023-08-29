package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblUmRoleMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblUmRoleMasterRepository extends JpaRepository<ENTITY_TblUmRoleMaster, Integer>, JpaSpecificationExecutor<ENTITY_TblUmRoleMaster> {
}