package com.patterns_extra_themes;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartTest {
    
    private WebDriver driver;
    private JavascriptExecutor js;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testPageTitle() throws InterruptedException {
        try {
            driver.get("https://ru.imgbb.com/");
            js.executeScript("document.querySelector('#anywhere-upload-input').setAttribute('style', 'display:flex')");
            WebElement input = driver.findElement(By.id("anywhere-upload-input"));
            input.sendKeys("/home/danya/Pictures/2024-03-05_22-54.png");
            String title = driver.getTitle();
            System.out.println(title);
            Assert.assertEquals(title, "ImgBB — Загрузить Фото — Хостинг Картинок");
        } catch (Exception e) {
            System.out.println(e);
            Assert.fail("Test failed: " + e.getMessage());
        }
    }
}
