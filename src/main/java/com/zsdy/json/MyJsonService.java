package com.zsdy.json;

import com.alibaba.fastjson.JSON;

public class MyJsonService {

    private String name;

    /**
     * 使用 fastjson 将对象转换为 json 字符串输出
     */
    public String objToJson(Object object) {
        return getName() + JSON.toJSONString(object);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}