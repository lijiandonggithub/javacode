package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.JsonResult;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    //value 属性：指定请求的实际地址，value 可以省略不写
    //method 属性：指定请求的类型，主要有GET、PUT、POST、DELETE，默认为 GET
    //produces 属性：指定返回内容类型

    @GetMapping(value = "/select")
    public JsonResult selectdatas(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){

         return goodsService.selectgoodsData(pageNum,pageSize);
    }
    @PostMapping(value = "/addgood")
    public JsonResult addGoodsdata(@RequestBody JSONObject request){
        return goodsService.addGood(request);
    }

    @PostMapping(value = "/updategood")
    public JsonResult updateGoodsdata(@RequestBody JSONObject request){
        return goodsService.updategoodsData(request);
    }

    @GetMapping(value = "/delgood")
    public JsonResult delGoodsdata(@RequestParam("id") int id){
        return goodsService.delgoodsData(id);
    }


}
//    @RequestParam("id")：获取请求参数(单个参数)
//    @RequestBody
//    @PostMapping(value = "/photocode")
//    public JsonResult photocode(
//            @RequestParam(required = false) String qqq){ //required=false qqq参数可传可不传，
//        return new JsonResult(qqq,"0",10);
//    }