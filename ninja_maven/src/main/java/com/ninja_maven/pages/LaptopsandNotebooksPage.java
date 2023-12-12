package com.ninja_maven.pages;

import com.ninja_maven.utility.Utility;
import org.openqa.selenium.By;

public class LaptopsandNotebooksPage extends Utility {
    By laptopsandnotebooktext = By.tagName("h2");
    public String actualresult(){
        return getTextFromElement(laptopsandnotebooktext);
    }
//1.3 Select Sort By "Price (High > Low)"
By sortorder1=By.xpath("//select[@id=\"input-sort\"]");
    public void selectPrice(){
        selectByIndexFromDropDown(sortorder1,4);
    }
  //  2.4 Select Product “MacBook”
    By selectMacbook = By.xpath("//div[@id='content']/div[4]/div[4]/div/div[2]/div[1]/h4/a");
    public void clickMacbook(){
      clickOnElement(selectMacbook);
    }

}






