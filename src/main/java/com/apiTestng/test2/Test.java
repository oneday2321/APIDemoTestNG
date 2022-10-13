package com.apiTestng.test2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test {
    @BeforeTest
    public void beforeTest(){
        System.out.println("@BeforeTest...22");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("@AfterTest...22");
    }
}
