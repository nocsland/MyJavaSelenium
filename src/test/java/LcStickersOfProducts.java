import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;





public class LcStickersOfProducts {
    private WebDriver driver;
    private WebDriverWait wait;


    @Before

    public void start() throws Exception {
        driver = new OperaDriver();
        wait = new WebDriverWait(driver,2);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Test

    public void StickersOfProducts() {

        driver.get("http://localhost/litecart/");
//Campaign Products
        assertTrue(isElementPresent(By.xpath("//*[@id=\"box-campaign-products\"]/div/article/a/div[1]/div")));
//Popular Products
        assertTrue(isElementPresent(By.xpath("//*[@id=\"box-popular-products\"]/div/article[1]/a/div[1]/div")));
        assertTrue(isElementPresent(By.xpath("//*[@id=\"box-popular-products\"]/div/article[2]/a/div[1]/div")));
        assertTrue(isElementPresent(By.xpath("//*[@id=\"box-popular-products\"]/div/article[3]/a/div[1]/div")));
        assertTrue(isElementPresent(By.xpath("//*[@id=\"box-popular-products\"]/div/article[4]/a/div[1]/div")));
        assertTrue(isElementPresent(By.xpath("//*[@id=\"box-popular-products\"]/div/article[5]/a/div[1]/div")));
//Latest Products
        assertTrue(isElementPresent(By.xpath("//*[@id=\"box-latest-products\"]/div/article[1]/a/div[1]/div")));
        assertTrue(isElementPresent(By.xpath("//*[@id=\"box-latest-products\"]/div/article[2]/a/div[1]/div")));
        assertTrue(isElementPresent(By.xpath("//*[@id=\"box-latest-products\"]/div/article[3]/a/div[1]/div")));
        assertTrue(isElementPresent(By.xpath("//*[@id=\"box-latest-products\"]/div/article[4]/a/div[1]/div")));
        assertTrue(isElementPresent(By.xpath("//*[@id=\"box-latest-products\"]/div/article[5]/a/div[1]/div")));

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