package com.josiah.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.josiah.domain.goods.Sku;
import org.apache.ibatis.annotations.Mapper;

/**
 * @title: SkuMapper
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:22
 */
@Mapper
public interface SkuMapper extends BaseMapper<Sku> {
}
