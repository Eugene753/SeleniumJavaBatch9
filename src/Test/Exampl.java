package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Exampl {

    public static String url = "aa.com/homePage.do";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\imark\\IdeaProjects\\SeleniumJavaBatch9\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement depart = driver.findElement(By.id("aa-leavingOn"));
        depart.click();
        WebElement dMonth = driver.findElement(By.className("ui-datepicker-month"));
        String monthText  = dMonth.getText();
        WebElement nextButton = driver.findElement(By.xpath("//a[@title = 'Next']"));
        while(!monthText.equals("September")){
            nextButton.click();
            monthText = dMonth.getText();
        }
        List<WebElement> departDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement departDate:departDates){
            if(departDate.getText().equals("21")){
                departDate.click();
                break;
            }
        }
        WebElement back = driver.findElement(By.id("aa-returningFrom"));
        back.click();
        WebElement rDate = driver.findElement(By.className("ui-datepicker-title"));
        String rMonthText =  rDate.getText();
        while(!rMonthText.equals("December")){
            nextButton.click();
            rMonthText = rDate.getText();
        }
        List<WebElement> returnDates = driver.findElements(By.className("ui-datepicker-calendar"));
        for(WebElement returnDate :returnDates){
            if(returnDate.getText().equals("15")){
                returnDate.click();
                break;
            }
        }
        WebElement destination = driver.findElement(By.name("destinationAirport"));
        Actions action = new Actions(driver);
        action.click(destination).sendKeys("Poland").release().perform();
        WebElement searchButton = driver.findElement(By.xpath("(//input[@value='Search'])[1]"));
        searchButton.click();
        driver.quit();
    }
}
