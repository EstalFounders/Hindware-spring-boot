package com.estal.Estal.controller;


import com.estal.Estal.entity.SihEntity;
import com.estal.Estal.service.SihSignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estal/signup")
public class SignUp {

    @Autowired
    SihSignUpService userService;

    @PostMapping("/saveTheUser")
    public String saveTheUser(@RequestBody SihEntity userEntity) {
        try {
            System.out.println(userEntity + "checking for what is coming");
            userService.saveTheUser(userEntity);
            return "User stored successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    }


}
