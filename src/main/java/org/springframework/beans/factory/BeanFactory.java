/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {
    // bean 容器
    private Map<String, Object> beanMap = new HashMap<>();

    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    public Object getBean(String name) {
        return beanMap.get(name);
    }

}
