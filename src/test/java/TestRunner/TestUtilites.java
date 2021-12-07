package TestRunner;

import BaseRunner.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class TestUtilites extends BaseClass {

    public void captureScreen(WebDriver driver, String tname) throws IOException, IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");
    }


    public static   void  SwtichToWindow(){

       String win = driver.getWindowHandle();
        Set<String> wins = driver.getWindowHandles();

        for(String wins2 :wins){

            if(!win.equals(wins)){
                driver.switchTo().window(wins2);
            }
        }

    }

    public void BtnClick(WebElement c){

        c.click();
    }

    public void SendData(WebElement sn,String data){

       sn.sendKeys(data);
    }


    public  void SelectByText(WebElement e,String text){

        Select s = new Select(e);
        s.selectByVisibleText(text);

    }



    public void ScolDown(WebElement Element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }

    //more than 2 windows

    public static   void  SwtichToWindows(){


    }


}
