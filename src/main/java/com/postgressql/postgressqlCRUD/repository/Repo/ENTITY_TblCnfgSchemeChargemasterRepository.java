package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgSchemeChargemaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgSchemeChargemasterRepository extends JpaRepository<ENTITY_TblCnfgSchemeChargemaster, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgSchemeChargemaster> {
}