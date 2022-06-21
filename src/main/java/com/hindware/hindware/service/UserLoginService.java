package com.hindware.hindware.service;


import com.hindware.hindware.dao.SihRepository;
import com.hindware.hindware.entity.SihEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserLoginService {

    @Autowired
    private SihRepository userRepository;




    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SihEntity sihEntity = userRepository.findingsByUsername(username);
        if (sihEntity == null) {
            throw new RuntimeException("User not found");
        }

            return new User(sihEntity.getUserName(), sihEntity.getPassword(), new ArrayList<>());
    }

    public SihEntity getUserDetails(String username) {
        if (userRepository.findingsByUsername(username) != null) {
            return userRepository.findingsByUsername(username);
        }
        return null;
    }

    public String passwordReset(String id, String password,String designation) {
        System.out.println(id + " "+ password + " "+ "testing in service");
        try {
        switch (designation) {
            case "SIH":
                userRepository.resetPassword(id, password);
                break;
            case "ZonalManger":
                System.out.println("ZonalManger");
                break;
            case "ASM":
                System.out.println("ASM");
                break;
            case "SalePerson":
                System.out.println("SalePerson");
                break;
        } } catch (Exception e) {
            throw new RuntimeException("Somerhing went wrong, please try again or after sometime",e);
        }

       return "Password reset successfully";
    }

}
