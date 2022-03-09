package Homework;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyStoreTC6TestTest {
@Test
    public void test1() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");
    Actions actions = new Actions(driver);

    WebElement women = driver.findElement(By.xpath("//a[.=\"Women\"]"));

    actions.moveToElement(women).perform();
    Thread.sleep(150);
    WebElement summerDress= driver.findElement(By.xpath("//a[@title=\"Summer Dresses\"]"));
    summerDress.click();
    WebElement sliderSquareOnLeft = driver.findElement(By.xpath("//a[@class=\"ui-slider-handle ui-state-default ui-corner-all\"][1]"));

    WebElement sliderPriceText = driver.findElement(By.xpath("//span[@id=\"layered_price_range\"]"));

   while (!sliderPriceText.getText().startsWith("$20.00")){

     actions.click(sliderSquareOnLeft).perform();
     actions.sendKeys(Keys.ARROW_RIGHT).perform();


   }










}
}