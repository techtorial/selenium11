package Homework.Homework1;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/radio-button");

        WebElement radioButton = driver.findElement(By.id("yesRadio"));
      //  radioButton.click();
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()",radioButton);
    }

}
