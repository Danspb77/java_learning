package com.example.avito_main_page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class main_page {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.avito.ru/sankt-peterburg/avtomobili/audi/a6-ASgBAgICAkTgtg3elyjitg3onSg?cd=1&radius=0&searchRadius=0");
        
        WebElement c4_folder = driver.findElement(By.xpath("//a[text()='C4 (1994—1997)']"));
    
        String category_id= c4_folder.getAttribute("data-category-id");
        System.out.println(category_id);

        WebElement car_count=driver.findElement(By.cssSelector(".page-title-count-wQ7pG"));
        String amount=car_count.getText();
        System.out.println(amount);
    }   
    
}
