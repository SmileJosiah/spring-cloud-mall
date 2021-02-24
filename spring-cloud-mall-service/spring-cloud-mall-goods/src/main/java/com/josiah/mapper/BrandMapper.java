package com.josiah.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.josiah.domain.goods.Brand;
import org.apache.ibatis.annotations.Mapper;

/**
 * @title: BrandMapper
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:14
 */
@Mapper
public interface BrandMapper extends BaseMapper<Brand> {
}
