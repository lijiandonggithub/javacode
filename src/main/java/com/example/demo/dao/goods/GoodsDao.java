package com.example.demo.dao.goods;

import com.example.demo.model.GoodsContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper
public interface GoodsDao {


    @Select("SELECT id,`name`,type,price,size,`status`,description FROM `58test`.`goods`")
    List<GoodsContent> getGoodsData();

    @Select("INSERT INTO `58test`.`goods`(`name`, `type`, `price`, `size`, `status`, `description`) VALUES ('电动打人器', '国产', 9999, 1, '有货', '插电即打')")
    List<GoodsContent> addGoodsData();

    @Select("DELETE FROM `58test`.`goods` WHERE `id` = 10")
    List<GoodsContent> delGoodsData(int id);

    @Select("UPDATE `58test`.`goods` SET `name` = 111, `type` = 100, `price` = 100, `size` = 100, `status` = 100 , `description` = 100 WHERE `id` = 9")
    List<GoodsContent> updataGoodsData();
}
