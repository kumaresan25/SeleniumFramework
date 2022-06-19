package test.java.OrangeHRM;

import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.LoginPageEvents;
import org.testng.annotations.Test;
import test.java.BaseProgramTest.baseTest;

public class OrangeHRMSignup extends baseTest {
    @Test
    public  void TC1_OrangeHRMSignup(){
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        HomePageEvents homePageEvents = new HomePageEvents();
        loginPageEvents.OrAngeHRMloginpage();
        homePageEvents.VerifyOrangeHRMHomePage();
    }
}
