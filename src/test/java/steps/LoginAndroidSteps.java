package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.BaseSteps;
import pageobjects.LoginPageObject;

import static org.junit.Assert.assertTrue;


public class LoginAndroidSteps extends BaseSteps {

    private BaseSteps base;
    private LoginPageObject loginPage;

    public LoginAndroidSteps(BaseSteps base) {
        this.base = base;
        loginPage = new LoginPageObject(base.driver);
    }

    @Given("^I go to bilyoner and log in using valid credentials in Android$")
    public void iGoToBilyonerAndLogInUsingValidCredentialsInAndroid() throws Throwable {
        loginPage.navigateToAndroid();
    }

    @Then("^I should be logged in Android$")
    public void iShouldBeLoggedInAndroid() throws Throwable {
        sleep(3000);
        assertTrue(loginPage.isLoggedInAndroid());
    }

    @When("^I log in using invalid Android credentials$")
    public void iLogInUsingInvalidAndroidCredentials() throws Throwable {
        loginPage.navigateToAndroid();
        loginPage.loginAndroidCredentials(config.getUserName(),"Hatalı Şifre");
    }

    @When("^I log in using valid Android credentials$")
    public void iLogInUsingValidAndroidCredentials() throws Throwable {
        Thread.sleep(2000);
        loginPage.navigateToAndroid();
        loginPage.loginAndroidCredentials(config.getUserName(),config.getPassword());
    }


    @Then("^I should not be logged in Android$")
    public void iShouldNotBeLoggedInAndroid() throws Throwable {
        assertTrue(loginPage.isNotLoggedInAndroid());
    }


}
