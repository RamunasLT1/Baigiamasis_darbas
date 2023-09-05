package lt.ramunas.pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class apklausaLt {


        public class SignIn {

            public static By inputEmail = By.xpath("(//input[@id='user_email'])[1]");
            public static By inputPswd = By.xpath("(//input[@id='user_password'])[1]");
            public static By buttonPrisijungti = By.xpath("//input[@value='Prisijungti']");
            public static By readSignInMessage = By.xpath("//div[@class='notice']");
        }

    }
}
