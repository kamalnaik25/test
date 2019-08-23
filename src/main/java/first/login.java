package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {

    @Test
    public void launch()throws Exception{

        System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        Thread.sleep(3000);
        driver.quit();
    }
}
