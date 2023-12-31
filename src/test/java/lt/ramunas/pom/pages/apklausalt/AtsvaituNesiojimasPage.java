package lt.ramunas.pom.pages.apklausalt;

import lt.ramunas.pom.pages.Common;
import lt.ramunas.pom.pages.Locators;

public class AtsvaituNesiojimasPage {
    public static void open() {
        Common.setUpEdgeDriver();
        Common.openUrl("https://apklausa.lt/f/atsvaitu-nesiojimas-4dzmdag/answers/new.html");
    }


    public static void clickOnVyrasCheckBox() {
        Common.clickOnElement(Locators.ApklausaLt.AtsvaituNesiojimas.genderSelect);
    }

    public static void inputAgeValue(String amzius) {

        Common.sendKeysToElement(Locators.ApklausaLt.AtsvaituNesiojimas.inputAge, amzius);
    }

    public static String readResultMessage() {
        return Common.getTextFromElement(Locators.ApklausaLt.AtsvaituNesiojimas.readMessage);
    }

    public static void clickOnTaip() {
        Common.clickOnElement(Locators.ApklausaLt.AtsvaituNesiojimas.clickOnTaip);
    }

    public static boolean isFieldPriezastisActive() {
        return Common.isElementEnabled(Locators.ApklausaLt.AtsvaituNesiojimas.isElementActive);

    }

    public static void clickOnSiustiAtsakyma() {
        Common.clickOnElement(Locators.ApklausaLt.AtsvaituNesiojimas.buttonSiustiAtsakyma);
    }


    public static boolean isErrorPresent() {
        return Common.waitForElementToBeVisibleCustomised(
                Locators.ApklausaLt.AtsvaituNesiojimas.errorMessage,
                3
        );
    }

    public static void readErrorMesage() {
        Common.getTextFromElement(Locators.ApklausaLt.AtsvaituNesiojimas.errorMessage);
    }



}
