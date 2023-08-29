package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgSchemeResidual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgSchemeResidualRepository extends JpaRepository<ENTITY_TblCnfgSchemeResidual, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgSchemeResidual> {
}