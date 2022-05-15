package com.estal.Estal.controller;

import com.estal.Estal.Jwt.JwtUtil;
import com.estal.Estal.Models.AuthenticationRequest;
import com.estal.Estal.Models.AuthenticationResponse;
import com.estal.Estal.entity.SihEntity;
import com.estal.Estal.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estal/login")
public class Login {


    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserLoginService userLoginService;

    @Autowired
    private JwtUtil jwtUtil;


    @PostMapping("/authenticate")
    public SihEntity authenticate(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
         try {
             UserDetails userDetails = userLoginService.loadUserByUsername(authenticationRequest.getUsername());
             final String jwt = jwtUtil.generateToken(userDetails);
             if (ResponseEntity.ok(new AuthenticationResponse(jwt)) != null) {
                 return this.getSihUserDetails(authenticationRequest);
             } else {
                 throw new Exception("Something went wrong in login, Maybe Wrong credentials") ;
             }
         } catch (Exception e) {
             throw new Exception("Something went wrong in authentication", e);
         }
    }

    @GetMapping("/getSihUserDetails")
    public SihEntity getSihUserDetails(AuthenticationRequest authenticationRequest) {
        try {
            return userLoginService.getUserDetails(authenticationRequest.getUsername());
        } catch (Exception e) {
            return null;
        }
    }



    @GetMapping("/testing")
    public String testing() {
        return "Working fine";
    }

}
