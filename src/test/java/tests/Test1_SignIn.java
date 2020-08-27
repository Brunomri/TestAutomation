package tests;

import org.junit.jupiter.api.Test;
import pages.AuthPage;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1_SignIn extends FunctionalTest {

    @Test
    public void signIn() {
        HomePage homepage = new HomePage(driver);
        homepage.clickSignIn();
        String URL = driver.getCurrentUrl();
        assertEquals(URL, "http://automationpractice.com/index.php?controller=authentication&back=my-account");

        AuthPage auth = new AuthPage(driver);
        auth.enterEmail("teste");

    }
}
