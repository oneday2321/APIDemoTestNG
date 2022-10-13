package cn.testNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class test1 {
    @Test(groups = "da1")
    public void test(){
        System.out.println("第1个测试方法");
    }

    @Test(groups = "da1")
    public void test2(){
        System.out.println("第2个测试方法");
    }

    @Test(groups = "da2")
    public void test3(){
        System.out.println("第3个测试方法");
    }

    @Test(groups = "da3")
    public void test4(){
        System.out.println("第4个测试方法");
    }

    @Test(groups = "da2")
    public void test5(){
        System.out.println("第5个测试方法");
    }

    @Test(groups = "da1")
    public void test6(){
        System.out.println("第6个测试方法");
    }

    @BeforeGroups("da1")
    public void beforeGroup(){
        System.out.println("@BeforeGroup...");
    }

    @AfterGroups("da1")
    public void afterGroup(){
        System.out.println("@AfterGroup...");
    }


}
