package com.futureworks.judge.bean;

import java.util.Base64;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginBean {
    private String username;
    private String password;

    public void setEncPassword(String password){
        this.password = Base64.getEncoder().encodeToString(password.getBytes());
    }
    public String getDecPassword(){
        return Base64.getDecoder().decode(password).toString();
    }
}
