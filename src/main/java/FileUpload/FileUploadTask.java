package FileUpload;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTask {

    @Test
    public void fileUploadPractice() throws InterruptedException {
        /*
        1)Navigate to the "https://demo.guru99.com/test/upload/'
        2)Upload the usa.png file on the website
        3)Click the box (I accept terms of service)
        4)validate box is selected
        5)Click submit button
        6)Validate the message "1 file has been successfully uploaded."
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        WebElement chooseFile=driver.findElement(By.id("uploadfile_0"));
        chooseFile.sendKeys("/Users/techtorial/Desktop/usa.png");
        WebElement box= driver.findElement(By.id("terms"));
        box
                .click();
        Assert.assertTrue(box.isSelected());

        WebElement submitButton=driver.findElement(By.id("submitbutton"));
        submitButton.click();
        Thread.sleep(3000);
        WebElement message=driver.findElement(By.xpath("//h3"));
        String actualMessage= BrowserUtils.getTextMethod(message);
        System.out.println(actualMessage);
        String expectedMessage="1 file\n" +
                "has been successfully uploaded.";
        Assert.assertEquals(actualMessage,expectedMessage);




    }
}
