package com.postgressql.postgressqlCRUD.model;

import com.postgressql.postgressqlCRUD.repository.entity.*;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.Collection;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserMaster {
//    private int recid;
    private Integer financierid;
    private String userid;
    private String password;
    private boolean ldapenabled;
    private String aduserid;
    private String username1;
    private String username2;
    private String username3;
    private String email;
    private String mobile;
    private String idnumber;
    private Integer vbIdtype;
    private Date dateofbirthG;
    private String dateofbirthH;
    private byte[] userpic;
    private Integer vbUserdesignation;
    private int vbBranchcode;
    private boolean initializepassword;
    private Date initializepwdate;
    private Date activedate;
    private Date expirydate;
    private Date logintime;
    private Date logouttime;
    private Date lastlogintime;
    private Date lastlogouttime;
    private Integer concurrentlogin;
    private Integer invalidlogin;
    private String l1Manager;
    private String l2Manager;
    private String l3Manager;
    private String l4Manager;
    private String l5Manager;
    private String portaluserid;
    private Integer vbLanguage;
    private Integer vbOtpchannel;
    private String deviceid;
    private String devicename;
    private Integer vbUserdevicetype;
    private String othdesc1;
    private String othdesc2;
    private String othdesc3;
    private String othdesc4;
    private String maker;
    private Date makedate;
    private String checker;
    private Date checkdate;
    private String updateby;
    private Date updatedate;
    private boolean recstatus;
    private Collection<ENTITY_TblUmCommiteeMembers> tblUmCommiteeMembersByUserid;
//    private Collection<ENTITY_TblUmUserBranch> tblUmUserBranchesByUserid;
//    private ENTITY_TblCnfgMstFinanciers tblCnfgMstFinanciersByFinancierid;
//    private Collection<ENTITY_TblUmUserProduct> tblUmUserProductsByUserid;
//    private Collection<ENTITY_TblUmUserRole> tblUmUserRolesByUserid;

    public String ToJson(){

        return null;
    }
}
