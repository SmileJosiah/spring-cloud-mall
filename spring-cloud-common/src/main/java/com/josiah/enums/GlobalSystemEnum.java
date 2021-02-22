package com.josiah.enums;


import lombok.Getter;

/**
 * @title: BussErrorEnum
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:27
 */

public enum GlobalSystemEnum implements RspEnum{
    //成功
    SUCCESS(200,"操作成功"),
    //系统内部错误
    SYSTEM_ERROR(9999,"系统内部错误");

    private final Integer value;
    private final String message;

    GlobalSystemEnum(Integer value, String message) {
        this.value = value;
        this.message = message;
    }


    @Override
    public Integer getCode() {
        return getValue();
    }

    @Override
    public String getMsg() {
        return getMessage();
    }

    public Integer getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }
}
