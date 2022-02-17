package ActionClass;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ActionClassMethods {

    //ContextClick()-->right click
    @Test
    public void ContextClick(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement contextMenu=driver.findElement(By.partialLinkText("Context"));
        contextMenu.click();
        WebElement box=driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        //ACTION CLASS YOU MUST USE PERFORM AT THE END.
        actions.contextClick(box).perform();
    }
    @Test
    public void HoverOver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement Hover=driver.findElement(By.linkText("Hovers"));
        Hover.click();
        Thread.sleep(2000);
        Actions actions =new Actions(driver);
        List<WebElement> names=driver.findElements(By.tagName("h5"));
        List<WebElement> pictures=driver.findElements(By.xpath("//div[@class='figure']/img"));
        List<String> expectedNames= Arrays.asList("name: user1","name: user2","name: user3");
        for(int i = 0 ; i<names.size();i++){
            Thread.sleep(2000);
            actions.moveToElement(pictures.get(i)).perform();//hover over here
            Assert.assertEquals(BrowserUtils.getTextMethod(names.get(i)),expectedNames.get(i));
            System.out.println(BrowserUtils.getTextMethod(names.get(i)));//get text here
        }
    }
    @Test
    public void doubleClick(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement doubleClickButton=driver.findElement(By.tagName("button"));
        Actions actions =new Actions(driver);
      //  actions.doubleClick(doubleClickButton).perform();
      //  actions.doubleClick(driver.findElement(By.tagName("button"))).perform();

        //TASK FOR STUDENTS
        /*
        Scenario to Automate:
1. Launch the Chrome web browser.
2. Open a URL "https://selenium08.blogspot.com/2019/11/double-click.html".
3. Locate the element "Double-click".
4.  click on the current location (i.e. on Double-click element).
5. Close the web browser.
         */
    }

    @Test
    public void doubleClickPractice(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        WebElement button= driver.findElement(By.xpath("//button[.='Double-Click me to see Alert message']"));
        Actions actions= new Actions(driver);
        actions.doubleClick(button).perform();
    }

    @Test
    public void dragAndDrop() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");
        driver.manage().window().maximize();
//        WebElement acceptCookies= driver.findElement(By.id("onetrust-accept-btn-handler"));
//        Thread.sleep(3000);
//        acceptCookies.click();
        Actions actions = new Actions(driver);
//        for(int i = 0; i<5;i++){
//            actions.sendKeys(Keys.ARROW_DOWN).perform();
//        }
        WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement orangeBox=driver.findElement(By.xpath("//div[@class='test2']"));
        String actualMessage=BrowserUtils.getTextMethod(orangeBox);
        String expectedMessage="... Or here.";

        Assert.assertEquals(actualMessage,expectedMessage);
        actions.dragAndDrop(draggable,orangeBox).perform();
        Thread.sleep(3000);
        orangeBox=driver.findElement(By.xpath("//div[@class='test2']"));
        String actualAfterDragAndDrop=BrowserUtils.getTextMethod(orangeBox);
        String expectedAfterDragAndDrop="You did great!";
        Assert.assertEquals(actualAfterDragAndDrop,expectedAfterDragAndDrop);

        String actualcssValue=orangeBox.getCssValue("background-color");
        String expectedCssValue="rgba(238, 111, 11,1)";
        Assert.assertEquals(actualcssValue,expectedCssValue);

    }

    @Test
    public void ClickAndHold(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");
        driver.manage().window().maximize();
        //        WebElement acceptCookies= driver.findElement(By.id("onetrust-accept-btn-handler"));
//        Thread.sleep(3000);
//        acceptCookies.click();
        WebElement bluebox = driver.findElement(By.xpath("//div[@class='test1']"));
        String actualBlueBoxMessage=BrowserUtils.getTextMethod(bluebox);
        String expectedBlueBoxMessage="Drag the small circle here ...";
        Assert.assertEquals(actualBlueBoxMessage,expectedBlueBoxMessage);
        WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
        Actions actions =new Actions(driver);
        actions.clickAndHold(draggable).moveToElement(bluebox).release().perform();
    }

    @Test
    public void DragAndDropPractice(){//please use drag and drop
        /*\
        1)Navigate to the website :"https://demoqa.com/droppable"
        2)Drag Drag me box and drop to drop box
        3)Validate the message is changed to "Dropped"
        4)Validate the css color is steel blue

         */


    }
    @Test
    public void ClickAndHoldPractice(){
        /*
        1)Navigate to the website :"https://demoqa.com/droppable"
        2)Click Accept
        3)ClickAndHold notAccepted box and release to Drop box
        4)validate message is still "Drop here"
        5)ClickAndHold acceptable box and release to Drop box
        6)Validate the  message is "dropped"
        7- Validate the background is blue
         */

    }
    @Test
    public void MoveByOffSet(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        driver.manage().window().maximize();
        WebElement slider = driver.findElement(By.xpath("//input"));
        Actions actions = new Actions(driver);
        //x means --> horizontal y means--> vertical
        actions.clickAndHold(slider).moveByOffset(-30,0).perform();

    }
    @Test
    public void sliderShortCut() throws InterruptedException {//this short cut for testing slider
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        driver.manage().window().maximize();
        WebElement slider = driver.findElement(By.xpath("//input"));
        WebElement range= driver.findElement(By.xpath("//span[@id='range']"));
        String myrange="3.5";
        while(!range.getText().trim().equals(myrange)){
            Thread.sleep(1000);
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
        /*
        TASK FOR STUDENTS:
        1)navigate to the Website "https://text-compare.com/"
        2)Type with the Keys --> "Good Bye Keys"
        3)with CTRL(COMMAND)+A --> select all text
        4)Copy this text CTRL(COMMAND) + C --> it will copy the text
        5)Go to the second box and paste CTRL(COMMAND) + V-->it will paste the text
        6) Validate this two boxes text are matching

         */

    }



}
