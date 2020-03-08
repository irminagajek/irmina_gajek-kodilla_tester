package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");
        driver.findElement(By.xpath("//button[@class='_13q9y _8hkto _11eg6 _7qjq4 _ey68j']")).click();

        WebElement inputField2 = driver.findElement(By.name("string"));
        inputField2.sendKeys("Mavic mini");
        WebElement selectField = driver.findElement(By.xpath("//select[1]"));
        Select categorySelect = new Select(selectField);
        categorySelect.selectByIndex(3);
        driver.findElement(By.xpath("//button[@class='_d25db_1t06j _13q9y _8tsq7 _1q2ua']")).click();
        driver.quit();
    }
}