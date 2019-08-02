package com.zsdy.json;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "ziyou.json")
public class MyJsonProperties {

    public static final String DEFAULT_NAME = "ziyou";

    private String name = DEFAULT_NAME;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
