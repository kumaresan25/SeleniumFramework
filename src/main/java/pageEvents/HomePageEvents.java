package main.java.pageEvents;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import main.java.pageobjects.HomepageElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.WebElement;
import test.java.BaseProgramTest.baseTest;


public class HomePageEvents {
    public static ExtentTest logger;

    public void VerifyOrangeHRMHomePage(){
        ElementFetch elementFetch = new ElementFetch();
        boolean t = elementFetch.getWebelement("XPATH" , HomepageElements.WelcomeText_Xpath).isDisplayed();
        if(t){
            baseTest.logger.log(Status.PASS, "Successfully navigated to the ORANGE HRM application home page");
        }else{
            baseTest.logger.log(Status.FAIL, "Unable to navigate to the ORANGE HRM application");
        }
    }
}
