import Pages.BooksResultPage;
import Pages.MainPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BooksResultsPageTest extends UseCaseBase {
    private static final Logger logger = LogManager.getLogger(BooksResultsPageTest.class);

    private static MainPage mainPage;
    private static BooksResultPage booksResultsPage;

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
        booksResultsPage = new BooksResultPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
        mainPage.openBooksByLanguageMenu();
    }

    @Test
    public void chooseEnglishOnlyOption() {
        logger.info("choose 'English Only' option test");
        mainPage.openHomePage();
        boolean isOpened = mainPage.isHomePageOpened();
        assertTrue(isOpened);
        mainPage.openBooksByLanguageMenu();
        boolean isDropDownMenuLoaded = mainPage.isBookByLanguageOpened();
        assertTrue(isDropDownMenuLoaded);
        booksResultsPage.chooseEnglishOnlyOption();
        mainPage.takeScreenshot("EnglishOnlyPageTest");
    }

    @Test
    public void chooseILoveToShareEngVersionBook() {
        logger.info("Choose 'I Love To Share Eng Ver. test");
        booksResultsPage.chooseEnglishOnlyOption();
        booksResultsPage.chooseBook();
        boolean isBookChosen = booksResultsPage.isBookChosen();
        assertTrue(isBookChosen);
        booksResultsPage.takeScreenshot("ILoveToGoToDayCareENGVerBookTest");
    }
}
