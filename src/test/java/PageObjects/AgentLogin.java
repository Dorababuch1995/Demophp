package PageObjects;

import BaseRunner.BaseClass;
import Utilites.DiverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentLogin  {



    WebDriver ldriver;

    public AgentLogin(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }


    @FindBy(xpath ="(//a[@class='btn btn-primary btn-lg btn-block'])[2]")
    @CacheLookup
    private WebElement AgentUrl;

    //SignUp
    @FindBy(xpath = "//a[@class='btn btn-outline-primary btn-block form-group effect ladda-sm ladda-button waves-effect']")
    private WebElement SignUp;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    @CacheLookup
    private WebElement FirstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    @CacheLookup
    private WebElement LastName;

    @FindBy(name = "phone")
    @CacheLookup
    private WebElement phone;

    @FindBy(name = "email")
    @CacheLookup
    private WebElement SignUpemail;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement signuppassword;

    @FindBy(id = "account_type")
    @CacheLookup
    private WebElement AccountType;

    @FindBy(xpath = "//button[@type='submit']")
    @CacheLookup
    private WebElement SignUpButoon;


    //Login

    @FindBy(name = "email")
    @CacheLookup
    private WebElement Email;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement Password;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    @CacheLookup
    private WebElement LoginButton;


    @FindBy(xpath = "(//div[@class='icon-box icon-layout-2 dashboard-icon-box'])[1]")
    @CacheLookup
    private WebElement WalletBalance;

    @FindBy(xpath = "(//div[@class='icon-box icon-layout-2 dashboard-icon-box'])[2]")
    @CacheLookup
    private WebElement TotalBooking;

    @FindBy(xpath = "(//div[@class='icon-box icon-layout-2 dashboard-icon-box'])[3]")
    @CacheLookup
    private WebElement PendingInvoice;

    @FindBy(xpath = "(//div[@class='icon-box icon-layout-2 dashboard-icon-box'])[4]")
    @CacheLookup
    private WebElement Reviews;

    //pom

    public WebDriver getLdriver() {
        return ldriver;
    }

    public void setLdriver(WebDriver ldriver) {
        this.ldriver = ldriver;
    }

    public WebElement getAgentUrl() {
        return AgentUrl;
    }

    public void setAgentUrl(WebElement agentUrl) {
        AgentUrl = agentUrl;
    }

    public WebElement getSignUp() {
        return SignUp;
    }

    public void setSignUp(WebElement signUp) {
        SignUp = signUp;
    }

    public WebElement getFirstName() {
        return FirstName;
    }

    public void setFirstName(WebElement firstName) {
        FirstName = firstName;
    }

    public WebElement getLastName() {
        return LastName;
    }

    public void setLastName(WebElement lastName) {
        LastName = lastName;
    }

    public WebElement getPhone() {
        return phone;
    }

    public void setPhone(WebElement phone) {
        this.phone = phone;
    }

    public WebElement getSignUpemail() {
        return SignUpemail;
    }

    public void setSignUpemail(WebElement signUpemail) {
        SignUpemail = signUpemail;
    }

    public WebElement getSignuppassword() {
        return signuppassword;
    }

    public void setSignuppassword(WebElement signuppassword) {
        this.signuppassword = signuppassword;
    }

    public WebElement getAccountType() {
        return AccountType;
    }

    public void setAccountType(WebElement accountType) {
        AccountType = accountType;
    }

    public WebElement getSignUpButoon() {
        return SignUpButoon;
    }

    public void setSignUpButoon(WebElement signUpButoon) {
        SignUpButoon = signUpButoon;
    }

    public WebElement getEmail() {
        return Email;
    }

    public void setEmail(WebElement email) {
        Email = email;
    }

    public WebElement getPassword() {
        return Password;
    }

    public void setPassword(WebElement password) {
        Password = password;
    }

    public WebElement getLoginButton() {
        return LoginButton;
    }

    public void setLoginButton(WebElement loginButton) {
        LoginButton = loginButton;
    }

    public WebElement getWalletBalance() {
        return WalletBalance;
    }

    public void setWalletBalance(WebElement walletBalance) {
        WalletBalance = walletBalance;
    }

    public WebElement getTotalBooking() {
        return TotalBooking;
    }

    public void setTotalBooking(WebElement totalBooking) {
        TotalBooking = totalBooking;
    }

    public WebElement getPendingInvoice() {
        return PendingInvoice;
    }

    public void setPendingInvoice(WebElement pendingInvoice) {
        PendingInvoice = pendingInvoice;
    }

    public WebElement getReviews() {
        return Reviews;
    }

    public void setReviews(WebElement reviews) {
        Reviews = reviews;
    }
}
