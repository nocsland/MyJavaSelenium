import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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

        driver.get("http://localhost/litecart");


    }

    @After

    public void stop() {
      driver.quit();
      driver = null;
    }
}

