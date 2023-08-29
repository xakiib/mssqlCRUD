package com.postgressql.postgressqlCRUD.repository.Repo;

import com.postgressql.postgressqlCRUD.ACCOUNTS_AccountsENTITY;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ACCOUNTS_AccountsENTITYRepository extends JpaRepository<ACCOUNTS_AccountsENTITY, Integer>, JpaSpecificationExecutor<ACCOUNTS_AccountsENTITY> {
}