package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver") ;
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement input = driver.findElement(By.xpath("//*[@id='APjFqb']"));
        WebElement logo = driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.LLD4me.yr19Zb.LS8OJ > div > img "));

    }
}
