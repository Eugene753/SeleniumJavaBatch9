package selenium.class07.AdvanceWindowHandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AdvanceWindowHandeling {

    public static String url="http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\imark\\IdeaProjects\\SeleniumJavaBatch9\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();
        WebElement instagramButton=driver.findElement(By.linkText("Follow On Instagram"));
        WebElement facebookButton=driver.findElement(By.linkText("Like us On Facebook"));
        WebElement instaAndFacebookButton=driver.findElement(By.linkText("Follow Instagram & Facebook"));

        instagramButton.click();
        facebookButton.click();
        instaAndFacebookButton.click();

        Set<String> allWindowHandels= driver.getWindowHandles();
        System.out.println(allWindowHandels.size());
        Iterator<String> iterator=allWindowHandels.iterator();

        while(iterator.hasNext()){// start iterating through handles
            String handle=iterator.next();// get the next handle
            if(!(handle.equals(mainPageHandle))){// switch to a window which is not equal to a parent handle
                driver.switchTo().window(handle);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(mainPageHandle);// switch back to parent

        instagramButton.click();


    }
}
