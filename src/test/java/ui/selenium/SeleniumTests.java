package ui.selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.TestBase;
import ui.selenium.pages.MainPage;

@Tag("Selenium")
public class SeleniumTests extends TestBase {
    @Test
    void testLogIn() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.logIn();
    }
}
