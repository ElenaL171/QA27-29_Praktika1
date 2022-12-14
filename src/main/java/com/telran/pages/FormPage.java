package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.Path;

public class FormPage extends BasePage {
    public FormPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "id_first_name")
    WebElement userName;

    @FindBy(id = "id_last_name")
    WebElement userLastName;

    @FindBy(id = "id_line1")
    WebElement id_line1;

    @FindBy(id = "id_line4")
    WebElement userCity;

    @FindBy(id = "id_postcode")
    WebElement userPostcode;

    @FindBy(id = "id_country")
    WebElement userCountry;

    @FindBy(xpath = "//*[contains(text(),'Algeria')]")
    WebElement country;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement contBtn;


    public PayPage fillForm(String name, String lastname, String firstlineofaddress, String city,
                             String postcode) {
            type(userName, name);
            type(userLastName, lastname);
            type(id_line1, firstlineofaddress);
            type(userCity, city);
            type(userPostcode, postcode);
            click(userCountry);
            click(country);
            click(contBtn);
            return new PayPage(driver);
        }
    }

