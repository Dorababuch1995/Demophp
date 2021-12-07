package TestRunner;

import BaseRunner.BaseClass;
import PageObjects.AgentLogin;
import Utilites.ReadConfig;
import com.beust.jcommander.Parameter;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_001 extends BaseClass {


    public  static TestUtilites tu = new TestUtilites();


//    @Test(enabled=false )//test skipp
//    public void NavigateToAgentPage() throws IOException {
//
//        AgentLogin agentLogin = new AgentLogin(driver);
//
//        driver.findElement(By.xpath("(//a[@class='btn btn-primary btn-lg btn-block'])[1]")).submit();
//
//        tu.SwtichToWindow();
//
//        tu.captureScreen(driver,"NavigateToAgentPage");
//
//    }

    @Test(priority = 2)
    public void AgentSignUp(){

        AgentLogin agentLogin = new AgentLogin(driver);
        tu.ScolDown(agentLogin.getSignUp());

        agentLogin.getSignUp().click();
            System.out.println("SignUp");
            try {
                driver.findElement(By.id("cookie_stop")).click();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        agentLogin.getFirstName().sendKeys(ReadConfig.ReadPropertiesData("Fname"));
        agentLogin.getLastName().sendKeys(ReadConfig.ReadPropertiesData("Lname"));
        agentLogin.getPhone().sendKeys(ReadConfig.ReadPropertiesData("phNo"));
        agentLogin.getSignUpemail().sendKeys(ReadConfig.ReadPropertiesData("agentemail"));
        agentLogin.getSignuppassword().sendKeys(ReadConfig.ReadPropertiesData("pssword"));

        tu.SelectByText(agentLogin.getAccountType(),"Agent");

        agentLogin.getSignUpButoon().submit();


    }


    @Parameters({"Agentusername","Agentpassword"})
    @Test(priority = 3)
    public void AgentLogin(String Agentusername,String Agentpassword) throws InterruptedException, IOException {

        AgentLogin agentLogin = new AgentLogin(driver);
        //lOGIN
        Thread.sleep(2000);
        agentLogin.getEmail().sendKeys(Agentusername);
        agentLogin.getPassword().sendKeys(Agentpassword);
        agentLogin.getLoginButton().submit();

        tu.captureScreen(driver,"DashBoard");
        tu.SwtichToWindow();

    }





}
