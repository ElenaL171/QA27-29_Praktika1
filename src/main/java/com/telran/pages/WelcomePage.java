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

        public CatalogPage click(){
            click(allLink);
            return new CatalogPage(driver);

    }
}
