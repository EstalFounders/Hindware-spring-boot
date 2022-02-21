package com.estal.Estal.service;


import com.estal.Estal.dao.UserRepository;
import com.estal.Estal.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public UserEntity saveTheUser( UserEntity userEntity) {
         return  userRepository.save(userEntity);
    }
}
