package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.JsonResult;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping(value = "/select")//设置为GET请求
    public JsonResult selectdatas(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){

        return studentService.selectstudentdata(pageNum,pageSize);
    }
    @PostMapping(value = "/addstudent")//设置为GET请求
    public JsonResult addGoodsdata(@RequestBody JSONObject request){
        return studentService.addstudentdata(request);
    }

    @PostMapping(value = "/updatestudent")//设置为GET请求
    public JsonResult updateGoodsdata(@RequestBody JSONObject request){
        return studentService.updatestudentdata(request);
    }

    @GetMapping(value = "/delstudent")//设置为GET请求
    public JsonResult delGoodsdata(@RequestParam("id") int id){
        return studentService.delstudentdata(id);
    }



}
//    @RequestParam("id")：获取请求参数(单个参数)
//    @RequestBody
//    @PostMapping(value = "/photocode")
//    public JsonResult photocode(
//            @RequestParam(required = false) String qqq){ //required=false qqq参数可传可不传，
//        return new JsonResult(qqq,"0",10);
//    }