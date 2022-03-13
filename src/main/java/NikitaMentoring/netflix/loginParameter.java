package NikitaMentoring.netflix;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginParameter   {
    WebDriver driver;

    @Test
    @Parameters({"email","pass","test"})
    public void loginNetflix(String email, String pass,String test) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://www.netflix.com/login");


        //send info to name
        driver.findElement(By.xpath("//input[@name=\"userLoginId\"]")).sendKeys(email+test);
        //send info to password
        driver.findElement(By.xpath("//input[@id=\"id_password\"]")).sendKeys(pass);

        //submit button
        driver.findElement(By.xpath("//button[@type=\"submit\" and @data-uia=\"login-submit-button\"]")).click();

        System.out.println("Username is "+email );
        System.out.println("Password is "+pass );
        System.out.println(test);

        Thread.sleep(5000);
        driver.quit();



    }

}