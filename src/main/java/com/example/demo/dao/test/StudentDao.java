package com.example.demo.dao.test;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.StudentljdContent;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper
public interface StudentDao {


    @Select("SELECT id,`name`,age,addr,sex,`mark` FROM `58test`.`student_ljd`")
    List<StudentljdContent> getstudents();

    @Insert("INSERT INTO `58test`.`student_ljd`(`name`, `age`, `addr`, `sex`, `mark`) VALUES (#{name},#{age},#{addr},#{sex},#{mark})")
    Integer addstudent(JSONObject request);

    @Delete("DELETE FROM `58test`.`student_ljd` WHERE `id` = #{id}")
    Integer delstudent(@Param("id") int id);

    @Update("UPDATE `58test`.`student_ljd` SET `name` = #{name}, `age` = #{age}, `addr` = #{addr}, `sex` = #{sex}, `mark` = #{mark} WHERE `id` = #{id}")
    Integer updatastudent(JSONObject request);

}
