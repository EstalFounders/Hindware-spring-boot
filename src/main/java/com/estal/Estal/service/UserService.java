package com.estal.Estal.service;


import com.estal.Estal.dao.UserSignUpRepository;
import com.estal.Estal.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UserSignUpRepository userSignUpRepository;

    public UserEntity saveTheUser( UserEntity userEntity) {
        Long uuid = UUID.randomUUID().getLeastSignificantBits();

        userEntity.setUser_id(uuid);


        return  userSignUpRepository.save(userEntity);
    }
}
