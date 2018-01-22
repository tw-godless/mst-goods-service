package com.thoughtworks.mstorderservice.goods;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "goods")
public class Goods {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    public Goods(String name) {
        this.name=name;
    }
}
