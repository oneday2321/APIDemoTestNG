package com.apiTestng.test1;

import org.testng.annotations.*;

public class AnnotationsTest {
    /*
    * 运行顺序
    * @BeforeMethod \ @AfterMethod  在每一个标记@test()方法得之前与之后运行
    * @BeforeTest \ @AfterTest
    * @BeforeSuite \ @AfterSuite
    * @BeforeClass \ @AfterClass
    * @BeforeGroup \ @AfterGroup
    * 参数传递
    * @DataProvider
    * @Parameters
    * 监听器
    * @Listeners
    * 标记测试
    * @test()
    * */

    @Test()
    public void test1(){
        System.out.println("第一个测试方法");
    }

    @Test()
    public void test2(){
        System.out.println("第二个测试方法");
    }

    @Test()
    public void test3(){
        System.out.println("第三个测试方法");
    }


    @BeforeMethod
    public void beforeMethodTest(){
        System.out.println("@BeforeMethod...");
    }

    @AfterMethod
    public void afterMethodTest(){
        System.out.println("@AfterMethod...");
    }

    @BeforeClass
    public void beforeClassTest(){
        System.out.println("@BeforeClass...");
    }

    @AfterClass
    public void afterClassTest(){
        System.out.println("@AfterClass...");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("@BeforeTest...");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("@AfterTest...");
    }

    @BeforeGroups("dataA")
    public void beforeGroup(){
        System.out.println("@BeforeGroup...");
    }

    @AfterGroups("dataB")
    public void afterGroup(){
        System.out.println("@AfterGroup...");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("@BeforeSuite...");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("@AfterSuite...");
    }

}
