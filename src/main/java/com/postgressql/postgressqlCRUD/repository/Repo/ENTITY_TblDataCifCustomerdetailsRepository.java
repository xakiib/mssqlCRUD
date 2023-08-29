package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblDataCifCustomerdetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblDataCifCustomerdetailsRepository extends JpaRepository<ENTITY_TblDataCifCustomerdetails, Integer>, JpaSpecificationExecutor<ENTITY_TblDataCifCustomerdetails> {
}