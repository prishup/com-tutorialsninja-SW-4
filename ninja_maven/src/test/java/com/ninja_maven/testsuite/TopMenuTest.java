package com.ninja_maven.testsuite;

import com.ninja_maven.pages.ComponentsPage;
import com.ninja_maven.pages.DeskTopPage;
import com.ninja_maven.pages.HomePage;
import com.ninja_maven.pages.LaptopsandNotebooksPage;
import com.ninja_maven.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homepage = new HomePage();
    DeskTopPage deskTopPage = new DeskTopPage();
    LaptopsandNotebooksPage laptopsandNotebooksPage = new LaptopsandNotebooksPage();
    ComponentsPage componentsPage = new ComponentsPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homepage.clickOnDesktopclick();
        // 1.3 Verify the text ‘Desktops’
        String actualResult = deskTopPage.getdesktoptext();
        String expectedTesult = "Desktops";
        Assert.assertEquals(actualResult, expectedTesult);
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {

//       2.1 Mouse hover on “Laptops & Notebooks” Tab and click
//       2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homepage.clickonlaptopsandnotebooks();
//       2.3 Verify the text ‘Laptops & Notebooks’
        String actualResult1 = laptopsandNotebooksPage.actualresult();
        String expectedResult1 = "Laptops & Notebooks";
        Assert.assertEquals(actualResult1, expectedResult1);
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
//       3.1 Mouse hover on “Components” Tab and click
//       3.2 call selectMenu method and pass the menu = “Show All Components”
        homepage.clickOnCoponents();
//       3.3 Verify the text ‘Components’
        String actualReslt3 = componentsPage.cmponentsText();
        String expectedResult3 = "Components";
        Assert.assertEquals(actualReslt3, expectedResult3);
    }
}
