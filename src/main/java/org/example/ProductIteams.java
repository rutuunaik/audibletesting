package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductIteams {

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"product-product-list-root\"]/div/div[4]/div[2]/div[1]/div[1]/div/div[1]/ul/li/a/div/picture/img")
    WebElement iteam;

    public  ProductIteams(WebDriver driver){
        this.driver=driver;

    }

    public  void selectItem(){

        iteam.click();

    }
}
