package com.josiah.enums;

/**
 * @title: RspEnum
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 13:22
 */
public interface RspEnum {
    /**
     * 获取响应值
     * @return
     */
    Integer getCode();

    /**
     * 获取响应信息
     * @return
     */
    String getMsg();
}
