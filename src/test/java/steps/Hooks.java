package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import library.BaseSteps;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Hooks extends BaseSteps {

    private BaseSteps base;

    public Hooks(BaseSteps base) {
        this.base = base;
    }

    @Before()
    public void initializeTest() throws MalformedURLException {
        switch (config.getPlatform()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                base.driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                base.driver = new FirefoxDriver();
                break;
           case "android":
               File appDir = new File(
                       "src/test/java/driver");
               File app = new File(appDir, "Bilyoner-5.1.0.apk");

               DesiredCapabilities capabilities = new DesiredCapabilities();
               capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
               capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
               capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
               capabilities.setCapability("appPackage", "com.pozitron.bilyoner");
               capabilities.setCapability(MobileCapabilityType.APP, app);

               base.driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

               //TODO:Genymotion capabilities
               //capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
               //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.56.101:5555");
               //capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        }
    }

    @After
    public void after(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            File scrFile = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("target/bilyoner.jpg"));
        }

        for (String winHandle : base.driver.getWindowHandles()) {
            try {
                base.driver.switchTo().window(winHandle);
                base.driver.close();
                base.driver.quit();
            } catch (Exception e) {
            }
        }
    }
}
