package com.futureworks.judge.bean;

import java.util.Base64;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity 
public class UserDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String _id;
    private String userId;
    private String userName;
    private String password;
    private String token;
    private String type;
    private List<String> queAttempted;
    private List<String> queCompleted;
    
    public void setEncPassword(String password){
        this.password = Base64.getEncoder().encodeToString(password.getBytes());
    }
    public String getDecPassword(){
        return Base64.getDecoder().decode(password).toString();
    }
}
