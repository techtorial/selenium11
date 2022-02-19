package JavaScriptExecutor;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
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
        // child unique --> parent --> get started //div[@class='sads']//..
        @Test//***
    public void ScrollIntoView() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        WebElement copyright=driver.findElement(By.xpath("//p[contains(text(),' Copy')]"));

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        BrowserUtils.ScrollWithJS(driver,copyright);
      //  js.executeScript("arguments[0].scrollIntoView(true)",copyright);
            Thread.sleep(4000);
            WebElement studentLogin=driver.findElement(By.xpath("//div[@class='navigation hidden-xs']//a[.='Student login']"));
        BrowserUtils.ScrollWithJS(driver,studentLogin);
            //TASK1;
            //1)Go to the techtorial academy website
            //2)Click Browse Course(with javascript)
            //3)scrool down to get started on campus(get started button)
            //4)click it with javascript.

        }

        @Test
    public void practice(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.techtorialacademy.com/");
            WebElement browse= driver.findElement(By.xpath("//a[.='Browse Course']"));
            BrowserUtils.ClickWithJS(driver,browse);
            WebElement GetStarted=driver.findElement(By.xpath("//h4[.='On-Campus Course']//..//a"));
//            JavascriptExecutor js = (JavascriptExecutor) driver;
////            js.executeScript("arguments[0].scrollIntoView(true)",GetStarted);
            BrowserUtils.ScrollWithJS(driver,GetStarted);
            BrowserUtils.ClickWithJS(driver,GetStarted);
        }
        @Test
    public void ScroolWithXandYCordinantTest(){
        //This is an interview question(POINT CLASS)
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.techtorialacademy.com/");
            WebElement copyright=driver.findElement(By.xpath("//p[contains(text(),' Copy')]"));
///        JavascriptExecutor js= (JavascriptExecutor) driver;
//            Point location=copyright.getLocation();
//            System.out.println(location.getX());
//            System.out.println(location.getY());
//            int xCord=location.getX();
//            int yCord=location.getY();
//            js.executeScript("window.scrollTo("+xCord+","+yCord+")");
            BrowserUtils.ScrollWithXandYCord(driver,copyright);

        }

    }


