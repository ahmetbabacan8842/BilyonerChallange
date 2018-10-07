package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.BaseSteps;
import pageobjects.LoginPageObject;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class LoginSteps extends BaseSteps {

    private BaseSteps base;
    private LoginPageObject loginPage;

    public LoginSteps(BaseSteps base) {
        this.base = base;
        loginPage = new LoginPageObject(base.driver);
    }

    @Given("^I go to bilyoner and log in using valid credentials$")
    public void iGoToBilyonerAndLogInUsingValidCredentials() throws Throwable {
        loginPage.navigateTo(config.getHost());
        loginPage.login(config.getUserName(),config.getPassword());
    }

    @Given("^I am a user of Bilyoner$")
    public void iAmAUserOfBilyoner() throws Throwable {
      loginPage.navigateTo(config.getHost());
    }

    @Then("^I should be logged in$")
    public void iShouldBeLoggedIn() throws Throwable {
        sleep(4000);
        assertTrue(loginPage.isLoggedIn());
    }

    @When("^I log in using valid credentials$")
    public void iLogInUsingValidCredentials() throws Throwable {
        loginPage.login(config.getUserName(),config.getPassword());
    }


    @When("^I log in using invalid credentials$")
    public void iLogInUsingInvalidCredentials() throws Throwable {
        loginPage.login(config.getUserName(),"Hatalı Şifre");
    }

    @Then("^I should not be logged in$")
    public void iShouldNotBeLoggedIn() throws Throwable {
        assertTrue(loginPage.isNotLoggedIn());
    }
}
