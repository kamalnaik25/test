package second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class login {

    @Test
    public void launch()throws Exception{

//        System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized"); // open Browser in maximized mode
//        WebDriver driver = new ChromeDriver(options);
//        driver.get("http://google.com");
        System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("start-maximized"); // open Browser in maximized mode
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://google.com");
        Thread.sleep(3000);
        driver.quit();
    }
}
