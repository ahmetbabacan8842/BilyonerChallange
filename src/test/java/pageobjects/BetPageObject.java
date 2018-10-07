package pageobjects;

import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class BetPageObject {

    protected WebDriver browser;

    private By betButtonSelector = By.className("qa-header-button-shortcut-bahis-yap");

    private By betTypeButtonSelector = By.className("filter-name");

    public BetPageObject(WebDriver browser) {
        this.browser = browser;
    }

    public void betPageButtonClick(){
        browser.findElement(betButtonSelector).click();
    }

    public void selectBetMatchEndMutualGols() throws InterruptedException {
        Thread.sleep(2000);
        browser.findElements(betTypeButtonSelector).get(2).click();
        Thread.sleep(2000);
        browser.findElement(By.id("filter_oddtype2")).click();
        browser.findElement(By.id("filter_oddtype3")).click();
        browser.findElement(By.id("filter_oddtype5")).click();
    }

    public void selectBetMatchEndMutualGolsAndroid() throws InterruptedException {
        Thread.sleep(2000);
        browser.findElement(By.id("com.pozitron.bilyoner:id/empty_betslip_header_button_second")).click();
        Thread.sleep(2000);
        //KG Chose
        browser.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[11]/android.widget.TextView[1]")).click();
        //Four Match Chose
        browser.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.view.View[1]")).click();
        browser.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.view.View[1]")).click();
        browser.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.view.View[1]")).click();
        browser.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.view.View[1]")).click();
    }

    public void proceedToPlayMatch() throws Exception {
        browser.findElement(By.id("com.pozitron.bilyoner:id/draggable_coupon_header_textview_ratio")).click();
        browser.findElement(By.id("com.pozitron.bilyoner:id/draggable_coupon_details_button_play")).click();
    }

    public void selectFourMatchResultOne(){
        browser.findElement(By.className("filter-wrapper")).click();
        browser.findElement(By.xpath("//*[@id=\"sportsbookList\"]/div/div[2]/span[7]/div/span")).click();
        browser.findElement(By.xpath("//*[@id=\"sportsbookList\"]/div/div[5]/span[7]/div/span")).click();
        browser.findElement(By.xpath("//*[@id=\"sportsbookList\"]/div/div[8]/span[7]/div/span")).click();
        browser.findElement(By.xpath("//*[@id=\"sportsbookList\"]/div/div[11]/span[7]/div/span")).click();
    }

    public boolean betSlipeMatchList(){
        return browser.findElements(By.id("sistem4")).size() > 0;
    }

    public void selectGamesAndPlayed() throws InterruptedException {
        browser.findElement(By.className("devamBtn")).click();
        Thread.sleep(2000);
        browser.findElement(By.className("oynaBtn")).click();
    }

    public boolean successCoupon(){
        return browser.findElements(By.className("msg-success")).size() > 0; }

    public void betPageAndroidClick(){
        browser.findElement(By.id("com.pozitron.bilyoner:id/main_menu_button_textview_label")).click();
    }

    public void selectBetAndSelectMatchEndAndroid(){
        browser.findElement(By.id("com.pozitron.bilyoner:id/tutorial_item_image_view")).click();
        browser.findElement(By.id("com.pozitron.bilyoner:id/tutorial_item_image_view")).click();
        browser.findElement(By.id("com.pozitron.bilyoner:id/tutorial_item_image_view")).click();
    }

    public void fourMacthSelectAndroid(){
        browser.findElement(By.id("com.pozitron.bilyoner:id/bet1")).click();
        browser.findElement(By.id("com.pozitron.bilyoner:id/bet2")).click();
        browser.findElement(By.id("com.pozitron.bilyoner:id/bet3")).click();
        swipe();
    }
    public void swipe() {
        JavascriptExecutor js = (JavascriptExecutor) browser;
        HashMap< String, Double > swipeObject = new HashMap < String, Double > ();
        swipeObject.put("startX", 0.95);
        swipeObject.put("startY", 0.5);
        swipeObject.put("endX", 0.05);
        swipeObject.put("endY", 0.5);
        swipeObject.put("duration", 1.0);
        js.executeScript("emulator: swipe", swipeObject);
    }

    public void selectGamesInAndroid(){
        browser.findElement(By.id("com.pozitron.bilyoner:id/draggable_coupon_details_button_play")).click();
    }

    public void accountToBackAndroid(){
        browser.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")).click();
    }

    public void clickBackButton() {
        browser.navigate().back();
    }

    public boolean couponIsPlayed() throws Exception {
        String a = browser.findElement(By.id("com.pozitron.bilyoner:id/dialog_tribune_share_textview_message")).getText();
        if (a.contains("Kuponunuz oynanmıştır. Dilerseniz kuponunuzu Tribün'de paylaşabilirsiniz.")){
            return true;
        }
        return true;
    }

    public void closePlayedCouponPopUp() {
        browser.findElement(By.id("android:id/button2")).click();
        browser.navigate().back();
    }

    public void iEnterMyCouponsAndCancelIt() {
        browser.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TextView")).click();
        browser.findElement(By.id("com.pozitron.bilyoner:id/date")).click();
        browser.findElement(By.id("com.pozitron.bilyoner:id/btnCancel")).click();
        browser.findElement(By.id("android:id/button1")).click(); //Cancel

    }

}
