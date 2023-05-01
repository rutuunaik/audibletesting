package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class GoToShop {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"container-08da6ad5da\"]/div[2]/div/div[2]/div[2]/div[5]/a")
    WebElement button;

     public GoToShop(WebDriver driver){
         this.driver=driver;
     }

     public void btnGoToShop() throws InterruptedException {
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,250)", "");
         String c = Keys.chord(Keys.CONTROL,Keys.ENTER);

         button.sendKeys(c);
         ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
         driver.switchTo().window(newTb.get(1));
         Thread.sleep(3000);


     }
}
