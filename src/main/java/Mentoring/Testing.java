package Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing {
    @Test
    public void chropath() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/selenium-xpath.html");



        driver.findElement(By.xpath("//a[contains(text(),'Web Services')]")).click(); driver.navigate().back();
        driver.findElement(By.xpath("//a[contains(text(),'SoapUI')]")).click(); driver.navigate().back();
        driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/ul[2]/li[2]/a[1]")).click(); driver.navigate().back();
        driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/ul[2]/li[1]/a[1]")).click(); driver.navigate().back();

    }
}
