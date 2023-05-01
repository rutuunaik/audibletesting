package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Hello world!
 *
 */
public class Profile {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"common-header-root\"]/div/nav/div/div/div[2]/ul/li[3]/a/i")
    WebElement profileclick;

    public Profile(WebDriver driver){
        this.driver=driver;
    }


    public void testProfile() throws InterruptedException {
        profileclick.click();
        Thread.sleep(2000);

    }


}
