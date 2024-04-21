package com.futureworks.judge.exception;

public class JudgeException extends Exception{

    private String msg;
    private Integer errorCode;

    public JudgeException(String msg, Integer errorCode){

    }

    public JudgeException(String msg){

    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }


}
