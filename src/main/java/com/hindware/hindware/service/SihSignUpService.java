package com.hindware.hindware.service;


import com.hindware.hindware.dao.SihRepository;
import com.hindware.hindware.entity.SihEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SihSignUpService {

    @Autowired
    SihRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public SihEntity saveTheUser(SihEntity userEntity) {
        Long uuid = UUID.randomUUID().getLeastSignificantBits();
        userEntity.setSihId(uuid);
        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));

        return  userRepository.save(userEntity);
    }
}
