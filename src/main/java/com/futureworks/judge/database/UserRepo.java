package com.futureworks.judge.database;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.futureworks.judge.bean.UserPojo;
import java.util.List;


public interface UserRepo extends MongoRepository<UserPojo,String>{

    UserPojo findByUserName(String userName);

    UserPojo findByUserNameAndPassword(String userName, String password);
    
}
