package com.josiah.req;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

/**
 * @title: DecStockReq
 * @description: 扣库存请求参数
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:34
 */

public class DecStockReq {
    @NotNull(message = "skuId不能为空")
    private String skuId;
    @Range
    private Integer count;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
