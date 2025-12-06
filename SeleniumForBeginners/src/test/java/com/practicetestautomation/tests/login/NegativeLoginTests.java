package com.practicetestautomation.tests.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests {

    @Test
    public void incorrectUsernameTest(){
        // Open page
        WebDriver driver=new EdgeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Type username incorrectUser into Username field
        WebElement incorrectUser= driver.findElement(By.xpath("//input[@id='username']"));
        incorrectUser.sendKeys("IncorrectStudentUsername");

        // Type password Password123 into Password field
        WebElement correctPassword= driver.findElement(By.xpath("//input[@id='password']"));
        correctPassword.sendKeys("Password123");

        // Push Submit button
        WebElement submitButton=driver.findElement(By.id("submit"));
        submitButton.click();

        // Verify error message is displayed
        WebElement errorMessage=driver.findElement(By.id("error"));
        Assert.assertTrue(errorMessage.isDisplayed());

        // Verify error message text is Your username is invalid!
        String expectedErrorMessage="Your username is invalid!";
        String actualError=errorMessage.getText();
        Assert.assertEquals(actualError,expectedErrorMessage);

        driver.quit();
    }

    @Test
    public  void incorrectPasswordTest(){
        // Open page
        WebDriver driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Type username student into Username field
        WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("student");

        // Type password incorrectPassword into Password field
        WebElement incorrectPassword= driver.findElement(By.xpath("//input[@id='password']"));
        incorrectPassword.sendKeys("incorrect");

        // Push Submit button
        WebElement submitButton=driver.findElement(By.id("submit"));
        submitButton.click();

        // Verify error message is displayed
        WebElement errorMessage=driver.findElement(By.id("error"));
        Assert.assertTrue(errorMessage.isDisplayed());

        // Verify error message text is Your password is invalid!
        String expectedErrorMessage="Your password is invalid!";
        String actualError=errorMessage.getText();
        Assert.assertEquals(actualError,expectedErrorMessage);

        driver.quit();
    }
}
