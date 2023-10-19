package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NavigationAndDropDowns extends BaseTest{
    @Test
    void demo() throws InterruptedException {
        driver.navigate().to("https://nambafood.kg/");
        //driver.get("https://demoqa.com/select-menu");
        driver.findElement(By.xpath("(//a[@href='/food'])[1]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(5000);

    }
    @Test
    void demo2() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement selectColor = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(selectColor);
//        select.selectByVisibleText("Indigo");
//        Thread.sleep(3000);
//        select.selectByValue("5");
//        Thread.sleep(3000);
//        select.selectByIndex(7);
//        Thread.sleep(3000);


        List<WebElement> selectedOptions = select.getOptions();
//        for (WebElement options: selectedOptions){
//            System.out.println(options.getText());
//        }

        selectRandomColor(select, selectedOptions);

        Thread.sleep(3000);

        /*

        selectReact.sendKeys("Group 1, option 1");
        selectReact.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        */

        WebElement selectReact = driver.findElement(By.id("withOptGroup"));
        WebElement inputClick = driver.findElement(By.xpath("//div[@aria-hidden='true']"));
        inputClick.click();

        List<WebElement> menuItem = selectReact.findElements(By.xpath("./div[2]"));

        List<String> menuItemValue = new ArrayList<>();
        WebElement selectReactInput = driver.findElement(By.id("react-select-2-input"));
        for (WebElement item: menuItem) {
            menuItemValue.add(item.getText());

        }
        for (int i = 0; i < menuItemValue.size(); i++){
            Random randomIndex = new Random();
            int rIndex = randomIndex.nextInt(menuItemValue.size());
            System.out.println(rIndex);
            selectReactInput.sendKeys(menuItemValue.get(rIndex));
            selectReactInput.sendKeys(Keys.ENTER);
            Thread.sleep(3000);



        }
//            for (int i = 0; i < menuItem.size(); i++){
//                menuItemValue.add(i, item.getText());
//                System.out.println(i);
//            }








    }

    public void selectRandomColor(Select select, List<WebElement> selectedOptions){
        Random randomColor = new Random();
        int indexColor = randomColor.nextInt(selectedOptions.size());
        select.selectByIndex(indexColor);
        System.out.println(indexColor);


    }
}
