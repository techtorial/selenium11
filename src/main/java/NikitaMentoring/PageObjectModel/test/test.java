package NikitaMentoring.PageObjectModel.test;

import NikitaMentoring.PageObjectModel.pages.homePage;
import NikitaMentoring.PageObjectModel.pages.optionsHeader.collectionPage;
import NikitaMentoring.PageObjectModel.pages.optionsHeader.visitPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class test {

    public void scrollToElement(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nga.gov/");

        homePage homePage = new homePage(driver);

        homePage.choseOptionMenu("collection");
        Thread.sleep(5000);

        collectionPage collectionPage = new collectionPage(driver);
        scrollToElement(driver,collectionPage.highlights.get(0));

        homePage.choseOptionMenu("visit");

        visitPage visitPage = new visitPage(driver);
        scrollToElement(driver,visitPage.promoContent.get(0));









    }
}
