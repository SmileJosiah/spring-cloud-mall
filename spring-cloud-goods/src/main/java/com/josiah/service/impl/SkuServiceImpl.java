package com.josiah.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.josiah.config.GoodsErrorEnum;
import com.josiah.domain.goods.Sku;
import com.josiah.exception.BussException;
import com.josiah.mapper.SkuMapper;
import com.josiah.service.SkuService;
import org.springframework.stereotype.Service;

/**
 * @title: SkuServiceImpl
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:22
 */
@Service
public class SkuServiceImpl extends ServiceImpl<SkuMapper, Sku> implements SkuService {

    private final SkuMapper skuMapper;

    public SkuServiceImpl(SkuMapper skuMapper) {
        this.skuMapper = skuMapper;
    }

    @Override
    public Integer decStock(String skuId, Integer count) {
        Sku sku = skuMapper.selectById(skuId);
        if (ObjectUtil.isEmpty(sku)){
            throw new BussException(GoodsErrorEnum.SKU_NOT_FOUNT);
        }
        Integer num = sku.getNum();
        if (count > num){
            throw new BussException(GoodsErrorEnum.STOCK_NOT_ENOUGH);
        }
        sku.setNum(sku.getNum()-count);
        return skuMapper.updateById(sku);
    }
}
