package SeleniumIntro;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {
    public static void main(String[] args) {
    //STEP1:We need to define the chrome driver into the project as a
        //property.
        System.setProperty("webdriver.chrome.driver","chromedriver");
        //Windows:
        //System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        //STEP2: We need to instantiate(declare) our driver.
        WebDriver driver = new ChromeDriver();
        //NOTE:driver is a reference name.WebDriver-->Interface
        //new ChromeDriver() -->new Object.
        //INTERVIEW QUESTION:
        //Where do you use polymorphism in your testing framework?
        //I use it to instantiate my driver.example
        // WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromemeDriver
        //SECOND INTERVIEW QUESTION:
        //CAN YOU INSTANTIATE YOUR DRIVER LIKE
        //WebDriver driver = new WebDriver();

        //FIRST METHOD:
        //Get()--> methods navigates to the given url.
        System.out.println(driver.getTitle()+"before");
        driver.get("https://www.techtorialacademy.com/");
        //getTitle()-->methods get the title of the page.
        String title=driver.getTitle();
        System.out.println(title);
        if(title.equals("Home Page - Techtorial")){
            System.out.println("Your test is passed");
        }else{
            System.out.println("your test is failed");
        }
        //getCurrentUrl()-->it gets the current url of the website
        String actual = driver.getCurrentUrl();
        String expected="https://www.techtorialacademy.com/";
        if(actual.equals(expected)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }
}
