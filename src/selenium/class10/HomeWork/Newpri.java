package selenium.class10.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Newpri {

    public static String url = "https://www.aa.com/homePage.do";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement departDate = driver.findElement(By.id("aa-leavingOn"));
        System.out.println(departDate.getSize());
        departDate.click();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> departDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement depDate : departDates) {
            if (depDate.getText().equals("30")) {
                depDate.click();
                break;
            }
        }

        WebElement arrDate = driver.findElement(By.id("aa-returningFrom"));
        arrDate.click();
        WebElement nextArrow = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a"));
        nextArrow.click();

        List<WebElement> arrivalDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement arrivalday : arrivalDates) {
            if (arrivalday.getText().equals("10")) {
                arrivalday.click();
                break;
            }
        }
        WebElement searchButton = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
        searchButton.click();
        driver.quit();
    }
}
