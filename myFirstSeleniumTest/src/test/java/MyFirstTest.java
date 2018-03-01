/**
 * Created by elizavetaskomorohova on 20.12.17.
 */

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {
    @Test
    public void startWebDriver() {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://seleniumsimplified.com/");
        Assert.assertTrue(
            "title should start wit SeleniumSimplified",
            driver.getTitle().startsWith("Selenium Simplified")
        );
        driver.close();
        driver.quit();
    }
}