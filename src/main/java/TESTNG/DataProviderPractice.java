package TESTNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
//    @DataProvider(name = "FullNameTest")
//    public Object[][] getData(){
//        return new Object[][]{
//                {"ahmet","baldir","ahmet baldir"},
//                {"eric","eric2","eric eric2"},
//                {"enes","enes5","enes enes5"},
//                {"olivia1","sharapova","olivia sharapova"},
//                {"george","sergei","george sergei"},
//                {"ivan","ivanova","ivan ivanova"}
//        };
//    }
    @Test(dataProvider ="FullNameTest",dataProviderClass = DataForNames.class)
    public void test1(String username,String lastname,String expectedfullName){
        String userName=username;
        String lastName=lastname;
        String fullName=userName+" "+lastName;
        Assert.assertEquals(fullName,expectedfullName);
    }
}
