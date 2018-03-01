/**
 * Created by elizavetaskomorohova on 28.01.18.
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Webdriver_class

{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        driver.close();

    }

}
