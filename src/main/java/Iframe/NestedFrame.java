package Iframe;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;

public class NestedFrame {

    @Test
    public void nestedFrameValidation(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();
        //this is example of the using index to switch frame
        driver.switchTo().frame(0);//I am on the top frame
        //this is the example of using webelement to switch frame
        WebElement middleFrame=driver.findElement(By.name("frame-middle"));
        driver.switchTo().frame(middleFrame);//I am on the middle frame
        WebElement textbox = driver.findElement(By.xpath("//div[@id='content']"));
        String actualName= BrowserUtils.getTextMethod(textbox);
        String expectedName="MIDDLE";
        Assert.assertEquals(actualName,expectedName);
        driver.switchTo().parentFrame();//top
        driver.switchTo().frame("frame-left");//left
        WebElement leftbox = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
        String actualtext=leftbox.getText().trim();
        String expectedText="LEFT";
        Assert.assertEquals(actualtext,expectedText);
//        driver.switchTo().parentFrame();//top
//        driver.switchTo().parentFrame();//html
        driver.switchTo().defaultContent();//means it directly goes to the HTML
        driver.switchTo().frame("frame-bottom");
        WebElement bottombox= driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
        String actualtextBottom=BrowserUtils.getTextMethod(bottombox);
        String expectedtextBottom="BOTTOM";
        Assert.assertEquals(actualtextBottom,expectedtextBottom);

    }
}
