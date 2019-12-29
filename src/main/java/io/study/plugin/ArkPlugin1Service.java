package io.study.plugin;

import io.study.service.HelloService;

public class ArkPlugin1Service {
    public void test(){
        new HelloService().sayHello();
    }
}
