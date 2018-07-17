package net.phptravels.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FirstHomePage {

    public FirstHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//a[@href='javascript:void(0);' and @class='dropdown-toggle go-text-right'])[2]")
    public WebElement myAccountBtn;

    @FindBy (linkText = "Login")
    public WebElement loginBtn;

    @FindBy (xpath = "//a[contains(text(), 'Hotels')]")
    public WebElement hotelBtn;


}
