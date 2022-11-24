package ru.yandex.praktikum.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    private final Properties properties = new Properties();

    private static TestProperties INSTANCE = null;

    public TestProperties() {
        try {
            properties.load(new FileInputStream(new File("src/test/resources/"
                    + System.getProperty("testProperties", "testProperties") + ".properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static TestProperties getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TestProperties();
        }
        return INSTANCE;
    }

    public String getProperties(String key) {
        return properties.getProperty(key);
    }
}

