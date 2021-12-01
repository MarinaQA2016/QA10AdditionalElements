package com.company.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationInNegevJobs {
    WebDriver driver;

    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.negevjobs.co.il/employer/register");
        Thread.sleep(20000);
    }

    @Test
    public void selectInNegevJobsCheck() throws InterruptedException {
        // Fill in 'Name'
        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.click();
        firstName.sendKeys("Ivan");
        Thread.sleep(3000);

        // Fill in Surname
        WebElement surname = driver.findElement(By.id("last_name"));
        surname.click();
        surname.sendKeys("Ivanov");
        Thread.sleep(3000);

        // Fill in 'email' field
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.click();
        emailField.sendKeys("test@test.com");
        Thread.sleep(3000);

        // Fill in password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.click();
        passwordField.sendKeys("password");
        Thread.sleep(3000);

        // Fill in another password field
        WebElement anotherPasswordField = driver.findElement(By.id("repassword"));
        anotherPasswordField.click();
        anotherPasswordField.sendKeys("password");
        Thread.sleep(3000);

        // Fill in position field
        Select positionField = new Select(driver.findElement(By.id("function")));
        positionField.selectByValue("HR");
        Thread.sleep(3000);

        // Fill in position field again
        positionField.selectByVisibleText("מנהל תפעול");
        Thread.sleep(3000);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
