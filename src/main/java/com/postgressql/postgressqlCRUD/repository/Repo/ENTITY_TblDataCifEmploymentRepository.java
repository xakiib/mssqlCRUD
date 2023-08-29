package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblDataCifEmployment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblDataCifEmploymentRepository extends JpaRepository<ENTITY_TblDataCifEmployment, Integer>, JpaSpecificationExecutor<ENTITY_TblDataCifEmployment> {
}