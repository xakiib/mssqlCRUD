package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgSchemeDownpayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgSchemeDownpaymentRepository extends JpaRepository<ENTITY_TblCnfgSchemeDownpayment, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgSchemeDownpayment> {
}