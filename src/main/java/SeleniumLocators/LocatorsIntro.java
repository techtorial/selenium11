package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/techtorial/Downloads/Techtorial%20(3).html");
        //LOCATOR: ID
        //getText()--> it gives you the text of the element.
        WebElement header = driver.findElement(By.id("techtorial1"));
        String actualText=header.getText();//from the system
        String expectedText="Techtorial Academy"; //from the business requirement
        if(actualText.equals(expectedText)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        WebElement paragraph=driver.findElement(By.id("details2"));
        System.out.println(paragraph.getText());
        //LOCATOR:ClassName

        WebElement tools=driver.findElement(By.className("group_checkbox"));
        System.out.println(tools.getText());

        //LOCATOR:Name

        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Ahmet");

        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Baldi");

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("1231243");

        WebElement email = driver.findElement(By.name("userName"));
        email.sendKeys("asgsfg@gmail.com");

        WebElement javaBox = driver.findElement(By.id("cond1"));
        javaBox.click();
        System.out.println(javaBox.isDisplayed());;//return true
        System.out.println(javaBox.isSelected());;//return true


        WebElement testng= driver.findElement(By.id("cond3"));
        testng.click();
        System.out.println(testng.isDisplayed());;//return true
        System.out.println(testng.isSelected());;//return true

        WebElement cucumber = driver.findElement(By.id("cond4"));
        cucumber.click();
        System.out.println(cucumber.isDisplayed());;//return true
        System.out.println(cucumber.isSelected());;//return true

    }

}
