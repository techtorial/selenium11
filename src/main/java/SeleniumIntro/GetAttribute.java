package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement googlesearch=driver.findElement(By.name("btnK"));
      //  System.out.println(googlesearch.getText());
        System.out.println(googlesearch.getAttribute("value"));
        System.out.println(googlesearch.getAttribute("aria-label"));
        if(googlesearch.getAttribute("value").equals("Google Search")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
