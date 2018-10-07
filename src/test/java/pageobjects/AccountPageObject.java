package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AccountPageObject {

    protected WebDriver browser;

    public AccountPageObject(WebDriver browser) {
        this.browser = browser;
    }

    public void openAccount(){
        Actions action = new Actions(browser);
        WebElement we = browser.findElement(By.className("title"));
        action.moveToElement(we).perform();
        action.moveToElement(browser.findElement(By.xpath("//*[@id=\"login-container\"]/div/div[2]/ul/li[1]/a"))).click().perform();
    }

    public void cancelledBet(){
        browser.findElement(By.className("button-cancel-coupon .ng-scope")).click();
    }

    public boolean successCancelledCoupon(){
        return browser.findElements(By.className("cancel-success-header")).size() > 0;
    }

    public void cancelledBetAndroid(){
        browser.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")).click();
    }
}
