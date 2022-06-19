package test.java.skypetest;

import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.LoginPageEvents;
import main.java.pageEvents.skypeloginevent;
import org.testng.annotations.Test;
import test.java.BaseProgramTest.baseTest;

public class skypeLoginTest extends baseTest{
    @Test
    public  void TC1_SkypeSignup(){
        skypeloginevent skypeloginevent = new skypeloginevent();
        skypeloginevent.SkypeLogin();
    }
}
