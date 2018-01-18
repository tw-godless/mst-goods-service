package com.thoughtworks.mstorderservice.goods;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class GoodsDTO {
    @JsonProperty("goods_id")
    private Long goodsId;

    @JsonProperty("name")
    private String name;

}
