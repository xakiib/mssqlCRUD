package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgMstBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgMstBranchRepository extends JpaRepository<ENTITY_TblCnfgMstBranch, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgMstBranch> {
}