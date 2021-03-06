package org.test.context.exa.exa04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
class ConfBeanB {

    @Bean
    @DependsOn("beanA")
    BeanB beanB() {
        return new BeanB();
    }
}
