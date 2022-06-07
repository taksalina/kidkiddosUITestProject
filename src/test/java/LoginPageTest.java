import Pages.LoginPage;
import Pages.MainPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest extends UseCaseBase {
    private static final Logger logger = LogManager.getLogger(LoginPageTest.class);

    private static MainPage mainPage;
    private static LoginPage loginPage;


    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
        loginPage = new LoginPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
        mainPage.openLoginPage();
    }
// Captcha does not allow running the following tests
    @Test
    public void errorMessageEmptyPassField() {
        logger.info("Empty password field error massage test");
        loginPage.loginEmailInput("skyrunner2491@gmailcom");
        loginPage.signInButton();
        boolean isErrorMessageVisible = loginPage.isEmptyPassEmailErrorVisible();
        assertTrue(isErrorMessageVisible);
        loginPage.takeScreenshot("EmptyPassFieldErrMessage");

    }

    @Test
    public void errorMessageEmptyEmailField() {
        logger.info("Empty email field error massage test ");
        loginPage.loginPassInput("qwerty12345");
        loginPage.signInButton();
        boolean isErrorMessageVisible = loginPage.isEmptyPassEmailErrorVisible();
        assertTrue(isErrorMessageVisible);
        loginPage.takeScreenshot("EmptyEmailFieldErrMessage");
    }

    @Test
    public void signInUserAcc() {
        loginPage.loginEmailInput("alinataksa@gmail.com");
        loginPage.loginPassInput("OwertY102938");
        loginPage.signInButton();
        boolean isErrorMessageVisible = loginPage.isEmptyPassEmailErrorVisible();
        assertTrue(isErrorMessageVisible);
        loginPage.takeScreenshot("WrongEmailOrPassErrMessage");

    }
}
