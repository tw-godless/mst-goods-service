package com.thoughtworks.mstorderservice.Repository;

import com.thoughtworks.mstorderservice.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods, String> {
}
