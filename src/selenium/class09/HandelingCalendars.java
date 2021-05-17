package selenium.class09;

import Test.DriverControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandelingCalendars {

    public static String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {

        DriverControl.driverOpen(url);

        WebElement userName=DriverControl.driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password=DriverControl.driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement passwordButton=DriverControl.driver.findElement(By.id("btnLogin"));
        passwordButton.click();

        Thread.sleep(2000);
        WebElement leaveButton=DriverControl.driver.findElement(By.linkText("Leave"));
        leaveButton.click();

        WebElement fromCalendar=DriverControl.driver.findElement(By.id("calFromDate"));
        fromCalendar.click();

        WebElement mDD=DriverControl.driver.findElement(By.className("ui-datepicker-month"));
        Select monthDD=new Select(mDD);
        monthDD.selectByVisibleText("Jul");

        List<WebElement> fromDates=DriverControl.driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        System.out.println(fromDates.size());
        for(WebElement fromDate:fromDates){
            if(fromDate.getText().equals("29")){
                fromDate.click();
                break;
            }
        }


    }
}
