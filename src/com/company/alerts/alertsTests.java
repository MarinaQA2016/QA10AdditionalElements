package com.company.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class alertsTests {
    WebDriver driver;
    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("file:///C:/Marina/TelRan/QA%20Courses/Selenium/AlertsDemo.html");
        Thread.sleep(3000);
    }
    @Test
    public void simpleAlertTest() throws InterruptedException {
        // ---- press on the SimpleAlert button ---
        driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        // --- accept alert ----
        alert.accept();
        Thread.sleep(3000);

        // ---- press on the ConfirmBox button ----
        driver.findElement(By.xpath("//button[contains(text(),'Confirm Box')]")).click();
        Thread.sleep(3000);
    }
    @Test
    public void confirmBoxTest() throws InterruptedException {
        // ---- press on the ConfirmBox button ----
        driver.findElement(By.xpath("//button[contains(text(),'Confirm Box')]")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        // ---- press ok button ----
        alert.accept();
        Thread.sleep(3000);
        // ---- press on the ConfirmBox button ----
        driver.findElement(By.xpath("//button[contains(text(),'Confirm Box')]")).click();
        Thread.sleep(3000);
        // ----- press cancel button ---
        alert.dismiss();
        Thread.sleep(3000);
    }

    @Test
    public void promptBoxTest() throws InterruptedException {
        // ---- press on the PromptBox button ----
        driver.findElement(By.xpath("//button[contains(text(),'Prompt box')]")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        // ---- press ok button ----
        alert.accept();
        Thread.sleep(3000);
        // ---- press on the PromptBox button ----
        driver.findElement(By.xpath("//button[contains(text(),'Prompt box')]")).click();
        Thread.sleep(3000);
        // ----- press cancel button ---
        alert.dismiss();
        Thread.sleep(3000);
        // ---- press on the PromptBox button ----
        driver.findElement(By.xpath("//button[contains(text(),'Prompt box')]")).click();
        Thread.sleep(3000);
         // -----------enter 'Buratino' to the field
        alert.sendKeys("Buratino");
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void  tearDown(){
        driver.quit();
    }
}
