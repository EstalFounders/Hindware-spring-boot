package com.hindware.hindware.controller;

import com.hindware.hindware.Jwt.JwtUtil;
import com.hindware.hindware.Models.AuthenticationRequest;
import com.hindware.hindware.Models.AuthenticationResponse;
import com.hindware.hindware.entity.SihEntity;
import com.hindware.hindware.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import javax.ws.rs.core.MultivaluedHashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/hindware/login")
public class Login {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserLoginService userLoginService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private String designation;

    private String password;

    private String id;


    @PostMapping("/authenticate")
    public ResponseEntity authenticate(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        UserDetails userDetails = userLoginService.loadUserByUsername(authenticationRequest.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);
        if (ResponseEntity.ok(new AuthenticationResponse(jwt)) != null && passwordEncoder.matches(authenticationRequest.getPassword(), userDetails.getPassword())) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.getSihUserDetails(authenticationRequest));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Something went wrong, Please check your credentials");
    }


    @GetMapping("/getSihUserDetails")
    public SihEntity getSihUserDetails(AuthenticationRequest authenticationRequest) {
        return userLoginService.getUserDetails(authenticationRequest.getUsername());
    }

    @PostMapping("/resetPassword")
    public String resetPassword(@RequestHeader Map<String, String> allHeader) {
        allHeader.forEach((key, value) -> {
            if (key.contains("id")) {
                id = value;
            }
            if (key.contains("designation")) {
                designation = value;
            }
            if (key.contains("password")) {
                password = passwordEncoder.encode(value);
            }
//            System.out.println(String.format("Header '%s' = %s", key, value));
        });

        userLoginService.passwordReset(id, password, designation);

        return "Password updated successfully";
    }

    @GetMapping("/testing")
    public String testing() {
        return "Working fine";
    }

}
