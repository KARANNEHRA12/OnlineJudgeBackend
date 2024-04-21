package com.futureworks.judge.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.futureworks.judge.bean.UserDetail;


@Repository
public interface UserDao extends JpaRepository<UserDetail,String>{
    UserDetail findByUserName(String userName);
}
