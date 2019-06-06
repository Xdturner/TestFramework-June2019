package com.xpxn.automation.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By allEventsBtn = By.cssSelector("#content .section--highlight .more-links-wrapper .more-link:nth-of-type(1) a");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String URL = "https://fcc.gov";

    public static HomePage Go(WebDriver driver) {
        HomePage page = new HomePage(driver);
        page.Go();
        return page;
    }

    public void Go() {
        driver.navigate().to(URL);
    }
}
