package com.futureworks.judge.bean;

import org.apache.tomcat.util.codec.binary.Base64;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginBean {
    private String username;
    private String password;

    private void setEncPassword(String password){
        this.password = Base64.encodeBase64String(password.getBytes());
    }
    public String getDecPassword(){
        return Base64.decodeBase64(password).toString();
    }
}
