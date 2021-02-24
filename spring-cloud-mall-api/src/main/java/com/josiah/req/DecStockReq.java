package com.josiah.req;
import lombok.Data;


/**
 * @title: DecStockReq
 * @description: 扣库存请求参数
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:34
 */
@Data
public class DecStockReq {
    private String skuId;
    private Integer count;
}
