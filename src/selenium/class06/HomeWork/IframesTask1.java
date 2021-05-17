package selenium.class06.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframesTask1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumJavaBatch9\\drivers\\chromedriver.exe");
        String url="http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement iframeWindow1=driver.findElement(By.xpath("//iframe[@name='FrameOne']"));
        driver.switchTo().frame(iframeWindow1);

        WebElement automationTestingMessage=driver.findElement(By.xpath("//a[@href='index.php']"));
        boolean isAutomationDisplayed=automationTestingMessage.isDisplayed();

        if(isAutomationDisplayed){
            System.out.println("Automation Testing Platform By Syntax displayed - true");
        }else{
            System.out.println("Automation Testing Platform By Syntax displayed - false");
        }

        driver.switchTo().defaultContent();

        WebElement iframeWindow2=driver.findElement(By.xpath("//iframe[@name='FrameTwo']"));
        driver.switchTo().frame(iframeWindow2);

        WebElement enrollTodayButton=driver.findElement(By.xpath("//a[text()='Enroll Today']"));
        boolean isEnrollTodayButtonDisplayed=enrollTodayButton.isDisplayed();

        if(isEnrollTodayButtonDisplayed){
            System.out.println("Enroll Today displayed - true");
        }else{
            System.out.println("Enroll Today displayed - false");
        }

        driver.quit();

    }
}
