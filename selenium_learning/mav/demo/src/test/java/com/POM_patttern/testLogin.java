package com.POM_patttern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLogin {
    
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver=new ChromeDriver();
        try{
            driver.get("https://www.saucedemo.com/");
            LoginPage lp= new LoginPage();
            lp.login("login", "secret_passwd");
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            driver.quit();
        }
        


    }
}
