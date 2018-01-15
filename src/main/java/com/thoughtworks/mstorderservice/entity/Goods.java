package com.thoughtworks.mstorderservice.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_goods")
public class Goods {
    @Id
    private String id;

    private String name;
    private String description;
    private Double price;
    private Integer amount;
}
