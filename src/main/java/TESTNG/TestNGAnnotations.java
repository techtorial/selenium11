package TESTNG;

import org.testng.annotations.*;

public class TestNGAnnotations {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
        //You can use to setup your chrome Browser properties
        //(deletecookies)
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
        //You can use to launch your browser
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
        //You can navigate to the website
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
        //You can use it to login the page
    }
    @Test
    public void test1(){
        System.out.println("test-1");
    }
    @Test
    public void test2(){
        System.out.println("test-2");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
        //YOU CAN TAKE A SCREENSHOT FOR FAILED TEST ANNOTATIONS
        //DRIVER.quit();
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }


}
