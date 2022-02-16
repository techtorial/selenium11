package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsPractice {
    //TASK:FACEBOOK INTERVIEW QUESTION:
    //1-Navigate to the website"yahoo.com"
    //2-Click news
    //3-Get all the news Headers
    //4-print out only the headers has COVID.

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        driver.manage().window().maximize();
        WebElement news = driver.findElement(By.id("root_2"));
        news.click();

      List<WebElement> headers =driver.findElements(By.tagName("h3"));
      int counter=0;
      for(int i = 0; i<headers.size();i++){
          //System.out.println( headers.get(i).getText());
          if(headers.get(i).getText().toUpperCase().contains("COVID")){
              System.out.println(headers.get(i).getText());
              counter++;
          }

      }
        System.out.println(counter);

    }
}
