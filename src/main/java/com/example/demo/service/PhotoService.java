package com.example.demo.service;


import com.example.demo.model.JsonResult;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface PhotoService {

    JsonResult getPthotoCode(int pageNum, int pageSize);



}
