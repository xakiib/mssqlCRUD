package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblDataCifIncome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblDataCifIncomeRepository extends JpaRepository<ENTITY_TblDataCifIncome, Integer>, JpaSpecificationExecutor<ENTITY_TblDataCifIncome> {
}