package com.josiah.vo;


import com.josiah.enums.GlobalSystemEnum;
import com.josiah.enums.RspEnum;
import com.josiah.exception.BussException;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * @title: BaseResp
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:25
 */

public class BaseResp implements Serializable {
    private Integer code;
    private String msg;
    private Object data;
    private RspEnum rspEnum;

    public BaseResp(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResp(RspEnum rspEnum) {
        this.code = rspEnum.getCode();
        this.msg = rspEnum.getMsg();
    }

    public BaseResp(Object data, RspEnum rspEnum) {
        this.data = data;
        this.code = rspEnum.getCode();
        this.msg = rspEnum.getMsg();
    }

    public BaseResp() {
    }

    public BaseResp(RspEnum rspEnum, String msg) {
        this.msg = msg;
        this.code = rspEnum.getCode();
    }


    public static BaseResp success(){
        return new BaseResp(GlobalSystemEnum.SUCCESS);
    }

    public static BaseResp success(Object data){
        return new BaseResp(data,GlobalSystemEnum.SUCCESS);
    }

    public static BaseResp error(){
        return new BaseResp(GlobalSystemEnum.SYSTEM_ERROR);
    }

    public static BaseResp error(String msg){
        return new BaseResp(GlobalSystemEnum.SYSTEM_ERROR,msg);
    }
    public static BaseResp error(Integer code,String msg){
        return new BaseResp(code,msg,null);
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public RspEnum getRspEnum() {
        return rspEnum;
    }

    public void setRspEnum(RspEnum rspEnum) {
        this.rspEnum = rspEnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseResp baseResp = (BaseResp) o;
        return Objects.equals(code, baseResp.code) &&
                Objects.equals(msg, baseResp.msg) &&
                Objects.equals(data, baseResp.data) &&
                Objects.equals(rspEnum, baseResp.rspEnum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg, data, rspEnum);
    }
}
