package com.futureworks.judge.database;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.futureworks.judge.bean.UserPojo;

public interface UserRepo extends MongoRepository<UserPojo,String>{

    UserPojo findByUserName(String userName);
    
}
