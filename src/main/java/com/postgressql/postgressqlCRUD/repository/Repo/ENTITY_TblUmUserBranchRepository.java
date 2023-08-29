package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblUmUserBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblUmUserBranchRepository extends JpaRepository<ENTITY_TblUmUserBranch, Integer>, JpaSpecificationExecutor<ENTITY_TblUmUserBranch> {
}