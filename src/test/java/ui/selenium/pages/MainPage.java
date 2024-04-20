package ui.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@id = 'user-name']")
    public WebElement login;

    @FindBy (xpath = "//input[@id = 'password']")
    public WebElement password;

    @FindBy (xpath = "//input[@id = 'login-button']")
    public WebElement logInButton;

    public void logIn() {
        login.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        logInButton.click();
    }


}
