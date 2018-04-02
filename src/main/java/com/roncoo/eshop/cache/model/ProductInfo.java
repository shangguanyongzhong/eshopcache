package com.roncoo.eshop.cache.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 商品信息
 *
 * @auther sgyz
 * @create 2018/4/2 0002
 */
@Data
@Accessors(chain = true)
public class ProductInfo {

    private Long id;
    private String name;
    private Double price;
}
