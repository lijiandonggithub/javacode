package com.example.demo.controller;

import com.example.demo.model.JsonResult;
import com.example.demo.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/photo")
public class PhotoCodeController {
    @Autowired
    private PhotoService photoService;

    @GetMapping(value = "/photocode")
    public JsonResult photocode(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) { //required=false qqq参数可传可不传，
        return photoService.getPthotoCode(pageNum, pageSize);
    }


}