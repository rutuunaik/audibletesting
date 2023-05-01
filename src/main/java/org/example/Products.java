package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products {

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"common-header-root\"]/div/nav/div/div/div[1]/div/div/ul[1]/li[1]/a/i")
    WebElement product;
    @FindBy(xpath = "//*[@id=\"common-header-root\"]/div/nav/div/div/div[1]/div/div/ul[1]/li[1]/div/div[2]/ul/li[1]/div/div[1]/a/span")
    WebElement items;


    public Products(WebDriver driver){
        this.driver=driver;
    }

    public void selectProduct() throws InterruptedException {

        Thread.sleep(1000);

        product.click();
        items.click();
    }
}
