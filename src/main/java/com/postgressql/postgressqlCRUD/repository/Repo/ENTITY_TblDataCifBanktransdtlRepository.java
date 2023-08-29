package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblDataCifBanktransdtl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblDataCifBanktransdtlRepository extends JpaRepository<ENTITY_TblDataCifBanktransdtl, Integer>, JpaSpecificationExecutor<ENTITY_TblDataCifBanktransdtl> {
}