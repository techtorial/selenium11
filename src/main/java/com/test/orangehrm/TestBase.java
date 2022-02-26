package com.test.orangehrm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.manage().window().maximize();
        System.out.println("i am running before every test annotation");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("I am running after each test annotation");
        driver.quit();
    }
}
