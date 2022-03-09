package NikitaMentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class SeleniumPlay {

    public static void playNotes(String[] notes, HashMap<String,WebElement> instrument) throws InterruptedException {

        for( String note : notes) {

            instrument.get(note).click();
            Thread.sleep(500);
        }

    }

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.musicca.com/piano");
        // List<WebElement> whiteKeys = driver.findElements(By.xpath("//span[@class='white-key']"));

       // List<WebElement> blackKeys = driver.findElements(By.xpath("//span[@class='black-key']"));

       // HashMap<WebElement,String> whiteKeysMap = new LinkedHashMap<>();

       // HashMap<WebElement,String> blackKeysMap = new LinkedHashMap<>();


        List<WebElement> keys = driver.findElements(By.xpath("//span[@data-key]"));

        HashMap<String,WebElement> keyboard = new HashMap<>();

        for(WebElement key : keys) {

            keyboard.put(key.getAttribute("data-note"),key);

        }

       String [] test = {"2g","2g","2e","2e","2d"};

        String [] surprise = {"2g","2g","2g","2d","2e","2e","2d","3b","3b","3a","3a","2g"};

        playNotes(surprise,keyboard);

        Thread.sleep(5000);

        driver.quit();

    }



}
