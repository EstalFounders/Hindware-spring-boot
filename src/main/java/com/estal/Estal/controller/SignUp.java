package com.estal.Estal.controller;


import com.estal.Estal.entity.UserEntity;
import com.estal.Estal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estal/signup")
public class SignUp {

    @Autowired
    UserService userService;

    @PostMapping("/saveTheUser")
    public String saveTheUser(@RequestBody UserEntity userEntity) {
        System.out.println(userEntity + "testing the value");
        userService.saveTheUser(userEntity);
       return "User stored successfully";
    }

}
