package com.estal.Estal.service;


import com.estal.Estal.dao.UserRepository;
import com.estal.Estal.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
<<<<<<< HEAD
=======

    @Autowired
    PasswordEncoder passwordEncoder;
>>>>>>> main

    public UserEntity saveTheUser( UserEntity userEntity) {
        Long uuid = UUID.randomUUID().getLeastSignificantBits();
        userEntity.setUser_id(uuid);
        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));

<<<<<<< HEAD

=======
>>>>>>> main
        return  userRepository.save(userEntity);
    }
}
