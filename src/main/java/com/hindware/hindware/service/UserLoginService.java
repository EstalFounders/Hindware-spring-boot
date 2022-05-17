package com.hindware.hindware.service;


import com.hindware.hindware.dao.SihRepository;
import com.hindware.hindware.entity.SihEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserLoginService implements UserDetailsService {

    @Autowired
    private SihRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SihEntity sihEntity = userRepository.findsihByUsername(username);
        if (sihEntity == null) {
            throw new RuntimeException("User not found");
        }
        return new User(sihEntity.getUserName(), sihEntity.password, new ArrayList<>());
    }

    public SihEntity getUserDetails(String username) {
        if (userRepository.findsihByUsername(username) != null) {
            return userRepository.findsihByUsername(username);
        }
        return null;
    }

}
