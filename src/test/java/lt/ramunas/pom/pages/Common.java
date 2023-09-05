package lt.ramunas.pom.pages;

import lt.ramunas.pom.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {


    public static void setUpChromeDriver() {
        Driver.setChrome();
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


    public static WebElement getElement(By locator) {
        return Driver.getInstance().findElement(locator);
    }

    public static List<WebElement> getElements(By locator) {
        return Driver.getInstance().findElements(locator);
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

    public static boolean isElementSelected(By locator) {
        return getElement(locator).isSelected();
    }

    public static boolean isElementDisabled(By locator) {
        return getElement(locator).isEnabled();
    }

    public static boolean isElementEnabled(By locator) {
        return getElement(locator).isEnabled();
    }

    public static boolean isElementVisible(By locator) {
        return getElement(locator).isDisplayed();
    }

    public static List<Boolean> getSelectedStatusesOfCheckBoxGroup(By locator) {
        List<Boolean> statusList = new ArrayList<>();

        for (WebElement element : getElements(locator)) {
            statusList.add(element.isSelected());
        }
        return statusList;
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static void selectOptionByValue(By locator, String selectValue) {
        WebElement element = getElement(locator);
        Select select = new Select(element);
        select.selectByValue(selectValue);
    }

    public static void selectOptionByVisibleText(By locator, String selectValue) {
        WebElement element = getElement(locator);
        Select select = new Select(element);
        select.selectByVisibleText(selectValue);
    }

    public static void accpetAlert() {
        getAlert().accept();
    }

    public static String getTextFromAlert() {
        return getAlert().getText();
    }
}
