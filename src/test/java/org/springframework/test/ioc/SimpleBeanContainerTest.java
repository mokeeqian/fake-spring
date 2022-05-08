/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import static org.assertj.core.api.Assertions.assertThat;


public class SimpleBeanContainerTest {
    @Test
    public void testGetBean() {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("Hello Bean", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("Hello Bean");
        assertThat(helloService).isNotNull();
        assertThat(helloService.sayHello()).isEqualTo("Hello Bean");
    }
    class HelloService {
        public String sayHello() {
            System.out.println("Hello Bean");
            return "Hello Bean";
        }
    }
}
