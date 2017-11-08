package org.test.springext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.test.springext.beans.MyService1;
import org.test.springext.beans.OfferEngine;

import java.util.Map;

public class SpringExtensionPointsTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring-configs/application.xml");
        System.out.println("ApplicationName: " + context.getApplicationName());
        System.out.println("DisplayName: " + context.getDisplayName());

        MyService1 service1 = context.getBean(MyService1.class);
        service1.myService1();

        Map<String, OfferEngine> offerEngineMap = context.getBeansOfType(OfferEngine.class, true, false);
        for (Map.Entry<String, OfferEngine> entry : offerEngineMap.entrySet()) {
            System.out.println("Offer Engine: " + entry.getKey() + " = {" + entry.getValue().toString() + "}");
        }

    }

}
