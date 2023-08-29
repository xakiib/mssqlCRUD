package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgMstEmployer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgMstEmployerRepository extends JpaRepository<ENTITY_TblCnfgMstEmployer, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgMstEmployer> {
}