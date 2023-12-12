package com.ninja_maven.pages;

import com.ninja_maven.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
//    2.11 Verify the text "Shopping Cart"

    By checkTextShoppingCart = By.xpath("//div[@id=\"top-links\"]/ul/li[4]/a");

    public String verifyTextForShoppingCart() {
        return getTextFromElement(checkTextShoppingCart);
    }
    //            2.12 Verify the Product name "HP LP3065"

    //            2.13 Verify the Delivery Date "2022-11-30"
//            2.14 Verify the Model "Product21"
//            2.15 Verify the Todat "£74.73"
//    2.10 Verify the Product name "MacBook"
    By checkNameOfProductMacBook = By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[2]/a");

    public String verifyProductNameIsMacBook() {
        return getTextFromElement(checkNameOfProductMacBook);
    }

    //            2.11 Change Quantity "2"
    By quantity = By.xpath("//div[@class='table-responsive']/table[1]/tbody/tr/td[4]/div[1]/input[1]");

    public void changeQuantity() {
        clearTextField(quantity);
        sendTextToElement(quantity, "2");
    }

    //            2.12 Click on “Update” Tab
    By updateTab = By.xpath("//div[@class='input-group btn-block']/span[1]/button[1]");

    public void clickOnCart() {
        clickOnElement(updateTab);
    }

    //2.13 Verify the message “Success: You have modified your shopping cart!”
    By verifyMessageSuccess = By.xpath("//div[@id='checkout-cart']/div[1]");

    public String modifiedMesaage() {
        return getTextFromElement(verifyMessageSuccess);
    }

    // 2.14 Verify the Total £737.45
    By verifyTotal = By.xpath("//div[@id='content']/div[2]/div/table/tbody/tr[4]/td[2]");

    public String verifyingTotal() {
        return getTextFromElement(verifyTotal);
    }
//        2.15 Click on “Checkout” button
    By clickOnCheckout = By.xpath("//div[@id='content']/div[3]/div[2]/a");
    public void clickOnCheckoutButton(){
        clickOnElement(clickOnCheckout);
    }


}
