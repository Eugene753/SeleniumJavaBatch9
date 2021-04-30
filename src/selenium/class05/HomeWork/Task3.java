package selenium.class05.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class Task3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumJavaBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.ebay.com/");

        driver.manage().window().maximize();

        WebElement categoriesDD=driver.findElement(By.id("gh-cat"));

        Select select=new Select(categoriesDD);

        List<WebElement> list=select.getOptions();

        Iterator<WebElement> iterator=list.iterator();

        while(iterator.hasNext()){
            WebElement element=iterator.next();
            String lists=element.getText();
            System.out.println(lists);
        }

        select.selectByVisibleText("Computers/Tablets & Networking");

        WebElement buttonSearch=driver.findElement(By.id("gh-btn"));
        buttonSearch.click();

        WebElement headerText=driver.findElement(By.xpath("//span[@class='b-pageheader__text']"));

        boolean displayedHeader=headerText.isDisplayed();

        if(displayedHeader){
            System.out.println("Header displayed - true");
        }else{
            System.out.println("Header displayed - false");
        }

        Thread.sleep(2000);

        driver.quit();
    }
}
