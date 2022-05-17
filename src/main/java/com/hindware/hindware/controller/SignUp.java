package com.hindware.hindware.controller;


import com.hindware.hindware.entity.SihEntity;
import com.hindware.hindware.service.SihSignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hindware/signup")
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
