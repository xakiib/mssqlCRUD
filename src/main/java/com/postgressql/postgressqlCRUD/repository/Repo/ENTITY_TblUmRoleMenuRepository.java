package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblUmRoleMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ENTITY_TblUmRoleMenuRepository extends JpaRepository<ENTITY_TblUmRoleMenu, Integer>, JpaSpecificationExecutor<ENTITY_TblUmRoleMenu> {
}