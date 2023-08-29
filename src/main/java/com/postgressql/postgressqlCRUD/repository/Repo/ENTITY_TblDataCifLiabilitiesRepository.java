package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblDataCifLiabilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblDataCifLiabilitiesRepository extends JpaRepository<ENTITY_TblDataCifLiabilities, Integer>, JpaSpecificationExecutor<ENTITY_TblDataCifLiabilities> {
}