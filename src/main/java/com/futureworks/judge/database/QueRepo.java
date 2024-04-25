package com.futureworks.judge.database;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.futureworks.judge.bean.QueDetail;

@Repository
public interface QueRepo extends MongoRepository<QueDetail,String>{
    
}
