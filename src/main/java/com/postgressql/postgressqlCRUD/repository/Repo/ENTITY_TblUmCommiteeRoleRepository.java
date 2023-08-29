package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblUmCommiteeRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblUmCommiteeRoleRepository extends JpaRepository<ENTITY_TblUmCommiteeRole, Integer>, JpaSpecificationExecutor<ENTITY_TblUmCommiteeRole> {
}