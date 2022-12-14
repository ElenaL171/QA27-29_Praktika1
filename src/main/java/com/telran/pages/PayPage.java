package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayPage extends BasePage {
    public PayPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(text(),'Continue')]")
    WebElement contBtn;

    public OrderPage click() {
        click(contBtn);
        return new OrderPage(driver);
    }
}
