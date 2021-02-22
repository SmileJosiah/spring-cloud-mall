package com.josiah.service;

import com.josiah.vo.BaseResp;

/**
 * @title: SkuService
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:22
 */
public interface SkuService {
    /**
     * 扣减库存
     * @param skuId id
     * @param count 数量
     * @return Integer
     */
    Integer decStock(String skuId, Integer count);

}
