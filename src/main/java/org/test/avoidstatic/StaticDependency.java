package org.test.avoidstatic;

public class StaticDependency {

    private static String configData;

    public static void initInstance(String configData) {
        StaticDependency.configData = configData;
    }

    public static String getInfo() {
        return configData;
    }
}
