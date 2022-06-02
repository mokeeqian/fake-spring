/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单的 bean 容器，使用 hashmap 来实现
 */
public class BeanFactory {
    // bean 容器
    private Map<String, Object> beanMap = new HashMap<>();

    /**
     * bean 注册
     * @param name bean名称，作为key放入hashmap
     * @param bean bean对象，作为value存入hashmap
     */
    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    /**
     * 按照名称获取bean对象
     * @param name 名称
     * @return bean对象
     */
    public Object getBean(String name) {
        return beanMap.get(name);
    }

}
