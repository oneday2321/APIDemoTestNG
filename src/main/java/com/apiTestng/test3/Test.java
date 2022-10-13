package com.apiTestng.test3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test {
    @BeforeTest
    public void beforeTest(){
        System.out.println("@BeforeTest...33");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("@AfterTest...33");
    }
}
