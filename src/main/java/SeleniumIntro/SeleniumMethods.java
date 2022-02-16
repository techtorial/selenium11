package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
    public static void main(String[] args) throws InterruptedException {
    //INTERVIEW QUESTION: WHAT IS THE DIFFERENCE BETWEEN driver.get
        //and driver.navigate().to
        //INTERVIEW QUESTIONS:
        //WHAT IS THE DIFFERENCE BETWEEN driver.close and driver.quit
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();
        //Driver.navigate.to() -->it navigates to the webpage.

        driver.navigate().to("https://www.google.com/");

      //  Thread.sleep(3000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.getPageSource()-->it gives the html source of the page.
      // System.out.println(driver.getPageSource());
        driver.navigate().to("https://www.techtorialacademy.com/");
      //  Thread.sleep(3000);
        driver.navigate().back();//amazon
      //  Thread.sleep(3000);
        driver.navigate().forward();//techtorial again
     //   Thread.sleep(3000);
        driver.navigate().refresh();//refresh
        driver.quit();







    }
}
