package com.thoughtworks.mstorderservice.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<GoodsDTO> findAll() {
        List<Goods> all = goodsRepository.findAll();
        return all.stream()
                  .map(goods -> new GoodsDTO(goods.getId(), goods.getName()))
                  .collect(Collectors.toList());
    }

    public Goods update(Long goodsId, GoodsRequest goodsRequest) {

        return goodsRepository.save(new Goods(goodsId, goodsRequest.getName()));
    }

    public Goods add(GoodsRequest goodsRequest) {
        return goodsRepository.save(new Goods(goodsRequest.getName()));
    }

    public void delete(Long goodsId) {
        goodsRepository.delete(goodsId);
    }
}
