package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NambaFood extends BaseTest{
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)", "");
    }
    @Test
    void orderFood() throws InterruptedException {
        driver.get("https://nambafood.kg/");
        //WebElement foodButton = driver.findElement();


    WebElement edaBtn = driver.findElement(By.xpath("//*[@href='/food']"));
    edaBtn.click();
    Thread.sleep(2000);
        scrollDown();
    WebElement nationalCos = driver.findElement(By.xpath("(//*[@href='/cafe/national'])[1]"));
    nationalCos.click();
    Thread.sleep(3000);

    WebElement mubarak = driver.findElement(By.xpath("//a[@href='/mubarak-gogolya']"));
    mubarak.click();
        scrollDown();


        WebElement countUpEngBr = driver.findElement(By.xpath("(//div[@class ='count-button count-up'])[2]"));
        countUpEngBr.click();
        Thread.sleep(1000);
        countUpEngBr.click();

        Thread.sleep(2000);

        WebElement orderSubmitEngBr = driver.findElement(By.xpath("(//button[@type='submit'])[6]"));
        orderSubmitEngBr.click();

        Thread.sleep(2000);

        WebElement owlNextBtn = driver.findElement(By.xpath("//div[@class='owl-next']"));
        owlNextBtn.click();
        Thread.sleep(1000);
        owlNextBtn.click();

        Thread.sleep(3000);

        WebElement drinksBtn = driver.findElement(By.xpath("//a[@href='#188']"));
        drinksBtn.click();
        Thread.sleep(1000);
        scrollDown();
        Thread.sleep(1000);

        WebElement countUpWater = driver.findElement(By.xpath("(//div[@class ='count-button count-up'])[67]"));
        countUpWater.click();
        Thread.sleep(1000);
        countUpWater.click();
        Thread.sleep(1000);

        WebElement orderSubmitWater = driver.findElement(By.xpath("(//button[@type='submit'])[71]"));
        orderSubmitWater.click();
        Thread.sleep(2000);

        WebElement basketMenu = driver.findElement(By.xpath("//a[@onclick]"));

        basketMenu.click();
        Thread.sleep(2000);

        WebElement checkOut = driver.findElement(By.xpath("(//button[@type='submit'])[5]"));
        checkOut.click();
        Thread.sleep(2000);

        WebElement nameFieldInput = driver.findElement(By.id("food_order_client_name"));
        nameFieldInput.sendKeys("William Saliba");
        Thread.sleep(2000);

        WebElement addressFieldInput = driver.findElement(By.id("food_order_address"));
        addressFieldInput.sendKeys("Arsenal ave., Wenger street");

        Thread.sleep(2000);



        WebElement doorCodeInput = driver.findElement(By.id("food_order_door_code"));

        doorCodeInput.sendKeys("2nd fl., 2nd floor");

        Thread.sleep(2000);



        WebElement phoneNoInput = driver.findElement(By.id("food_order_phone"));
        phoneNoInput.sendKeys("0222222222");
        Thread.sleep(2000);

        WebElement addInfoInput = driver.findElement(By.id("food_order_additional_info"));
        addInfoInput.sendKeys("The appartment of the best defender in Arsenal");
        Thread.sleep(2000);

        WebElement changeInput = driver.findElement(By.id("food_order_money_change"));
        changeInput.sendKeys("1000000");
        Thread.sleep(2000);

        WebElement paymentCashBtn = driver.findElement(By.id("payment_cash"));
        paymentCashBtn.click();
        Thread.sleep(7000);



    }
}
