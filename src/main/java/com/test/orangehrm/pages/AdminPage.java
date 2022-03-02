package com.test.orangehrm.pages;

import Utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdminPage {
    public AdminPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "btnAdd")
    WebElement addButton;

    @FindBy(id = "systemUser_userType")
    WebElement userRoles;

    @FindBy(id = "systemUser_employeeName_empName")
    WebElement employeeName;

    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement userName;

    @FindBy(name = "systemUser[status]")
    WebElement status;

    @FindBy(name = "systemUser[password]")
    WebElement password;

    @FindBy(name = "systemUser[confirmPassword]")
    WebElement confirmPassword;

    @FindBy(className = "addbutton")
    WebElement saveButton;

    @FindBy(xpath = "//tr//a[contains(@href,'saveSystemUser')]")
    List<WebElement> allNames;


    public void sendingAllInformationForEmployee() throws InterruptedException {
        addButton.click();
        BrowserUtils.selectBy(userRoles,"Admin","text");
        employeeName.sendKeys("Alice Duval");
        userName.sendKeys("ahmetnewahmet1546");
        BrowserUtils.selectBy(status,"0","value");
        password.sendKeys("ahmet12345");
        confirmPassword.sendKeys("ahmet12345");
        Thread.sleep(1000);
        saveButton.click();
        Thread.sleep(1000);
    }
    public boolean ValidationTheEmployeeIsCreated(String Username){
        for(WebElement name: allNames){
            if(name.getText().trim().equals(Username)){
                return true;
            }
        }
        return false;
    }
}
