package com.apiTestng.test1.testSuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("@BeforeSuite...，在所属套件中，所有类未运行，方法未加载 之前 运行一次");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("@AfterSuite...，在所属套件中，所有类已运行，方法已加载 之后 运行一次");
    }
}
