package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By username = By.id("user-name");
    By pass = By.name("password");
    By login = By.id("login-button");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(){
        driver.findElement(username).sendKeys("standard_user");
    }

    public void enterPassword(){
        driver.findElement(pass).sendKeys("password");
    }
    public void LoginButton(){
        driver.findElement(login).click();
    }

}