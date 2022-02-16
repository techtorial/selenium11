package SelectClass;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DreamCars {
    @Test
    public void BMW() throws InterruptedException {
        //first go to the "https://www.cars.com/"
        //Choose the options you want for your car
        //Click Search Button
        //Validate the header
        //ANd validate all the subheaders contains the name of the cars you are looking for
        //.clear--> sendKeys
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cars.com/");
        driver.manage().window().maximize();
        WebElement newUsed= driver.findElement(By.xpath("//select[@id='make-model-search-stocktype']"));
        WebElement make=driver.findElement(By.xpath("//select[@id='makes']"));
        WebElement model=driver.findElement(By.xpath("//select[@id='models']"));
        WebElement search=driver.findElement(By.xpath("//button[@type='submit' and @data-searchtype='make']"));

        BrowserUtils.selectBy(newUsed,"new","value");
        BrowserUtils.selectBy(make,"Volvo","text");
        BrowserUtils.selectBy(model,"volvo-s90","value");
        Thread.sleep(2000);
        search.click();

        WebElement header=driver.findElement(By.xpath("//h1[contains(text(),'New Volvo S90 for sale')]"));
        String actualHeader = BrowserUtils.getTextMethod(header);
        String expectedHeader="New Volvo S90 for sale";
        Assert.assertEquals(actualHeader,expectedHeader);

        List<WebElement> validationForSubheaders= driver.findElements(By.xpath("//h2[@class='title']"));
        for(WebElement car:validationForSubheaders){
            boolean contains = car.getText().trim().toLowerCase().contains("volvo");
            Assert.assertTrue(contains);
        }



    }
}
