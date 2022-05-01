package com.estal.Estal.service;


import com.estal.Estal.dao.UserRepository;
import com.estal.Estal.entity.SihEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SihSignUpService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public SihEntity saveTheUser(SihEntity userEntity) {
        Long uuid = UUID.randomUUID().getLeastSignificantBits();
        userEntity.setSihId(uuid);
        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));

        return  userRepository.save(userEntity);
    }
}
