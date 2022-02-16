package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FINDELEMENTS {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement abtesting=driver.findElement(By.linkText("A/B Testing"));
        System.out.println(abtesting.getText());

        List<WebElement> allLinks=driver.findElements(By.xpath("//li/a"));
        int counter=0;
        for(WebElement link:allLinks){
            if(link.getText().length()<=12){
                System.out.println(link.getText());
                counter++;
            }

        }
        System.out.println(counter);

        //can you find only the links that its size less than equal 12 ant count
        //how many we have >

    }
}
