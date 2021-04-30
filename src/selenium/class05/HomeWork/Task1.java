package selenium.class05.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumJavaBatch9\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement createNewAccountButton=driver.findElement(By.linkText("Create New Account"));
        createNewAccountButton.click();
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement mounthDD=driver.findElement(By.id("month"));
        Select select=new Select(mounthDD);
        List<WebElement> allMonths=select.getOptions();
        int size=allMonths.size();
        System.out.println("Number of months is: "+size);

        select.selectByVisibleText("May");

        WebElement daysDD=driver.findElement(By.id("day"));
        Select select1=new Select(daysDD);
        List<WebElement> allDays=select1.getOptions();
        int days=allDays.size();
        System.out.println("Number of days is "+days);

        select1.selectByVisibleText("5");

        WebElement yearDD=driver.findElement(By.id("year"));
        Select select2=new Select(yearDD);
        List<WebElement> allYears=select2.getOptions();
        int years=allYears.size();
        System.out.println("Number of years is: "+years);

        select2.selectByVisibleText("1994");

        Thread.sleep(2000);

        driver.quit();
    }
}
