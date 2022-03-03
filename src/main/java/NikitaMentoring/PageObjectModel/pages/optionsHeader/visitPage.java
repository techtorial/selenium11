package NikitaMentoring.PageObjectModel.pages.optionsHeader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class visitPage {

    public visitPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//div[@class=\"promo-content promo-parallel\"]")
    public List<WebElement> promoContent;
}
