package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage1 extends BasePage {
    public LoginPage1(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "id_registration-email")
    WebElement userName_r;

    @FindBy(id = "id_registration-password1")
    WebElement password_r;

    @FindBy(id = "id_registration-password2")
    WebElement password_r1;

    @FindBy (name = "registration_submit")
    WebElement registrationBtn;

    public ProfilePage1 registration(String name, String pass) {
        type(userName_r, name);
        type(password_r, pass);
        type(password_r1, pass);
        click(registrationBtn);
        return new ProfilePage1(driver);
    }

    @FindBy(id = "id_login-username")
    WebElement userName;

    @FindBy(id = "id_login-password")
    WebElement password;

    @FindBy (name = "login_submit")
    WebElement loginBtn;

    public ProfilePage1 login(String name, String pass) {
        type(userName, name);
        type(password, pass);
        click(loginBtn);
        return new ProfilePage1(driver);
    }


}
