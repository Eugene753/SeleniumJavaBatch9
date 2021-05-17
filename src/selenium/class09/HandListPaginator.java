package selenium.class09;

import Test.DriverControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandListPaginator {

    public static String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {

        DriverControl.driverOpen(url);

        WebElement userName=DriverControl.driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password=DriverControl.driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement passwordButton=DriverControl.driver.findElement(By.id("btnLogin"));
        passwordButton.click();

        WebElement PIM=DriverControl.driver.findElement(By.id("menu_pim_viewPimModule"));
        PIM.click();
        Thread.sleep(1000);
        WebElement addEmployee=DriverControl.driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployee.click();
        Thread.sleep(2000);

        WebElement firstNameField=DriverControl.driver.findElement(By.id("firstName"));
        firstNameField.sendKeys("Ali");

        WebElement lastNameField=DriverControl.driver.findElement(By.id("lastName"));
        lastNameField.sendKeys("Hazarov");

        WebElement employeeIdField=DriverControl.driver.findElement(By.id("employeeId"));
        String empId=employeeIdField.getAttribute("value");

        WebElement saveButton=DriverControl.driver.findElement(By.id("btnSave"));
        saveButton.click();

        WebElement employeeListButton=DriverControl.driver.findElement(By.linkText("Employee List"));
        employeeListButton.click();

        boolean flag=true;

        while (flag){
            List<WebElement> tableRows=DriverControl.driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            for(int i=0;i<tableRows.size();i++){
                String rowText=tableRows.get(i).getText();
                if(rowText.contains(empId)){
                    flag=false;
                    WebElement checkbox=DriverControl.driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" +i+ "]/td[1]"));
                    checkbox.click();
                    WebElement deleteButton=DriverControl.driver.findElement(By.id("btnDelete"));
                     deleteButton.click();
                     WebElement confirmDelete=DriverControl.driver.findElement(By.id("dialogDeleteBtn"));
                     confirmDelete.click();
                     break;
                }
                WebElement next=DriverControl.driver.findElement(By.linkText("Next"));
                next.click();
            }
        }

    }
}
