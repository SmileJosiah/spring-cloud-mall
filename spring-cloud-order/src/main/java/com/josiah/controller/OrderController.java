package com.josiah.controller;

import com.josiah.feign.GoodsFeignProxy;
import com.josiah.req.AddOrderReq;
import com.josiah.req.DecStockReq;
import com.josiah.service.IOrderService;
import com.josiah.vo.BaseResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: OrderController
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-20 17:52
 */
@RestController
@RequestMapping(value = "/order")
@Slf4j
public class OrderController {

    private final IOrderService orderService;
    private final GoodsFeignProxy goodsFeignProxy;

    public OrderController(IOrderService orderService, GoodsFeignProxy goodsFeignProxy) {
        this.orderService = orderService;
        this.goodsFeignProxy = goodsFeignProxy;
    }

    @PostMapping(value = "/add")
    public BaseResp addOrder(){
        log.info("订单操作完成");
        log.info("-----------------开始扣减库存-----------------");
        DecStockReq decStockReq = new DecStockReq();
        decStockReq.setCount(10);
        decStockReq.setSkuId("1318594982227025922");
        goodsFeignProxy.decStock(decStockReq);
        return BaseResp.success();
    }
}
