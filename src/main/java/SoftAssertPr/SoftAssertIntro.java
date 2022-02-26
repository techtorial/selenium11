package SoftAssertPr;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertIntro {

    public int getSum(int num1,int num2){
        return num1+num2;
    }

    @Test
    public void test(){
        Assert.assertEquals(getSum(2,6),8);
        System.out.println("test1");
        Assert.assertEquals(getSum(0,0),1);
        System.out.println("test2");
        Assert.assertEquals(getSum(-6,-7),-13);
        System.out.println("test3");
    }

    @Test
    public void test2(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getSum(2,6),8);
        System.out.println("test1");
        softAssert.assertEquals(getSum(0,0),1,"This is not correct");
        System.out.println("test2");
        softAssert.assertEquals(getSum(-6,-7),-14);
        System.out.println("test3");
        //this is for this scene

    }
}
