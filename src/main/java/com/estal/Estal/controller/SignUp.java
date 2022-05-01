package com.estal.Estal.controller;


import com.estal.Estal.entity.sihEntity;
import com.estal.Estal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estal/hindware/signup")
public class SignUp {

    @Autowired
    UserService userService;

    @PostMapping("/saveTheUser")
    public String saveTheUser(@RequestBody sihEntity userEntity) {
        try {
            System.out.println(userEntity + "checking for what is coming");
            userService.saveTheUser(userEntity);
            return "User stored successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    }


}
