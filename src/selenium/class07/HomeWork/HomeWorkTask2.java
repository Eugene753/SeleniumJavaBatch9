package selenium.class07.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomeWorkTask2 {

    public static String url="http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumJavaBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        String mainPageHandle=driver.getWindowHandle();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement linkText=driver.findElement(By.linkText("This is a Ajax link"));
        linkText.click();
        WebElement text=driver.findElement(By.xpath("//div[@class='ContactUs']"));
        System.out.println(text.getText());



    }
}
