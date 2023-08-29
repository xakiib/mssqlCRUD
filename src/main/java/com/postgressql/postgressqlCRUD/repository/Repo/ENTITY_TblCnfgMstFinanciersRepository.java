package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgMstFinanciers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgMstFinanciersRepository extends JpaRepository<ENTITY_TblCnfgMstFinanciers, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgMstFinanciers> {
}