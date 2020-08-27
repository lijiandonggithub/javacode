package com.example.demo.service;

import com.example.demo.model.GoodsContent;
import com.example.demo.model.JsonResult;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface GoodsService {

    JsonResult selectData(int pageNum, int pageSize);

    JsonResult getPthotoCode(int pageNum, int pageSize);

}
