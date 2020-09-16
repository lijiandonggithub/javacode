package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.JsonResult;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface StudentService {


    JsonResult selectstudentdata(int pageNum, int pageSize);


    JsonResult addstudentdata(JSONObject request);

    JsonResult delstudentdata(int id);

    JsonResult updatestudentdata(JSONObject request);



}
