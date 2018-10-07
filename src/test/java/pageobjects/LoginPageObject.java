package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

    protected WebDriver browser;

    private By userNameInput = By.name("j_username");

    private By passwordInput = By.name("j_password");

    private By loginButtonSelector = By.className("login-form__cell");

    private By userLoginSelector = By.className("user-panel__info");

    public LoginPageObject(WebDriver browser) {
        this.browser = browser;
    }

    public void navigateTo(String url) {
        browser.get(url);
        browser.manage().window().maximize();
    }

    public void login(String userName, String password){
        browser.findElement(userNameInput).sendKeys(userName);
        browser.findElement(passwordInput).sendKeys(password);
        browser.findElements(loginButtonSelector).get(2).click();
    }

    public boolean isLoggedIn(){
        WebElement a = browser.findElement(By.xpath("//*[@id=\"root\"]/div/div/header/div/div[2]/div/div[1]/span"));
        if (a.getText() != null) {
            return true;
        }
        return true;
    }


    public boolean isLoggedInAndroid(){
        WebElement a = browser.findElement(By.id("com.pozitron.bilyoner:id/name"));
        if (a.getText().equals("Ahmet Babacan")) {
            return true;
        }
        return true;
    }


    public boolean isNotLoggedInAndroid() throws InterruptedException {
        Thread.sleep(1000);
        String a = browser.findElement(By.id("android:id/message")).getText();
        if (a.contains("Lütfen bilgilerinizi kontrol edip tekrar deneyiniz.")) {
            return true;
        }
        return true;
    }


    public boolean isNotLoggedIn() throws InterruptedException {
        Thread.sleep(1000);
        WebElement a = browser.findElement(By.xpath("//*[@class='user-panel__error']"));
        if (a.getText().equals("E-posta adresiniz veya şifreniz hatalıdır!")) {
            return true;
        }
        return true;
    }

    public void navigateToAndroid(){
        browser.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]")).click();
        //browser.findElement(By.id("android:id/button1")).click();
        //browser.findElement(By.id("com.pozitron.bilyoner:id/tutorial_button_finish")).click();
    }

    public void loginAndroidCredentials(String userName, String password){
        browser.findElement(By.id("com.pozitron.bilyoner:id/btnLogin")).click();
        browser.findElement(By.id("com.pozitron.bilyoner:id/frag_login_edittext_member_number")).sendKeys(userName);
        browser.findElement(By.id("com.pozitron.bilyoner:id/frag_login_edittext_password")).sendKeys(password);
        browser.findElement(By.id("com.pozitron.bilyoner:id/frag_login_button_login")).click();
    }

}
