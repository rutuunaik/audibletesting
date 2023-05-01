package org.example;

import com.driver.DriverClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {

    WebDriver d= DriverClass.setUpBrowser("chrome","https://www.tcl.com/in/en");

        @Test(priority = 1)
        public void VerifyProfileTest() throws InterruptedException {

            Profile p = PageFactory.initElements(d,Profile.class);
            p.testProfile();
        }
        @Test(priority = 2)
        public void pressLogin(){
            LoginButton lb=  PageFactory.initElements(d, LoginButton.class);
            try{
                lb.pressloginbtn();
            }catch (Exception e){
                System.out.println("Not entered any Credentails ");
            }
        }

        @Test(priority = 3)
        public void enterWrongDetails() {
            InvalidCredentials ic = PageFactory.initElements(d,InvalidCredentials.class);
           try {
               ic.enterInvalidDetails();
           }
           catch (Exception e){
               System.out.println("Wrong details");
           }


        }

        @Test(priority = 4)
        public void clearDetails() throws InterruptedException {
            Clear c = PageFactory.initElements(d, Clear.class);
            c.clearFields();
        }

        @Test(priority = 5)
        public void enterCorrectDetails() throws InterruptedException {
            ValidCredentails vc = PageFactory.initElements(d,ValidCredentails.class);
           try {
               vc.enterValidCredential();

           }catch (Exception e){
               System.out.println("wrong details");
           }

        }
        @Test(priority = 6)
        public void selectProduct() throws InterruptedException {
            Products pd = PageFactory.initElements(d,Products.class);
            try {
                pd.selectProduct();
            }
            catch (Exception e){
                System.out.println("Not able to select the product Dropdown module");
            }
        }
        @Test(priority= 7)
        public void selectIteam(){
            ProductIteams pi = PageFactory.initElements(d,ProductIteams.class);
            try {
                pi.selectItem();
            }
            catch (Exception e){
                System.out.println("Not able to select the product");
            }
        }

        @Test(priority = 8)
        public void pressbtn() throws InterruptedException {
            GoToShop gp = PageFactory.initElements(d, GoToShop.class);
            try {
                gp.btnGoToShop();
            }catch (Exception e){
                System.out.println("Not able to go to the shop");
            }
        }
         @Test(priority = 9)
        public void pressAddToCart(){
            AddToCart ac=  PageFactory.initElements(d, AddToCart.class);
            try {
                ac.btncart();
            }
            catch (Exception e){
                System.out.println("Not able to add the product in to the cart");
            }
         }
}
