package com.josiah.feign;


import com.josiah.req.DecStockReq;
import com.josiah.rsp.BaseResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @title: GoodsFeignProxy
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 16:28
 */
@Service
public class GoodsFeignProxy {

    @Autowired
    private GoodsFeignClient client;

    public BaseResp decStock(@RequestBody DecStockReq req){
        return client.decStock(req);
    }
}
