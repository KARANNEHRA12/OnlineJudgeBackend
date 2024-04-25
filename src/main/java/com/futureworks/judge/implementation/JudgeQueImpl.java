package com.futureworks.judge.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import com.futureworks.judge.bean.QueDetail;
import com.futureworks.judge.contants.Constant;
import com.futureworks.judge.database.QueRepo;
import com.futureworks.judge.exception.JudgeException;

@Component
public class JudgeQueImpl {
    
    @Autowired
    private QueRepo que;
    
    public QueDetail getQue(String id) throws JudgeException{
        QueDetail detail = que.findById(id).get();

        if(detail == null){
            throw new JudgeException( "No data found",Constant.ERROR_CODE.DATABASE_ERROR);
        }else{
            return detail;
        }
    }

    public String setQue(QueDetail detail) throws JudgeException {
        if(detail == null){
            throw new JudgeException( "No data found",Constant.ERROR_CODE.DATABASE_ERROR);
        }else{
            return que.save(detail).get_id();
        }
    }

    public Object getAllQue() throws JudgeException{
        List<QueDetail> detail = que.findAll();

        if(detail == null || detail.size() <= 0){
            throw new JudgeException( "No data found",Constant.ERROR_CODE.DATABASE_ERROR);
        }else{
            return detail;
        }
    }

}
