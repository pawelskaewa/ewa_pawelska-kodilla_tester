package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://allegro.pl/");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[3]/div[1]/div/div[2]/div[2]/button[1]")));
        WebElement inputField = driver.findElement(By.xpath("//html/body/div[3]/div[1]/div/div[2]/div[2]/button[1]"));
        inputField.click();

        WebElement category = driver.findElement(By.xpath("//*[@aria-label=\"Kategoria i opcje wyszukiwania\"]"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(3);

        WebElement drone = driver.findElement(By.xpath("//*[@placeholder=\"czego szukasz?\"]"));
        drone.sendKeys("Mavic mini");
        drone.submit();

        List<WebElement> articles = driver.findElements(By.cssSelector("section>article"));
        articles.get(0).getText();
    }
}