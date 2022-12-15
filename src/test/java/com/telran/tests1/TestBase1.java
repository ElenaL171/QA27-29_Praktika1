package com.telran.tests1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase1 {
    WebDriver driver;
    @BeforeMethod
    public void init(){
        driver = new ChromeDriver();
        driver.get("http://selenium1py.pythonanywhere.com/en-gb/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    @AfterMethod(enabled = true)
    public void tearDown(){
        driver.quit();
    }


}
