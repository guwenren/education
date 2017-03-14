package com.siyuanren.education.common.web.bean;

import java.io.Serializable;

/**
 * Created by   guwr
 * Project_name education
 * Path         com.siyuanren.education.common.web.bean.Result
 * Date         2017/3/14
 * Time         9:58
 * Description
 */
public class Result implements Serializable {
    private static final long serialVersionUID = 6276349388857903930L;
    private int code = 0;
    private String msg = "";
    private Object data = new Object[]{};

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Object data) {
        this.data = data;
    }

    public Result() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
