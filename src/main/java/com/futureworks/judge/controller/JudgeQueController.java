package com.futureworks.judge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.futureworks.judge.bean.QueDetail;
import com.futureworks.judge.contants.Constant;
import com.futureworks.judge.exception.JudgeException;
import com.futureworks.judge.http.JudgeResponser;
import com.futureworks.judge.implementation.JudgeQueImpl;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin
@RestController
@RequestMapping("/Que")
public class JudgeQueController {
    
    @Autowired
    private JudgeQueImpl queImpl;

    @PostMapping("/get")
    public JudgeResponser getQue(@RequestHeader String Id){
        JudgeResponser responser = new JudgeResponser();
        try{
            responser.setStatus(Constant.STATUS.SUCCESS);
            responser.setData(queImpl.getQue(Id));
        }catch(JudgeException exception){
            responser.setStatus(Constant.STATUS.ERROR);
            responser.setErrorCode(exception.getErrorCode());
            responser.setMessage(exception.getMsg());
        }
        return responser;
    }

    @PostMapping("/getAll")
    public JudgeResponser getAllQue(){
        JudgeResponser responser = new JudgeResponser();
        try{
            responser.setStatus(Constant.STATUS.SUCCESS);
            responser.setData(queImpl.getAllQue());
        }catch(JudgeException exception){
            responser.setStatus(Constant.STATUS.ERROR);
            responser.setErrorCode(exception.getErrorCode());
            responser.setMessage(exception.getMsg());
        }
        return responser;
    }

    @PostMapping("/set")
    public JudgeResponser setQue(@RequestBody QueDetail que) {
        JudgeResponser responser = new JudgeResponser();
        try{
            responser.setStatus(Constant.STATUS.SUCCESS);
            responser.setData(queImpl.setQue(que));
        }catch(JudgeException exception){
            responser.setStatus(Constant.STATUS.ERROR);
            responser.setErrorCode(exception.getErrorCode());
            responser.setMessage(exception.getMsg());
        }
        return responser;
    }
    
}
