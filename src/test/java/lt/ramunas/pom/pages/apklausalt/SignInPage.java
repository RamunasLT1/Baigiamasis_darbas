package lt.ramunas.pom.pages.apklausalt;

import lt.ramunas.pom.pages.Common;
import lt.ramunas.pom.pages.Locators;

public class SignInPage {
    public static void open() {
        Common.setUpChromeDriver();
        Common.openUrl("https://apklausa.lt/users/sign_in");
    }

    public static void writeEmail(String email) {
        Common.sendKeysToElement(Locators.ApklausaLt.SignIn.inputEmail, email);
    }

    public static void writePswd(String password) {
        Common.sendKeysToElement(Locators.ApklausaLt.SignIn.inputPswd, password);

    }

    public static void clickOnButtonPrisijungti() {
        Common.clickOnElement(Locators.ApklausaLt.SignIn.buttonPrisijungti);
    }
}

