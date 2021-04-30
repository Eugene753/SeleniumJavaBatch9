package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.TreeMap;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.facebook.com");

        WebElement createAccount=driver.findElement(By.linkText("Create New Account"));
        createAccount.click();
        Thread.sleep(2000);
        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("Ievgenii");
        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("Markadanov");
        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("givi@yandex.ru");
        WebElement re_enterEmail=driver.findElement(By.name("reg_email_confirmation__"));
        re_enterEmail.sendKeys("givi@yandex.ru");
        WebElement password=driver.findElement(By.id("password_step_input"));
        password.sendKeys("154sdfgdfg");
        WebElement button=driver.findElement(By.name("websubmit"));
        button.click();
        WebElement closePopUp=driver.findElement(By.xpath("//img[@class='_8idr img']"));
        Thread.sleep(2000);
        closePopUp.click();
        Thread.sleep(2000);
        driver.quit();








    }
}
