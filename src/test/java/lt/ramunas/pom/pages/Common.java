package lt.ramunas.pom.pages;

import lt.ramunas.pom.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class Common {


    public static void setUpEdgeDriver() {
        Driver.setEdge();
    }

    public static void openUrl(String url) {
        Driver.getInstance().get(url);
    }

    public static void quitDriver() {
        Driver.quitWebDriver();
    }

    public static Alert getAlert() {
        return Driver.getInstance().switchTo().alert();
    }

    public static void dismissAlert() {
        getAlert().dismiss();
    }


    public static WebElement getElement(By locator) {
        return Driver.getInstance().findElement(locator);
    }


    public static void sendKeysToElement(By locator, String message) {
        getElement(locator).sendKeys(message);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }


    public static boolean isElementEnabled(By locator) {
        return getElement(locator).isEnabled();
    }

    public static boolean isElementVisible(By locator) {
        return getElement(locator).isDisplayed();
    }

    public static boolean waitForElementToBeVisibleCustomised(By locator, int seconds) {

        for (int i = 1; i <= (seconds); i++) {
            try {
                Thread.sleep(500);

                if (isElementVisible(locator)) {
                    return true;
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (NoSuchElementException e) {
            }
        }
        return false;
    }

    public static void accpetAlert() {
        getAlert().accept();
    }

}
