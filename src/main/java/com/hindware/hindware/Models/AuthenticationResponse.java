package com.hindware.hindware.Models;


import org.springframework.stereotype.Component;

@Component
public class AuthenticationResponse {
    private String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public AuthenticationResponse() {

    }

    public String getJwt() {
        return jwt;
    }
}
