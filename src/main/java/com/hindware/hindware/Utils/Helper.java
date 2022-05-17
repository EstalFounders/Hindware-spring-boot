package com.hindware.hindware.Utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.Entity;
import java.util.UUID;

public class Helper {

    @Autowired
    private PasswordEncoder passwordEncoder;

     public static Long generateRandomUuid() {
       Long uuid = UUID.randomUUID().getLeastSignificantBits();
       return uuid;
     }

}
