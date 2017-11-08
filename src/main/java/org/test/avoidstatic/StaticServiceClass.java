package org.test.avoidstatic;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.Collections.singletonList;

public class StaticServiceClass {

    private static Collection<String> staticData;

    public static void initService(String initialStaticData) {
        staticData = new ArrayList<>(singletonList(initialStaticData));
        StaticDependency.initInstance("dependency data");
    }

    public static void addStaticData(String newStaticData) {
        staticData.add(newStaticData);
    }

    public static String getStaticData() {
        return staticData.iterator().next() + "/--/" + StaticDependency.getInfo();
    }

    public static void destroyService() {
        System.out.println(StaticServiceClass.class.getName() + " shutting down");
    }

}
