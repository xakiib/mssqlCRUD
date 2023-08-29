package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblUmCommiteeMembers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblUmCommiteeMembersRepository extends JpaRepository<ENTITY_TblUmCommiteeMembers, Integer>, JpaSpecificationExecutor<ENTITY_TblUmCommiteeMembers> {
}