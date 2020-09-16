package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.JsonResult;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface GoodsService {

    JsonResult selectgoodsData(int pageNum, int pageSize);


    JsonResult addGood(JSONObject request);

    JsonResult delgoodsData(int id);
//
    JsonResult updategoodsData(JSONObject request);
//


}
