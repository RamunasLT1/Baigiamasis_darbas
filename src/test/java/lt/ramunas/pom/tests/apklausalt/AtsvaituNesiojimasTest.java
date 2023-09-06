package lt.ramunas.pom.tests.apklausalt;

import lt.ramunas.pom.pages.apklausalt.AtsvaituNesiojimasPage;
import lt.ramunas.pom.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AtsvaituNesiojimasTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        AtsvaituNesiojimasPage.open();
    }

    @Test
    public void testAtsvaituNesiojimasPollPositive() {
        String amzius = "34";
        boolean isPriezastisKodelActive;
        String expectedResult = "Dėkojame už atsakymą!";
        String actualResult;

        AtsvaituNesiojimasPage.clickOnVyrasCheckBox();
        AtsvaituNesiojimasPage.inputAgeValue(amzius);
        AtsvaituNesiojimasPage.clickOnTaip();
        AtsvaituNesiojimasPage.clickOnSiustiAtsakyma();
        isPriezastisKodelActive = AtsvaituNesiojimasPage.isFieldPriezastisActive();

        actualResult = AtsvaituNesiojimasPage.readResultMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format(
                        "\nActual: %s\nExpected: %s",
                        actualResult,
                        expectedResult
                )
        );
        System.out.println("Galima įrašyti priežastį kodėl ? " + (isPriezastisKodelActive ? "TAIP" : "NE"));
    }

    @Test
    public void testAtsvaituNesiojimasPollNegative() {
        String amzius = "34";
        boolean expectedResult = true;
        boolean actualResult;

        AtsvaituNesiojimasPage.clickOnVyrasCheckBox();
        AtsvaituNesiojimasPage.inputAgeValue(amzius);
        AtsvaituNesiojimasPage.clickOnSiustiAtsakyma();

        actualResult = AtsvaituNesiojimasPage.isErrorPresent();

        if (actualResult) {
            AtsvaituNesiojimasPage.readErrorMesage();
        }
        Assert.assertEquals(actualResult, expectedResult);
    }
}
