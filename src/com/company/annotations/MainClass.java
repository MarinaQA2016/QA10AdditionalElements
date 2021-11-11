package com.company.annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class MainClass {

    @BeforeSuite
    public void method1(){
        System.out.println("MainClass - @BeforeSuite");
    }
    @BeforeClass
    public void method2(){
        System.out.println("MainClass - @BeforeClass");
    }
    @BeforeMethod
    public void method3(){
        System.out.println("MainClass - @BeforeMethod");
    }

    @AfterSuite
    public void method4(){
        System.out.println("MainClass - @AfterSuite");
    }
    @AfterClass
    public void method5(){
        System.out.println("MainClass - @AfterClass");
    }
    @AfterMethod
    public void method6(){
        System.out.println("MainClass - @AfterMethod");
    }
}
