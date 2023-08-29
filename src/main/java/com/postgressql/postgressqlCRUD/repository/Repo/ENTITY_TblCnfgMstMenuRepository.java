package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgMstMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblCnfgMstMenuRepository extends JpaRepository<ENTITY_TblCnfgMstMenu, Integer>, JpaSpecificationExecutor<ENTITY_TblCnfgMstMenu> {
}