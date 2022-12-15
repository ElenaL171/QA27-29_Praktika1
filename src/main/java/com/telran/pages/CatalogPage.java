package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends BasePage {
    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[contains(text(),'Add to basket')]")
    WebElement addBtn;

    public CatalogPage clickAddToBasket(){
        click(addBtn);
        return this;
    }

    @FindBy(xpath = "//*[contains(text(),'View basket')]")
    WebElement viewBtn;

    public BasketPage clickToViewBasket(){
        click(viewBtn);
        return new BasketPage(driver);
    }

}
