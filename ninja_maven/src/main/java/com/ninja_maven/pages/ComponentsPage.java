package com.ninja_maven.pages;

import com.ninja_maven.utility.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {
    By componentsTest = By.tagName("h2");
    public String cmponentsText(){
        return getTextFromElement(componentsTest);
    }

}
