package com.thoughtworks.mstorderservice.api;

import com.thoughtworks.mstorderservice.entity.Goods;
import com.thoughtworks.mstorderservice.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Goods> getAll() {
        return goodsService.getAll();
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Goods getGoodDetailById(@PathVariable("id") String id){
        return goodsService.getGoodDetailById(id);
    }
}
