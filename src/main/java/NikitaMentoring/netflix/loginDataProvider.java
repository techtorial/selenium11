package NikitaMentoring.netflix;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginDataProvider {

    WebDriver driver;

    @Test(dataProvider = "data_for_login")
    public void loginNetflix(String login, String password, String test) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

         driver = new ChromeDriver();
        driver.get("https://www.netflix.com/login");


        //send info to name
        driver.findElement(By.xpath("//input[@name=\"userLoginId\"]")).sendKeys(test+login);
        //send info to password
        driver.findElement(By.xpath("//input[@id=\"id_password\"]")).sendKeys(password);

        //submit button
        driver.findElement(By.xpath("//button[@type=\"submit\" and @data-uia=\"login-submit-button\"]")).click();

        System.out.println("Username is "+login );
        System.out.println("Password is "+password );

        Thread.sleep(500);
        driver.quit();
    }

    @DataProvider (name = "data_for_login")
    public Object[][] dataForLogin () {

        Object [][] loginData = new Object[4][3];


        loginData[0][0] = "LoginOne";
        loginData[0][1] = "PasswordOne";
        loginData[0][2] = "TEEEEEEST";



        loginData[1][0] = "LoginTwo";
        loginData[1][1] = "PasswordTwo";
        // loginData[1][2] = null;

        loginData[2][0] = "LoginThree";
        loginData[2][1] = "PasswordThree";

        loginData[3][0] = "LoginFour";
        loginData[3][1] = "PasswordFour";


        return loginData;
    }
}
