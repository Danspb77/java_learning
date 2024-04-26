package com.patterns_extra_themes;



import java.time.Duration;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class start {
    

    private static final String JavascriptExecutor = null;

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver= new ChromeDriver();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        
        try{
            driver.get("https://ru.imgbb.com/");
            js.executeScript("document.querySelector('#anywhere-upload-input').setAttribute('style', 'display:flex')");
            WebElement input= driver.findElement(By.id("anywhere-upload-input"));
            input.sendKeys("/home/danya/Pictures/2024-03-05_22-54.png");

            
            
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            Thread.sleep(5000);
            driver.quit();
        }
    }
}
