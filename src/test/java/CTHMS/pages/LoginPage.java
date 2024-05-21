package CTHMS.pages;

import org.example.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    // USERNAME TEXTBOX
    @FindBy(xpath = "//input[@id='email']")
    public WebElement userNameTextBox;

    // PASSWORD TEXTBOX
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    // SIGN IN BUTTON
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton;

    public LoginPage() {PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
