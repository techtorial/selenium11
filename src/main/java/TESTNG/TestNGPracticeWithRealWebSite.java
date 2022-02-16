package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestNGPracticeWithRealWebSite {

    @Test//I am testing the website is correct or not
    public void validateWebsite(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        String actualWebsite=driver.getCurrentUrl();
        String expectedWebsite="https://demo.opencart.com/admin/";
        Assert.assertEquals(actualWebsite,expectedWebsite);
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }

    @Test
    public void validateCatalogisDisplayed(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar=driver.findElement(By.id("menu-catalog"));
        boolean ActualCatalog= catalogBar.isDisplayed();
        boolean ExpectedCatalog=true;
        Assert.assertEquals(ActualCatalog,ExpectedCatalog,"Catalog is not there");
        catalogBar.click();
    }

    @Test
    public void validateProductsIsDisplayed(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar=driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        WebElement productBar= driver.findElement(By.xpath("//a[.='Products']"));
        boolean ActualProductBar=productBar.isDisplayed();
        boolean ExpectedProductBar=true;
        Assert.assertEquals(ActualProductBar,ExpectedProductBar);
        productBar.click();
    }
    @Test
    public void validationOfBoxes() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar=driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        WebElement productBar= driver.findElement(By.xpath("//a[.='Products']"));
        Thread.sleep(1000);
        productBar.click();
        List<WebElement> boxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(int i = 1;i<boxes.size();i++){
            Thread.sleep(500);//this for me to see each click
            boxes.get(i).click();
            boolean ActualboxValidation=boxes.get(i).isDisplayed();
            boolean ExpectedboxValidation=true;
            Assert.assertEquals(ActualboxValidation,ExpectedboxValidation);
            boolean ActualBoxValidationIsSelected=boxes.get(i).isSelected();
            boolean ExpectedBoxValidationIsSelected=true;
            Assert.assertEquals(ActualBoxValidationIsSelected,ExpectedBoxValidationIsSelected);
        }
    }
}
