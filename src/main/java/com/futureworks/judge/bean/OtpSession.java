package com.futureworks.judge.bean;

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
//@Entity// use this for realation base db
@Document("OTP_Validation")
public class OtpSession {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String session;
    private String otp;

    private String logoutTime;
}
