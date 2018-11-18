package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    //main method
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "../ChromeDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));

        List<String> searchValues = Arrays.asList("Hello", "Words","Alphabet");

        for (String value : searchValues) {
            element.clear();
            element.sendKeys(value);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }

        element.submit();
        driver.close();
    }

}
