package DEMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTest {


    public WebDriver driver;

    @BeforeClass
    public void setUpBrowser(){


        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver(); // create new object

        driver.manage().window().maximize(); // make full screen

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7)); // setup the time

            PageFactory.initElements(driver, this);



    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
