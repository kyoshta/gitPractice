package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsDemo extends BaseTest{
    public void sleep() throws InterruptedException {
        Thread.sleep(5000);
    }
    @Test
    void demo2() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);
        //make double click
        actions.doubleClick(doubleClickButton).perform();
        WebElement doubleClickText = driver.findElement(By.xpath("//p[text()='You have done a double click']"));
        Assert.assertEquals(doubleClickText.getText(), "You have done a double click");

        sleep();

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickButton).perform();

        WebElement rightClickText = driver.findElement(By.xpath("//p[text()='You have done a right click']"));
        Assert.assertEquals(rightClickButton.getText(), "You have done a right click");

        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        actions.click(clickMeButton).perform();

        WebElement clickMeText = driver.findElement(By.xpath("//p[text()='You have done a dynamic click']"));
        Assert.assertEquals(clickMeText.getText(), "You have done a dynamic click");

    }
}
