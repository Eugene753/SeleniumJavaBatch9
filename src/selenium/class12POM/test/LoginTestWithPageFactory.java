package selenium.class12POM.test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import selenium.class12POM.pages.DashboardPage;
import selenium.class12POM.pages.LoginPageWithPageFactory;
import selenium.class12POM.testbase.BaseClass;
import selenium.class12POM.utils.CommonMethods;

import java.io.File;
import java.io.IOException;

public class LoginTestWithPageFactory {
    public static void main(String[] args)  {
        BaseClass.setUpWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewPimModule");
        DashboardPage dashboardPage=new DashboardPage();
        LoginPageWithPageFactory loginPageWithPageFactory=new LoginPageWithPageFactory();
        loginPageWithPageFactory.userNameTextBox.sendKeys("Admin");
        loginPageWithPageFactory.passwordTextBox.sendKeys("Hum@nhrm123");
        loginPageWithPageFactory.loginBtn.click();

        CommonMethods.sendText(loginPageWithPageFactory.userNameTextBox,"Admin");

        TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile,new File("screenshots/HRMS/dashboard.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String welcomeText=dashboardPage.welcomeAdmin.getText();
        System.out.println(welcomeText);

        BaseClass.tearDown();
    }
}
