package selenium.class04.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();


        WebElement userNameInput=driver.findElement(By.cssSelector("input#txtUsername"));
        userNameInput.sendKeys("Admin");
        WebElement loginButton=driver.findElement(By.cssSelector("input#btnLogin"));
        loginButton.click();
        WebElement passwordCannotBeEmptyMessage=driver.findElement(By.cssSelector("span#spanMessage"));
        Thread.sleep(2000);
        if(passwordCannotBeEmptyMessage.isDisplayed()){
            System.out.println("Password cannot be empty displayed - true");
        }else{
            System.out.println("Password cannot be empty displayed - false");
        }
        Thread.sleep(2000);
        driver.quit();




    }
}
