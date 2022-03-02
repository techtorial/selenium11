package com.test.etsy.pages;

import com.test.etsy.EtsyTestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EtsyMainPage {

    public EtsyMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "global-enhancements-search-query")
    WebElement searchBox;

    @FindBy(xpath = "//li//h3")
    List<WebElement> allheaders;


    public void searchItem(String searchItem){
        searchBox.sendKeys(searchItem, Keys.ENTER);
    }
    public boolean validateHeader(){

        for(WebElement header:allheaders){
            String headr=header.getText().trim().toLowerCase();
            if(!(headr.contains("iphone") ||headr.contains("13") ||headr.contains("case"))){
                return false;
            }
        }
        return true;
    }
}
