package org.test.context.exb.exb02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * Same as exb01, but configuration class ConfBeanB has been renamed to ConfBeanXB
 * <p>
 * The instantiation order remains unchanged.
 */
class ApplicationExB02 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
