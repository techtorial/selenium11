package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class GoogleStepDefs {
    WebDriver driver;
    @Given("I navigate to google.com")
    public void i_navigate_to_google_com() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    @When("I search for Techtorial")
    public void i_search_for_techtorial() {
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("Techtorial", Keys.ENTER);

    }
    @Then("I get more than {int} links on the google page")
    public void i_get_more_than_links_on_the_google_page(Integer expectedCount) {
      List<WebElement> allLinks= driver.findElements(By.tagName("a"));

        Assert.assertTrue(allLinks.size()>expectedCount);


    }
}
