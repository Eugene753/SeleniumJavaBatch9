package selenium.class07.ImplicitWaitDemo1;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo1 {

    public static String url="http://syntaxtechs.com/selenium-practice/index.php";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\imark\\IdeaProjects\\SeleniumJavaBatch9\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement startPractisingButton=driver.findElement(By.id("btn_basic_example"));
        startPractisingButton.click();


        /**
         * webelement1
         * webelement2
         * 3
         * 4
         * 5
         * 6
         *
         */

    }
}
