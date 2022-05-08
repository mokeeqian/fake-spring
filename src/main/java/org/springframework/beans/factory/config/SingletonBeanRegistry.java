/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package org.springframework.beans.factory.config;

/**
 * 单例注册表
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
