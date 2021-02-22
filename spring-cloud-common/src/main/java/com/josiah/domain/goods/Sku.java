package com.josiah.domain.goods;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @title: Sku
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:16
 */
@TableName(value = "sku")
@Data
public class Sku {
    @TableId(value = "id",type = IdType.UUID)
    private String id;
    @TableField(value = "name")
    private String name;
    @TableField(value = "price")
    private Integer price;
    @TableField(value = "num")
    private Integer num;
    @TableField("image")
    private String image;
    @TableField(value = "images")
    private String images;
    @TableField("create_time")
    private String createTime;
    @TableField(value = "update_time")
    private String updateTime;
    @TableField(value = "spu_id")
    private String spuId;
    @TableField(value = "category_id")
    private Integer categoryId;
    @TableField(value = "category_name")
    private String categoryName;
    @TableField(value = "brand_id")
    private Integer brandId;
    @TableField(value = "brand_name")
    private String brandName;
    @TableField(value = "sku_attribute")
    private String skuAttribute;
    @TableField(value = "status")
    private Integer status;
}
