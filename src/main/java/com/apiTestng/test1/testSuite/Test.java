package com.apiTestng.test1.testSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test {
    @BeforeTest
    public void beforeTest(){
        System.out.println("@BeforeTest...11");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("@AfterTest...11");
    }
}
