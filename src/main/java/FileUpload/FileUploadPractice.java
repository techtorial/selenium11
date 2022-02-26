package FileUpload;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.sql.rowset.BaseRowSet;

public class FileUploadPractice {

    @Test
    public void validateFileUpload(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        WebElement chooseFile=driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("/Users/techtorial/Desktop/usa.png");
        WebElement uploadButton=driver.findElement(By.id("file-submit"));
        uploadButton.submit();
        WebElement message1=driver.findElement(By.tagName("h3"));
         String actualMessage1= BrowserUtils.getTextMethod(message1);
         String expectedMessage1="File Uploaded!";
        Assert.assertEquals(actualMessage1,expectedMessage1);
        WebElement message2=driver.findElement(By.id("uploaded-files"));
        String actualMessage2=BrowserUtils.getTextMethod(message2);
        String expectedMessage2="usa.png";
        Assert.assertEquals(actualMessage2,expectedMessage2);
       // Assert.assertTrue(actualMessage2.equals("usa.png"));


    }
    @Test
    public void validateFileUpload5() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("/Users/techtorial/Desktop/usa.png");
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.submit();
        WebElement message1 = driver.findElement(By.tagName("h3"));
        String actualMessage1 = BrowserUtils.getTextMethod(message1);
        String expectedMessage1 = "File Uploaded!";
        Assert.assertEquals(actualMessage1, expectedMessage1);
        WebElement message2 = driver.findElement(By.id("uploaded-files"));
        String actualMessage2 = BrowserUtils.getTextMethod(message2);
        String expectedMessage2 = "usa.png";
        Assert.assertEquals(actualMessage2, expectedMessage2);
        // Assert.assertTrue(actualMessage2.equals("usa.png"));
    }
        @Test
        public void validateFileUpload1() {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://the-internet.herokuapp.com/upload");
            driver.manage().window().maximize();
            WebElement chooseFile = driver.findElement(By.id("file-upload"));
            chooseFile.sendKeys("/Users/techtorial/Desktop/usa.png");
            WebElement uploadButton = driver.findElement(By.id("file-submit"));
            uploadButton.submit();
            WebElement message1 = driver.findElement(By.tagName("h3"));
            String actualMessage1 = BrowserUtils.getTextMethod(message1);
            String expectedMessage1 = "File Uploaded!";
            Assert.assertEquals(actualMessage1, expectedMessage1);
            WebElement message2 = driver.findElement(By.id("uploaded-files"));
            String actualMessage2 = BrowserUtils.getTextMethod(message2);
            String expectedMessage2 = "usa.png";
            Assert.assertEquals(actualMessage2, expectedMessage2);
            // Assert.assertTrue(actualMessage2.equals("usa.png"));
        }
        }
