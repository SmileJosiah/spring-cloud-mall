package com.josiah.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.josiah.domain.Order;
import com.josiah.mapper.OrderMapper;
import com.josiah.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @title: OrderServiceImpl
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-20 17:55
 */
@Service
@Slf4j
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {
}
