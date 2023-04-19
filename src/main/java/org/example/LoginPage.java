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

    public void enterUsername(String uname) throws InterruptedException {
        driver.findElement(username).sendKeys("standard_user");
        Thread.sleep(2000);
    }

    public void enterPassword(String upass) throws InterruptedException {
        driver.findElement(pass).sendKeys("password");
        Thread.sleep(2000);

    }
    public void LoginButton(){
        driver.findElement(login).click();
    }

}