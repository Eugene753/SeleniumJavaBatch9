package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanchBrowser {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();//launch the browser
        driver.get("http://www.google.com/");//navigate to the specified url
        String url = driver.getCurrentUrl();//getting current url
        System.out.println(url);
        String title=driver.getTitle();//getting the title of the page
        System.out.println(title);
        driver.quit();
    }
}
