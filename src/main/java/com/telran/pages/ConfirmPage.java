package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmPage extends BasePage{
    public ConfirmPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Oscar')]")
    WebElement logo;

    public WelcomePage click() {
        click(logo);
        return new WelcomePage(driver);
    }
}
