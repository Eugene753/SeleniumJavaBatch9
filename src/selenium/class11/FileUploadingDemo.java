package EugeneSelenium.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadingDemo {
    public static String url="http://the-internet.herokuapp.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mariiayarema/eclipse-workspace/Selenium/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        WebElement fileUploadLink=driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();
        WebElement chooseFile=driver.findElement(By.id("file-upload"));
        Thread.sleep(5000);
        chooseFile.sendKeys("/Users/mariiayarema/Downloads/PhotoFile.jpeg");
        WebElement uploadButton=driver.findElement(By.id("file-submit"));
        uploadButton.click();
    }
}
