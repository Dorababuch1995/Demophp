package BaseRunner;

import Utilites.DiverFactory;
import Utilites.FilePaths;
import Utilites.ReadConfig;
import Utilites.TimeDate;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.Date;
import java.util.logging.Logger;

public class BaseClass extends DiverFactory {

    public  static ReadConfig readConfig;

    public Logger logger;

    @BeforeSuite
        public  void SuiteRun(){

        logger = Logger.getLogger("PHP Travel Project");
        PropertyConfigurator.configure(FilePaths.Log4jpath);

        logger.info("Testcase Running from suite File");
        System.out.println("-------------------------TEST SUITE STARTED------------------------");
    }

    @BeforeTest
    public void BrowserLunch(){

        Initilization(readConfig.BrowserName());

        driver.manage().window().maximize();

        logger.info("Chrome Browser lunched in Windows");
    }

    @BeforeClass
       public void BrowserSetup(){

        TimeDate td = new TimeDate();
        driver.manage().deleteAllCookies();
        System.out.println("Test Finised in  "+" "+ "Time "+" " +td.currentDate() );
       driver.get(ReadConfig.AgentApplicationURL());
        logger.info("Browser URL ");
    }


    @AfterClass
    public void TestTime(){

        TimeDate td = new TimeDate();

        System.out.println("Test Finised in  "+" "+ "Date "+" "+td.currentDate() );

        logger.info("Test finised date"+" "+ td.currentTime());

    }

    @AfterTest
       public void KillBrowser(){
       //DriverKill();
    }

    @AfterSuite
    public  void    SuiteFinied(){

        System.out.println("------------------TEST Suite Complted--------------------------------");
    }


}
