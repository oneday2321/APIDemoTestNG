package com.apiTestng.testSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test {
    @BeforeTest
    public void beforeTest(){
        System.out.println("@BeforeTest...");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("@AfterTest...");
    }
}
