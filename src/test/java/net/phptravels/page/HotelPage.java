package net.phptravels.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelPage {

    public HotelPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@id='3']/../ins[@class='iCheck-helper']")
    public WebElement threeStar;

    @FindBy (xpath = "//div[@class='slider-handle round' and @style='left: 100%;']")
    public WebElement scale;

    @FindBy (xpath = "//div[@class='slider-handle round' and @style='left: 33.3333%;']")
    public WebElement scale1;
}
