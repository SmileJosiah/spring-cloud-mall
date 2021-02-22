package com.josiah.vo;


import com.josiah.enums.GlobalSystemEnum;
import com.josiah.enums.RspEnum;
import com.josiah.exception.BussException;
import lombok.Data;

/**
 * @title: BaseResp
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:25
 */
@Data
public class BaseResp {
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

}
