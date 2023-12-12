package com.ninja_maven.testbase;


import com.ninja_maven.propertyreader.PropertyReader;

import com.ninja_maven.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod (alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
      //closeBrowser();
    }


}
