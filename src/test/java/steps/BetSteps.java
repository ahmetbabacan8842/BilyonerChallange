package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileCommand;
import library.BaseSteps;
import pageobjects.AccountPageObject;
import pageobjects.BetPageObject;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class BetSteps extends BaseSteps {

    private BaseSteps base;
    private BetPageObject betPage;
    private AccountPageObject accountPage;

    public BetSteps(BaseSteps base) {
        this.base = base;
        betPage = new BetPageObject(base.driver);
        accountPage = new AccountPageObject(base.driver);
    }

    @And("^I go to betting newsletter$")
    public void iGoToBettingNewsletter() throws Throwable {
        betPage.betPageButtonClick();
    }

    @And("^I select bet type and select match-end mutual goals$")
    public void iSelectBetTypeAndSelectMatchEndMutualGoals() throws Throwable {
        betPage.betPageButtonClick();
        betPage.selectBetMatchEndMutualGols();
    }

    @And("^I select (\\d+) match and result (\\d+)$")
    public void iSelectMatchAndResult(int arg0, int arg1) throws Throwable {
        sleep(5000);
        betPage.selectFourMatchResultOne();
    }

    @Then("^I should see bet slipe has 4 match$")
    public void iShouldSeeBetSlipeHasMatch() throws Throwable {
        sleep(3000);
        assertTrue(betPage.betSlipeMatchList());
    }

    @When("^Create a coupon with selected matches$")
    public void createACouponWithSelectedMatches() throws Throwable {
        betPage.selectGamesAndPlayed();
    }

    @And("^I go to my account$")
    public void iGoToMyAccount() throws Throwable {
        accountPage.openAccount();
    }

    @And("^I go to betting newsletter Android$")
    public void iGoToBettingNewsletterAndroid() throws Throwable {
        betPage.betPageAndroidClick();
    }

    @And("^I select bet type and select match-end Android$")
    public void iSelectBetTypeAndSelectMatchEndAndroid() throws Throwable {
        betPage.selectBetAndSelectMatchEndAndroid();
    }

    @And("^I select (\\d+) match and result (\\d+) Android$")
    public void iSelectMatchAndResultAndroid(int arg0, int arg1) throws Throwable {
        betPage.fourMacthSelectAndroid();
    }

    @When("^I selected games are played Android$")
    public void iSelectedGamesArePlayedAndroid() throws Throwable {
        betPage.selectGamesInAndroid();
    }

    @Then("^I should see played a coupon Android$")
    public void iShouldSeePlayedACouponAndroid() throws Throwable {
        assertTrue(betPage.successCoupon());
    }

    @And("^I select bet type and select match-end mutual goals in Android$")
    public void iSelectBetTypeAndSelectMatchEndMutualGoalsInAndroid() throws Throwable {
        betPage.clickBackButton();
        betPage.selectBetMatchEndMutualGolsAndroid();
        betPage.proceedToPlayMatch();
    }

    @Then("^I should see the coupon is played$")
    public void iShouldSeeTheCouponIsPlayed() throws Throwable {
        betPage.couponIsPlayed();
        betPage.closePlayedCouponPopUp();
    }

    @And("^I go to my account and Cancel the coupon in Android$")
    public void iGoToMyAccountAndCancelTheCouponInAndroid() throws Throwable {
        betPage.accountToBackAndroid();
        betPage.iEnterMyCouponsAndCancelIt();
    }
}
