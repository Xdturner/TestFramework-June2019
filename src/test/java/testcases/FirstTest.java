package testcases;

import com.xpxn.automation.example.pages.HomePage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import steps.BaseTest;

public class FirstTest extends BaseTest {
    @Test
    private void basicTest() {

    }

    @Test
    private void homePageTest() throws NoSuchFieldException {
        HomePage pageBoy = HomePage.Go(driver);
        wait.until(ExpectedConditions.urlContains("fcc.gov"));
        pageBoy.scrollTo("allEventsBtn");
        pageBoy.click("allEventsBtn");

    }
}
