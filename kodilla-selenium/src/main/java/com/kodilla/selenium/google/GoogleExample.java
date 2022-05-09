package com.kodilla.selenium.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        WebElement inputFieldTwo = driver.findElement(By.cssSelector("div.QS5gu.sy4vM"));
//        inputFieldTwo.click();

//        WebDriverWait wait2 = new WebDriverWait(driver, 20);
//        WebElement inputFieldThree = driver.findElement(By.cssSelector("span.VfPpkd-vQzf8d"));
//        inputFieldThree.click();

//        WebElement inputField = driver.findElement(By.name("q")); // [4]
//        inputField.sendKeys("Kodilla");
    }
}