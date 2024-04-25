package com.futureworks.judge.bean;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueDetail {
    @Id
    private String _id;
    private String que;
    private String name;
    private int level;
    private TestCaseDetail testCase; 
}
