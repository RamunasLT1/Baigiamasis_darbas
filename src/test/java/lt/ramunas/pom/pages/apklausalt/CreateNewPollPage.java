package lt.ramunas.pom.pages.apklausalt;

import lt.ramunas.pom.pages.Common;
import lt.ramunas.pom.pages.Locators;

public class CreateNewPollPage {
    public static void open() {
        Common.setUpChromeDriver();
        Common.openUrl("https://apklausa.lt/users/sign_in");
    }

    public static void writeInTitle(String pollName) {
        Common.sendKeysToElement(Locators.ApklausaLt.NewPollCreation.writeTitle, pollName);
    }


    public static void clickOnSukurti() {
        Common.clickOnElement(Locators.ApklausaLt.NewPollCreation.buttonSukurti);
    }

    public static String readMessage() {
        return Common.getTextFromElement(Locators.ApklausaLt.NewPollCreation.readMessage);
    }

    public static String readErrorMessage() {
        return Common.getTextFromElement(Locators.ApklausaLt.NewPollCreation.errorMessage);
    }

    public static void signIn() {
        String eMail = "qwarez@inbox.lt";
        String password = "a8P4k3L5a8u6S4a1";
        SignInPage.writeEmail(eMail);
        SignInPage.writePswd(password);
        SignInPage.clickOnButtonPrisijungti();
    }

    public static void clickOnManoAnketos() {
        Common.clickOnElement(Locators.ApklausaLt.NewPollCreation.manoAnketos);
    }

    public static void clickOnKurtiNaujaAnketa() {
        Common.clickOnElement(Locators.ApklausaLt.NewPollCreation.buttonKurtiNauja);
    }
}
