package com.josiah.enums;

import lombok.Getter;

/**
 * @title: PayStatusEnum
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 16:01
 */

public enum PayStatusEnum {
    /**
     * 未支付
     */
    UNPAID(0),
    /**
     * 已支付
     */
    PAID(1),
    /**
     * 支付失败
     */
    PAID_ERROR(2);
    private final Integer value;

    PayStatusEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
