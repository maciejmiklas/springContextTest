package org.test.context.excd.excd01;

import javax.annotation.PostConstruct;

import static org.test.context.Log.log;

class BeanB implements MyInterface{

    public BeanB() {
        log("BeanB - constructor");
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanB - postConstruct");
    }

    public void method() {
        log("BeanB - method");
    }
}
