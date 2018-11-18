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

        //List with different words for search
        List<String> searchValues = Arrays.asList("Words","Alphabet");

        for (String value : searchValues) {
            WebElement element = driver.findElement(By.name("q"));
            element.clear();
            element.sendKeys(value);
            element.submit();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        driver.close();
    }
}
