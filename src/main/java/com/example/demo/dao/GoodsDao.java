package com.example.demo.dao;

import com.example.demo.model.GoodsContent;
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

}
