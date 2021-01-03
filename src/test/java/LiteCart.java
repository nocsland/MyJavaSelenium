import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;


import java.io.File;
import java.util.concurrent.TimeUnit;


public class LiteCart {
    private WebDriver driver;


    @Before

    public void start() throws Exception {
        driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test

    public void LiteCart() {

        driver.get("http://localhost/litecart/admin");
        driver.findElement(By.xpath("//*[@id=\"box-login\"]/form/div[1]/div[1]/div/input")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"box-login\"]/form/div[1]/div[2]/div/input")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"box-login\"]/form/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"top-bar\"]/li[10]/a")).click();



    }

    @After

    public void stop() {
      driver.quit();
      driver = null;
    }
}

