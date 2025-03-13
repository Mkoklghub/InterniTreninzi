package org.pages;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.setup.DriverSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class LoginPage {
    private WebDriver driver;

    DriverSetup driverSetup = new DriverSetup();


    public void mainLoginPage() {
        driver = driverSetup.setUp();
        driver.get("https://akademija.fina.hr/prijava");
    }


    public void login() {
        driver = driverSetup.setUp();
        driver.get("https://akademija.fina.hr/prijava");

        // Locate the username and password fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        // Enter the username and password
        usernameField.sendKeys("test1"); // Replace with your actual username
        passwordField.sendKeys("Inicijalni1"); // Replace with your actual password

        // Submit the login form (assuming there's a submit button)
        WebElement submitButton = driver.findElement(By.className("ant-btn"));
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlToBe("https://akademija.fina.hr/"));

        // Add assertions here to verify successful login
    }

    public String currentUrl(){

        String currentUrl = driver.getCurrentUrl();
        //driverSetup.quitBrowser();
        return currentUrl;
    }


}
