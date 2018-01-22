package com.thoughtworks.mstorderservice.goods;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GoodsRequest {
    @JsonProperty
    private String name;
}
