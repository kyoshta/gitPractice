package DEMO;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.Keys.SUBTRACT;

public class HomeWork extends BaseTest{
    @Test
    void fillTheFields()
    {

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement fillFirstName = driver.findElement(By.id("firstName"));

        String expectedFirstName = "Declan";

        fillFirstName.sendKeys(expectedFirstName);

        WebElement fillLastName = driver.findElement(By.xpath("//input[@id='lastName']"));

        String expectedLastName = "Rice";

        fillLastName.sendKeys(expectedLastName);

        WebElement fillEmailField = driver.findElement(By.id("userEmail"));

        String expectedEmailField = "drice@gmail.com";

        fillEmailField.sendKeys(expectedEmailField);

        WebElement clickFemaleBtn = driver.findElement(By.xpath("//label[normalize-space()='Male']"));

        clickFemaleBtn.click();

        WebElement fillUserNumber = driver.findElement(By.id("userNumber"));
        String expectedUserNumber = "0414141410";
        fillUserNumber.sendKeys(expectedUserNumber);

        WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        String expectedDateOfBirth = "14 Jan 1999";

        dateOfBirth.sendKeys(Keys.CONTROL + "a");
        dateOfBirth.sendKeys(expectedDateOfBirth);
        dateOfBirth.sendKeys(Keys.ENTER);



        WebElement subject = driver.findElement(By.id("subjectsInput"));


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");


        subject.sendKeys("Computer Science");
        subject.sendKeys(Keys.ENTER);

        WebElement checkBox = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
        checkBox.click();

        WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
        uploadPicture.sendKeys("C:\\Users\\user\\Pictures\\Фоновые изображения рабочего стола\\2. Хаски.jpg");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("London");



        WebElement state = driver.findElement(By.id("react-select-3-input"));
        state.sendKeys("NCR");
        state.sendKeys(Keys.ENTER);

        WebElement city = driver.findElement(By.id("react-select-4-input"));
        city.sendKeys("Delhi");
        city.sendKeys(Keys.ENTER);



        WebElement submitBtn = driver.findElement(By.id("submit"));

        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '60%';\n" + "");
        submitBtn.sendKeys(Keys.ENTER);

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//        driver.close();
//
//        driver.quit();




    }
}
