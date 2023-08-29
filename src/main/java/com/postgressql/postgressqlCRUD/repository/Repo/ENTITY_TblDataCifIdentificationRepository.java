package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblDataCifIdentification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblDataCifIdentificationRepository extends JpaRepository<ENTITY_TblDataCifIdentification, Integer>, JpaSpecificationExecutor<ENTITY_TblDataCifIdentification> {
}