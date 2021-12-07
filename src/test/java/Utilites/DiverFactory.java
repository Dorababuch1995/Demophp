package Utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.util.logging.Logger;

public class DiverFactory {

    public static WebDriver driver;


    public void Initilization(String BrowserName){

        if (BrowserName.equals("chrome")){

            System.setProperty("webdriver.chrome.driver", FilePaths.ChromeDrierPath);
            driver = new ChromeDriver();

        }else if (BrowserName.equals("FireFox")){

          //  System.setProperty("webdriver.chrome.driver", FilePaths.FireFoxPath);
            driver = new FirefoxDriver();


        }else if (BrowserName.equals("InterNetExplorer")){

      //      System.setProperty("webdriver.chrome.driver", FilePaths.InternetExplor);
            driver = new InternetExplorerDriver();

        } else {

            System.out.println("----------------------No browser found to Lunch--------------------------------");
        }




    }

    public void DriverKill(){
        driver.close();
        driver.quit();
    }



}
