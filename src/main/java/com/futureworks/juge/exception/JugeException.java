package com.futureworks.juge.exception;

public class JugeException extends Exception{

    private String msg;
    private Integer errorCode;

    public JugeException(String msg, Integer errorCode){

    }

    public JugeException(String msg){

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
