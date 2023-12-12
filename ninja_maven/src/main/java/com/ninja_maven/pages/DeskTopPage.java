package com.ninja_maven.pages;

import com.ninja_maven.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DeskTopPage extends Utility {
    //    1.3 Verify the text ‘Desktops’
    By desktoptext = By.xpath("//div[@id='content']/h2");

    public String getdesktoptext() {
        return getTextFromElement(desktoptext);
    }

    // 1.3 Select Sort By position "Name: Z to A"
    By sortorder = By.xpath("//select[@id=\"input-sort\"]");

    public void SelectingZtoAFromDropDown() {
        selectByIndexFromDropDown(sortorder, 2);

    }
    public void SelectingAtoZFromDropDown() {
        selectByIndexFromDropDown(sortorder, 1);

    }

//1.4 Verify the Product will arrange in Descending order.
    By descendingorder = By.xpath("//div[@id=\"content\"]/div[4]/div");

    // Extract product names and store them in a list
    public void descendingorderofdesktops(){
        List<WebElement> productElements = driver.findElements(descendingorder);
        List<String> productNames = new ArrayList<>();
        for (WebElement productElement : productElements) {
        }
        // Check if product names are in alphabetical order
        boolean isAlphabeticalOrder = true;
        for (int i = 1; i < productNames.size(); i++) {
            if (productNames.get(i - 1).compareToIgnoreCase(productNames.get(i)) > 0) {
                isAlphabeticalOrder = false;
                break;
            }
        }
        if (isAlphabeticalOrder) {
            System.out.println("Products are arranged in alphabetical order A-Z. ");
        } else {
            System.out.println("Products are arranged in alphabetical order Z-A.");
        }}
//    2.4 Select product “HP LP3065”
    By product = By.xpath("//div[@id='content']/div[4]/div[3]/div/div[2]/div[1]/h4/a");
    public void clickOnHPLP3065Product(){
        clickOnElement(product);
    }

//      2.5 Verify the Text "HP LP3065"

//       2.6 Select Delivery Date "2022-11-30"
//        2.7.Enter Qty "1” using Select class.
//
//        2.8 Click on “Add to Cart” button

}


