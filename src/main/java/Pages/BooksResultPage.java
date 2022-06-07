package Pages;

public class BooksResultPage extends BasePage {

    private static final String ENGLISH_ONLY_OPTION = "//a[text()='English Only']";
    private static final String I_LOVE_TO_GO_TO_DAYCARE_ENG_VERSION = "//*[@alt = 'I-Love-to-Go-to-Daycare-kids-bunnies-bedtime-story-Shelley-Admont-English-language-cover']";


    public BooksResultPage chooseEnglishOnlyOption() {
        clickElementByXpath(ENGLISH_ONLY_OPTION);
        return new BooksResultPage();
    }

    public void chooseBook() {
        clickElementByXpath(I_LOVE_TO_GO_TO_DAYCARE_ENG_VERSION);

    }

    public boolean isBookChosen() {
        return elementExist(I_LOVE_TO_GO_TO_DAYCARE_ENG_VERSION);
    }
}
