package com.estal.Estal.service;


import com.estal.Estal.dao.UserRepository;
import com.estal.Estal.entity.SihEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SihSignUpService {

    @Autowired
    UserRepository userRepository;
<<<<<<< HEAD
=======

    @Autowired
    PasswordEncoder passwordEncoder;
>>>>>>> main

    public SihEntity saveTheUser(SihEntity userEntity) {
        Long uuid = UUID.randomUUID().getLeastSignificantBits();
        userEntity.setSihId(uuid);
        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));

<<<<<<< HEAD

=======
>>>>>>> main
        return  userRepository.save(userEntity);
    }
}
