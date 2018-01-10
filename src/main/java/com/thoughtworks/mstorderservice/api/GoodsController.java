package com.thoughtworks.mstorderservice.api;

import com.thoughtworks.mstorderservice.entity.Goods;
import com.thoughtworks.mstorderservice.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Goods> getAll() {
        return goodsService.getAll();
    }
}
