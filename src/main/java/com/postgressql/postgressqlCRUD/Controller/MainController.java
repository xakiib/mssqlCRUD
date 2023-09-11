package com.postgressql.postgressqlCRUD.Controller;


//import com.postgressql.postgressqlCRUD.repository.Repo.ENTITY_MSreplicationOptions_Repository;
import com.google.gson.Gson;
import com.postgressql.postgressqlCRUD.model.ResponseObject;
import com.postgressql.postgressqlCRUD.model.UserMaster;
import com.postgressql.postgressqlCRUD.repository.Repo.ENTITY_TblCnfgCreditApprovallevelRepository;
import com.postgressql.postgressqlCRUD.repository.Repo.ENTITY_TblUmUserMasterRepository;
import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblCnfgCreditApprovallevel;
import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblUmUserMaster;
import net.minidev.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    ENTITY_TblUmUserMasterRepository repoTblUmUserMaster;

    @Autowired
    private ModelMapper modelMapper;

//    @Autowired
//    ResponseObject responseObject;
    @GetMapping(path="/docker", produces = "application/json")
    public ResponseEntity<ResponseObject> dockerDemo(){
        ResponseObject responseObject = new ResponseObject();
        try {


            List<ENTITY_TblUmUserMaster> listData = (List<ENTITY_TblUmUserMaster>)repoTblUmUserMaster.findAll();
            ENTITY_TblUmUserMaster entityObject = listData.get(0);

            UserMaster userMaster = this.modelMapper.map(entityObject, UserMaster.class);
            System.out.println((new  Gson().toJson(userMaster)));

            responseObject.setData(userMaster);
            responseObject.setStatus("00");
            responseObject.setMessage("Success");
            responseObject.setTid("1234");
            System.out.println("Response: " + responseObject.toString());
            return new ResponseEntity<>(responseObject, HttpStatus.OK);
        }catch (Exception  ex){
            ex.printStackTrace();
            responseObject.setData("");
            responseObject.setStatus("99");
            responseObject.setMessage("oops");
            responseObject.setTid("1234");
            return new ResponseEntity<>(responseObject, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
