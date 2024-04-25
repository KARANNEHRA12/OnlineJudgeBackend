package com.futureworks.judge.bean;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestCaseDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String _id;

    private List<String> testCase;
    private List<String> testResult;
}
