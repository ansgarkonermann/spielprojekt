package org.test.springext.beans;

import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Map;

@Service
public class MyService1 {

    private static final String PREFIX = "MyService1#myService1() ";
    @Inject
    Map<String, OfferEngine> offerEngineMap;

    public void myService1() {
        System.out.println(PREFIX);

        System.out.println(PREFIX + "Listing Offer Engines:");
        for (Map.Entry<String, OfferEngine> entry : offerEngineMap.entrySet()) {
            System.out.println(PREFIX + "OfferEngine = " + entry.getKey() + " " + entry.getValue().toString());
        }
    }
}
