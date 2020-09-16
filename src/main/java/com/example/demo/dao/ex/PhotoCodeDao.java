package com.example.demo.dao.ex;

import com.example.demo.model.PhotoCodeContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Mapper
public interface PhotoCodeDao {

    @Select("select base.id,record.mobile,record.keywords,record.send_time FROM `umc`.`sms_record_2020` record left join `umc`.`user_base_info` base on record.mobile = base.mobile where record.keywords!='' ORDER BY record.send_time desc")
    List<PhotoCodeContent> getPhothCode();

}
