/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package org.springframework.beans.factory;
import org.springframework.beans.BeansException;

public interface BeanFactory {
    /**
     * 获取 bean
     * @param name
     * @return
     * @throws BeansException
     */
    Object getBean(String name) throws BeansException;
}