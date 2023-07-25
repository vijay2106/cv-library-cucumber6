package co.library.demo6.pages;

import co.library.demo6.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * 2.ResultPage
 *   Locators - resultText
 *   Method - verifyTheResults(String expected)
 */

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public String getMessage(){
        return getTextFromElement(resultText);
    }
}
