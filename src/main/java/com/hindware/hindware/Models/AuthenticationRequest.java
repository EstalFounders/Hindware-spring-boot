package com.hindware.hindware.Models;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan()
public class AuthenticationRequest {

    private String username;
    private String password;

    public AuthenticationRequest() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AuthenticationRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
