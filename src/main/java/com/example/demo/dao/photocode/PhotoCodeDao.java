package com.example.demo.dao.photocode;

import com.example.demo.model.PhotoCodeContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Mapper
public interface PhotoCodeDao {

    @Select("SELECT mobile,keywords,send_time FROM `umc`.`sms_record_2020` WHERE `sms_type` = '0' ORDER BY id desc")
    List<PhotoCodeContent> getPhothCode();
}
