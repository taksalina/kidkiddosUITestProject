package Pages;

import Constants.Const;


public class MainPage extends BasePage {

    private static final String LOGO_IMG = "//img[@itemprop = 'logo']";
    private static final String CONTACT_US_OPTION = "//a[text() = 'Contact us']";
    private static final String LOGIN_OPTION = "//*[@class = 'icon icon-login']";
    private static final String HOME_BUTTON = "//*[@class = 'site-nav__link site-nav__link--main']";
    private static final String BOOK_BY_LANGUAGE_MENU = "//*[@aria-controls = 'SiteNavLabel-books-by-language']";

    public void navigateToMainPage() {
        webDriver.get(Const.MAIN_URL);
    }

    public boolean isLogoVisible() {
        return elementExist(LOGO_IMG);
    }
    public ContactUsPage openContactUsTab() {
        clickElementByXpath(CONTACT_US_OPTION);
        return new ContactUsPage();
    }

    public LoginPage openLoginPage() {
        clickElementByXpath(LOGIN_OPTION);
        return new LoginPage();
    }

    public MainPage openHomePage() {
        clickElementByXpath(HOME_BUTTON);
        return new MainPage();
    }

    public boolean isHomePageOpened() {
       return elementExist(HOME_BUTTON);
    }

    public MainPage openBooksByLanguageMenu() {
        clickElementByXpath(BOOK_BY_LANGUAGE_MENU);
        return new MainPage();
    }

    public boolean isBookByLanguageOpened() {
        return elementExist(BOOK_BY_LANGUAGE_MENU);

    }
}
