package org.initial;

import org.junit.Test;
import org.pages.LoginPage;
import org.pages.MainPage;

public class MainTest {
    MainPage mainPage = new MainPage();

    @Test
    public void fillMainForm() {
        mainPage.fillForm();
    }
}
