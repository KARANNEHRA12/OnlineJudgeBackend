package com.futureworks.juge.bean;

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
@Entity
public class UserDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    private String userName;
    private String password;
    private String token;
    private String type;

}
