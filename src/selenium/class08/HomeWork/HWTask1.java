package selenium.class08.HomeWork;

import Test.DriverControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HWTask1 {

    public static String url="https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) throws InterruptedException {
        DriverControl.driverOpen(url);

        DriverControl.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement checkBox=DriverControl.driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement removeButton=DriverControl.driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeButton.click();

        WebElement textItsGone=DriverControl.driver.findElement(By.xpath("//p[@id = 'message']"));
        if(textItsGone.isDisplayed()){
            System.out.println("It's gone! displayed - true");
        }else{
            System.out.println("It's gone! displayed - false");
        }
        WebElement enabledButton=DriverControl.driver.findElement(By.xpath("//button[@onclick = 'swapInput()']"));
        enabledButton.click();
        WebElement textItEnabled=DriverControl.driver.findElement(By.xpath("//p[@id='message']"));
        if(textItEnabled.isDisplayed()){
            System.out.println("It's enabled displayed - true");
        }else{
            System.out.println("It's enabled displayed - false");
        }
        WebElement textBox=DriverControl.driver.findElement(By.xpath("//form[@id='input-example']/input"));
        textBox.sendKeys("Hello");
        enabledButton.click();
        WebElement textDisabled=DriverControl.driver.findElement(By.xpath("//p[@id='message']"));
        if(textDisabled.isDisplayed()){
            System.out.println("It's disabled! displayed - true");
        }else{
            System.out.println("It's disabled! displayed - false");
        }

        DriverControl.driveClose();

    }
}
