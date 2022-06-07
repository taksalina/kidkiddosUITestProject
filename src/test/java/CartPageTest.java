import Pages.CartPage;
import Pages.ProductPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartPageTest extends UseCaseBase {

    private static final Logger logger = LogManager.getLogger(CartPageTest.class);

    private static CartPage cartPage;
    private static ProductPage productPage;

    @BeforeAll
    public static void classSetup() {
        productPage = new ProductPage();
        cartPage = new CartPage();
    }

    @BeforeEach
    public void beforeTest() {
        productPage.navigateToProductPage();
    }

    @Test
    public void changeTheNumberOfBooks() {
        logger.info("Change the number of books in the cart test");
        productPage.addToCart();
        boolean isCartPageOpened = productPage.isCartPageOpened();
        assertTrue(isCartPageOpened);
        cartPage.clickOnQuantity();
        cartPage.deleteQuantity();
        cartPage.enterNewNumberOfBooks("6");
        cartPage.clickUpdateButton();
        cartPage.takeScreenshot("ChangeTheNumberOfBooksInTheCartTest");
        cartPage.getPrice();
        boolean isPriceChanged = cartPage.isPriceChanged();
        assertTrue(isPriceChanged);

    }
}