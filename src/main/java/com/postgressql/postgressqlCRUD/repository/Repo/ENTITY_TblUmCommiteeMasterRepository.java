package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblUmCommiteeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblUmCommiteeMasterRepository extends JpaRepository<ENTITY_TblUmCommiteeMaster, Integer>, JpaSpecificationExecutor<ENTITY_TblUmCommiteeMaster> {
}