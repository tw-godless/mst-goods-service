package com.thoughtworks.mstorderservice.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/goods")
public class GoodsController {


    @Autowired
    private GoodsService goodsService;

    @GetMapping("/{goods_id}")
    public GoodsDTO getOne(@PathVariable("goods_id") Long goodsId) {
        return goodsService.findOne(goodsId);
    }
}
