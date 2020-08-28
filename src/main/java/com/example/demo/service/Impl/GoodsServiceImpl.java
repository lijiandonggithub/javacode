package com.example.demo.service.Impl;

import com.example.demo.dao.goods.GoodsDao;
import com.example.demo.dao.photocode.PhotoCodeDao;
import com.example.demo.model.GoodsContent;
import com.example.demo.model.JsonResult;
import com.example.demo.model.PhotoCodeContent;
import com.example.demo.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lijiandong
 */
@Service(value = "GoodsService")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private PhotoCodeDao photocode;
    @Autowired
    private GoodsDao goodsDao;
    @Override
    public JsonResult selectData(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<GoodsContent> pageInfo = new PageInfo(goodsDao.getGoodsData());
        return new JsonResult(pageInfo.getList(), "操作成功！", pageInfo.getTotal());

    }

    @Override
    public JsonResult getPthotoCode(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<PhotoCodeContent> photoCodePageInfo = new PageInfo(photocode.getPhothCode());
        return new JsonResult(photoCodePageInfo.getList(),"操作成功",photoCodePageInfo.getTotal());
    }


}
