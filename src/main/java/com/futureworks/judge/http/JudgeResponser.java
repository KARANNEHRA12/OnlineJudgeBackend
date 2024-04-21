package com.futureworks.judge.http;

import java.util.HashMap;
import java.util.Map;

public class JudgeResponser implements java.io.Serializable  {
    
    private int status;
    private int errorCode;
    private Object Data;
    private String msg;

    public JudgeResponser(
        int status,
        int errorCode,
        Object Data,
        String msg
    ) {
        this.status = status;
        this.errorCode = errorCode;
        this.Data = Data;
        this.msg = msg;
    }
    
    public JudgeResponser(JudgeResponser res) {
        this.status = res.getStatus();
        this.errorCode = res.getErrorCode();
        this.Data = res.getData();
        this.msg = res.getMessage();
    }

    public JudgeResponser() {
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Object getData() {
        return this.Data;
    }

    public void setData(Object Data) {
        this.Data = Data;
    }

    public String getMessage() {
        return this.msg;
    }

    public void setMessage(String msg) {
        this.msg = msg;
    }
    

    public String sendResponse(){
        Map<String,Object> map = new HashMap();
        map.put("status", this.getStatus());
        map.put("error_code", this.getErrorCode());
        map.put("message", this.getMessage());
        map.put("data", this.getData());
        
        return map.toString();
    }

}
