package com.futureworks.judge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.futureworks.judge.bean.LoginBean;
import com.futureworks.judge.bean.UserPojo;
import com.futureworks.judge.contants.Constant;
import com.futureworks.judge.exception.JudgeException;
import com.futureworks.judge.http.JudgeResponser;
import com.futureworks.judge.implementation.JudgeUserImpl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin
@RestController
@RequestMapping("/user")
public class JudgeUserController {

    @Autowired
    private JudgeUserImpl userImpl;

    @PostMapping("/login")
    private JudgeResponser login(@RequestBody LoginBean bean){
        JudgeResponser responser = new JudgeResponser();
        try{
            responser.setStatus(Constant.STATUS.SUCCESS);
            responser.setData(userImpl.loginInit(bean.getUsername(),bean.getPassword())); 
        }catch(JudgeException e){
            System.out.println(e.getMessage());
            responser.setStatus(Constant.STATUS.FAILED);
            responser.setMessage(e.getMessage());
            responser.setErrorCode(Constant.ERROR_CODE.DATABASE_ERROR);
        }
        return responser;
    }

    @PostMapping("/user")
    public JudgeResponser getUserDetailJugeResponser(@RequestBody String id) {
        JudgeResponser responser = new JudgeResponser();
            try{
                responser.setStatus(Constant.STATUS.SUCCESS);
                responser.setData(userImpl.getUserDetail(id)); 
            }catch(JudgeException e){
                System.out.println(e.getMessage());
                responser.setStatus(Constant.STATUS.FAILED);
                responser.setMessage(e.getMessage());
                responser.setErrorCode(Constant.ERROR_CODE.DATABASE_ERROR);
            }
        return responser;
    }
    
    @PostMapping("/AddUser")
    public JudgeResponser setUser(@RequestBody UserPojo user) {
        JudgeResponser responser = new JudgeResponser();
            try{
                responser.setStatus(Constant.STATUS.SUCCESS);
                userImpl.setUser(user);
                responser.setData(true); 
            }catch(JudgeException e){
                System.out.println(e.getMessage());
                responser.setStatus(Constant.STATUS.FAILED);
                responser.setMessage(e.getMessage());
                responser.setErrorCode(Constant.ERROR_CODE.DATABASE_ERROR);
            }
        return responser;
    }
}
