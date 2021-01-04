import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;


public class LiteCart {
    private WebDriver driver;


    @Before

    public void start() throws Exception {
        driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Test

    public void LiteCart() {

        driver.get("http://localhost/litecart/admin");
        driver.findElement(By.xpath("//*[@id=\"box-login\"]/form/div[1]/div[1]/div/input")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"box-login\"]/form/div[1]/div[2]/div/input")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"box-login\"]/form/div[2]/button")).click();
        assertTrue(isElementPresent(By.xpath("//*[@id=\"logotype\"]/a/img")));
        driver.findElement(By.xpath("//*[@id=\"top-bar\"]/li[10]/a")).click();


    }


    @After

    public void stop() {
        driver.quit();
        driver = null;
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}

