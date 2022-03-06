package Waits;

import Utils.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitlyWaitPractice {
    @Test
    public void validateWait(){
        WebDriver driver= DriverHelper.getDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startButton=driver.findElement(By.tagName("button"));
        startButton.click();
      //  WebElement text=driver.findElement(By.xpath("//h4[.='Hello World!']"));
//        String actualText=text.getText().trim();
//        String expectedText="Hello World!";
//        Assert.assertEquals(actualText,expectedText);

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement text1=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h4[.='Hello World!']"))));
        Assert.assertEquals(text1.getText().trim(),"Hello World!");

        WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
        String actual1=wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h4[.='Hello World!']")))).getText().trim();
        String expected="Hello World!";
        Assert.assertEquals(actual1,expected);

    }
}
