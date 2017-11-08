package org.test.springext.extensions;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object beanInstance, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor#postProcessBeforeInitialisation(" + beanInstance.toString() + ", " + beanName + ")");
        return beanInstance;
    }

    @Override
    public Object postProcessAfterInitialization(Object beanInstance, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor#postProcessAfterInitialisation(" + beanInstance.toString() + ", " + beanName + ")");
        return beanInstance;
    }
}
