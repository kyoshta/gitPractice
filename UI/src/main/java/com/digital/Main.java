package com.digital;

import com.digital.driver.Driver;
import com.digital.helper.AlertHelper;
import com.digital.helper.ScreenShotMethods;
import com.digital.pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class Main extends BasePage {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
    }

    @Test
    public void test1() throws InterruptedException, IOException {
        ScreenShotMethods screenShotMethods = new ScreenShotMethods();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Alert alert = Driver.getDriver().switchTo().alert();
        Thread.sleep(5000);
        alert.accept();
        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();


        driver.findElement(By.id("confirmButton")).click();
        alert.dismiss();

        driver.findElement(By.id("promtButton")).click();
        alert.sendKeys("Nuta");
        alert.accept();
        screenShotMethods.takeScreenShot();


    }

    @Test
    public void testToAlert() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        AlertHelper alertHelper = new AlertHelper();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(5000);
        alertHelper.acceptAlert();
        driver.findElement(By.id("timerAlertButton")).click();
        alertHelper.acceptAlert();
        Thread.sleep(2000);
        driver.findElement(By.id("confirmButton")).click();
        alertHelper.dismissAlert();
        driver.findElement(By.id("promtButton")).click();
        alertHelper.sendKeysAlert("Jildiz");







    }
}