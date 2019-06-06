package pages;

import com.xpxn.automation.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FccBasePage extends BasePage {
    private By navContainer = new By.ByCssSelector();
    private By hamburger = new By.ByCssSelector("body> .sidr> .navigation-slider:not(:empty)");
    private By browseByCategory = new By.ByCssSelector("#block-fcc-blocks-browse-by .category >a");
    private By browseByOffices = new By.ByCssSelector("#block-fcc-blocks-browse-by .bureaus-and-offices >a");

    public FccBasePage(WebDriver driver) {
        super(driver);
    }


    public boolean sideMenuActive() {
        boolean isHamburger =getElement(hamburger) != null;
        if (isHamburger && !(getElement(new By.ByCssSelector("body")).getAttribute("class").contains("sidr-open"))) {
            getElement(hamburger).click();
            wait.until(ExpectedConditions.elementToBeClickable(browseByCategory));
        }
        return isHamburger;
    }
}
