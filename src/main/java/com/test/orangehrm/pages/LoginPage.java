package com.test.orangehrm.pages;

import Utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "txtUsername")
    WebElement userName;

    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement password;

    @FindBy(id = "btnLogin")
    WebElement loginButton;

    @FindBy(id="spanMessage")
    WebElement errorMessage;

    public void login(String username, String password){
        this.userName.sendKeys(username);
        this.password.sendKeys(password);
        this.loginButton.click();
    }
    public String getErrorMessage(){
        return BrowserUtils.getTextMethod(errorMessage);
    }
    public String getColorOfTheErrorMessage(){
        return errorMessage.getCssValue("color");
    }
}
