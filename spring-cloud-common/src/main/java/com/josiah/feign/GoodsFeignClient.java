package com.josiah.feign;

import com.josiah.req.DecStockReq;
import com.josiah.vo.BaseResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @title: GoodsFeign
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 16:15
 */
@FeignClient(value = "mall-goods",path = "mall-goods",fallbackFactory = GoodsFallBackFactory.class)
public interface GoodsFeignClient {
    /**
     * 扣减库存
     * @param req
     * @return
     */
    @PutMapping("/sku/decStock")
    BaseResp decStock(@RequestBody DecStockReq req);
}
