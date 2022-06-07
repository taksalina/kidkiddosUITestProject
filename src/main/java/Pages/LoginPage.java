package Pages;

public class LoginPage extends BasePage {
    public static final String LOGIN_PAGE = "//*[@class = 'main-content']";
    private static final String SIGN_IN_BUTTON = "//*[@value = 'Sign In']";
    private static final String LOGIN_EMAIL_INPUT = "//*[@name = 'customer[email]']";
    private static final String LOGIN_PASS_INPUT = "//*[@name='customer[password]']";
    private static final String WRONG_EMAIL_PASS_FIELD_ERR_MESSAGE = "//*[@text() = 'Incorrect email or password.']";


    public boolean isLoginScreenOpen() {
        return elementExist(LOGIN_PAGE);
    }

    public LoginPage signInButton() {
        clickElementByXpath(SIGN_IN_BUTTON);
        return new LoginPage();
    }

    public void loginEmailInput(String email) {
        sendTextToElementByXpath(LOGIN_EMAIL_INPUT, email);
    }

    public void loginPassInput(String password) {
        sendTextToElementByXpath(LOGIN_PASS_INPUT, password);
    }

    public boolean isEmptyPassEmailErrorVisible() {
        return elementExist(WRONG_EMAIL_PASS_FIELD_ERR_MESSAGE);
    }


}
