package com.ninja_maven.testsuite;

import com.ninja_maven.pages.DeskTopPage;
import com.ninja_maven.pages.HPLP3065;
import com.ninja_maven.pages.HomePage;
import com.ninja_maven.pages.ShoppingCartPage;
import com.ninja_maven.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeskTopTest extends TestBase {
    HomePage homePage = new HomePage();
    DeskTopPage deskTopPage= new DeskTopPage();
    HPLP3065 hplp3065 = new HPLP3065();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();
    @Test

public void verifyProductArrangeInAlphaBaticalOrder(){
        // 1.1 Mouse hover on Desktops Tab.and click
        // 1.2 Click on “Show All Desktops”
       homePage.clickOnDesktopclick();

       // 1.3 Select Sort By position "Name: Z to A"
     deskTopPage.SelectingZtoAFromDropDown();
     deskTopPage.descendingorderofdesktops();

     // 1.4 Verify the Product will arrange in Descending order.
}
@Test
public void verifyProductAddedToShoppingCartSuccessFully(){
//    2.1 Mouse hover on Desktops Tab. and click

//    2.2 Click on “Show All Desktops”
    homePage.clickOnDesktopclick();

//    2.3 Select Sort By position "Name: A to Z"
    deskTopPage.SelectingAtoZFromDropDown();

//    2.4 Select product “HP LP3065”
    deskTopPage.clickOnHPLP3065Product();

//    2.5 Verify the Text "HP LP3065"
    String actualResult5= hplp3065.getWelcomeText();
    String expectedResult5 = "HP LP3065";
    Assert.assertEquals(actualResult5,expectedResult5);

//    2.6 Select Delivery Date "2022-11-30"
    hplp3065.deliveryTheDate();

//    2.7.Enter Qty "1” using Select class.
    hplp3065.selectQuantity();

//    2.8 Click on “Add to Cart” button
 hplp3065.addToCartTo();

//    2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
String actalResult6 = hplp3065.verifySuccessMessageForAddedProduct();
    System.out.println(actalResult6);
String expectedResult6 ="Success: You have added HP LP3065 to your shopping cart!\n" +
        "×";
Assert.assertEquals(actalResult6,expectedResult6);

//    2.10 Click on link “shopping cart” display into success message
    hplp3065.clickOnShoppingCartLinkIntoSuccessMessage();

//    2.11 Verify the text "Shopping Cart"
  String actualText7 = shoppingCart.verifyTextForShoppingCart();
  String expectedText7= "Shopping Cart";
  Assert.assertEquals(actualText7,expectedText7);

}
}
