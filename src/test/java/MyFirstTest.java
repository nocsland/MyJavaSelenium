import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class MyFirstTest {
    private WebDriver driver;
    private WebDriverWait wait;


    @Before

    public void start() throws Exception {
        driver = new OperaDriver();
        wait = new WebDriverWait(driver,2);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Test

    public void MyFirstTest() {

        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("test");
        driver.findElement(By.name("btnK")).submit();
        wait.until(titleIs("test - Поиск в Google"));

    }

    @After

    public void stop() {
        driver.quit();
        driver = null;

    }

}

