package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblWfMasterDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblWfMasterDocumentRepository extends JpaRepository<ENTITY_TblWfMasterDocument, Integer>, JpaSpecificationExecutor<ENTITY_TblWfMasterDocument> {
}