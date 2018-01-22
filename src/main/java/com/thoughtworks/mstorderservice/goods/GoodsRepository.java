package com.thoughtworks.mstorderservice.goods;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods, Long>{
    Goods findById(Long goodsId);

    List<Goods> findAll();
}
