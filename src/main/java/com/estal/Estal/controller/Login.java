package com.estal.Estal.controller;

import com.estal.Estal.Jwt.JwtUtil;
import com.estal.Estal.Models.AuthenticationRequest;
import com.estal.Estal.Models.AuthenticationResponse;
import com.estal.Estal.service.UserLoginService;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estal/login")
public class Login {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserLoginService userLoginService;

    @Autowired
    JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public ResponseEntity authenticate(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
         try {
             UserDetails userDetails = userLoginService.loadUserByUsername(authenticationRequest.getUsername());
             final String jwt = jwtUtil.generateToken(userDetails);

             return ResponseEntity.ok(new AuthenticationResponse(jwt));
         } catch (Exception e) {
             throw new Exception("Something went wrong in authentication", e);
         }
    }


    @GetMapping("/testing")
    public String testing() {
        return "Working fine";
    }

}
