package WindowHandle;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeWindowHandling {

    /*
    1)navigate to the "https://www.hyrtutorials.com/p/window-handles-practice.html"
    2)Click open multiple tabs under button 4
    3)switch back to Basic Controls and validate the header(Basic Controls)
    4)Fill all the boxes and click register
    5)validate the message"Registration is Successful";
    6)Go back to Alert tabs and click the one of the click me box
    7)Close all the tabs
    8)Enjoy the chocolate if you are top5

     */

    @Test
    public void practiceMultipleWindowHandling() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        WebElement openMultipleTask=driver.findElement(By.xpath("//button[@id='newTabsBtn']"));
        openMultipleTask.click();
       // BrowserUtils.ClickWithJS(driver,openMultipleTask);
        BrowserUtils.switchByTitle(driver,"\n" +
                "Basic Controls - \n" +
                "                H Y R Tutorials");
        WebElement header = driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));
        String actualHeader= BrowserUtils.getTextMethod(header);
        String expectedHeader= "Basic Controls";
        Assert.assertEquals(actualHeader,expectedHeader);
        WebElement firstName=driver.findElement(By.id("firstName"));
        firstName.sendKeys("Ahmet");

        WebElement lastname=driver.findElement(By.id("lastName"));
        lastname.sendKeys("Baldi");

        WebElement languageBox= driver.findElement(By.id("englishchbx"));
        languageBox.click();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("ahmet@gmail.com");

        WebElement password =driver.findElement(By.id("password"));
        password.sendKeys("12325");

        WebElement register=driver.findElement(By.id("registerbtn"));
        register.click();

        WebElement message= driver.findElement(By.id("msg"));
        String actualMessage=BrowserUtils.getTextMethod(message);
        String expectedMessage="Registration is Successful";
        Assert.assertEquals(actualMessage,expectedMessage);
        BrowserUtils.switchByTitle(driver,"AlertsDemo");
        WebElement clickme=driver.findElement(By.id("alertBox"));
        clickme.click();
        Thread.sleep(3000);
        driver.quit();

    }
}
