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

        // Xpath
        // "//div[@class='name of class']"
        // "// in the beginning of the path means only single element"
        // "//a[@class='g'][last()]"
        // "a[text()="search in google"]"
        // "*[text()="search in google"]"
        // "span[contains(text(),'search in google')]"
        // h3[contains(@class,'name of class')]

        // inner classes
        // //div[@class='name of class'][3]//a[text()='search in google']
        // "//span[text()="some"]/parent::div/parent::div/following-sibling::div[@class='name of class']"

        // CSS selectors
        //$$() in console
        // "#id"
        // ".class_name"
        //"[attribute_name='value']"
        //"[role*='contain this words']"
        //"[role^='search the beginning']"
        //"[role$='search at the ending']"
        // ".class_name1.class_name2[attribute_name='value']"
        // "div:not(.col)"
        // "a:not(href^'http')"

        //inners
        // "div[name='name of div'] div.child_name"


        // "div[name='name of div'] > div.child_name"

        //"ul li:first-child"
        // "ul li:nth-child(2)"

        



    }
}
