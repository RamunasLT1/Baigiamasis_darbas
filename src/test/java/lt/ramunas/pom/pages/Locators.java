package lt.ramunas.pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class ApklausaLt {


        public class SignIn {

            public static By inputEmail = By.xpath("(//input[@id='user_email'])[1]");
            public static By inputPswd = By.xpath("(//input[@id='user_password'])[1]");
            public static By buttonPrisijungti = By.xpath("//input[@value='Prisijungti']");
            public static By readSignInMessage = By.xpath("//div[@class='notice']");
            public static By readErrorMessage = By.xpath("//div[@class='messages']");
        }

        public static class AtsvaituNesiojimas {

            public static By genderSelect = By.xpath("//input[@data-id='5945888']");
            ;
            public static By inputAge = By.xpath("(//input[@type='text'])[1]");
            public static By clickOnTaip = By.xpath("//input[@data-id='5945897']");
            public static By paragraphGender = By.xpath("//select[@class='options'])[1]");
            public static By readMessage = By.xpath("//h2[@class='notice']");
            public static By isElementActive = By.xpath("(//input[@type='text'])[2]");
            public static By clickOnSiustiAtsakyma = By.xpath("//input[@value='Siųsti atsakymą']");
            public static By errorMessage = By.xpath("//div[@class='alert answer-errors']");

        }

    }
}
