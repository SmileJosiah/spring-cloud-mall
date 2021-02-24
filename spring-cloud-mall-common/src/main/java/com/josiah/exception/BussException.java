package com.josiah.exception;

import com.josiah.enums.RspEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * @title: BussException
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 13:16
 */

public class BussException extends RuntimeException{
    private Integer code;
    private String msg;

    public BussException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BussException(RspEnum rspEnum) {
        this.code = rspEnum.getCode();
        this.msg = rspEnum.getMsg();
    }

    public BussException() {

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
