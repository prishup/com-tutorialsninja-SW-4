package com.ninja_maven.testsuite;

import com.ninja_maven.pages.HomePage;
import com.ninja_maven.pages.LoginPage;
import com.ninja_maven.pages.MyAccountPage;
import com.ninja_maven.pages.RegisterPage;
import com.ninja_maven.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccounts extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    LoginPage loginPage= new LoginPage();
    //1.1 create method with name "selectMyAccountOptions" it has one parameter name option" of type string.

//1.2 This method should click on the options whatever name is passed as parameter.
// (Hint: Handle List of Element and Select options)

    //    Write the following test
//1. Test name verifyUserShouldNavigateToRegisterPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        //1.1 Click on My Account Link.
        homePage.clickOnAccount();

        // 1.2 Call the method “selectMyAccountOptions” method and pass the parameter Register
        myAccountPage.setRegister();

        // 1.3 Verify the text “Register Account”.
        Thread.sleep(1000);
        String actualText16 = registerPage.verifyRegisterAccountText();
        System.out.println(actualText16);
        String expectedText16 = "Register Account";
        Assert.assertEquals(actualText16, expectedText16);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
//        2.1 Click on My Account Link.
        homePage.clickOnAccount();

//        2.2 Call the method “selectMyAccountOptions” method and pass the parameter Login
        Thread.sleep(1000);
        myAccountPage.setLogin();


//        2.3 Verify the text “Returning Customer”.
        Thread.sleep(1000);
        String actualText17 = registerPage.verifyTextReturningCustomerOnLoginPage();
        System.out.println(actualText17);
        String expectedText17 = "Returning Customer";
        Assert.assertEquals(actualText17, expectedText17);
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
//    3.1 Clickr on My Account Link.
        homePage.clickOnAccount();

//    3.2 Call the method “selectMyAccountOptions” method and pass the parameter Register
        myAccountPage.setRegister();

//    3.3 Enter First Name
//   3.4 Enter Last Name
//    3.5 Enter Email
//    3.6 Enter Telephone
//    3.7 Enter Password
//    3.8 Enter Password Confirm
        registerPage.registerDetails();

//    3.9 Select Subscribe Yes radio button
        registerPage.clickOnRadioButton();

//    3.10 Click on Privacy Policy check box
        registerPage.clickOnPrivacyPolicy();

//    3.11 Click on Continue button
        registerPage.clickOnContinueButton();

//    3.12 Verify the message “Your Account Has Been Created!”
        Thread.sleep(1000);
       String actualText17= myAccountPage.verifyAccountRegisteredMessage();
        System.out.println(actualText17);
       String expectedResult17 = "Your Account Has Been Created!";
       Assert.assertEquals(actualText17, expectedResult17);

//    3.13 Click on Continue button
        myAccountPage.clickOnContinueButton();

//    3.14 Click on My Account Link.
        homePage.clickOnAccount();

//    3.15 Call the method “selectMyAccountOptions” method and pass the parameter Logout
        myAccountPage.setLogout();

//    3.16 Verify the text “Account Logout”
//    3.17 Click on Continue button
        myAccountPage.clickOnContinue1();
    }
@Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
//    4.1 Click on My Account Link.
    homePage.clickOnAccount();

//    4.2 Call the method “selectMyAccountOptions” method and pass the parameter login
    Thread.sleep(1000);
    myAccountPage.setLogin();

//    4.3 Enter Email address
//    4.5 Enter Password
    loginPage.loginDetails();

//    4.6 Click on Login button
    loginPage.loginButton();

//    4.7 Verify text “My Account”
//    4.8 Click on My Account Link.
    homePage.clickOnAccount();

//    4.9 Call the method “selectMyAccountOptions” method and pass the parameter logout
    myAccountPage.setLogout();

//    4.10 Verify the text “Account Logout”
//    4.11 Click on Continue button
    myAccountPage.clickOnContinue1();
}

}
