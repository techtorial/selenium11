package Alert;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v93.page.model.BackForwardCacheNotRestoredExplanation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest {

    @Test
    public void JSAlert() throws InterruptedException {
        /*(ALERT CLASS)
        1)Navigate to "https://sweetalert.js.org/"
        2)Click first preview(which is on the bottom left one)
        3)Validate the text on pop-up
        4)Handle the pop up

         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://sweetalert.js.org/");
        WebElement previewJS=driver.findElement(By.xpath("//h5[contains(text(),'Normal alert')] //..//button"));
        previewJS.click();
        Thread.sleep(2000);
        Alert alert= driver.switchTo().alert();
        String actualmessage=alert.getText();
        System.out.println(actualmessage);
        String expectedmessage="Oops, something went wrong!";
        Assert.assertEquals(actualmessage,expectedmessage);
        alert.accept();
    }

    @Test
    public void TrialForAlertToHandleHTMLpopup(){
        /* TASK 2 (ALERT CLASS)
         1)Navigate to "https://sweetalert.js.org/"
        2)Click first preview(which is on the bottom right one)
        3)Validate the text on pop-up
        4)Handle the pop up
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://sweetalert.js.org/");
        WebElement previewHTML=driver.findElement(By.xpath("//button[contains(@onclick,'swal')]"));
        previewHTML.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();


    }
    @Test
    public void HTMLALERT () throws InterruptedException {
        /*
        TASK 3 (HTML ALERT)
        1)Navigate to "https://sweetalert.js.org/"
        2)Click first preview(which is on the bottom right one)
        3)Validate the text on pop-up
        4)Handle the pop up
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://sweetalert.js.org/");
        WebElement previewHTML=driver.findElement(By.xpath("//button[contains(@onclick,'swal')]"));
        previewHTML.click();
        Thread.sleep(3000);
        WebElement text=driver.findElement(By.xpath("//div[.='Something went wrong!']"));
        String actualText= BrowserUtils.getTextMethod(text);
        String expectedText="Something went wrong!";
        Assert.assertEquals(actualText,expectedText);
        WebElement okButton=driver.findElement(By.xpath("//button[.='OK']"));
        okButton.click();
    }
}
