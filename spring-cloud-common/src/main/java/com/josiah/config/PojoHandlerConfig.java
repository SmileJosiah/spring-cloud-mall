package com.josiah.config;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.josiah.domain.order.Order;
import com.josiah.enums.OrderStatusEnum;
import com.josiah.enums.PayStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @title: PojoHandlerConfig
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 14:48
 */
@Component
@Slf4j
public class PojoHandlerConfig implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        if (metaObject.getOriginalObject() instanceof Order){
            setFieldValByName("createTime", LocalDateTime.now().toString(),metaObject);
            setFieldValByName("transactionId", IdUtil.fastSimpleUUID(),metaObject);
            setFieldValByName("orderStatus", OrderStatusEnum.UNDO.getValue(),metaObject);
            setFieldValByName("payStatus", PayStatusEnum.UNPAID.getValue(),metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        setFieldValByName("updateTime", LocalDateTime.now().toString(),metaObject);
    }
}
