package com.josiah.domain.order;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;

/**
 * @title: Order
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-20 17:54
 */
@TableName(value = "`order`")
@Data
public class Order implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    @TableField(value = "total_num")
    private Integer totalNum;
    @TableField(value = "moneys")
    private Integer moneys;
    @TableField(value = "pay_type")
    private String payType;
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private String createTime;
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    private String updateTime;
    @TableField(value = "pay_time")
    private String payTime;
    @TableField(value = "consign_time")
    private String consignTime;
    @TableField(value = "end_time")
    private String endTime;
    @TableField(value = "username")
    private String userName;
    @TableField(value = "recipients")
    private String recipients;
    @TableField(value = "recipients_mobile")
    private String recipientsMobile;
    @TableField(value = "recipients_address")
    private String recipientsAddress;
    @TableField(value = "weixin_transaction_id",fill = FieldFill.INSERT)
    private String transactionId;
    @TableField(value = "order_status",fill = FieldFill.INSERT)
    private Integer orderStatus;
    @TableField(value = "pay_status",fill = FieldFill.INSERT)
    private Integer payStatus;
    @TableLogic(value = "is_delete",delval = "1")
    private Integer deleted;
}
