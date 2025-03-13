package org.initial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.LoginPage;
import static org.junit.Assert.assertEquals;

public class LoginTest {

    LoginPage loginPage = new LoginPage();


    @Test
    public void getToLoginPage() {
        loginPage.mainLoginPage();
        String currentUrl = loginPage.currentUrl();
        assertEquals("The current URL should be http://akademija1.unix.fina.hr:8081/prijava",
                "https://akademija.fina.hr/prijava", currentUrl);
    }

    @Test
    public void loginInPage() {
        loginPage.login();
        String currentUrl = loginPage.currentUrl();
        assertEquals("The current URL should be https://akademija.fina.hr/","https://akademija.fina.hr/", currentUrl);
    }

}
