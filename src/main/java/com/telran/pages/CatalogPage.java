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

    public CatalogPage click(){
        click(addBtn);
        return this;
    }

    @FindBy(xpath = "//*[contains(text(),'View basket')]")
    WebElement viewBtn;

    public BasketPage click1(){
        click(viewBtn);
        return new BasketPage(driver);
    }
    @FindBy(xpath = "//*[contains(text(),'Proceed to checkout')]")
    WebElement checkout;

    public FormPage click2(){
        click(checkout);
        return new FormPage(driver);
    }




}
