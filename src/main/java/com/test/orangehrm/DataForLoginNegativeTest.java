package com.test.orangehrm;

import org.testng.annotations.DataProvider;

public class DataForLoginNegativeTest {

    @DataProvider(name = "LoginNegativeTestScenario")
    public Object[][] getNegativeScenarioData(){
        return new Object[][]{
                {"Admin","wrongPassword","Invalid credentials"},
                {"wrongUsername","admin123","Invalid credentials"},
                {"wrongUsername","wrongpassword","Invalid credentials"}
        };
    }
    @DataProvider(name = "UserRoles")
    public Object [][] getUserRolesData(){
        return new Object[][]{
                {"Admin"},
                {"ESS"}
        };
    }
}
