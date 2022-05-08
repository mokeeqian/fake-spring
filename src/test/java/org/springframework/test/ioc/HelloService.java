/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package org.springframework.test.ioc;

public class HelloService {
    public String sayHello() {
        System.out.println("Hello");
        return "Hello";
    }
}
