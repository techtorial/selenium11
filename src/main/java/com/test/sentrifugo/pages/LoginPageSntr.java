package com.test.sentrifugo.pages;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSntr {
    public LoginPageSntr(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
//we are going to store our element locations and methods here.
    @FindBy(xpath ="//input[@id='username']" )
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(id = "loginsubmit")
    WebElement loginButton;

//    public void loginAsaSuperAdmin(){
//        username.sendKeys("EM01");
//        password.sendKeys("sentrifugo");
//        loginButton.click();
//    }
//    public void loginAsaManager(){
//        username.sendKeys("EM02");
//        password.sendKeys("sentrifugo");
//        loginButton.click();
//    }
    public void dynamicLogin(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginButton.submit();
    }

}
