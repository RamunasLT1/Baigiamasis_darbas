package lt.ramunas.pom.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class Driver {

    private static WebDriver webDriver;

    public static void setEdge() {
        WebDriverManager.edgedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--force-device-scale-factor=0.80");
//        options.addArguments("--headless=new");

        webDriver = new EdgeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }

    public static WebDriver getInstance() {
        return webDriver;
    }

    public static void quitWebDriver() {
        webDriver.close();
        webDriver.quit();
    }
}
