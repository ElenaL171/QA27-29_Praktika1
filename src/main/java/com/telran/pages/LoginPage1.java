package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage1 extends BasePage {
    public LoginPage1(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "id_login-username")
    WebElement userName;

    @FindBy(id = "id_login-password")
    WebElement password;

    @FindBy (xpath = "//*[contains(text(),'Login')]")
    WebElement loginBtn;

    public ProfilePage1 login(String name, String pass) {
        type(userName, name);
        type(password, pass);
        click(loginBtn);
        return new ProfilePage1(driver);
    }
    public LoginPage1 loginNegative(String name, String pass) {
        type(userName, name);
        type(password, pass);
        click(loginBtn);
        return this;
    }
}
