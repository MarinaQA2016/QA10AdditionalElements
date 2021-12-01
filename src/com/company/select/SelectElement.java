package com.company.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectElement {
    WebDriver driver;
    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
        Thread.sleep(10000);
    }
    @Test
    public void selectTest() throws InterruptedException {
        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        Thread.sleep(4000);
        System.out.println("Header: " + driver.findElement(By.xpath("//h1")).getText());
        Select selectCar = new Select(driver.findElement(By.id("cars")));
        // ------ Select by value -----
        //selectCar.selectByValue("saab");
        selectCar.selectByVisibleText("Opel");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value = 'Submit']")).click();
        Thread.sleep(2000);

        System.out.println("Text : " + driver.findElement(By.cssSelector(".w3-large")).getText());
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
