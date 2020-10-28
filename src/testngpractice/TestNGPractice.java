package testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.awt.image.Kernel;
import java.io.File;
import java.security.Key;

public class TestNGPractice {


    public String url = "https://www.emirates.com/us/english/";
    public String expected;
    public String actual;
    public String sourcecode;
    public WebDriver fd;

    @BeforeTest
    public void launchbrowser() {
        System.setProperty("webdriver.chrome.driver", "windowsdriver/chromedriver.exe");
        fd = new ChromeDriver();
        fd.get(url);
    }

    @BeforeMethod
    public void verifytitle() throws InterruptedException {
        expected = "Emirates flights – Book a flight, browse our flight offers and explore the Emirates Experience";
        Thread.sleep(5000);
        actual = fd.getTitle();
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
        Thread.sleep(5000);
    }

    @Test
    public void departure() throws InterruptedException {
//        fd.findElement(By.xpath("//body/form[@id='aspnetForm']/div[2]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/eol-airport-select[1]/div[1]/i[1]")).click();
        fd.findElement(By.xpath("//body/main[@id='maincontent']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]")).click();
//        fd.findElement(By.xpath("//body/form[@id='aspnetForm']/div[2]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/eol-airport-select[1]/div[2]/div[1]/section[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[5]")).click();
        expected = "Boston,";
        actual = fd.findElement(By.xpath("//body/main[@id='maincontent']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/ol[1]/li[1]/div[1]/div[1]/p[1]/span[1]")).getText();
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
//        Thread.sleep(5000);

    }


    @Test
    public void Arrival() throws InterruptedException {
        fd.findElement(By.name("Arrival Airport")).sendKeys("Algeria");
        Thread.sleep(5000);
        fd.findElement(By.xpath("//*[@id=\"panel0\"]/div/div/div/div[2]/section/div[4]/div[1]/div[4]/a/span")).click();
        expected = "";
        actual = fd.findElement(By.name("Arrival Airport")).getText();
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
        Thread.sleep(5000);
    }

    @Test
    public void Date() throws InterruptedException {
        //select departing and arrival Date
        fd.findElement(By.xpath("//*[@id=\"panel0\"]/div/div/div/div[2]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[3]/table/tbody/tr[2]/td[3]/a")).click();
        fd.findElement(By.xpath("//*[@id=\"panel0\"]/div/div/div/div[2]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[2]/table/tbody/tr[5]/td[7]/a")).click();
        Thread.sleep(5000);
    }

    @Test
    public void passengers() throws InterruptedException {
        fd.findElement(By.xpath("//body/main[@id='maincontent']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).isDisplayed();
        fd.findElement(By.xpath("//body/main[@id='maincontent']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/button[1]")).isDisplayed();
        Thread.sleep(5000);
        expected = "";
        actual = fd.findElement(By.xpath("//body/main[@id='maincontent']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).getText();
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
        Thread.sleep(5000);
    }

    @Test
    public void economyClass() throws InterruptedException {
        fd.findElement(By.id("search-flight-class")).isDisplayed();
        Thread.sleep(5000);
        fd.findElement(By.xpath("//body/main[@id='maincontent']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/section[1]/a[1]/p[1]")).isDisplayed();
        expected = "";
        actual = fd.findElement(By.xpath("//body/main[@id='maincontent']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/section[1]/a[1]")).getText();
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
        Thread.sleep(5000);
    }

    @Test
    public void searchFlight() throws InterruptedException {
        fd.findElement(By.xpath("//*[@id='panel0']/div/div/div/div[2]/section/div[4]/div[2]/div[3]/form/button")).submit();
        Thread.sleep(5000);
        expected = "Book a flight";
        actual = fd.findElement(By.id("ctl00_c_pH_heading1")).getText();
        Assert.assertEquals(actual, expected);
        System.out.println(actual);

    }

//    @Test
//    public void regester() throws Exception {
//        Thread.sleep(5000);
//        fd.findElement(By.className("login-icon")).click();
//        fd.findElement(By.linkText("Register now")).click();
////        actual = fd.findElement(By.cssSelector(".h1-bold")).getText();
////        expected = "Join Emirates Skywards";
////        Assert.assertEquals(actual, expected);
////        System.out.println(actual);

//    }

    //    @Test
//    public void fillApplication() throws InterruptedException {
//
////        Select select = new Select(fd.findElement(By.id("//*[@id=\"MainContent_ctl01_txtTitle\"]")));
////        select.selectByVisibleText("Title");
////        Thread.sleep(5000);
//        fd.findElement(By.id("txtSkywardsNumber")).sendKeys("00000000");
//        Thread.sleep(5000);
////
////        fd.findElement(By.id("2586-d5c4-db80-e3b0-0")).sendKeys("Mr");
////        Thread.sleep(5000);
//    }
////    @Test
////    public void fillApplication() throws InterruptedException {
////
////
////        fd.findElement(By.id("txtFamilyName")).sendKeys("Kramou");
    ////        Thread.sleep(5000);
    ////
    //    }

    @AfterTest
    public void close() {
        fd.quit();
    }
}


