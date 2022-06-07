package Pages;

public class ProductPage extends BasePage {

    private static final String I_LOVE_GO_TO_DAYCARE_ENG_VER_BOOK_URL = "https://kidkiddos.com/products/i-love-to-go-to-daycare-childrens-picture-book-english-only?variant=33400213441";
    private static final String PAPER_BOOK_FORMAT = "//*[@id = 'SingleOptionSelector-0']// descendant::*[@value= 'Paperback']";
    private static final String HARD_COVER_BOOK_FORMAT = "//*[@id = 'SingleOptionSelector-0']//descendant::*[@value='Hardcover']";
    private static final String QUANTITY = "//*[@name = 'quantity']";
    private static final String ADD_TO_CART_BUTTON = "//*[@id = 'AddToCartText-product-template']";
    private static final String CART_PAGE = "//*[@class = 'template-cart cbb-desktop-button']";


    public void navigateToProductPage() {
        webDriver.get(ProductPage.I_LOVE_GO_TO_DAYCARE_ENG_VER_BOOK_URL);
    }

    public void clickOnPaperbackOption() {
        clickElementByXpath(PAPER_BOOK_FORMAT);
    }

    public void chooseHardCoverFormat() {
        clickElementByXpath(HARD_COVER_BOOK_FORMAT);
    }

    public boolean isHardcoverFormatVisible() {
        return elementExist(HARD_COVER_BOOK_FORMAT);
    }

    public void clickOnQuantity() {
        clickElementByXpath(QUANTITY);
    }

    public void deleteQuantity() {
        findElementByXpath(QUANTITY).clear();
    }

    public void enterNumberOfBooks(String Quantity) {
        sendTextToElementByXpath(QUANTITY, "5");
    }

    public void addToCart() {
        clickElementByXpath(ADD_TO_CART_BUTTON);
    }

    public boolean isCartPageOpened() {
        return elementExist(CART_PAGE);
    }
}
