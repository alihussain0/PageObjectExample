package com.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FactoryBrowser {
     static WebDriver driver;
    public static WebDriver  setupBrowser(String browser, String url){
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }


        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        return driver;
    }
}
