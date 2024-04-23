package com.drag_and_drop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class start {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver= new ChromeDriver();

        try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            WebElement drag= driver.findElement(By.id("draggable"));
            WebElement drop = driver.findElement(By.id("droppable"));

            Actions action= new Actions(driver);
            // it will move to the element "drag" , catch it and hold it , move to the element "drop" , release it
            action.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
        
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally{
            Thread.sleep(5000);
            driver.quit();
        }

        
        
        



    }
}
