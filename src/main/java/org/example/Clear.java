package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Clear {
    WebDriver driver;
    @FindBy(xpath ="//*[@id=\"t-container\"]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/input" )
    WebElement clearUsername;
    @FindBy(xpath = "//*[@id=\"t-container\"]/div/div/div[1]/div[1]/div[3]/div[1]/div[1]/input")
    WebElement clearPassword;

    public Clear(WebDriver driver){
        this.driver=driver;

    }

    public void clearFields() throws InterruptedException {
         String ue = Keys.chord(Keys.CONTROL, "a");
        clearUsername.sendKeys(ue);
        clearUsername.sendKeys(Keys.DELETE);
        Thread.sleep(1000);

        String up = Keys.chord(Keys.CONTROL, "a");
        clearPassword.sendKeys(up);
        clearPassword.sendKeys(Keys.DELETE);
        Thread.sleep(1000);
    }
}
