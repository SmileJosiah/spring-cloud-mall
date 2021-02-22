package com.josiah.feign;

import com.josiah.req.DecStockReq;
import com.josiah.vo.BaseResp;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @title: GoodsFallBackFactory
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 16:20
 */
@Component
public class GoodsFallBackFactory implements FallbackFactory<GoodsFeignClient> {

    @Override
    public GoodsFeignClient create(Throwable throwable) {
        return new GoodsFeignClient() {
            @Override
            public BaseResp decStock(DecStockReq req) {
                return null;
            }
        };
    }
}
