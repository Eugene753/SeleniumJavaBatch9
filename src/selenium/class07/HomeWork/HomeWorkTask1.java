package selenium.class07.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomeWorkTask1 {

    public static String url="https://demoqa.com/browser-windows";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumJavaBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String mainPageHandel=driver.getWindowHandle();
        WebElement newTabButton=driver.findElement(By.id("tabButton"));
        WebElement newWindowButton=driver.findElement(By.id("windowButton"));
        WebElement newWindowMessage=driver.findElement(By.id("messageWindowButton"));

        newTabButton.click();
        newWindowButton.click();
        newWindowMessage.click();

        String title=driver.getTitle();

        Set<String>set=driver.getWindowHandles();

        Iterator<String>iterator=set.iterator();

        while(iterator.hasNext()){
            String tab=iterator.next();
            if(!(tab.equals(mainPageHandel))){
                driver.switchTo().window(tab);
                WebElement webElement1=driver.findElement(By.xpath("newTabButton.click();"));
                System.out.println(driver.getTitle());

                driver.close();
            }
        }
        driver.switchTo().window(mainPageHandel);
        System.out.println("Main Page Title: "+driver.getTitle());

        driver.quit();

    }
}
