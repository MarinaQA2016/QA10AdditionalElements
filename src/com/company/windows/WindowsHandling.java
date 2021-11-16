package com.company.windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsHandling {
    WebDriver driver;
    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        Thread.sleep(5000);
    }
    @Test
    public void windowsTest() throws InterruptedException {
        WebElement tryItYourselfButton = driver.findElement(By.xpath("(//*[contains(text(),'Try it Yourself')])[1]"));
        //----- get and print first window handle (code) -----
        String firstWindowHandle = driver.getWindowHandle();
        System.out.println("First (active) window handle" + firstWindowHandle);
        tryItYourselfButton.click();
        Thread.sleep(3000);
        System.out.println("Active window handle" + driver.getWindowHandle());
        // ------- Print handles of all opened windows ----
        String secondWindowHandle="";
        for (String handle: driver.getWindowHandles()){
            System.out.println("Handle: " + handle);
            if (!handle.equals(firstWindowHandle)) secondWindowHandle = handle;
        }
        driver.switchTo().window(secondWindowHandle);

        System.out.println("Run button name: " + driver.findElement(By.id("runbtn")).getText());
        System.out.println("Another button: " + driver.findElement(By.id("getwebsitebtn")).getText() );
        //---- Close the current window (second) -----
        driver.close();
        Thread.sleep(3000);
        //System.out.println("Run button name: " + driver.findElement(By.id("runbtn")).getText());
        driver.switchTo().window(firstWindowHandle);
        System.out.println("Active window handle" + driver.getWindowHandle());

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
