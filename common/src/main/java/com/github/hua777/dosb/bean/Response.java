package com.github.hua777.dosb.bean;

public class Response<T> {

    static String SUCCESS = "SUCCESS";

    static String FAILED = "FAILED";

    public Response() {
        code = SUCCESS;
    }

    public Response(String code) {
        this.code = code;
    }

    public Response(T data) {
        code = SUCCESS;
        this.data = data;
    }

    public Response(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Response(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    String code;
    String msg;
    T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
