package NikitaMentoring.PageObjectModel.pages.optionsHeader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class collectionPage {

    public collectionPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//h3[@class=\"promo-heading\"]")
    public List<WebElement> highlights;
}
