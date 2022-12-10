package com.telran.tests1;

import com.telran.pages.HomePage;
import com.telran.pages.LoginPage1;
import com.telran.pages.ProfilePage1;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTests1 extends TestBase1{

    @Test
    public void LoginPositiveTest(){
        new HomePage(driver).click();
        new LoginPage1(driver).login("l123@gmail.com","S123456f!");
    }
    @AfterMethod
    public void logOut(){
        new ProfilePage1(driver).logOut();
    }
}
