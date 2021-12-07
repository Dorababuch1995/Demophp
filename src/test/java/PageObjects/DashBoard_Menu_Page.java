package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard_Menu_Page {


    WebDriver ldriver;

    public WebElement getMybooking() {
        return mybooking;
    }

    public void setMybooking(WebElement mybooking) {
        this.mybooking = mybooking;
    }

    public WebElement getAddfunds() {
        return addfunds;
    }

    public void setAddfunds(WebElement addfunds) {
        this.addfunds = addfunds;
    }

    public WebElement getMyprofil() {
        return myprofil;
    }

    public void setMyprofil(WebElement myprofil) {
        this.myprofil = myprofil;
    }

    public WebElement getLogout() {
        return logout;
    }

    public void setLogout(WebElement logout) {
        this.logout = logout;
    }

    public DashBoard_Menu_Page(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }


    @FindBy(xpath = "//i[@class='la la-shopping-cart mr-2 text-color-3']")
    private WebElement mybooking;

    @FindBy(xpath = "//i[@class='la la-wallet mr-2 text-color-9']")
    private WebElement addfunds;

    @FindBy(xpath = "//i[@class='la la-user mr-2 text-color-2']")
    private WebElement myprofil;

    @FindBy(xpath = "//i[@class='la la-power-off mr-2 text-color-6']")
    private WebElement logout;
}
