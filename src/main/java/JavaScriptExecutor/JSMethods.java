package JavaScriptExecutor;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JSMethods {
    //whenever normal methods are not working then last decision should javaScript.
    @Test
    public void TitleMethod(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle()+"from driver");
//        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
//        String title= javascriptExecutor.executeScript("return document.title").toString();
       // System.out.println(title+"from javaScript");
        String actualTitle=BrowserUtils.GetTitleWithJS(driver);
        String expectedTitle="Home Page - Techtorial";
        Assert.assertEquals(actualTitle,expectedTitle);

        }
        @Test//I use this method often.
    public void ClickWithJS(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        WebElement browserCourse=driver.findElement(By.xpath("//a[.='Browse Course']"));
//        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
//       javascriptExecutor.executeScript("arguments[0].click()",browserCourse);
            BrowserUtils.ClickWithJS(driver,browserCourse);
        }
        @Test
    public void ClickWIthJSPractice(){
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("http://www.techtorialacademy.com/");
       driver.manage().window().maximize();
       WebElement studentLogin=driver.findElement(By.xpath("//div[@class='navigation hidden-xs']//a[.='Student login']"));
       BrowserUtils.ClickWithJS(driver,studentLogin);
        }
    }


