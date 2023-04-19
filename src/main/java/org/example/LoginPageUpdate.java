package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageUpdate {
    WebDriver driver;
    @FindBy(id = "user-name")
    WebElement uname;

    @FindBy(name = "password")
    WebElement pass;

    @FindBy(id = "login-button")
    WebElement loginButton;

    public LoginPageUpdate(WebDriver driver)
    {
        this.driver = driver;
    }

    public void loginWebsite(String username, String password){
        uname.sendKeys(username);
        pass.sendKeys(password);
        loginButton.click();
    }
}
