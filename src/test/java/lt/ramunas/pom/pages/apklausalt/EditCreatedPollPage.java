package lt.ramunas.pom.pages.apklausalt;

import lt.ramunas.pom.pages.Common;
import lt.ramunas.pom.pages.Locators;

public class EditCreatedPollPage {
    public static void open() {
        Common.setUpChromeDriver();
        Common.openUrl("https://apklausa.lt/users/sign_in");
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

    public static void clickOnCreatedPoll() {
        Common.clickOnElement(Locators.ApklausaLt.EditCreatedPoll.createdPoll);
    }

    public static void clickOnKlausimai() {
        Common.clickOnElement(Locators.ApklausaLt.EditCreatedPoll.klausimai);
    }

    public static void clickOnEiluteTekstoIvedimui() {
        Common.clickOnElement(Locators.ApklausaLt.EditCreatedPoll.eiluteKlausimuIvedimui);
    }

    public static void writeQuestion(String question) {
        Common.sendKeysToElement(Locators.ApklausaLt.EditCreatedPoll.newQuestion, question);
    }

    public static void submitChanges() {
        Common.clickOnElement(Locators.ApklausaLt.EditCreatedPoll.buttonIssaugoti);
    }

    public static String readNewQuestionText() {
        return Common.getTextFromElement(Locators.ApklausaLt.EditCreatedPoll.newQuestionText);
    }
}
