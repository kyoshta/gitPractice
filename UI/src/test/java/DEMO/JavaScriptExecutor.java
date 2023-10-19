package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends BaseTest{
    @Test
    void demo1() throws InterruptedException {
       // driver.get("https://demoqa.com/text-box");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location='https://demoqa.com/text-box'");

        WebElement fullName = driver.findElement(By.id("userName"));

        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", fullName, "border: 2px solid red");
        fullName.sendKeys("Ben White");
        Thread.sleep(5000);


        WebElement userEmail = driver.findElement(By.id("userEmail"));

        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", userEmail, "border: 2px solid red");
        userEmail.sendKeys("bwhite@gmail.com");
        Thread.sleep(5000);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", currentAddress, "border: 2px solid red");
        currentAddress.sendKeys("North London");
        Thread.sleep(5000);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", permanentAddress, "border: 2px solid red");
        permanentAddress.sendKeys("England");
        Thread.sleep(5000);

        WebElement submitBtn = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].click()", submitBtn);

    }
}
