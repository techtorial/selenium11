package RecapSelenium;

public class InterviewQuestions {

    /*
  1)What are the advantages and disadvantages of Selenium ?
  Advantages: *Free open source
              *It supports multiple language(java, phyton,c++,C#)
              *Big Community
              *It supports multiple browsers(chrome, safari,firefox..)
  Disadvantages:
               *You cannot automate the captcha,pictures,mobile application....
               *There is no direct call for the error report.(support center)
               *It only automates the web application
               *It doesn't have any system to generate report, so we use testng report
               system.

  2)What type of testing can you automate with Selenium?
                **Smoke
                ***Regression
                **Functional test(positive and negative

  3)What are the test types do not automate with Selenium?
                *Performance Testing
                *Manual Testing(captcha,pictures...,Adhoc testing)
                *Non-functional testing(performance,stress,load....)
                *Load Testing
                *Stress Testing

   4)What is locator and what are the locator types ? *********
      Locator is a way to find the elements from DOM(development tool/page)
                *ID
                *ClassName
                *Name
                *Xpath
                *TagName
                *LinkText
                *PartialLinkText
                *CSS
   5)How do you handle the Dynamic Elements? CVS ***********

     In my project, I faced many dynamic elements and I used different ways to handle with
     *I used parent-child relationship to locate the elements.
     *I used special element types like(following-siblings,preceding-siblings,contains...,
     and, or synthax) //i would little bit give information I meant and , or conditions.
     *I wend with different attributes which are not dynamic.

   6)Different between driver.get() and driver.navigate.to()?

    NavigateTo()-->it doesn't wait webelements(page) to be loaded.
                -->it has some methods(back(),refresh(),forward(),to())

    Get()-->it will wait all the webelements(page) to be loaded
         -->it doesn't have any methods.

   7)Difference between driver.close() and driver.quit()?

   close()-->it specifically closes the window that you are currently working.(where your driver is located)

   quit()-->it closes all the windows.(whole browsers)

   8) What is XPATH? and can you tell me about types of Xpath? Which one do you use in your project mostly?

   *XPATH:Xpath is used to find the location of the elements on a webpage by using HTML structure.

    -->There are 2 types of XPATH:

        1)Absolute XPATH:it goes from all the way parent to child step by step.

        2)Relative XPATH:it directly focuses on the child.(location of the element)

   -->In my project, I use mostly relative xpath because it directly focuses on the child which I need to locate.
   -->it is way shorter than Absolute Xpath

   9)What is the difference between Absolute and Relative XPATH?

    Absolute XPATH: *It goes from parent to child
                    *It has (/) single slash for the path
                    *Synthax is different

    Relative XPATH: *It goes directly to the child
                    *It has (//) double slash for the path
                    *Synthax is different

    10)How do you handle(static) drop down menus?

      In my project, I was handling static drop-down with different ways:
        *I would definitely check the tag of the location.
            *If the location has SELECT tag -->I use SELECT CLASS (Select select = new Select(WebElement);
            *If the location doesn't have Select Tag-->I use locators to locate my elements.(sendKeys())
            *I can also use ACTION CLASS to hoverOver my element(moveToElement)

    11)What are the methods of SELECT ?

        Select class is really useful for my project,To be able use Select Class, element must have SELECT TAG.
        I can locate the elements with these Select Methods:

        *SelectByVisibleText()
        *SelectByIndex()
        *SelectByValue()

    12) What kind of exceptions did you face in Selenium?

        *NoSuchElementException
        *NullPointerException
        *StaleElementReference Exception
        *ElementIsNotInteractable Exception
        *TimeOutException
        *NoSuchFrameException
        *NoSuchWindowException
        *AlertUnhandledException

     13)In what condition do you get StaleElementReference Exception? How do you handle it ?

     *In project, I had a hard time with Stale Element Reference Exception to handle ?

        *once the element is not in DOM anymore
        *Navigate to the another page and come back.(element needs little bit time to be loaded)

       -->I CAN HANDLE THIS EXCEPTION EITHER PUTTING SOME TIME TO BE UPDATED(THREAD.SLEEP)
       -->I REINITILIAZE MY ELEMENT BEFORE I DO MY ACTIONS ON IT.
       -->You can also refresh the page.

     14)How do you handle the alerts?

        There are different types of alerts I faced in my framework

        1) Operation System Alert:I cannot handle it directly. I need to use ROBOT CLASS(show off)

        2)HTML Alert:I just need to find element and click on it.(close)

        3)JavaScript Alert(pop-ups)-->I handle this alerts/pop-ups with ALERT CLASS(RemoteAlertClass)

                Alert alert = driver.switchTo().Alert()

       15)For the Alert Interface what kind of methods do you know?

       First of all, Alert is an interface I agree, but the methods are coming from RemoteAlertClass

        I think you were checking me :) //these are tips for you to make the interview process warmer

        We have 4 methods of AlertClass:

        Alert alert = driver.switchTo().Alert();

             1)alert.Accept()-->which clicks the OK button
             2)alert.Dismiss()-->which clicks the CANCEL button
             3)alert.GetText()-->which gets the text from pop-up
             4)alert.SendKeys()-->which sends the keys to pop-up.

       16)What do you know about iframe? Can you tell me the type that you used before
            and how do you handle the iframe in selenium?

        16-2) Here is the scenario  we have a website and I would like to get the text of price
         from products.All xpath is correct and there is no problem with attribute as well. There is
         no problem with switching the window.But I cannot get the price of the product.What do
         you think the reason could be ?

         NOTE:iframe is basically html inside of another HTML. The reason people are using iframe
         because they would like to get extra protection for their data like(advertisement,videos..)

       The reason could be the Iframe, so basically I would go to the website and check the HTML
       has an iframe tag or not by typing(//iframe or frame).If there is iframe on the HTML, I would
       definitely check that the element I am looking for is not under the iframe.

       I CAN DEAL WITH IFRAME ELEMENTS BY SWITCHING MY DRIVER:

        driver.switchto.frame():

        SHOW OFF PART:
        If you want i can give you more details about other methods for iframe LIKE:
        driver.switchto.ParentFrame()-->which goes to the parent iframe
        driver.switchto.defaultContent()-->which goes to the main HTML

        17)What do you know about ACTIONS class?

        Action class basically does the functionality of my mouse and keyboard. I can say
        it is really useful my project to handle some elements.Some of the important methods
        actions class have :
        Actions actions = new Actions(driver);
        actions.

        *MoveByOffSet(x,y)
        *DoubleClick()
        *SendKeys()
        *ContextClick()-->Right Click ****
        *ClickAndHold. and release()
        *DragAndDrop
        *MoveToElements()-->hover over
        *Click()
        *Perform()
        NOTE:YOu must put perform at the end to do your any actions methods you call.

        KeyBoard:
           Keys.ENTER/RETURN
           Keys.ARROW-UP,ARROW-DOWN,ARROW-RIGHT,ARROW-LEFT

       18) What is the difference between Find element and Find Elements()?

       *Find element:*driver.findElement(By."")
                     *returns the single WebElement
                     *Once it fails,it throws noSuchElement exception

       *Find elements: * driver.findElements(By."")
                       *returns the list of WebElement
                       *Once it fails, it throws empty list of array.(no exception)

       19)What are the driver and webElement methods? (I never heard as an interview Question)

       Driver methods:
           *get
           *navigate
           *getTitle
           *findElement/elements
           *GetCurrentUrl
           *GetPageSource
           *manage
           *close
           *quit
        WebElement Methods:
           *sendkeys
           *click
           *getText
           *Clear
           *isDisplayed/IsEnabled/IsSelected
           *submit
           *GetAttribute
           *GetCssValue

        20)What is the difference between check-box and radio button?

        CheckBox: you can click multiple boxes

        RadioButton:you can choose only one.

        21) Difference between isDisplayed, IsSelected, IsEnabled?

        All of them return boolean condition:
        *IsDisplayed:It displays the elements it is visible or not
        *IsEnabled:It checks the element is enable or not.-->(moslty i use it to click the element to make sure
        it is not disabled)
        *IsSelected:the element is selected or not(check mark inside of the box)

        22)How do you switch the multiple windows ?

        -->I can use driver.WindowHandle and driver.WindowHandles method to switch my windows and handle
        the elements from other websites. We use set to store our page ids.(unique)

        driver.switchTo().window(id);

         public static void switchByTitle(WebDriver driver, String title) {
        Set<String> allPages = driver.getWindowHandles();
        for (String id : allPages) {//internet-->new Window
            driver.switchTo().window(id);
            if (driver.getTitle().contains(title)) {
                break;
            }
        }

        23) How do you scroll down to the page from Web Browser?

        I would use JAVASCRIPT with SCROLLINTOVIEW,ScrollTo(x,y) and POINT CLASS.(show off answer)
        //check your browser utils that we created for the more details.
        Point point = new Point()
        point.getX()-->coordination of x
        point.getY()--->coordination of y
        MoveByOffSet(x,y)

        24)How do you download and upload File in selenium?

        *Find the element that triggers upload window.(choose button)
        *Find the path of the file you want to upload
        *driver.findElement(chooseButton).sendKEYS(location of the file)(//C://Users//usa.png

        25)What is the difference between ASSERT and SofASSERT?
        //to be honest they have similar logic in terms of the validation,but there is couple difference
        as much as I know

        Assert:is a class that have some methods to validate the actual and expected data  with the methods
        like assert.assertequals, assert.assertTrue...
          *When it fails, it immediately throws and exception then stop the executing next code.


        SofAssert:is a class that have some methods to validate the actual and expected data  with the methods
        like assert.assertequals, assert.assertTrue...
           *When it fails, it doesn't throws and exception then it keeps executing the next codes.
           ***To be able to activate soft assert.You have to softassert.assertaLL method at the end

           Softassert softassert= new Softassert();

         26) Can you tell me about Singleton? Have you ever used it in your project?

         First of all, I appreciate for this question since I love the singleton because in the past once
         I was working on my driver, I was getting lots of NULLPOINTER exception.But with the help of singleton
         pattern design,I made my driver more safe and reliable.
         How Do i create Singleton Desing pattern is :
            Encapsulation:
            1)I need to have private WebDriver
            2)I need to have private Constructor(because I do not want anyone to create an object from this class)
            3)I create a public method to be called by other classes
            4)I use if conditions like (if driver==null and initiliaze my driver) and return it.

          27)Can you tell me how you provide pictures once you find the bug?

            In my project, I have a really good implementation for the screenShot.It means once my tests
            fail, my system takes screenshot of them and store.

          28) Do you know anything about DataProvider ? ,parameter,
          28-1)What do you do with the same test with different scenarios?

          DataProvider is a way to execute your different set of data with the same test.

           @DataProvider(name="test"
           @Test(dataprovider="test")

           29)What do you know about the wait times ? --> can you tell me the difference between implicit and
           explicit wait?

           Implicit wait:is a wait which waits for a specific time while locating the elements.
                         *when it doesn't find the element on a certain time you provide. It throws NoSuchElement

           Explicit wait:is a wait which applies to a particular webelement until the EXPECTED
           CONDITION specified is met.
                WebDriverWait wait = new WebDriverWait(Duration.ofSecond(10));
                wait.until.(ExpectedCondition.visibilityofElement(WebElement))
                 *when it doesn't find the element on a certain time you provide. It throws TimeoutException

           30)We have different customers for the specific website login. I would like to test our all
           customers login functionality is working or not.How would you test it ?

           DATA PROVIDER.You should talk how data provider works.

     */
}
