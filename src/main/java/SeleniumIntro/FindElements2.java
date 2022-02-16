package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class FindElements2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3.org/TR/2019/NOTE-wai-aria-practices-1.1-20190814/examples/checkbox/checkbox-1/checkbox-1.html");

        List<WebElement> boxes = driver.findElements(By.xpath("//div[@role='checkbox']"));
        for(WebElement box: boxes){
            System.out.println(box.isDisplayed());
            System.out.println(box.getText());
            String selected=box.getAttribute("aria-checked");
            System.out.println(selected);
            if(box.getAttribute("aria-checked").equals("false")){
                box.click();
            }

        }
    }
}
