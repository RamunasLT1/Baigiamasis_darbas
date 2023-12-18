package lt.ramunas.pom.tests.apklausalt;

import lt.ramunas.pom.pages.apklausalt.SignInPage;
import lt.ramunas.pom.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        SignInPage.open();

    }

    @Test
    public void testSignInPositive() {
        String eMail = "qwarez@inbox.lt";
        String password = "a8P4k3L5a8u6S4a1";
        String expectedResult = "Prisijungėte sėkmingai.";
        String actualResult;

        SignInPage.writeEmail(eMail);
        SignInPage.writePswd(password);
        SignInPage.clickOnButtonPrisijungti();

        actualResult = SignInPage.readSignInMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSignInNegativePaswd() {
        String eMail = "qwarez@inbox.lt";
        String password = "a8P4k3L5a8u6S4a";
        String expectedResult = "Neteisingas el. paštas arba slaptažodis.";
        String actualResult;

        SignInPage.writeEmail(eMail);
        SignInPage.writePswd(password);
        SignInPage.clickOnButtonPrisijungti();

        actualResult = SignInPage.readErrorMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSignInNegativeEmail() {
        String eMail = "qwz@inbox.lt";
        String password = "a8P4k3L5a8u6S4a1";
        String expectedResult = "Invalid El. paštas or password.";
        String actualResult;

        SignInPage.writeEmail(eMail);
        SignInPage.writePswd(password);
        SignInPage.clickOnButtonPrisijungti();

        actualResult = SignInPage.readErrorMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
