package com.example.demo.model;

import lombok.Data;

@Data
public class PhotoCodeContent {
    private Integer userid;
    private String mobile;
    private String send_time;
    private String keywords;

    public PhotoCodeContent(Integer userid,String mobile, String send_time, String keywords) {
        this.userid=userid;
        this.mobile = mobile;
        this.send_time = send_time;
        this.keywords = keywords;
    }
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSend_time() {
        return send_time;
    }

    public void setSend_time(String send_time) {
        this.send_time = send_time;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
