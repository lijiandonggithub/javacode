package com.example.demo.service.Impl;

import com.example.demo.dao.GoodsDao;
import com.example.demo.model.GoodsContent;
import com.example.demo.model.JsonResult;
import com.example.demo.model.PhotoCode;
import com.example.demo.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * @author Lijiandong
 */
@Service(value = "GoodsService")
public class GoodsServiceImpl implements GoodsService {

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
        PageInfo<PhotoCode> photoCodePageInfo = new PageInfo(goodsDao.getPhothCode());
        return new JsonResult(photoCodePageInfo.getList(),"操作成功",photoCodePageInfo.getTotal());
    }


}
