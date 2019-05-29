package com.telran;

import org.junit.Test;

import java.io.InputStream;
import java.util.Properties;

public class MyUnitTest {

    @Test
    public void test_1() throws Exception {
        //database.username=root
        //database.password=password

        Properties properties = new Properties();
        InputStream is = MyUnitTest.class
                .getClassLoader()
                .getResourceAsStream("application.properties");

        properties.load(is);

        System.out.println(properties.getProperty("database.username"));
        System.out.println(properties.getProperty("database.password"));
    }
}
