package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage {
    public OrderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Place order')]")
    WebElement placeBtn;

    public ConfirmPage click() {
        click(placeBtn);
        return new ConfirmPage(driver);
    }
}
