package test.java.base;

import main.java.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public  void setUp() throws InterruptedException {
        /*
        System.setProperty("webdriver.gecko.driver","resources//geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://hightest.nc/");
        WebElement element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div[2]/div/div[2]/div/nav[1]/div/ul/li[3]/a")));
        homePage = new HomePage(driver);
       */


        System.setProperty("webdriver.chrome.driver","resources//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://hightest.nc/");
        driver.manage().window().maximize();
         WebElement element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div[2]/div/div[2]/div/nav[1]/div/ul/li[3]/a")));
        homePage = new HomePage(driver);


    }
    @AfterClass
    public void tearDown(){driver.quit();}

}

