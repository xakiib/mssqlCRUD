package com.postgressql.postgressqlCRUD;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@ToString
@Table(name = "accounts", schema = "public", catalog = "test_db")
public class ACCOUNTS_AccountsENTITY {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id", nullable = false)
    private int userId;
    @Basic
    @Column(name = "username", nullable = false, length = 50)
    private String username;
    @Basic
    @Column(name = "password", nullable = false, length = 50)
    private String password;
    @Basic
    @Column(name = "email", nullable = false, length = 255)
    private String email;
    @Basic
    @Column(name = "created_on", nullable = false)
    private Timestamp createdOn;
    @Basic
    @Column(name = "last_login", nullable = true)
    private Timestamp lastLogin;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ACCOUNTS_AccountsENTITY that = (ACCOUNTS_AccountsENTITY) o;
//
//        if (userId != that.userId) return false;
//        if (username != null ? !username.equals(that.username) : that.username != null) return false;
//        if (password != null ? !password.equals(that.password) : that.password != null) return false;
//        if (email != null ? !email.equals(that.email) : that.email != null) return false;
//        if (createdOn != null ? !createdOn.equals(that.createdOn) : that.createdOn != null) return false;
//        if (lastLogin != null ? !lastLogin.equals(that.lastLogin) : that.lastLogin != null) return false;
//
//        return true;
//    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (lastLogin != null ? lastLogin.hashCode() : 0);
        return result;
    }
}
