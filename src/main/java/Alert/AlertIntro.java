package Alert;

import Utils.BrowserUtils;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertIntro {
    public static String name="Techtorial";
    @Test
    public void JSAlertAcceptMethod(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        WebElement clickJsAlert=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        clickJsAlert.click();
//        WebElement header=driver.findElement(By.tagName("h3"));//unhandledAlertexception
//        System.out.println(header.getText());
        Alert alert= driver.switchTo().alert();
        String actualText=alert.getText();
        String expectedText="I am a JS Alert";
        Assert.assertEquals(actualText,expectedText);
        alert.accept();
        WebElement message= driver.findElement(By.xpath("//p[@id='result']"));
        String actualMessage= BrowserUtils.getTextMethod(message);
        String expectedMessage="You successfully clicked an alert";
        Assert.assertEquals(actualMessage,expectedMessage);

    }

    @Test
    public void JSAlertDismissMethod(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement clickForJSConfirm=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        clickForJSConfirm.click();
        Alert alert=driver.switchTo().alert();
        String actualText=alert.getText();
        String expectedText="I am a JS Confirm";
        Assert.assertEquals(actualText,expectedText);
        alert.dismiss();
        WebElement message=driver.findElement(By.xpath("//p[@id='result']"));
        String actualMessage=BrowserUtils.getTextMethod(message);
        String expectedMessage="You clicked: Cancel";
        Assert.assertEquals(actualMessage,expectedMessage);

    }
    @Test
    public void AlertClassSendKeys(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement clickForJsPrompt=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        clickForJsPrompt.click();
        Alert alert= driver.switchTo().alert();

        alert.sendKeys(name);
        alert.accept();
        WebElement message=driver.findElement(By.xpath("//p[@id='result']"));
        String actualMessage=BrowserUtils.getTextMethod(message);
        String expectedMessage="You entered: "+name;
        Assert.assertEquals(actualMessage,expectedMessage);

    }
}
