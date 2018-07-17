package test;

import net.phptravels.page.FirstHomePage;
import net.phptravels.page.HotelPage;
import net.phptravels.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class TestSite {

    WebDriver driver;
    String url = ConfigurationReader.getProperty("url");

    @BeforeClass
    public void setup() {
        driver = Driver.getDriver();
        driver.get(url);
    }

    @Test
    public void test() {
        FirstHomePage fHome = new FirstHomePage();

        String expectedTitle = ConfigurationReader.getProperty("title");
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Title didn't match to out expected one");

        fHome.hotelBtn.click();

        String expectedHotelsTitle = ConfigurationReader.getProperty("hotelsTitle");
        String actualHotelsTitle = driver.getTitle();

        Assert.assertEquals(actualHotelsTitle, expectedHotelsTitle, "Title didn't match to out expected one");

        HotelPage hp = new HotelPage();
        hp.threeStar.click();

//        Actions action = new Actions(driver);
//        action.dragAndDrop(hp.scale, hp.scale1).perform();
//        action.clickAndHold(hp.scale).moveToElement(hp.scale1).build().perform();

        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(hp.scale, -118, 0).build();
        action.perform();


//        fHome.myAccountBtn.click();
//        fHome.loginBtn.click();
//
//        LoginPage logPage = new LoginPage();
//        logPage.username.sendKeys(ConfigurationReader.getProperty("username"));
//        logPage.password.sendKeys(ConfigurationReader.getProperty("password"));
//        logPage.login.click();
    }
}
