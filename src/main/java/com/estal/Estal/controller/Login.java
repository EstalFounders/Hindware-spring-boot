package com.estal.Estal.controller;

import com.estal.Estal.Jwt.JwtRequest;
import com.estal.Estal.Jwt.JwtResponse;
import com.estal.Estal.Jwt.JwtUtility;
import com.estal.Estal.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("estal/login")
public class Login {

    @Autowired
    private UserLoginService userLoginService;

    @Autowired
    private JwtUtility jwtUtility;

    @Autowired
    private AuthenticationManager authenticationManager;


    @PostMapping("/authenticate")
    public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception {

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            jwtRequest.getMobileNo(),
                            jwtRequest.getPassword()
                    )
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Invalid credentials", e);
        }
      final UserDetails userDetails = userLoginService.loadUserByUsername(((jwtRequest.getMobileNo())));
        final String token = jwtUtility.generateToken(userDetails);

        return new JwtResponse(token);
    }


    @GetMapping("/")
    public String login() {
        return "Welcome to JWT tutorial";
    }

    }

