package lt.ramunas.pom.tests;

import lt.ramunas.pom.pages.apklausalt.AtsvaituNesiojimasPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;

public class AtsvaituNesiojimasTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        AtsvaituNesiojimasPage.open();
    }

    @Test
    public void testAtsvaituNesiojimasQuestionnairePositive() {
        String amzius = "34";
        boolean isActive;
        String expectedResult = "Dėkojame už atsakymą!";
        String actualResult;

        AtsvaituNesiojimasPage.clickOnVyrasCheckBox();
        AtsvaituNesiojimasPage.inputAgeValue(amzius);
        AtsvaituNesiojimasPage.clickOnTaip();
        AtsvaituNesiojimasPage.isFieldPriezastisActive();
        AtsvaituNesiojimasPage.clickOnSiustiAtsakyma();
        isActive = AtsvaituNesiojimasPage.isFieldPriezastisActive();

        actualResult = AtsvaituNesiojimasPage.readResultMessage();
        System.out.println("Į laukelį <Jeigu nenešiojate, parašykite trumpą priežastį kodėl' galima rašyti> " + (isActive ? "TAIP" : "NE"));
        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format(
                        "\nActual: %s\nExpected: %s",
                        actualResult,
                        expectedResult
                )
        );
    }

    @Test
    public void testAtsvaituNesiojimasQuestionnaireNegative() {
        String amzius = "34";
        boolean isActive;
        String expectedResult = "Rastos klaidos";
        String actualResult;
        boolean isErrorMessage;

        AtsvaituNesiojimasPage.clickOnVyrasCheckBox();
        AtsvaituNesiojimasPage.inputAgeValue(amzius);
        AtsvaituNesiojimasPage.isFieldPriezastisActive();
        AtsvaituNesiojimasPage.clickOnSiustiAtsakyma();
        AtsvaituNesiojimasPage.isErrorMessagePresent();

        isErrorMessage = AtsvaituNesiojimasPage.isErrorMessagePresent();
        isActive = AtsvaituNesiojimasPage.isFieldPriezastisActive();

        System.out.println("Į laukelį 'Jeigu nenešiojate, parašykite trumpą priežastį kodėl' galima rašyti'" + (isActive ? "TAIP" : "NE"));
        System.out.println("Klaidos pranešimas atsiranda ? " + (isErrorMessage ? "TAIP" : "NE"));

        actualResult = AtsvaituNesiojimasPage.readErrorMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format(
                        "\nActual: %s\nExpected: %s",
                        actualResult,
                        expectedResult
                )
        );
    }
}
