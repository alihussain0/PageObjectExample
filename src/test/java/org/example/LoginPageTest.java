package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {
    WebDriver driver;

    @Test
    public void loginVerification() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        LoginPage login = new LoginPage(driver);
        login.enterUsername("Standard_user");
        Thread.sleep(2000);

        login.enterPassword("Standard_pass");
        Thread.sleep(2000);

        login.LoginButton();

        driver.quit();
}
}