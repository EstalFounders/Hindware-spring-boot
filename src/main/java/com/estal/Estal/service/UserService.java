package com.estal.Estal.service;


import com.estal.Estal.dao.UserRepository;
import com.estal.Estal.entity.UserEntity;
import org.apache.tomcat.util.net.openssl.ciphers.MessageDigest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserEntity saveTheUser( UserEntity userEntity)
    {
        Long uuid = UUID.randomUUID().getLeastSignificantBits();
        userEntity.setUser_id(uuid);
         return  userRepository.save(userEntity);
    }
}
