import Pages.ProductPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductPageTest extends UseCaseBase {

    private static final Logger logger = LogManager.getLogger(ProductPageTest.class);

    private static ProductPage productPage;

    @BeforeAll
    public static void classSetup() {
        productPage = new ProductPage();
    }

    @BeforeEach
    public void beforeTest() {
        productPage.navigateToProductPage();
    }

    @Test
    public void chooseBookFormat() {
        logger.info("Change book format test");
        productPage.clickOnPaperbackOption();
        boolean isHardcoverFormatVisible = productPage.isHardcoverFormatVisible();
        assertTrue(isHardcoverFormatVisible);
        productPage.chooseHardCoverFormat();
        productPage.takeScreenshot("ILoveToGoToDayCareENGVerBookFormatTest");
    }

    @Test
    public void changeNumberOfBooks() {
        logger.info("Change number of books test");
        productPage.clickOnQuantity();
        productPage.deleteQuantity();
        productPage.enterNumberOfBooks("5");
        productPage.takeScreenshot("ILoveToGoToDayCareENGVerBookChangeAmountTest");
    }

    @Test
    public void addBooksToCart() {
        logger.info("Add 'I love to  go to daycare' Eng. ver. hardcover book to the cart ");
        productPage.addToCart();
        boolean isCartPageOpened = productPage.isCartPageOpened();
        assertTrue(isCartPageOpened);
        productPage.takeScreenshot("ILoveToGoToDayCareENGVerBookAddToCartTest");
    }
}
