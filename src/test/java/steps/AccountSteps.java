package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import library.BaseSteps;
import pageobjects.AccountPageObject;

import static org.junit.Assert.assertTrue;

public class AccountSteps extends BaseSteps {

    private BaseSteps base;
    private AccountPageObject accountPage;

    public AccountSteps(BaseSteps base) {
        this.base = base;
        accountPage = new AccountPageObject(base.driver);
    }

    @And("^I cancel the bet$")
    public void iCancelTheBet() throws Throwable {
        accountPage.openAccount();
        accountPage.cancelledBet();
    }

    @And("^I the coupon is canceled Android$")
    public void iTheCouponIsCanceledAndroid() throws Throwable {
        accountPage.cancelledBetAndroid();
    }

    @Then("^I should see is canceled coupon Android$")
    public void iShouldSeeIsCanceledCouponAndroid() throws Throwable {
        sleep(2000);
        assertTrue(accountPage.successCancelledCoupon());
    }

    @Then("^I should see the coupon is canceled$")
    public void iShouldSeeTheCouponIsCanceled() throws Throwable {
        sleep(2000);
        assertTrue(accountPage.successCancelledCoupon());
    }
}
