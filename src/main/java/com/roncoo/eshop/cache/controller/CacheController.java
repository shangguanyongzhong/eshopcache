package com.roncoo.eshop.cache.controller;

import com.roncoo.eshop.cache.model.ProductInfo;
import com.roncoo.eshop.cache.model.ShopInfo;
import com.roncoo.eshop.cache.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 缓存Controller
 *
 * @auther sgyz
 * @create 2018/4/2 0002
 */
@Controller
public class CacheController {

    @Autowired
    private CacheService cacheService;

    @RequestMapping("/testPutCache")
    @ResponseBody
    public String testPutCache(ProductInfo productInfo){
        cacheService.saveLocalCache(productInfo);
        return "SUCCESS";
    }

    @RequestMapping("/testGetCache")
    @ResponseBody
    public ProductInfo testGetCache(long id){
        return cacheService.getLocalCache(id);
    }

    @RequestMapping("/getProductInfo")
    @ResponseBody
    public ProductInfo testGetProductInfo(long productId){
        ProductInfo productInfo = null;
        //先从redis中获取数据
        productInfo = cacheService.getProductInfoFromReidsCache(productId);
        System.out.println("===============================从redis中获取缓存"+productInfo);
        if(productInfo == null){
            //需要从local中获取
            productInfo = cacheService.getProductInfoFromLocalCache(productId);
            System.out.println("============================从local中获取缓存"+productInfo);
        }
        //如果没有就直接从数据库取数据
        return productInfo;
    }

    @RequestMapping("/getShopInfo")
    @ResponseBody
    public ShopInfo testGetShopInfo(long shopId){
        ShopInfo shopInfo = null;
        //先从redis中获取数据
        shopInfo = cacheService.getShopInfoFromReidsCache(shopId);
        System.out.println("===============================从redis中获取缓存"+shopInfo);
        if(shopInfo == null){
            //需要从local中获取
            shopInfo = cacheService.getShopInfoFromLocalCache(shopId);
            System.out.println("============================从local中获取缓存"+shopInfo);
        }
        //如果没有就直接从数据库取数据
        return shopInfo;
    }

}
