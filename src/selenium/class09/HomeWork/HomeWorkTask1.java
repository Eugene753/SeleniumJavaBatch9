package selenium.class09.HomeWork;

import Test.DriverControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomeWorkTask1 {
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
        WebElement toCalendar=DriverControl.driver.findElement(By.id("calToDate"));
        toCalendar.click();
        WebElement toMDD=DriverControl.driver.findElement(By.className("ui-datepicker-month"));
        Select monthToDD=new Select(toMDD);
        monthToDD.selectByVisibleText("Sep");

        List<WebElement> toDates=DriverControl.driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        System.out.println(toDates.size());
        for(WebElement toDate:toDates){
            if(toDate.getText().equals("17")){
                toDate.click();
            }
        }
        List<WebElement> checkBoxes=DriverControl.driver.findElements(By.xpath("//div[@id='leaveList_chkSearchFilter_checkboxgroup']/label"));
        System.out.println(checkBoxes.size());

        for(WebElement checkBox:checkBoxes){
            if(checkBox.getText().equals("Cancelled")||checkBox.getText().equals("Rejected")){
                checkBox.click();
            }
            if(checkBox.getText().equals("Pending Approval")){
                checkBox.click();
            }
        }
        WebElement subUnit=DriverControl.driver.findElement(By.id("leaveList_cmbSubunit"));
        Select subUnitDD=new Select(subUnit);
        subUnitDD.selectByVisibleText("IT Support");
        WebElement searchButton=DriverControl.driver.findElement(By.id("btnSearch"));
        searchButton.click();
        DriverControl.driverQuit();
    }
}
