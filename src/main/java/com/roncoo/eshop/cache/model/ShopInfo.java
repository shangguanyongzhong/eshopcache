package com.roncoo.eshop.cache.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 店铺信息
 *
 * @auther sgyz
 * @create 2018/4/7 0007
 */
@Data
@Accessors(chain = true)
public class ShopInfo {
    private Long id;
    private String name;
    private Integer level;
    private Double goodCommentRate;
}
