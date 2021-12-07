package TestRunner;

import BaseRunner.BaseClass;
import PageObjects.AgentLogin;
import PageObjects.DashBoard_Menu_Page;
import Utilites.ReadConfig;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class DashBoard_menu extends BaseClass {


    public  static TestUtilites tu = new TestUtilites();
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

    @Test(priority = 4)
    public void DashBoad_MenuOptions(){

        String dashboardUrl = driver.getCurrentUrl();
        Assert.assertEquals(dashboardUrl,"https://www.phptravels.net/account/dashboard");
        System.out.println(dashboardUrl);
        DashBoard_Menu_Page dashBoard_menu_page = new DashBoard_Menu_Page(driver);
        dashBoard_menu_page.getMybooking().click();

        String mybookingurl = driver.getCurrentUrl();
        System.out.println(mybookingurl);
        Assert.assertEquals(mybookingurl,"https://www.phptravels.net/account/bookings");

        dashBoard_menu_page.getAddfunds().click();

        String addfunds = driver.getCurrentUrl();
        System.out.println(addfunds);
        Assert.assertEquals(addfunds,"https://www.phptravels.net/account/add_funds");

        dashBoard_menu_page.getMyprofil().click();

        String myprofil = driver.getCurrentUrl();
        System.out.println(myprofil);
        Assert.assertEquals(myprofil,"https://www.phptravels.net/account/profile");

        dashBoard_menu_page.getLogout().click();

        String logout = driver.getCurrentUrl();
        System.out.println(logout);

        Assert.assertEquals(logout,"https://www.phptravels.net/login");


    }




}
