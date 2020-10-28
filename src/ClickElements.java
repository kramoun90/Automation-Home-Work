import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickElements {


    public static void clickByClassName(WebDriver ldriver ,String clasName){
        Actions act = new Actions(ldriver);
        act.moveToElement(ldriver.findElement(By.className(clasName))).click().build().perform();

    }
    // Click on register
//        ClickElements.clickByClassName(driver,"login-icon"); // mouse Hover
//        Thread.sleep(5000);
//        driver.findElement(By.linkText("Register now")).click();
//        Thread.sleep(5000);
}

