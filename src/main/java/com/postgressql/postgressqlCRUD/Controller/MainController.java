package com.postgressql.postgressqlCRUD.Controller;


//import com.postgressql.postgressqlCRUD.repository.Repo.ENTITY_MSreplicationOptions_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

//    @Autowired
//    ENTITY_MSreplicationOptions_Repository entityMSreplicationOptionsRepository;

    @GetMapping("/docker")
    public String dockerDemo(){
//        System.out.println(entityMSreplicationOptionsRepository.findAll());
        return "Dockerizing Spring Boot Application";
    }
}
