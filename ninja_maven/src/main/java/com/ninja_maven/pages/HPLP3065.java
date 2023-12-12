package com.ninja_maven.pages;

import com.ninja_maven.utility.Utility;
import org.openqa.selenium.By;

public class HPLP3065 extends Utility {
//2.5 Verify the Text "HP LP3065"
    By verifyText = By.xpath("//div[@id='content']/div/div[2]/h1");
    public String getWelcomeText() {
        return getTextFromElement(verifyText);
    }
    // 2.6 Select Delivery Date "2022-11-30"
    By clearTheDate = By.xpath("//div[@id='content']/div/div[2]/div[2]/div[1]/div/input");
    public void deliveryTheDate() {
        clearTextField(clearTheDate);
        sendTextToElement(clearTheDate,"2022-11-30");
    }
  //  2.7.Enter Qty "1” using Select class.
  By quantity=By.id("input-quantity");
    public void selectQuantity(){
        clearTextField(quantity);
       sendTextToElement(quantity,"1");
    }
   // 2.8 Click on “Add to Cart” button
    By addToCart = By.id("button-cart");
    public void addToCartTo(){
        clickOnElement(addToCart);
    }
   // 2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
    By verifyMessege1 = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    public String verifySuccessMessageForAddedProduct(){
        return getTextFromElement(verifyMessege1);
    }
   // 2.10 Click on link “shopping cart” display into success message
    By shoppingCartLink = By.xpath("//ul[@class='list-inline']/li[4]/a");
    public void clickOnShoppingCartLinkIntoSuccessMessage() {
        clickOnElement(shoppingCartLink);
    }
}
