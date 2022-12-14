package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage{
    public HomePage (WebDriver driver) {
        super(driver);
    }

    @FindBy (className = "form-control")
    WebElement langBtn;

    @FindBy(xpath ="//*[contains(text(),'British')]")
    WebElement engBtn;

    @FindBy(xpath ="//*[contains(text(),'Go')]")
    WebElement go;

    public HomePage click2(){
        click(langBtn);
        click(engBtn);
        click(go);

        return this;
    }
    @FindBy (xpath = "//*[contains(text(),'Login')]")
    WebElement logInButton;

    public LoginPage1 click(){
        click(logInButton);
        return new LoginPage1(driver);
    }

    @FindBy(css = ".alert.alert-danger")
    WebElement warning;

    public HomePage isWarningPresent(){
        String message = "Warning";
        String message2 = "Warning2";
        boolean isEqual = warning.equals(message)|| warning.equals(message2);
        Assert.assertTrue(isEqual, "The text" + warning + "is" + message2);
        return this;
    }
}
