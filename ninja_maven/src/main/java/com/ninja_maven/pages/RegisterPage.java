package com.ninja_maven.pages;

import com.ninja_maven.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerAccount = By.xpath("//div[@id='account-register']/div[1]/div[1]/h1");
    public String verifyRegisterAccountText() {
        return getTextFromElement(registerAccount);
    }
    // * 2.3	Verify the text “Returning Customer”.
    By returningCustomerText = By.xpath("//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/h2");
    public String verifyTextReturningCustomerOnLoginPage() {
        return getTextFromElement(returningCustomerText);
    }
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephoneNumber = By.id("input-telephone");
    By passwordField = By.id("input-password");
    By confirmPasswordField = By.id("input-confirm");

    public void registerDetails(){
        sendTextToElement(firstName,"Kinja");
        sendTextToElement(lastName,"shah");
        sendTextToElement(email,"kinja1534@yahoo.com");
        sendTextToElement(telephoneNumber,"258964785");
        sendTextToElement(passwordField,"123456");
        sendTextToElement(confirmPasswordField,"123456");
    }
    //    3.9 Select Subscribe Yes radio button
    By clickOnRadio = By.xpath("//div[@id='content']/form/fieldset[3]/div/div/label[1]/input");
    public void clickOnRadioButton(){
        clickOnElement(clickOnRadio);
    }
    //    3.10 Click on Privacy Policy check box
    By clickOnPrivacy = By.xpath("//div[@class='buttons']/div/input[1]");
    public void clickOnPrivacyPolicy(){
        clickOnElement(clickOnPrivacy);
    }
    //    3.11 Click on Continue button
    By clickOnCntinue = By.xpath("//div[@class='buttons']/div/input[2]");
    public void clickOnContinueButton(){
        clickOnElement(clickOnCntinue);
    }

}
