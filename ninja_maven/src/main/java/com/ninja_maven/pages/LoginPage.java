package com.ninja_maven.pages;


import com.ninja_maven.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");


  public String getWelcomeText(){
      return getTextFromElement(welcomeText);
  }
//  4.3 Enter Email address
By email = By.id("input-email");
//4.5 Enter Password
By passwordField = By.id("input-password");
public void loginDetails(){
      sendTextToElement(email,"kinja1534@yahoo.com");
      sendTextToElement(passwordField,"123456");

  }
    //4.6 Click on Login button
    By clickOnLogin = By.xpath("//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
public void loginButton(){
    clickOnElement(clickOnLogin);
}
//    4.7 Verify text “My Account”

//    4.10 Verify the text “Account Logout”

}
