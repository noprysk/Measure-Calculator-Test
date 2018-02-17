package nao.cycledev.mcalc.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

@DefaultUrl("https://measure-calculator.firebaseapp.com/")
public class MeasureCalculatorPage extends PageObject {

    @FindBy(name = "q")
    WebElement search;

    public void searchFor(String keywords) {
        search.sendKeys(keywords, Keys.ENTER);
        waitFor(titleContains("Google Search"));
    }
}

