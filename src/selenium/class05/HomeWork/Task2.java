package selenium.class05.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumJavaBatch9\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        WebElement createNewAccountButton=driver.findElement(By.linkText("Create New Account"));
        createNewAccountButton.click();

        Thread.sleep(1000);

        WebElement fistName=driver.findElement(By.xpath("//input[@name='firstname']"));
        fistName.sendKeys("Eugene");

        WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Mark");

        WebElement emailElement=driver.findElement(By.xpath("//input[@name='reg_email__']"));
        emailElement.sendKeys("Mark@yandex.ru");

        WebElement emailRepeat=driver.findElement(By.name("reg_email_confirmation__"));
        emailRepeat.sendKeys("Mark@yandex.ru");

        WebElement password=driver.findElement(By.id("password_step_input"));
        password.sendKeys("jjhgk1234");

        WebElement mounthDD=driver.findElement(By.id("month"));
        Select select=new Select(mounthDD);
        select.selectByVisibleText("May");

        WebElement daysDD=driver.findElement(By.id("day"));
        Select select1=new Select(daysDD);
        select1.selectByVisibleText("5");

        WebElement yearDD=driver.findElement(By.id("year"));
        Select select2=new Select(yearDD);
        select2.selectByVisibleText("1994");

        WebElement button1=driver.findElement(By.xpath("//input[@value='2']"));
        button1.click();

        WebElement signIn=driver.findElement(By.xpath("//button[@name='websubmit']"));
        signIn.click();

        Thread.sleep(2000);

        driver.quit();
    }
}
