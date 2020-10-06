import WebDriverInit.ReadFile;
import WebDriverInit.initDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static WebDriverInit.Data.DRIVER_PATH;

public class myTest {
    WebDriver driver;


    @BeforeMethod
    public void setUp() throws IOException {
        initDriver instanceDriver = initDriver.getInstance();
        driver = instanceDriver.openBrowser();
    }


    @Test
    public void test_1() {
        driver.get("http:/www.google.com");

        System.out.println("title =" + driver.getTitle());
    }


}
