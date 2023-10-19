package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenuRadioBtnCheckBox extends BaseTest{

    @Test
    void MenuMoveTo() throws InterruptedException {
        driver.get("https://nambafood.kg/");
        Actions actions = new Actions(driver);

        WebElement menuBar = driver.findElement(By.cssSelector("a[class^='menu-link parent']"));
        actions.moveToElement(menuBar).perform();
        Thread.sleep(3000);

        WebElement faq = driver.findElement(By.xpath("(//a[@href='/faq.html'])[1]"));
        actions.moveToElement(faq).perform();
        Thread.sleep(2000);

        WebElement faqText = driver.findElement(By.xpath("(//a[@href='/faq.html'])[1]"));
        Assert.assertEquals(faqText.getText(), "ВОПРОСЫ?");
        Thread.sleep(3000);

    }

    @Test
    void checkBox() throws InterruptedException {
        driver.get("https://artoftesting.com/samplesiteforselenium");
        Actions actions = new Actions(driver);
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@class='Automation']"));
        actions.moveToElement(checkBox1).click().perform();
        //actions.click(checkBox1).click().perform();
        Thread.sleep(3000);

        WebElement checkBox1Text = driver.findElement(By.xpath("//*[@id='commonWebElements']/form[2]/text()[1]"));
        actions.moveToElement(checkBox1Text).perform();
        Assert.assertEquals(checkBox1Text.getText(), "Automation Testing");
        Thread.sleep(3000);

        WebElement checkBox2 = driver.findElement(By.xpath("//input[@class='Performance']"));
        actions.moveToElement(checkBox2).click().perform();
        Thread.sleep(3000);

        WebElement checkBox2Text = driver.findElement(By.xpath("//*[@id='commonWebElements']/form[2]/text()[2]"));
        actions.moveToElement(checkBox2Text).perform();
        Assert.assertEquals(checkBox2Text.getText(), "Performance Testing");
        Thread.sleep(3000);




    }
}
