package com.futureworks.judge.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.futureworks.judge.bean.UserDetail;
import com.futureworks.judge.contants.Constant;
import com.futureworks.judge.database.UserDao;
import com.futureworks.judge.exception.JudgeException;

@Component
public class JudgeUserImpl {
    
    @Autowired
    private UserDao userDao;

    public UserDetail getUserDetail(String id) throws JudgeException {
        UserDetail user = userDao.findById(id).get();

        if(user != null && "".equalsIgnoreCase(user.getUserName()))
            return user;
        else throw new JudgeException("No data found",Constant.ERROR_CODE.DATABASE_ERROR);
    }

    public UserDetail loginInit(String password,String userName) throws JudgeException {
        UserDetail user = userDao.findByUserNameAndPassword(userName,password);
        //Todo inti seesion id and otp
        if(user != null && "".equalsIgnoreCase(user.getUserName()))
            return user;
        else throw new JudgeException("No data found",Constant.ERROR_CODE.DATABASE_ERROR);
    }

}
