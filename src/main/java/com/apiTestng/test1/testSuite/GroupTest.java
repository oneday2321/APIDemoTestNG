package com.apiTestng.test1.testSuite;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;

public class GroupTest {
    @BeforeGroups("dataA")
    public void beforeGroup(){
        System.out.println("@BeforeGroup...");
    }

    @AfterGroups("dataB")
    public void afterGroup(){
        System.out.println("@AfterGroup...");
    }
}
