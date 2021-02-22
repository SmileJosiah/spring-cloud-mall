package com.josiah.enums;

import lombok.Getter;

/**
 * @title: OrderStatusEnum
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 15:59
 */
public enum OrderStatusEnum {
    /**
     * 未完成
     */
    UNDO(0),
    /**
     * 已完成
     */
    DODE(1),
    /**
     * 已退货
     */
    BACK(2);
    private final Integer value;

    OrderStatusEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
