package com.telran.tests1;

import com.telran.data.UserData;
import com.telran.pages.HomePage;
import com.telran.pages.LoginPage1;
import com.telran.pages.ProfilePage1;
import com.telran.pages.WelcomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_RegTests1 extends TestBase1{

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).clickLoginBtn();

    }

    @Test(priority = 1)
    public void RegistrationPositiveTest(){
        new LoginPage1(driver).registration(UserData.USER_EMAIL, UserData.USER_PASSWORD);
        new WelcomePage(driver).verifyReg("Thanks for registering!");
        Assert.assertTrue(isElementPresent(By.xpath("//*[contains(text(),'Thanks for registering!')]") ));
    }

    @Test(priority = 2)
    public void LoginPositiveTest(){
        new LoginPage1(driver).login(UserData.USER_EMAIL, UserData.USER_PASSWORD);
        new WelcomePage(driver).verifyLog("Welcome back");
        Assert.assertTrue(isElementPresent(By.xpath("//*[contains(text(),'Welcome back')]") ));
    }

    @AfterMethod
    public void logOut(){
        new ProfilePage1(driver).logOut();
    }
}
