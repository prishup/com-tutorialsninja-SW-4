package com.ninja_maven.pages;


import com.ninja_maven.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By desktoplink = By.xpath("//ul[@class='nav navbar-nav']/li[1]/a");
    By showAllDeskTops = By.xpath("//ul[@class='nav navbar-nav']/li[1]/div/a");
    By laptopsandnotebookslinks = By.xpath("//ul[@class='nav navbar-nav']/li[2]/a");
    By showAlllaptopsandnotebooks = By.xpath("//ul[@class=\"nav navbar-nav\"]/li[2]/div/a");
    By  components = By.xpath("//ul[@class='nav navbar-nav']/li[3]/a");
    By showAllComonents = By.xpath("//ul[@class=\"nav navbar-nav\"]/li[3]/div/a");

    public void clickOnDesktopclick() {
        mouseHoverToElementAndClick(desktoplink);
        clickOnElement(showAllDeskTops);
    }
//    2.1 Mouse hover on “Laptops & Notebooks” Tab and click
    public void clickonlaptopsandnotebooks(){
        mouseHoverToElementAndClick(laptopsandnotebookslinks);
        clickOnElement(showAlllaptopsandnotebooks);
    }
    public void clickOnCoponents(){
        mouseHoverToElementAndClick(components);
        clickOnElement(showAllComonents);
    }
     // 1.1 Click on My Account Link.
    By clickOnAccountButton = By.xpath("//nav[@id='top']/div[1]/div[2]/ul/li[2]");
    public void clickOnAccount(){
        clickOnElement(clickOnAccountButton);
    }

}


