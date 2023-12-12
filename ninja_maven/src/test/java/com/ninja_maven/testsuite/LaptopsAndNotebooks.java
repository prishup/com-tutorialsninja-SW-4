package com.ninja_maven.testsuite;

import com.ninja_maven.pages.*;
import com.ninja_maven.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNotebooks extends TestBase {
    HomePage homePage= new HomePage();
    LaptopsandNotebooksPage laptopsandNotebooksPage = new LaptopsandNotebooksPage();
    MacBookPage macBookPage= new MacBookPage();
    ShoppingCartPage shoppingCart= new ShoppingCartPage();
    CheckoutPage checkoutPage= new CheckoutPage();
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){
//        1.1 Mouse hover on Laptops & Notebooks Tab.and click
//        1.2 Click on “Show All Laptops & Notebooks”
        homePage.clickonlaptopsandnotebooks();

//        1.3 Select Sort By "Price (High > Low)"
       laptopsandNotebooksPage.selectPrice();

//        1.4 Verify the Product price will arrange in High to Low order.
    }
    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
//        2.1 Mouse hover on Laptops & Notebooks Tab and click
//        2.2 Click on “Show All Laptops & Notebooks”
        homePage.clickonlaptopsandnotebooks();

//        2.3 Select Sort By "Price (High > Low)"
        laptopsandNotebooksPage.selectPrice();

//        2.4 Select Product “MacBook”
        laptopsandNotebooksPage.clickMacbook();

//        2.5 Verify the text “MacBook”
       String actualText9 =  macBookPage.verifyTheTextMacBook();
       String expectedText9 = "MacBook";
        Assert.assertEquals(actualText9,expectedText9);

//        2.6 Click on ‘Add To Cart’ button
        Thread.sleep(1000);
        macBookPage.clickOnAddToCart();

//        2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        Thread.sleep(1000);
      String actualText11=  macBookPage.verifySuccessMessageForAddingProductToShoppingCart();
        System.out.println(actualText11);
      String exprctedText11 = "Success: You have added MacBook to your shopping cart!\n" +
              "×";
      Assert.assertEquals(actualText11,exprctedText11);

//        2.8 Click on link “shopping cart” display into success message
        Thread.sleep(1000);
        macBookPage.clickOnLinkToShoppingCartMessage();

//        2.9 Verify the text "Shopping Cart"
        Thread.sleep(1000);
        String actualText12 = shoppingCart.verifyTextForShoppingCart();
        String expectedText12= "Shopping Cart";
        Assert.assertEquals(actualText12,expectedText12);

//        2.10 Verify the Product name "MacBook"
        Thread.sleep(1000);
      String actualResult15= shoppingCart.verifyProductNameIsMacBook();
      String expectedResult15 = "MacBook";
      Assert.assertEquals(actualResult15,expectedResult15);

//        2.11 Change Quantity "2"
        shoppingCart.changeQuantity();

//        2.12 Click on “Update” Tab
        shoppingCart.clickOnCart();

//        2.13 Verify the message “Success: You have modified your shopping cart!”
        Thread.sleep(1000);
       String actualText13 = shoppingCart.modifiedMesaage();
        System.out.println(actualText13);
       String expectedText13 ="Success: You have modified your shopping cart!\n" +
               "×";
       Assert.assertEquals(actualText13,expectedText13);

//        2.14 Verify the Total £737.45
        Thread.sleep(1000);
        String actualText14 = shoppingCart.verifyingTotal();
        System.out.println(actualText13);
        String expectedText14 ="$1,204.00";
        Assert.assertEquals(actualText14,expectedText14);

//        2.15 Click on “Checkout” button
        Thread.sleep(1000);
        shoppingCart.clickOnCheckoutButton();

//        2.16 Verify the text “Checkout”
        Thread.sleep(1000);
        String actualText16 = checkoutPage.verifyCheckOutText();
        System.out.println(actualText13);
        String expectedText16 ="Checkout";
        Assert.assertEquals(actualText16,expectedText16);

//        2.17 Verify the Text “New Customer”
        checkoutPage.verifyTextNewCustomer();

//        2.18 Click on “Guest Checkout” radio button
        checkoutPage.clickingRadioButton();

//        2.19 Click on “Continue” tab
        checkoutPage.clickingContinue();

//        2.20 Fill the mandatory fields
        Thread.sleep(1000);
        checkoutPage.enterMandatoryField();

//        2.21 Click on “Continue” Button
        checkoutPage.clickOnButton();

//        2.22 Add Comments About your order into text area
        Thread.sleep(1000);
        checkoutPage.comment();

//        2.23 Check the Terms & Conditions check box
        checkoutPage.clickBoxOnTermsAndCondition();

//        2.24 Click on “Continue” button
        Thread.sleep(1000);
        checkoutPage.clickOnContinueButtonForPaymentMethod();

//        2.25 Verify the message “Warning: Payment method required!”
    }
}
