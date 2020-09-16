package com.example.demo.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.test.GoodsDao;
import com.example.demo.model.GoodsContent;
import com.example.demo.model.JsonResult;
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
    private GoodsDao goodsDao;


    @Override
    public JsonResult selectgoodsData(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<GoodsContent> pageInfo = new PageInfo(goodsDao.getGoodsData());
        return new JsonResult(pageInfo.getList(), "操作成功！", pageInfo.getTotal());
    }

    @Override
    public JsonResult addGood(JSONObject request) {
        JsonResult result = new JsonResult();
        System.out.println(request);
        try {
            goodsDao.addGoodsData(request);
            result.setMsg("添加成功！");
            result.setCode("0");
        } catch (Exception e) {
            result.setMsg("添加失败！");
            result.setCode("500");
        }
        return result;
    }

    @Override
    public JsonResult updategoodsData(JSONObject request) {
        JsonResult result = new JsonResult();
        try {
            goodsDao.updataGoodsData(request);
            result.setMsg("修改成功！");
            result.setCode("0");
        } catch (Exception e) {
            result.setMsg("修改失败！");
            result.setCode("500");
        }
        return result;
    }


    @Override
    public JsonResult delgoodsData(int id) {
        JsonResult result = new JsonResult();
        try {
            goodsDao.delGoodsData(id);
            result.setMsg("删除成功！");
            result.setCode("0");
        } catch (Exception e) {
            result.setMsg("删除失败！");
            result.setCode("500");
        }
        return result;

    }
}
