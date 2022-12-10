package com.telran.tests2;

import com.telran.tests1.TestBase1;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTests2 extends TestBase2 {

    @Test
    public void LoginPositiveTest(){
  //      new LoginPage2(driver).login().verifyUserName();
    }
    @AfterMethod
    public void logOut(){
  //      new ProfilePage2(driver).logOut();
    }
}
