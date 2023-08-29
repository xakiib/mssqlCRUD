package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblDataCifBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblDataCifBankRepository extends JpaRepository<ENTITY_TblDataCifBank, Integer>, JpaSpecificationExecutor<ENTITY_TblDataCifBank> {
}