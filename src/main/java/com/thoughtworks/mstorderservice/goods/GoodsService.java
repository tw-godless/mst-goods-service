package com.thoughtworks.mstorderservice.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {

    @Autowired
    private GoodsRepository goodsRepository;

    public GoodsDTO findOne(Long goodsId) {
        Goods goods = goodsRepository.findById(goodsId);
        return GoodsDTO.builder()
                       .goodsId(goods.getId())
                       .name(goods.getName())
                       .build();
    }
}
