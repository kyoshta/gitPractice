package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicLocators extends BaseTest{

    @Test
    void byIdTest(){

        WebElement byId = driver.findElement(By.id("userName"));

    }

    @Test
    void byTagName(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement byTag = driver.findElement(By.tagName("h5"));
        System.out.println(byTag.getText());
    }

    @Test
    void byClassName(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement byClassName = driver.findElement(By.className("main-header"));
        System.out.println(byClassName.getText());
    }

    @Test
    void byLinkedText(){
        driver.get("https://demoqa.com/links");
        WebElement linkedText = driver.findElement(By.linkText("Home"));
        System.out.println(linkedText.getText());
    }

    @Test
    void byPartialLinkedText(){
        driver.get("https://demoqa.com/links");
        WebElement partialLink = driver.findElement(By.partialLinkText("Bad"));
        System.out.println(partialLink.getText());

    }
    @Test
    void byName(){
        driver.get("https://accounts.lambdatest.com/login");
        WebElement byName = driver.findElement(By.name("email"));
        System.out.println(byName.getText());
    }

}
