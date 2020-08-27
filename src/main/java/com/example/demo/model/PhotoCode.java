package com.example.demo.model;

import javax.xml.crypto.Data;

public class PhotoCode {
    private String mobile;
    private String send_time;
    private String keywords;

    public PhotoCode(String mobile, String send_time, String keywords) {
        this.mobile = mobile;
        this.send_time = send_time;
        this.keywords = keywords;
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
