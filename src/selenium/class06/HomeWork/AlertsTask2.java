package selenium.class06.HomeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTask2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumJavaBatch9\\drivers\\chromedriver.exe");
        String url="http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php";
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement clickOnMeButton1=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        clickOnMeButton1.click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        WebElement clickOnMeButton2=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        clickOnMeButton2.click();
        Thread.sleep(2000);
        alert.accept();

        WebElement clickOnMeButton3=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        clickOnMeButton3.click();
        Thread.sleep(2000);
        alert.sendKeys("Hello Syntax");
        Thread.sleep(2000);
        alert.accept();

        driver.quit();

    }
}
