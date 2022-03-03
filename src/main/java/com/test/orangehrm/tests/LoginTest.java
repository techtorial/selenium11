package com.test.orangehrm.tests;

import Utils.ConfigReader;
import com.test.orangehrm.TestBase;
import com.test.orangehrm.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void validateLoginPositive(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(ConfigReader.readProperty("orangehrmusername"),ConfigReader.readProperty("orangehrmpassword"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    }

    @Test
    public void validateLoginNegative1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin","ahmet");
        String actualErrorMessage=loginPage.getErrorMessage();
        String expectedErrorMessage="Invalid credentials";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
    }

    @Test
    public void validateLoginNegative2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("","");
        String actualErrorMessage=loginPage.getErrorMessage();
        String expectedErrorMessage="Username cannot be empty";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
        String actualColorOfErrorMessage=loginPage.getColorOfTheErrorMessage();
        String expectedColorOfErrorMessage="rgba(221, 119, 0, 1)";
        Assert.assertEquals(actualColorOfErrorMessage,expectedColorOfErrorMessage);
    }
}
