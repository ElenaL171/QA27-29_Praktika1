package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{
    public BasketPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//*[contains(text(),'Proceed to checkout')]")
    WebElement checkout;

    public FormPage click(){
        click(checkout);
        return new FormPage(driver);
    }


}
