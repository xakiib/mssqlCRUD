package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgSchemeChargedetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgSchemeChargedetailRepository extends JpaRepository<ENTITY_TblCnfgSchemeChargedetail, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgSchemeChargedetail> {
}