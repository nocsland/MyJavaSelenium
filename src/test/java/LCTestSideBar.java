import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class LCTestSideBar {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before

    public void start() throws Exception {
        driver = new OperaDriver();
        wait = new WebDriverWait(driver,2);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test

    public void TestSideBar() {
//login and wait title
        driver.get("http://localhost/litecart/admin");
        driver.findElement(By.xpath("//*[@id=\"box-login\"]/form/div[1]/div[1]/div/input")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"box-login\"]/form/div[1]/div[2]/div/input")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"box-login\"]/form/div[2]/button")).click();
        wait.until(titleIs("Dashboard | My Store"));
//click and wait title Appearance
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[1]/a/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[1]/ul/li[1]/a/span")).click();
        wait.until(titleIs("Template | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[1]/ul/li[2]/a/span")).click();
        wait.until(titleIs("Logotype | My Store"));
//click and wait title Catalog
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[2]/a/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[2]/ul/li[1]/a/span")).click();
        wait.until(titleIs("Catalog | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[2]/ul/li[2]/a/span")).click();
        wait.until(titleIs("Attribute Groups | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[2]/ul/li[3]/a/span")).click();
        wait.until(titleIs("Manufacturers | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[2]/ul/li[4]/a/span")).click();
        wait.until(titleIs("Suppliers | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[2]/ul/li[5]/a/span")).click();
        wait.until(titleIs("Delivery Statuses | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[2]/ul/li[6]/a/span")).click();
        wait.until(titleIs("Sold Out Statuses | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[2]/ul/li[7]/a/span")).click();
        wait.until(titleIs("Quantity Units | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[2]/ul/li[8]/a/span")).click();
        wait.until(titleIs("Import/Export CSV | My Store"));
//click and wait title Country
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[3]/a/span[2]")).click();
        wait.until(titleIs("Countries | My Store"));
//click and wait title Currencies
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[4]/a/span[2]")).click();
        wait.until(titleIs("Currencies | My Store"));
//click and wait title Customers
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[5]/a/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[5]/ul/li[1]/a/span")).click();
        wait.until(titleIs("Customers | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[5]/ul/li[2]/a/span")).click();
        wait.until(titleIs("CSV Import/Export | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[5]/ul/li[3]/a/span")).click();
        wait.until(titleIs("Newsletter | My Store"));
//click and wait title Geo Zones
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[6]/a/span[2]")).click();
        wait.until(titleIs("Geo Zones | My Store"));
//click and wait title Languages
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[7]/a/span[2]")).click();
        wait.until(titleIs("Languages | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[7]/ul/li[1]/a/span")).click();
        wait.until(titleIs("Languages | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[7]/ul/li[2]/a/span")).click();
        wait.until(titleIs("Storage Encoding | My Store"));
//click and wait title Modules
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[8]/a/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[8]/ul/li[1]/a/span")).click();
        wait.until(titleIs("Customer Modules | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[8]/ul/li[2]/a/span")).click();
        wait.until(titleIs("Shipping Modules | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[8]/ul/li[3]/a/span")).click();
        wait.until(titleIs("Payment Modules | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[8]/ul/li[4]/a/span")).click();
        wait.until(titleIs("Order Modules | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[8]/ul/li[5]/a/span")).click();
        wait.until(titleIs("Order Total Modules | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[8]/ul/li[6]/a/span")).click();
        wait.until(titleIs("Job Modules | My Store"));
//click and wait title Orders
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[9]/a/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[9]/ul/li[1]/a/span")).click();
        wait.until(titleIs("Orders | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[9]/ul/li[2]/a/span")).click();
        wait.until(titleIs("Order Statuses | My Store"));

//click and wait title Pages
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[10]/a/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[10]/ul/li[1]/a/span")).click();
        wait.until(titleIs("Pages | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[10]/ul/li[2]/a/span")).click();
        wait.until(titleIs("CSV Import/Export | My Store"));
//click and wait title Reports
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[11]/a/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[11]/ul/li[1]/a/span")).click();
        wait.until(titleIs("Monthly Sales | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[11]/ul/li[2]/a/span")).click();
        wait.until(titleIs("Most Sold Products | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[11]/ul/li[3]/a/span")).click();
        wait.until(titleIs("Most Shopping Customers | My Store"));
//click and wait title Settings
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[12]/a/span[2]")).click();
        wait.until(titleIs("Settings | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[12]/ul/li[1]/a/span")).click();
        wait.until(titleIs("Settings | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[12]/ul/li[2]/a/span")).click();
        wait.until(titleIs("Settings | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[12]/ul/li[3]/a/span")).click();
        wait.until(titleIs("Settings | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[12]/ul/li[4]/a/span")).click();
        wait.until(titleIs("Settings | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[12]/ul/li[5]/a/span")).click();
        wait.until(titleIs("Settings | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[12]/ul/li[6]/a/span")).click();
        wait.until(titleIs("Settings | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[12]/ul/li[7]/a/span")).click();
        wait.until(titleIs("Settings | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[12]/ul/li[8]/a/span")).click();
        wait.until(titleIs("Settings | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[12]/ul/li[9]/a/span")).click();
        wait.until(titleIs("Settings | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[12]/ul/li[10]/a/span")).click();
        wait.until(titleIs("Settings | My Store"));
//click and wait title Slides
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[13]/a/span[2]")).click();
        wait.until(titleIs("Slides | My Store"));
//click and wait title Tax
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[14]/a/span[2]")).click();
        wait.until(titleIs("Tax Rates | My Store"));
        driver.findElement(By.xpath("//*//*[@id=\"box-apps-menu\"]/li[14]/ul/li[1]/a/span")).click();
        wait.until(titleIs("Tax Rates | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[14]/ul/li[2]/a/span")).click();
        wait.until(titleIs("Tax Classes | My Store"));
//click and wait title Translations
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[15]/a/span[2]")).click();
        wait.until(titleIs("Search Translations | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[15]/ul/li[1]/a/span")).click();
        wait.until(titleIs("Search Translations | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[15]/ul/li[2]/a/span")).click();
        wait.until(titleIs("Scan Translations | My Store"));
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[15]/ul/li[3]/a/span")).click();
        wait.until(titleIs("Import/Export CSV | My Store"));
//click and wait title Users
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[16]/a/span[2]")).click();
        wait.until(titleIs("Users | My Store"));
//click and wait title vQmods
        driver.findElement(By.xpath("//*[@id=\"box-apps-menu\"]/li[17]/a/span[2]")).click();
        wait.until(titleIs("vQmods | My Store"));


    }

    @After

    public void stop() {
        driver.quit();
        driver = null;

    }

}
