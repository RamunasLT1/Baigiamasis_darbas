package lt.ramunas.pom.pages.apklausalt;

import lt.ramunas.pom.pages.Common;
import lt.ramunas.pom.pages.Locators;

public class DeletePollPage {
    public static void open() {
        Common.setUpChromeDriver();
        Common.openUrl("https://apklausa.lt/users/sign_in");
    }

    public static void clickOnSalinti() {
        Common.clickOnElement(Locators.ApklausaLt.DeletePoll.buttonDelete);
    }

    public static void clickOnOkToCloseAlertBox() {
        Common.accpetAlert();
    }

    public static void clickOnCancelToCloseAlertBox() {
        Common.dismissAlert();
    }

    public static String readTextAfterDelete() {
        return Common.getTextFromElement(Locators.ApklausaLt.DeletePoll.afterDelete);
    }
}
