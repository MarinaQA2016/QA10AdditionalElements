package com.company.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IsradonWork {
    WebDriver driver;
    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.isradon.com/");
        Thread.sleep(15000);
    }
    @Test
    public void closeChatPanel() throws InterruptedException {
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-testid = 'dialog_iframe']")));
        Thread.sleep(2000);
        System.out.println("Text: " + driver.findElement(By.xpath("//strong")).getText());
        driver.findElement(By.xpath("//div[@aria-label='close']")).click();
        Thread.sleep(5000);
    }

    @AfterMethod
    public  void tearDown(){
        driver.quit();
    }
}
