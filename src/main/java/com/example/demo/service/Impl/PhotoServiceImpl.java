package com.example.demo.service.Impl;

import com.example.demo.dao.ex.PhotoCodeDao;
import com.example.demo.dao.test.GoodsDao;
import com.example.demo.model.JsonResult;
import com.example.demo.model.PhotoCodeContent;
import com.example.demo.service.PhotoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lijiandong
 */
@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoCodeDao photocode;
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public JsonResult getPthotoCode(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<PhotoCodeContent> photoCodePageInfo = new PageInfo(photocode.getPhothCode());
        return new JsonResult(photoCodePageInfo.getList(),"操作成功",photoCodePageInfo.getTotal());
    }




}
