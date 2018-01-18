package com.thoughtworks.mstorderservice.goods;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name = "goods")
public class Goods {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;
}
