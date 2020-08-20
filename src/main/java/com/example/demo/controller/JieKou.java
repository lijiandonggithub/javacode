package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.JsonResult;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/goods")
public class JieKou {
    @Autowired
    private GoodsService goodsService;
    //value 属性：指定请求的实际地址，value 可以省略不写
    //method 属性：指定请求的类型，主要有GET、PUT、POST、DELETE，默认为 GET
    //produces 属性：指定返回内容类型
    @RequestMapping(value = "/select",method = RequestMethod.GET)//设置为GET请求
    public JsonResult selectdatas(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
//        @RequestParam("id")：获取请求参数(单个参数)
//        @RequestBody
         return goodsService.selectData(pageNum,pageSize);

    }
    @PostMapping(value = "/hahaha")
    public JsonResult aaaa(
            @RequestParam(required = false) String qqq){ //required=false qqq参数可传可不传，
        return new JsonResult(qqq,"0",10);
    }

}
