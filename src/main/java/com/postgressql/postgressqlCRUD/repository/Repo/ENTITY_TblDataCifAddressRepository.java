package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblDataCifAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblDataCifAddressRepository extends JpaRepository<ENTITY_TblDataCifAddress, Integer>, JpaSpecificationExecutor<ENTITY_TblDataCifAddress> {
}