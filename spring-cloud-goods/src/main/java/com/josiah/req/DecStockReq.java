package com.josiah.req;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

/**
 * @title: DecStockReq
 * @description: 扣库存请求参数
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:34
 */
@Data
public class DecStockReq {
    @NotNull(message = "skuId不能为空")
    private String skuId;
    @Range
    private Integer count;
}
