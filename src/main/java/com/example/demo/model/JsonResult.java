package com.example.demo.model;

import lombok.Data;

@Data
public class JsonResult<T> {
    /**
     * 响应码
     * protected变量 对于继承此类的子类来说是公共的，未继承的子女来说是私有的且无法获得此变量
     */
    protected String code;
    /**
     * 响应信息
     */
    protected String msg;
    /**
     * 返回数据
     */
    //TODO  T和类中的<T>是什么意思
    private T data;
    /**
     * 返回数据数量
     */
    private long count;
    public JsonResult(T data, String msg, long count){
        this.data = data;
        this.code = "0";
        this.msg = msg;
        this.count = count;
    }




}
