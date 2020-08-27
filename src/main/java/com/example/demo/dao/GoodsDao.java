package com.example.demo.dao;

import com.example.demo.model.GoodsContent;
import com.example.demo.model.PhotoCode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Mapper
public interface GoodsDao {


    @Select("SELECT id,`name`,type,price,size,`status`,description FROM `goods`")
    List<GoodsContent> getGoodsData();

//    List<GoodsContent> getUserList();

    @Select("SELECT mobile,keywords,send_time FROM `umc`.`sms_record_2020` WHERE `sms_type` = '0' ORDER BY id desc")
    List<PhotoCode> getPhothCode();
}
