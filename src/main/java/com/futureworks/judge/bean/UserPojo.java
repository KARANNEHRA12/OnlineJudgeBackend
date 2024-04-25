package com.futureworks.judge.bean;

import java.util.Base64;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("UserDetails")
public class UserPojo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    private String userName;
    private String password;
    private String token;
    private String type;
    
    public void setEncPassword(String password){
        this.password = Base64.getEncoder().encodeToString(password.getBytes());
    }
    public String getDecPassword(){
        return Base64.getDecoder().decode(password).toString();
    }
}
