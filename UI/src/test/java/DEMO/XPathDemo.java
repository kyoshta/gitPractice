package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class XPathDemo extends BaseTest{

    @Test
    void absoluteXpath() throws InterruptedException {

        driver.get("https://demoqa.com/automation-practice-form");
        WebElement byXpath = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/form/div[4]/div[2]/input"));
        byXpath.sendKeys("1234567890");
        Thread.sleep(7000);


    }
    @Test
    void relativeXpath() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement lastNameInputField = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameInputField.sendKeys("Rice");

        WebElement emailInputField = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        emailInputField.sendKeys("drice@gmail.com");

        WebElement mobNoInputField = driver.findElement(By.xpath("//*[@id='userNumber']"));
        mobNoInputField.sendKeys("0414141410");

        WebElement regFormText = driver.findElement(By.xpath("//*[text()='Student Registration Form']"));

        WebElement contains = driver.findElement(By.xpath("//*[contains(text(), 'Student')]"));

        WebElement emailText = driver.findElement(By.xpath("//form/div[2]/div/label"));
        Thread.sleep(8000);

        // WebElement byIndex = driver.findElement(By.xpath("(//*[@id='currentAddress'])[2]"));
        // WebElement parent = driver.findElement(By.xpath("(//*[@id='currentAddress'])[2]/../.."));

    }


}
