package CTHMS.steps;

import CTHMS.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.example.WebDriverUtils.driver;

public class CTHMS_Login_Steps {

    LoginPage loginPage = new LoginPage();

    @Given("a CTHMS user is on the Login Page")
    public void a_cthms_user_is_on_the_login_page() {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://mexil.it/chroma_tech_academy/hospital/site/login";
        driver.get(url);
    }
    @When("user enters username {string} in username text box")
    public void user_enters_username_in_username_text_box(String username) {
        loginPage.userNameTextBox.sendKeys(username);
    }
    @When("enters password {string} in password text box")
    public void enters_password_in_password_text_box(String password) {
        loginPage.passwordTextBox.sendKeys(password);
    }
    @When("clicks on Sign In button")
    public void clicks_on_sign_in_button() {
        loginPage.signInButton.click();
    }
}
