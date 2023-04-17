package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {
    WebDriver driver;

    @Test
    public void loginVerification(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        LoginPage login = new LoginPage(driver);
        login.enterUsername();
        login.enterPassword();
        login.LoginButton();

        driver.quit();
}
}