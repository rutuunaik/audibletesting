package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ResourceBundle;

public class ValidCredentails {

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"t-container\"]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/input")
    WebElement username;
    @FindBy(xpath = "//*[@id=\"t-container\"]/div/div/div[1]/div[1]/div[3]/div[1]/div[1]/input")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"t-container\"]/div/div/div[1]/div[1]/button/div")
    WebElement button;
    public ValidCredentails(WebDriver driver){
        this.driver=driver;
    }

    public void enterValidCredential()  {

        ResourceBundle r1 = ResourceBundle.getBundle("config");
        String user= r1.getString("username_email_1");
        String pass = r1.getString("user_password_1");

        username.sendKeys(user);
        password.sendKeys(pass);
        button.click();

    }
}
