package org.test.context.exa.exa04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Same as exa03, but BeanB has @DependsOn("beanA")
 * <p>
 * Spring loads dependent bean in a first place, it does not matter where it's located, Spring will scan all
 * possible configurations to locate it.
 */
class ApplicationExA04 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();
    }
}
