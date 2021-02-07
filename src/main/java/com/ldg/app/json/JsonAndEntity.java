package com.ldg.app.json;

import com.alibaba.fastjson.JSON;

/**
 * @author ldg
 * JSON字符串和实体之间的转换
 */
public class JsonAndEntity {


    /**
     * 根据json对象返回指定类型的实体对象
     *
     * @param o
     * @param c
     * @param <T>
     * @return
     */
    public static <T> T toEnity(Object o, Class<T> c) {
        return JSON.parseObject(JSON.toJSONString(o), c);
    }

}
