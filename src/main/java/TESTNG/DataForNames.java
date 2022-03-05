package TESTNG;

import org.testng.annotations.DataProvider;

public class DataForNames {
    @DataProvider(name = "FullNameTest")
    public Object[][] getData(){
        return new Object[][]{
                {"ahmet","baldir","ahmet baldir"},
                {"eric","eric2","eric eric2"},
                {"enes","enes5","enes enes5"},
                {"olivia","sharapova","olivia sharapova"},
                {"george","sergei","george sergei"},
                {"ivan","ivanova","ivan ivanova"}
        };
    }
}
