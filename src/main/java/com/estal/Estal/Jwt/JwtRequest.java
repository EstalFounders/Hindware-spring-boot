package com.estal.Estal.Jwt;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtLoginRequest {

    private int mobileNo;
    private String password;



}
