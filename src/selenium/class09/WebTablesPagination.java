package selenium.class09;

import Test.DriverControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTablesPagination {

    public static String url="http://syntaxtechs.com/selenium-practice/table-pagination-demo.php";

    public static void main(String[] args) {

        DriverControl.driverOpen(url);

        List<WebElement> tableRows=DriverControl.driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));

        WebElement nextButton=DriverControl.driver.findElement(By.xpath("//a[@class='next_link']"));
        boolean flag=true;

        while(flag){

            for(WebElement tableRow:tableRows){
                String rowText=tableRow.getText();
                if(!rowText.isEmpty()) {
                    System.out.println(rowText);
                }
                if(rowText.contains("Archy J")) {
                    flag=false;
                    System.out.println(rowText);
                    break;
                }
            }
            nextButton.click();
        }

    }
}
