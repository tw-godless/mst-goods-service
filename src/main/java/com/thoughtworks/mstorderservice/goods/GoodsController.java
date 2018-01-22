package com.thoughtworks.mstorderservice.goods;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/goods")
public class GoodsController {


    @Autowired
    private GoodsService goodsService;

    @GetMapping("/{goods_id}")
    public GoodsDTO getOne(@PathVariable("goods_id") Long goodsId) {
        return goodsService.findOne(goodsId);
    }

    @GetMapping
    public List<GoodsDTO> getAll() {
        return goodsService.findAll();
    }

    @PutMapping("/{goods_id}")
    public Goods update(@PathVariable("goods_id") Long goodsId, @RequestBody GoodsRequest goodsRequest) {
        return goodsService.update(goodsId, goodsRequest);
    }

    @PostMapping
    public Goods add(@RequestBody GoodsRequest goodsRequest) {
        return goodsService.add(goodsRequest);
    }

    @DeleteMapping("/{goods_id}")
    public void delete(@PathVariable("goods_id") Long goodsId) {
        log.error("delete goods id: {} ", goodsId);
        goodsService.delete(goodsId);
    }


}
