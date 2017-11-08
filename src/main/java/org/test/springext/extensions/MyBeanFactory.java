package org.test.springext.extensions;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import org.test.springext.beans.OfferEngine;

@Component
public class MyBeanFactory implements FactoryBean<OfferEngine> {

    @Override
    public OfferEngine getObject() throws Exception {
        return new OfferEngine();
    }

    @Override
    public Class<?> getObjectType() {
        return OfferEngine.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
