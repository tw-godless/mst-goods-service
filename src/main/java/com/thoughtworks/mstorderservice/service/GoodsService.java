package com.thoughtworks.mstorderservice.service;

import com.thoughtworks.mstorderservice.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> getAll();
}
