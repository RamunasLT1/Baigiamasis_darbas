package lt.ramunas.pom.tests.apklausalt;

import lt.ramunas.pom.pages.apklausalt.CreateNewPollPage;
import lt.ramunas.pom.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateNewPollTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        CreateNewPollPage.open();
        CreateNewPollPage.signIn();
        CreateNewPollPage.clickOnManoAnketos();
    }


    @Test
    public void testNewPollCreationPositive() {

        String pollName = "Mėgstamiausios uogos";
        String expectedResult = "Anketa sukurta";
        String actualResult;

        CreateNewPollPage.writeInTitle(pollName);
        CreateNewPollPage.clickOnSukurti();
        actualResult = CreateNewPollPage.readMessage();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testNewPollCreationNoNameNegative() {

        String expectedResult = "negali būti tuščias";
        String actualResult;

        CreateNewPollPage.clickOnKurtiNaujaAnketa();
        CreateNewPollPage.clickOnSukurti();
        actualResult = CreateNewPollPage.readErrorMessage();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
