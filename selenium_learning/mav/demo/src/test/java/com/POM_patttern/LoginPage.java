package com.POM_patttern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    WebDriver driver = new ChromeDriver();

    WebElement loginInput= driver.findElement(By.id("email"));
    WebElement passwordInput = driver.findElement(By.id("password"));
    WebElement loginButton = driver.findElement(By.id("login-button"));

    public void login (String login, String password){
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        loginButton.click();
    }








}
   

