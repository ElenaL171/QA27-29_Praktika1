package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage1 extends BasePage {

    public ProfilePage1(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[contains(text(),'Logout')]")
    WebElement logOutButton;

    public LoginPage1 logOut() {
        click(logOutButton);
        return new LoginPage1(driver);
    }
}
