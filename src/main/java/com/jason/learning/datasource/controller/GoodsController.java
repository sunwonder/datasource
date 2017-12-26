package com.jason.learning.datasource.controller;

import com.jason.learning.datasource.entity.Goods;
import com.jason.learning.datasource.service.IGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("GoodsController")
@RestController
@RequestMapping("/goods/*")
public class GoodsController {
    @Autowired
    private IGoodsService goodsService;

    @RequestMapping("get")
    @ApiOperation(value = "get", httpMethod = "POST")
    public Goods getGoods(Goods goods) {
        return this.goodsService.get(goods);
    }

    @RequestMapping("save")
    @ApiOperation(value = "save", httpMethod = "POST")
    public Goods saveGoods(Goods goods) {
        this.goodsService.save(goods);
        return goods;
    }

    @RequestMapping("delete")
    @ApiOperation(value = "delete", httpMethod = "POST")
    public int deleteGoods(Goods goods) {
        return this.goodsService.delete(goods);
    }

    @RequestMapping("update")
    @ApiOperation(value = "update", httpMethod = "POST")
    public int updateGoods(Goods goods) {
        return this.goodsService.update(goods);
    }

    @RequestMapping("list")
    @ApiOperation(value = "list", httpMethod = "POST")
    public List<Goods> listGoods(Goods goods) {
        return this.goodsService.list(goods);
    }
}