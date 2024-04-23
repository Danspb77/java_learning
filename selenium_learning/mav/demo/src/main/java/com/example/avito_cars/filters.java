package com.example.avito_cars;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filters {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.avito.ru/sankt-peterburg/avtomobili/audi/a6-ASgBAgICAkTgtg3elyjitg3onSg?cd=1&radius=0&searchRadius=0");
        WebElement searchManufactoryInput= driver.findElement(By.xpath("//input[@data-marker='params[152642]/multiselect-outline-input']"));
        searchManufactoryInput.sendKeys("Германия1"+Keys.ENTER);
        WebElement searchInput= driver.findElement(By.xpath("//input[@data-marker='search-form/suggest']"));
        searchInput.sendKeys("Германия1"+Keys.ENTER);
    
    }
       
}
