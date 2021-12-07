package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLogin {


    WebDriver ldriver;

    public DemoLogin(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }


    @FindBy(xpath = "//a[@class='lvl-0 sign-in btn btn-md btn-white-outline']")
    private WebElement DemoLogin;

    @FindBy(xpath = "//input[@placeholder='Enter email']")
    private WebElement DemoEmail;


    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement DemoPassword;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement demoUserLoginButton;

    @FindBy(xpath ="//div[@class='recaptcha-checkbox-border']")
    private WebElement rObotButton;


    public WebDriver getLdriver() {
        return ldriver;
    }

    public void setLdriver(WebDriver ldriver) {
        this.ldriver = ldriver;
    }

    public WebElement getDemoLogin() {
        return DemoLogin;
    }

    public void setDemoLogin(WebElement demoLogin) {
        DemoLogin = demoLogin;
    }

    public WebElement getDemoEmail() {
        return DemoEmail;
    }

    public void setDemoEmail(WebElement demoEmail) {
        DemoEmail = demoEmail;
    }

    public WebElement getDemoPassword() {
        return DemoPassword;
    }

    public void setDemoPassword(WebElement demoPassword) {
        DemoPassword = demoPassword;
    }

    public WebElement getDemoUserLoginButton() {
        return demoUserLoginButton;
    }

    public void setDemoUserLoginButton(WebElement demoUserLoginButton) {
        this.demoUserLoginButton = demoUserLoginButton;
    }

    public WebElement getrObotButton() {
        return rObotButton;
    }

    public void setrObotButton(WebElement rObotButton) {
        this.rObotButton = rObotButton;
    }
}
