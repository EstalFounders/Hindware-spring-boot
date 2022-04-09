package com.estal.Estal.service;


<<<<<<< HEAD
import com.estal.Estal.dao.UserSignUpRepository;
import com.estal.Estal.entity.UserEntity;
=======
import com.estal.Estal.dao.UserRepository;
import com.estal.Estal.entity.UserEntity;
import org.apache.tomcat.util.net.openssl.ciphers.MessageDigest;
>>>>>>> dfa57a0884023302a0e9133c0c4206764600ee76
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
<<<<<<< HEAD
    UserSignUpRepository userSignUpRepository;

    public UserEntity saveTheUser( UserEntity userEntity) {
        Long uuid = UUID.randomUUID().getLeastSignificantBits();

        userEntity.setUser_id(uuid);


        return  userSignUpRepository.save(userEntity);
=======
    UserRepository userRepository;

    public UserEntity saveTheUser( UserEntity userEntity)
    {
        Long uuid = UUID.randomUUID().getLeastSignificantBits();
        userEntity.setUser_id(uuid);
         return  userRepository.save(userEntity);
>>>>>>> dfa57a0884023302a0e9133c0c4206764600ee76
    }
}
