package com.josiah.controller;

import com.josiah.req.DecStockReq;

import com.josiah.rsp.BaseResp;
import com.josiah.service.SkuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: SkuController
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:21
 */
@RestController
@RequestMapping(value = "/sku")
@Slf4j
public class SkuController {

    private final SkuService skuService;

    public SkuController(SkuService skuService) {
        this.skuService = skuService;
    }

    @PutMapping("/decStock")
    public BaseResp decStock(@RequestBody DecStockReq req){
        Integer count = req.getCount();
        String skuId = req.getSkuId();
        skuService.decStock(skuId,count);
        return BaseResp.success();
    }
}
