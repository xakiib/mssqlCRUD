package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgVbKeys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgVbKeysRepository extends JpaRepository<ENTITY_TblCnfgVbKeys, String>, JpaSpecificationExecutor<ENTITY_TblCnfgVbKeys> {
}