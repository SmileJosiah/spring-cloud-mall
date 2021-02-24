package com.josiah.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.josiah.domain.order.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @title: OrderMapper
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-20 17:55
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
