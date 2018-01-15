package com.thoughtworks.mstorderservice.api;

import com.thoughtworks.mstorderservice.Repository.GoodsRepository;
import com.thoughtworks.mstorderservice.entity.Goods;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@SpringBootTest
@ActiveProfiles(profiles = "test")
public class GoodsControllerTest {

    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private GoodsRepository goodsRepository;

    protected MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @BeforeEach
    public void beforeEach() throws Exception {
        Goods goods = new Goods("1", "test", "test", 100.00, 2);
        goodsRepository.saveAndFlush(goods);
    }

    @Test
    public void should_return_all_goods_when_get_all() throws Exception {
        MockHttpServletRequestBuilder request = get("/api/goods")
            .contentType(MediaType.APPLICATION_JSON);
        String response = mockMvc.perform(request)
            .andReturn()
            .getResponse()
            .getContentAsString();
        JSONArray jsonArray = new JSONArray(response);

        assertThat(jsonArray.length()).isEqualTo(1);

        JSONObject firstGood = jsonArray.getJSONObject(0);
        assertThat(firstGood.get("id")).isEqualTo("1");
    }

    @Test
    public void should_return_good_detail_when_get_good_by_id() throws Exception {
        MockHttpServletRequestBuilder request = get("/api/goods/1")
            .contentType(MediaType.APPLICATION_JSON);
        String response = mockMvc.perform(request)
            .andReturn()
            .getResponse()
            .getContentAsString();
        JSONObject jsonObject = new JSONObject(response);
        assertThat(jsonObject.get("id")).isEqualTo("1");
    }
}