package NikitaMentoring.netflix;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginConfigReader {
WebDriver driver;

        @Test
        public void testConfigz() throws InterruptedException {
            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
            WebDriver driver = new ChromeDriver();
            driver.get(configReader.returnKey("urlfromConfigs"));


            //send info to name
            driver.findElement(By.xpath("//input[@name=\"userLoginId\"]")).sendKeys(configReader.returnKey("emailTest"));
            //send info to password
            driver.findElement(By.xpath("//input[@id=\"id_password\"]")).sendKeys(configReader.returnKey("passTest"));

            //submit button
            driver.findElement(By.xpath("//button[@type=\"submit\" and @data-uia=\"login-submit-button\"]")).click();

            System.out.println("Username is " + configReader.returnKey("emailTest"));
            System.out.println("Password is " + configReader.returnKey("passTest"));
            System.out.println(configReader.returnKey("urlfromConfigs"));

            Thread.sleep(5000);
            driver.quit();
        }

    }

