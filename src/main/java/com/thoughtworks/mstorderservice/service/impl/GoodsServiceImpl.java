package com.thoughtworks.mstorderservice.service.impl;

import com.thoughtworks.mstorderservice.Repository.GoodsRepository;
import com.thoughtworks.mstorderservice.entity.Goods;
import com.thoughtworks.mstorderservice.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public List<Goods> getAll() {
        return goodsRepository.findAll();
    }
}
