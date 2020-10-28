
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test {


    WebDriver driver;
    String url = "https://www.emirates.com/us/english/";
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "windowsdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        wait = new WebDriverWait(driver, 5);
        driver.get(url);
    }

    @Test
    public void HomePage() {

        String actual = driver.getTitle();
        String expected = "Emirates flights – Book a flight, browse our flight offers and explore the Emirates Experience";
        Assert.assertEquals(actual, expected, "is failed ");
    }

    @Test
    public void Search() throws InterruptedException {
        // Click on register
        ClickElements.clickByClassName(driver, "login-icon"); // mouse Hover
        Thread.sleep(5000);
        driver.findElement(By.linkText("Register now")).click();
        Thread.sleep(5000);
        // Validate  #content > div
//        String actualt = driver.findElement(By.className("intro-text")).getText();
//        String expected = "Open up a world of rewards every time you travel. Enjoy reward flights, upgrades, exclusive benefits, and more.";
//        Assert.assertEquals(actualt,expected, "Test Fail: Search keyword does not match");

    }

    @Test
    public void regestration() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='txtSkywardsNumber']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("702b-10a1-2809-b5ee-0")).click();
    }

    @AfterMethod
    public void TearDown() {
        driver.close();
//        driver.quit();
    }


}
