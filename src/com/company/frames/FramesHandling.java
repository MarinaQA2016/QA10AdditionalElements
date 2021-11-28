package com.company.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesHandling {
    WebDriver driver;
    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        Thread.sleep(20000);
    }
    @Test
    public void framesTest() throws InterruptedException {
        //------- Print 'Run >' button name
        System.out.println("Run button name is " + driver.findElement(By.cssSelector("#runbtn")).getText());
        //------ Print the title 'HTML Iframes' in the frame
        //System.out.println("Header in the frame is " + driver.findElement(By.xpath("//h2")).getText());
        // ----- Switch into frame ----------------
        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        Thread.sleep(2000);
        //------ Print the title 'HTML Iframes' in the frame
        System.out.println("Header in the frame is " + driver.findElement(By.xpath("//h2")).getText());
        //------ Switch to the parent frame -----------
        driver.switchTo().parentFrame();
        //------- Print 'Run >' button name
        System.out.println("Run button name is " + driver.findElement(By.cssSelector("#runbtn")).getText());
        // ----- Switch into frame ----------------
        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        Thread.sleep(2000);
        //---- Print the text of the header 1 (//h1) ----
        //System.out.println("The header 1 is " + driver.findElement(By.xpath("//h1")).getText());
        // ------- Switch into the second frame ----
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@title = 'Iframe Example']")));
        //---- Print the text of the header 1 (//h1) ----
        System.out.println("The header 1 is " + driver.findElement(By.xpath("//h1")).getText());
        // ------ Switch into default frame (content) -----
        driver.switchTo().defaultContent();
        //------- Print 'Run >' button name
        System.out.println("Run button name is " + driver.findElement(By.cssSelector("#runbtn")).getText());


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
