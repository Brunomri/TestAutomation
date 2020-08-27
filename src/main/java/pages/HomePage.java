package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]")
    private WebElement signIn;

    public void clickSignIn() {
        this.signIn.click();
    }
}
