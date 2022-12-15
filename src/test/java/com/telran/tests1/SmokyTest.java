package com.telran.tests1;

import com.telran.data.UserData;
import com.telran.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokyTest extends TestBase1 {

    @BeforeMethod
    public void ensurePrecondition() {
        new HomePage(driver).selectLang();
        new HomePage(driver).clickLoginBtn();
        new LoginPage1(driver).login(UserData.USER_EMAIL, UserData.USER_PASSWORD);
    }

    @Test
    public void Smoky() {
        new WelcomePage(driver).clickAllProducts();
        new CatalogPage(driver).clickAddToBasket().clickToViewBasket();
        new BasketPage(driver).clickProceedToCheckout();
        new FormPage(driver).fillForm(UserData.USER_FIRSTNAME, UserData.USER_LASTNAME,
                UserData.USER_FIRSTLINEOFADDRESS, UserData.USER_CITY, UserData.USER_POSTCODE);
        new PayPage(driver).click();
        new OrderPage(driver).click().verifyOrder("Your order has been placed");
        Assert.assertTrue(isElementPresent(By.xpath("//*[contains(text(),'Your order has been placed')]") ));
    }
}
