package com.example.demo.dao.test;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.GoodsContent;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper
public interface GoodsDao {

    @Select("SELECT id,`name`,type,price,size,`status`,description FROM `58test`.`goods`")
    List<GoodsContent> getGoodsData();

    @Insert("INSERT INTO `58test`.`goods`(`name`, `type`, `price`, `size`, `status`, `description`) VALUES (#{name},#{type},#{price},#{size},#{status},#{description})")
    Integer addGoodsData(JSONObject request);

    @Delete("DELETE FROM `58test`.`goods` WHERE `id` = #{id}")
    Integer delGoodsData(@Param("id") int id);

    @Update("UPDATE `58test`.`goods` SET `name` = #{name}, `type` = #{type}, `price` = #{price}, `size` = #{size}, `status` = #{status} , `description` = #{description} WHERE `id` = #{id}")
    Integer updataGoodsData(JSONObject request);

}
