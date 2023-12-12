package com.ninja_maven.pages;

import com.ninja_maven.utility.Utility;
import org.openqa.selenium.By;

public class MacBookPage extends Utility {
    By checkTextMacBook = By.xpath("//div[@id='content']/div/div[2]/h1");
    public String verifyTheTextMacBook() {
        return getTextFromElement(checkTextMacBook);
    }
    // * 2.6	Click on ‘Add To Cart’ button
    By addToCart = By.xpath("//button[@id='button-cart']");
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }
  //  2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
  By successMessageForAddingProduct = By.xpath("//div[@id='product-product']/div[1]");

    public String verifySuccessMessageForAddingProductToShoppingCart() {
        return getTextFromElement(successMessageForAddingProduct);
    }
    // * 2.8	Click on link “shopping cart” display into success message
    By linkToShoppingCartInsideMessage = By.xpath("//ul[@class='list-inline']/li[4]/a");
    public void clickOnLinkToShoppingCartMessage() {
        clickOnElement(linkToShoppingCartInsideMessage);
    }


}
