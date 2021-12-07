package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardBadges_page {

    WebDriver ldriver;

    public DashBoardBadges_page(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }


    @FindBy(xpath = "(//p[@class='info__desc'])[1]")
    private WebElement wallentblance;

    @FindBy(xpath = "(//p[@class='info__desc'])[2]")
    private  WebElement totalbooking;

    @FindBy(xpath = "(//p[@class='info__desc'])[3]")
    private WebElement pendinginvoice;

    @FindBy(xpath = "(//p[@class='info__desc'])[4]")
    private WebElement reviews;

    public WebElement getWallentblance() {
        return wallentblance;
    }

    public void setWallentblance(WebElement wallentblance) {
        this.wallentblance = wallentblance;
    }

    public WebElement getTotalbooking() {
        return totalbooking;
    }

    public void setTotalbooking(WebElement totalbooking) {
        this.totalbooking = totalbooking;
    }

    public WebElement getPendinginvoice() {
        return pendinginvoice;
    }

    public void setPendinginvoice(WebElement pendinginvoice) {
        this.pendinginvoice = pendinginvoice;
    }

    public WebElement getReviews() {
        return reviews;
    }

    public void setReviews(WebElement reviews) {
        this.reviews = reviews;
    }
}
