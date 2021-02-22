package com.josiah.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.josiah.domain.goods.Brand;
import com.josiah.mapper.BrandMapper;
import com.josiah.service.BrandService;
import org.springframework.stereotype.Service;

/**
 * @title: BrandServiceImpl
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:14
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
