package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {
    public WelcomePage(WebDriver driver) {
        super(driver);
    }

        @FindBy (xpath = "//*[contains(text(),'All')]")
        WebElement allLink;

        public CatalogPage clickAllProducts(){
            click(allLink);
            return new CatalogPage(driver);

    }

    @FindBy(xpath = "//*[contains(text(),'Thanks for registering!')]")
    WebElement messageR;

    public WelcomePage verifyReg(String s) {
            messageR.getText().equalsIgnoreCase(s);
            return this;
    }

    @FindBy(xpath = "//*[contains(text(),'Welcome back')]")
    WebElement messageL;

    public WelcomePage verifyLog(String s) {
        messageL.getText().equalsIgnoreCase(s);
        return this;
    }
}
