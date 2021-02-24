package com.josiah.domain.goods;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * @title: Sku
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-22 11:16
 */
@TableName(value = "sku")
public class Sku implements Serializable {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getSpuId() {
        return spuId;
    }

    public void setSpuId(String spuId) {
        this.spuId = spuId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSkuAttribute() {
        return skuAttribute;
    }

    public void setSkuAttribute(String skuAttribute) {
        this.skuAttribute = skuAttribute;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Sku{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", image='" + image + '\'' +
                ", images='" + images + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", spuId='" + spuId + '\'' +
                ", categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", skuAttribute='" + skuAttribute + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sku sku = (Sku) o;
        return Objects.equals(id, sku.id) &&
                Objects.equals(name, sku.name) &&
                Objects.equals(price, sku.price) &&
                Objects.equals(num, sku.num) &&
                Objects.equals(image, sku.image) &&
                Objects.equals(images, sku.images) &&
                Objects.equals(createTime, sku.createTime) &&
                Objects.equals(updateTime, sku.updateTime) &&
                Objects.equals(spuId, sku.spuId) &&
                Objects.equals(categoryId, sku.categoryId) &&
                Objects.equals(categoryName, sku.categoryName) &&
                Objects.equals(brandId, sku.brandId) &&
                Objects.equals(brandName, sku.brandName) &&
                Objects.equals(skuAttribute, sku.skuAttribute) &&
                Objects.equals(status, sku.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, num, image, images, createTime, updateTime, spuId, categoryId, categoryName, brandId, brandName, skuAttribute, status);
    }
}
