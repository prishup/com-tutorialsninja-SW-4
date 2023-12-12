package com.ninja_maven.pages;

import com.ninja_maven.utility.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    //        2.16 Verify the text “Checkout”
    By checkOutText = By.xpath("//div[@id='content']/h1");
    public String verifyCheckOutText() {
        return getTextFromElement(checkOutText);
    }

//        2.17 Verify the Text “New Customer”
By checkNewCustomerText = By.xpath("//div[@id=\"content\"]/div/div[1]/div[2]/div/div/div[1]/h2");

    public String verifyTextNewCustomer() {
        return getTextFromElement(checkNewCustomerText);
    }
//        2.18 Click on “Guest Checkout” radio button
    By clickOnRadio = By.xpath("//div[@id='content']/div/div[1]/div[2]/div/div/div[1]/div[2]/label/input");
    public void clickingRadioButton(){
        clickOnElement(clickOnRadio);
    }
//        2.19 Click on “Continue” tab
By clickOnContinue = By.xpath("//input[@id='button-account']");
    public void clickingContinue(){
        clickOnElement(clickOnContinue);
    }
//        2.20 Fill the mandatory fields
By firstName = By.id("input-payment-firstname");
    By lastName = By.id("input-payment-lastname");
    By email = By.id("input-payment-email");
    By telephone = By.id("input-payment-telephone");
    By addressField = By.id("input-payment-address-1");
    By cityName = By.id("input-payment-city");
    By zipCode = By.name("postcode");
    By countryName = By.id("input-payment-country");
    By zoneName = By.id("input-payment-zone");

    public void enterMandatoryField() throws InterruptedException {
        sendTextToElement(firstName,"Kinjal");
        sendTextToElement(lastName,"shah");
        sendTextToElement(email,"kin@yahoo.com");
        sendTextToElement(telephone,"07845129638");
        sendTextToElement(addressField,"bremer");
        sendTextToElement(cityName,"London");
        sendTextToElement(zipCode,"ha01rf");
        selectByIndexFromDropDown(countryName,18);
        Thread.sleep(1000);
        selectByIndexFromDropDown(zoneName,10);

    }
//        2.21 Click on “Continue” Button
    By clickOnButton = By.xpath("//input[@id=\"button-guest\"]");
    public void clickOnButton(){
        clickOnElement(clickOnButton);
    }

//        2.22 Add Comments About your order into text area
    By addComments = By.xpath("//div[@id='content']/div/div[3]/div[2]/div[1]/p[2]/textarea");
    public void comment(){
        sendTextToElement(addComments,"Pack nicely");
    }


//        2.23 Check the Terms & Conditions check box
    By termsAndCondition = By.xpath("//div[@id='content']/div/div[3]/div[2]/div/div[2]/div/input[1]");
    public void clickBoxOnTermsAndCondition(){
        clickOnElement(termsAndCondition);
    }
//        2.24 Click on “Continue” button
By continueButtonForPayment = By.xpath("//input[@id='button-payment-method']");
    public void clickOnContinueButtonForPaymentMethod() {
        clickOnElement(continueButtonForPayment);
    }
//        2.25 Verify the message “Warning: Payment method required!”
}
