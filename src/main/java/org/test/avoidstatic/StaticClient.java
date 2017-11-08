package org.test.avoidstatic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StaticClient {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Application.class);
        context.refresh();

        MySingletonService singletonService = context.getBean(MySingletonService.class);

        StaticServiceClass.initService("HELLO WORLD");
        StaticServiceClass.addStaticData(singletonService.getData());
        System.out.println(StaticServiceClass.getStaticData());

        StaticServiceClass.destroyService();
    }
}
