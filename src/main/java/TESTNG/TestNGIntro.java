package TESTNG;
import org.testng.annotations.Test;
public class TestNGIntro {

    @Test(priority = 1)
    public void c(){
        System.out.println("test1");
    }
    @Test(priority = 3)
    public void b(){
        System.out.println("test2");
    }
    @Test(priority = 2)
    public void a(){
        System.out.println("test3");
    }





}
