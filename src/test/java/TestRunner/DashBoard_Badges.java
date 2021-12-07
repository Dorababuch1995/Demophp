package TestRunner;

import BaseRunner.BaseClass;
import PageObjects.AgentLogin;
import PageObjects.DashBoardBadges_page;
import Utilites.ReadConfig;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class DashBoard_Badges extends BaseClass {

    public  static TestUtilites turef = new TestUtilites();

    @Test(priority = 2)
    public void AgentSignUp(){

        AgentLogin agentLogin = new AgentLogin(driver);
        turef.ScolDown(agentLogin.getSignUp());

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

        turef.SelectByText(agentLogin.getAccountType(),"Agent");

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

        turef.captureScreen(driver,"DashBoard");
        turef.SwtichToWindow();

    }

    @Test(priority = 4)
    public void dashBoardBadges(){


        DashBoardBadges_page dashBoardBadges_page = new DashBoardBadges_page(driver);
        //walletbalmc
        String WalletTxt = dashBoardBadges_page.getWallentblance().getText();
        System.out.println(WalletTxt);
        Assert.assertEquals(WalletTxt,"Wallet Balance");
        //totalbookings
        String TotalBookingTxt = dashBoardBadges_page.getTotalbooking().getText();
        System.out.println(TotalBookingTxt);
        Assert.assertEquals(TotalBookingTxt,"Total Bookings");
        //pendinginvoice
        String pendingInvoiceTxt = dashBoardBadges_page.getPendinginvoice().getText();
        System.out.println(pendingInvoiceTxt);
        Assert.assertEquals(pendingInvoiceTxt,"Pending Invoices");
        //Reviews
        String  ReviewsTxt = dashBoardBadges_page.getReviews().getText();
        System.out.println(ReviewsTxt);
        Assert.assertEquals(ReviewsTxt,"Reviews");

    }



}
