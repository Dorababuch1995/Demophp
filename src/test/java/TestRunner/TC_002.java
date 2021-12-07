package TestRunner;

import BaseRunner.BaseClass;
import PageObjects.AgentLogin;
import PageObjects.DemoLogin;
import Utilites.ReadConfig;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TC_002 extends BaseClass {

    public static ReadConfig readConfig;

    //demoUser

    @Test(priority = 1)
      public void  NavigateToDemoUser(){
        driver.navigate().to(ReadConfig.DemoApplicationURL());
        DemoLogin demoLogin = new DemoLogin(driver);
        demoLogin.getDemoLogin().click();
        String dEMOuSERlLogin = driver.getCurrentUrl();

        System.out.println(dEMOuSERlLogin);
        Assert.assertEquals(dEMOuSERlLogin,"https://www.phptravels.com/demo/");

        }



    @Test(priority = 2)
    public void AgentLogin(String demoUser,String demoPassword) throws InterruptedException, IOException {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(5000 );
        DemoLogin demoLogin = new DemoLogin(driver);

        demoLogin.getDemoEmail().sendKeys("Agent@gmail.com");
        demoLogin.getDemoPassword().sendKeys("Selenium@2021");
        demoLogin.getrObotButton().click();
        demoLogin.getDemoUserLoginButton().click();

    }




    }

