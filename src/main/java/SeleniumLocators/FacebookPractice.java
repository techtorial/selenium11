package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPractice {
/*
    Facebook Sign up:
Scenario:
Open a Chrome browser.
Navigate to “http://www.fb.com”
Verify that the page is redirected to “http://www.facebook.com”, by getting the current URL. (use Assertion)
Verify that there is a “Create an account” section on the page.
Fill in the text boxes: First Name, Surname, Mobile Number or email address, “Re-enter mobile number”, new password.
Update the date of birth in the drop-down.
Select gender.
Click on “Create an account”.
Verify that the account is not created.
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.fb.com");
        String actualurl = driver.getCurrentUrl();
        if (actualurl.equals("https://www.facebook.com/")) {
            System.out.println("you are on the fb main page");
        } else {
            System.out.println("You are not on the fb main page");
        }
        WebElement createButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));

        if (createButton.isDisplayed()) {
            System.out.println("button is there");
        } else {
            System.out.println("button is not there");
        }
        createButton.click();
        Thread.sleep(3000);
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Ahmet");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Baba");

        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("ahmetbaba06@gmail.com");

        WebElement emailConfirmation = driver.findElement(By.name("reg_email_confirmation__"));
        emailConfirmation.sendKeys("ahmetbaba06@gmail.com");

        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("testPassword");

        WebElement month = driver.findElement(By.id("month"));
        month.sendKeys("Aug");
        WebElement day = driver.findElement(By.id("day"));
        day.sendKeys("13");
        WebElement year = driver.findElement(By.id("year"));
        year.sendKeys("1991");
        WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
        gender.click();
        WebElement signup = driver.findElement(By.name("websubmit"));
        signup.click();
        Thread.sleep(15000);
        String actualError = driver.findElement(By.id("reg_error_inner")).getText();
        String expectedError = "There was an error with your registration. Please try registering again.";
        if (actualError.equals(expectedError)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }
}
