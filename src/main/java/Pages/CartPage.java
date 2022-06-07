package Pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage {

    private static final String QUANTITY_YOUR_CART = "//*[@class = 'cart__qty-input']";
    private static final String UPDATE_BUTTON = "//*[@class = 'btn btn--secondary cart__update cart__update--large small--hide']";
    private String UPDATED_PRICE_I_LOVE_TO_GO_TO_DAY_CARE_SIX_PC = "//td[@class='text-right small--hide']//*[@class='cbb-price-digits']";

    public void clickOnQuantity() {
        clickElementByXpath(QUANTITY_YOUR_CART);
    }

    public void enterNewNumberOfBooks(String Quantity) {
        sendTextToElementByXpath(QUANTITY_YOUR_CART, "6");
    }

    public void deleteQuantity() {
        findElementByXpath(QUANTITY_YOUR_CART).clear();
    }

    public void clickUpdateButton() {
        clickElementByXpath(UPDATE_BUTTON);
    }

    public void getPrice() {
        findElementByXpath(UPDATED_PRICE_I_LOVE_TO_GO_TO_DAY_CARE_SIX_PC).getText();

    }

    public boolean isPriceChanged() {
        return elementExist(UPDATED_PRICE_I_LOVE_TO_GO_TO_DAY_CARE_SIX_PC);
    }
}



