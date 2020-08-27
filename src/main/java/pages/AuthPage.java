package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthPage extends PageObject {

    public AuthPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email_create")
    private WebElement emailField;

    public void enterEmail(String email) {
        this.emailField.sendKeys(email);
    }
}
