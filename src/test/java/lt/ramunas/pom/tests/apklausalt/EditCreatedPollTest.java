package lt.ramunas.pom.tests.apklausalt;

import lt.ramunas.pom.pages.apklausalt.EditCreatedPollPage;
import lt.ramunas.pom.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditCreatedPollTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        EditCreatedPollPage.open();
        EditCreatedPollPage.signIn();
        EditCreatedPollPage.clickOnManoAnketos();
    }

    @Test
    public void testEditOfCreatedPoll() {

        String questionText = "Kokias uogas valgote dažniausiai?";
        String expectedResult = "Kokias uogas valgote dažniausiai?";
        String actualResult;

        EditCreatedPollPage.clickOnCreatedPoll();
        EditCreatedPollPage.clickOnKlausimai();
        EditCreatedPollPage.clickOnEiluteTekstoIvedimui();
        EditCreatedPollPage.writeQuestion(questionText);
        EditCreatedPollPage.submitChanges();

        actualResult = EditCreatedPollPage.readNewQuestionText();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
