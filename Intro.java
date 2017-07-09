package com.hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Baby on 7/1/17.
 */
public class Intro {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.facebook.com");

        //*[@name=‘email’]
        //login
        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("unsid12@yahoo.com");    //login

        //by password
        driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("milagro");

        //forgot password
        //driver.findElement(By.linkText("Forgot account?")).click();

        driver.findElement(By.cssSelector("#u_0_r")).click();

    }






}
