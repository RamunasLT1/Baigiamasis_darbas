package lt.ramunas.pom.tests.apklausalt;

import lt.ramunas.pom.pages.apklausalt.DeletePollPage;
import lt.ramunas.pom.pages.apklausalt.EditCreatedPollPage;
import lt.ramunas.pom.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeletePollTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        DeletePollPage.open();
        EditCreatedPollPage.signIn();
        EditCreatedPollPage.clickOnManoAnketos();
    }


    @Test
    public void testPollDelete() {

        String expectedButton = "OK";
        String expectedResult = "Nauja anketa";
        String actualResult;

        DeletePollPage.clickOnSalinti();

        if (expectedButton.equals("OK")) {
            DeletePollPage.clickOnOkToCloseAlertBox();
        } else {
            DeletePollPage.clickOnCancelToCloseAlertBox();
        }
        actualResult = DeletePollPage.readTextAfterDelete();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s\nExpected: %s".formatted(
                        actualResult, expectedResult
                )

        );

    }
}
