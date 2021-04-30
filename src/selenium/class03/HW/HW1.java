package selenium.class03.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxtechs.com/selenium-practice/index.php");

        WebElement button=driver.findElement(By.xpath("//a[text() = ' Start Practising ']"));
        button.click();
        Thread.sleep(2000);
        WebElement simpleFormDemo=driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
        simpleFormDemo.click();
        WebElement userMessage=driver.findElement(By.xpath("//input[@id='user-message']"));
        Thread.sleep(2000);
        userMessage.sendKeys("Hello");
        WebElement showMessageButton=driver.findElement(By.xpath("//button[text()='Show Message']"));
        Thread.sleep(2000);
        showMessageButton.click();
        Thread.sleep(2000);
        driver.quit();

    }
}
