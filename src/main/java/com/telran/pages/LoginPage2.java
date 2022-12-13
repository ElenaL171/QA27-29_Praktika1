package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage2 extends BasePage {
    public LoginPage2 (WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "id_login-username")
    WebElement userName;

    @FindBy(id="id_login-password")
    WebElement password;

    @FindBy (name = "login_submit")
    WebElement loginBtn;

    public CatalogPage login(String name, String pass) {
        type(userName, name);
        type(password, pass);
        click(loginBtn);
        return new CatalogPage(driver);
    }
}
