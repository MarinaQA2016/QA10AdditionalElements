package com.company.scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollingTest {
    WebDriver driver;
    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        Thread.sleep(3000);
    }
    @Test
    public void scrollingTest() throws InterruptedException {
        // ------- Scrolling down till the 'PlayGame' button ------
        WebElement playButton = driver.findElement(By.xpath("//*[contains(text(),'Play Game')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",playButton);
        Thread.sleep(3000);

        //--------- Scrolling up to 'HTML' header -----
        WebElement htmlHeader = driver.findElement(By.xpath("//h1[contains(text(),'HTML')]"));
        js.executeScript("arguments[0].scrollIntoView();",htmlHeader);
        Thread.sleep(3000);

        //---------- Scrolling down by pixels -------
        js.executeScript("window.scrollBy(0,1000);");
        Thread.sleep(3000);

        //---------- Scrolling up by pixels -------
        js.executeScript("window.scrollBy(0,-1000);");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
