package com.company.annotations;

import org.testng.annotations.*;

public class Child1 extends MainClass{
    @BeforeSuite
    public void method11(){
        System.out.println("Child1 - @BeforeSuite");
    }
    @BeforeClass
    public void method12(){
        System.out.println("Child1 - @BeforeClass");
    }
    @BeforeMethod
    public void method13(){
        System.out.println("Child1 - @BeforeMethod");
    }

    @AfterSuite
    public void method14(){
        System.out.println("Child1 - @AfterSuite");
    }
    @AfterClass
    public void method15(){
        System.out.println("Child1 - @AfterClass");
    }
    @AfterMethod
    public void method16(){
        System.out.println("Child1 - @AfterMethod");
    }

    @Test
    public void test11(){
        System.out.println("Child1 - test11");
    }
    @Test
    public void test12(){
        System.out.println("Child1 - test12");
    }
}
