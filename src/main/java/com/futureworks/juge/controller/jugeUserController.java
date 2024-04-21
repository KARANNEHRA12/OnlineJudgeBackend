package com.futureworks.juge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.futureworks.juge.contants.Constant;
import com.futureworks.juge.exception.JugeException;
import com.futureworks.juge.http.JugeResponser;
import com.futureworks.juge.implementation.JugeUserImpl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin
@RestController
@RequestMapping("/user")
public class jugeUserController {

    @Autowired
    private JugeUserImpl userImpl;

    @PostMapping("/login")
    private JugeResponser login(){
        JugeResponser responser = new JugeResponser();

        return responser;
    }

    @PostMapping("/user")
    public JugeResponser getUserDetailJugeResponser(@RequestBody String id) {
        JugeResponser responser = new JugeResponser();
            try{
                responser.setStatus(Constant.STATUS.SUCCESS);
                responser.setData(userImpl.getUserDetail(id)); 
            }catch(JugeException e){
                System.out.println(e.getMessage());
                responser.setStatus(Constant.STATUS.FAILED);
                responser.setMessage(e.getMessage());
            }
        return responser;
    }
    
}
