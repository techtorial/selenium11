package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmazonStepDefs {
    WebDriver driver;
    @When("I navigate to Amazon homepage")
    public void i_navigate_to_amazon_homepage() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }

    @And("I search for iphone 13 case")
    public void i_search_for_iphone_case() {
        WebElement amazonSearchBar=driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearchBar.sendKeys("iphone 13 case");
        WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
    }

    @Then("I should get more than {int} results")
    public void i_should_get_more_than_results(Integer expectedResult) {
        List<WebElement> allheaders= driver.findElements(By.tagName("h2"));
        Assert.assertTrue(allheaders.size()>expectedResult);

    }

    @And("I validate the search result number")
    public void i_validate_the_search_result_number() {
        WebElement resultText=driver.findElement(By.xpath("//span[contains(text(),'1-16 of over 30,000 results for')]"));
       // 1-16 of over 30,000 results for
        String [] resultsArr=resultText.getText().trim().split(" ");
        int result=Integer.parseInt(resultsArr[3].replace(",",""));
        Assert.assertEquals(result,30000);

    }
}
