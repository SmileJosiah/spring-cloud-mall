package com.josiah.domain.goods;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @title: Goods
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:09
 */
@TableName(value = "brand")
@Data
public class Brand {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    @TableField(value = "name")
    private String name;
    @TableField(value = "image")
    private String image;
    @TableField(value = "initial")
    private Integer initial;
    @TableField(value = "sort")
    private Integer sort;
}
