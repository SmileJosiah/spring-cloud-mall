package com.josiah.config;

import com.josiah.enums.RspEnum;
import lombok.Getter;

/**
 * @title: GoodsErrorEnum
 * @description: 10001-20000 表示Goods微服务的错误信息
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 13:19
 */

public enum GoodsErrorEnum implements RspEnum {
    /**
     * 库存不足
     */
    STOCK_NOT_ENOUGH(10001,"商品库存不足"),
    SKU_NOT_FOUNT(10002,"商品信息不存在");
    private final Integer value;
    private final String message;

    GoodsErrorEnum(Integer value, String message) {
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
