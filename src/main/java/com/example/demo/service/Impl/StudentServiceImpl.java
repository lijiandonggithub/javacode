package com.example.demo.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.test.StudentDao;
import com.example.demo.model.GoodsContent;
import com.example.demo.model.JsonResult;
import com.example.demo.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lijiandong
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;


    @Override
    public JsonResult selectstudentdata(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<GoodsContent> pageInfo = new PageInfo(studentDao.getstudents());
        System.out.println("list "+pageInfo.getList());
        return new JsonResult(pageInfo.getList(), "操作成功！", pageInfo.getTotal());

    }

    @Override
    public JsonResult addstudentdata(JSONObject request) {
        JsonResult result=new JsonResult();
        System.out.println(request);
        try {
            studentDao.addstudent(request);
            result.setMsg("添加成功！");
            result.setCode("0");
        }catch(Exception e){
            result.setMsg("添加失败！");
            result.setCode("500");
        }
        return result;
    }

    @Override
    public JsonResult updatestudentdata(JSONObject request) {
        JsonResult result=new JsonResult();
        try {
            studentDao.updatastudent(request);
            result.setMsg("修改成功！");
            result.setCode("0");
        }catch(Exception e){
            result.setMsg("修改失败！");
            result.setCode("500");
        }
        return result;
    }


    @Override
    public JsonResult delstudentdata(int id) {
        JsonResult result=new JsonResult();
        try {
            studentDao.delstudent(id);
            result.setMsg("删除成功！");
            result.setCode("0");
        }catch(Exception e){
            result.setMsg("删除失败！");
            result.setCode("500");
        }
        return result;

    }




}
