package SelectClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectBasics {

    @Test
    public void practice1() throws InterruptedException {
    //    WebDriverManager.firefoxdriver().setup();
     //   WebDriver driver = new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement dropDown=driver.findElement(By.linkText("Dropdown"));
        dropDown.click();
        WebElement optionsBox=driver.findElement(By.id("dropdown"));
        Select option = new Select(optionsBox);//provide webelement location
        Thread.sleep(1000);
       option.selectByIndex(1);//option2
        Thread.sleep(1000);
        option.selectByValue("2");
        Thread.sleep(1000);
        option.selectByVisibleText("Option 1");
        List<WebElement> options=option.getOptions();
        for(WebElement optn:options){
            System.out.println(optn.getText().trim());
        }
    }
}
