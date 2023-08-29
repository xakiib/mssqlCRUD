package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgCreditApprovallevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgCreditApprovallevelRepository extends JpaRepository<ENTITY_TblCnfgCreditApprovallevel, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgCreditApprovallevel> {
}