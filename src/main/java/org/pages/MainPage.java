package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.setup.DriverSetup;

public class MainPage {
    private WebDriver driver;
    DriverSetup driverSetup = new DriverSetup();
    LoginPage loginPage = new LoginPage();
    public void fillForm() {
        driver = driverSetup.setUp();
        loginPage.login();
        WebElement nazivInput = driver.findElement(By.name("naziv"));
        WebElement trenerInput = driver.findElement(By.id("trener-input"));
        WebElement trajanjeInput = driver.findElement(By.name("trajanje"));
        WebElement brSudionikaInput = driver.findElement(By.name("brSudionika"));
        WebElement opisInput = driver.findElement(By.name("opis"));

        nazivInput.sendKeys("test1");
        trenerInput.sendKeys("Test Jedan");
        trajanjeInput.sendKeys("3");
        brSudionikaInput.sendKeys("10");
        opisInput.sendKeys("Opis edukacije");
    }

}
