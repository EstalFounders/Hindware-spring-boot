package com.estal.Estal.service;


import com.estal.Estal.dao.UserRepository;
import com.estal.Estal.entity.sihEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public sihEntity saveTheUser(sihEntity userEntity) {
        Long uuid = UUID.randomUUID().getLeastSignificantBits();
        userEntity.setSihId(uuid);
        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));

        return  userRepository.save(userEntity);
    }
}
