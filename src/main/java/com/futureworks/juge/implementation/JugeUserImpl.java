package com.futureworks.juge.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.futureworks.juge.bean.UserDetail;
import com.futureworks.juge.contants.Constant;
import com.futureworks.juge.database.UserDao;
import com.futureworks.juge.exception.JugeException;

@Component
public class JugeUserImpl {
    
    @Autowired
    private UserDao userDao;

    public UserDetail getUserDetail(String id) throws JugeException{
        UserDetail user = userDao.findById(id).get();

        if(user != null && "".equalsIgnoreCase(user.getUserName()))
            return user;
        else throw new JugeException("No data found",Constant.ERROR_CODE.DATABASE_ERROR);
    }

}
