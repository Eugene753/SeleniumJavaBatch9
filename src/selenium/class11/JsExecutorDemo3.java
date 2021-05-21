package EugeneSelenium.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class JsExecutorDemo3 {
    public static String url = "https://www.google.com/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mariiayarema/eclipse-workspace/Selenium/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //driver.get(url);

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.open();");
        driver.get(url);
        WebElement search=driver.findElement(By.name("q"));
        search.sendKeys("sdfsdfsdfsdfsdf");
        Set<String> set=driver.getWindowHandles();
        for(String s:set){
            System.out.println(s);
        }
    }
}
