package com.apiTestng.test1;

import org.testng.annotations.*;

public class AnnotationsTest {
    /*
    * 运行顺序
    * @BeforeMethod \ @AfterMethod  位置当前类，在每一个标记@test()方法得 之前与之后 运行
    * @BeforeTest   \ @AfterTest
    * @BeforeSuite  \ @AfterSuite   在测试套件中，任何类和方法都没运行之前与都运行之后运行
    * @BeforeClass  \ @AfterClass   位置当前类，在类方法运行 之前与之后 运行
    * @BeforeGroup  \ @AfterGroup   在分组的前后运行
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
        System.out.println("第1个测试方法");
    }

    @Test()
    public void test2(){
        System.out.println("第2个测试方法");
    }

    @Test()
    public void test3(){
        System.out.println("第3个测试方法");
    }

    @BeforeMethod
    public void beforeMethodTest(){
        System.out.println("@BeforeMethod...，当前类 @Test测试方法 之前运行");
    }

    @AfterMethod
    public void afterMethodTest(){
        System.out.println("@AfterMethod...，当前类 @Test测试方法 之后 运行");
    }

    @BeforeClass
    public void beforeClassTest(){
        System.out.println("@BeforeClass...，当前类 所有测试方法 未运行 之前 运行");
    }

    @AfterClass
    public void afterClassTest(){
        System.out.println("@AfterClass...，当前类 所有测试方法 已运行 之后 运行");
    }

}
