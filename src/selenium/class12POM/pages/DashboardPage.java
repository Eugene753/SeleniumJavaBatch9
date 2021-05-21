package selenium.class12POM.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.class12POM.utils.CommonMethods;

public class DashboardPage extends CommonMethods {

    @FindBy(id="welcome")
    public WebElement welcomeAdmin;

    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }

}
