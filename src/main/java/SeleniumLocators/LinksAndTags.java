package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAndTags {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/techtorial/Downloads/Techtorial%20(2).html");
        driver.manage().window().maximize();

        WebElement javalink = driver.findElement(By.linkText("Java"));
        javalink.click();
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        WebElement selenium =driver.findElement(By.linkText("Selenium"));
        selenium.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        javalink=driver.findElement(By.linkText("Java"));
        Thread.sleep(3000);
        javalink.click();
        driver.navigate().back();

        WebElement restApi= driver.findElement(By.partialLinkText("Rest"));
        restApi.click();
        driver.navigate().back();
        WebElement version = driver.findElement(By.tagName("u"));
        System.out.println(version.getText());
    }
}
