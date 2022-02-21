package com.estal.Estal.rest;


import com.estal.Estal.entity.UserEntity;
import com.estal.Estal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signup")
public class SignUp {

    @Autowired
    UserService userService;

    @PostMapping("/saveTheUser")
    public String saveTheUser(@RequestBody UserEntity userEntity) {
        userService.saveTheUser(userEntity);
       return "User stored successfully";
    }
}
