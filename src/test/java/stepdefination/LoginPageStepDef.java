package stepdefination;

import crmpages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageStepDef
{
    WebDriver driver;
    LoginPage loginPage;
@Before
public void init()
{
driver = new ChromeDriver();
loginPage = new LoginPage(driver);
}


    @Given("user is on free crm login page")
    public void user_is_on_free_crm_login_page() {
        driver.get("https://classic.freecrm.com/index.html");
    }
    @And("user enter username in username textbox")
    public void user_enter_username_in_username_textbox() {
        loginPage.enterUsername();
    }
    @And("user enter password in password textbox")
    public void user_enter_password_in_password_textbox() {
        loginPage.enterPassword();
    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        loginPage.clickOnLoginBtn();
    }
    @Then("user should be redirectd to the home page")
    public void user_should_be_redirectd_to_the_home_page() {
        System.out.println("User is on HomePage");
    }


@After
    public void tearDown()
{


}





}
