package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        WebElement firstName=driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("Ievgenii");
        WebElement lastName=driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys("Markadanov");
        WebElement address=driver.findElement(By.id("customer.address.street"));
        address.sendKeys("568 West str");
        WebElement city=driver.findElement(By.id("customer.address.city"));
        city.sendKeys("New York city");
        WebElement state=driver.findElement(By.id("customer.address.state"));
        state.sendKeys("New York");
        WebElement zipCode=driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys("562380");
        WebElement phoneNumber=driver.findElement(By.id("customer.phoneNumber"));
        phoneNumber.sendKeys("458-6658-894");
        WebElement ssn=driver.findElement(By.id("customer.ssn"));
        ssn.sendKeys("458-7874-456");
        WebElement userName=driver.findElement(By.id("customer.username"));
        userName.sendKeys("Jeka");
        WebElement password=driver.findElement(By.id("customer.password"));
        password.sendKeys("777Jeka");
        WebElement confirPassword=driver.findElement(By.id("repeatedPassword"));
        confirPassword.sendKeys("777Jeka");
        WebElement register=driver.findElement(By.linkText("Register"));
        register.click();
        driver.quit();

    }
}
