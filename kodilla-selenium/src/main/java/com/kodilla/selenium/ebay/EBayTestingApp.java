package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("_nkw")));

        WebElement inputField = driver.findElement(By.name("_nkw")); // [4]
        inputField.sendKeys("Laptop");
        inputField.submit();
    }
}