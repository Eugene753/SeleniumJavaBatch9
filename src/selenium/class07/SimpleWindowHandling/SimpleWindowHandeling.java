package selenium.class07.SimpleWindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandeling {

    public static String url="http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\imark\\IdeaProjects\\SeleniumJavaBatch9\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();// getting current window handle
        System.out.println(mainPageHandle);
        WebElement helpLink = driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set<String> allWindowHandles = driver.getWindowHandles();//will automatically return LinkedHashSet
        System.out.println(allWindowHandles.size());

        Iterator<String> iterator=allWindowHandles.iterator();
        mainPageHandle=iterator.next();// stepping forward and getting main page
        String childHandle=iterator.next();// stepping forward again and getting child page
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle);// switching back to parent window
        //driver.close();
        driver.quit();

    }


}
