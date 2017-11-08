package org.test.springext.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.SmartLifecycle;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class OfferEngineRegistry implements InitializingBean {

    private Map<Object, Object> offerEngines = new HashMap<>();

    public void registerOfferEngine(Produzent produzent, OfferEngine offerEngine) {
        System.out.println("OfferEngineRegistry#registerOfferEngine(" + produzent + ", " + offerEngine + ")");
        offerEngines.put(produzent, offerEngine);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("OfferEngineRegistry#afterPropertiesSet()");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("OfferEngineRegistry#postConstruct()");
    }
}