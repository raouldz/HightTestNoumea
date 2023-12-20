package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolBoxPage {
    private WebDriver driver;
    private By IstqTestfrenchLink = By.cssSelector("#page > div:nth-child(4) > div > section > article > div:nth-child(2) > div > div:nth-child(1) > div > div:nth-child(2) > div > a.text-poppins.bg-color-green-medium.lang.d-block.text-color-white.text-weight-light.text-uppercase.letter-spacing200");


    public ToolBoxPage(WebDriver driver){
        this.driver = driver;    }
    public IstqbPage clickOnIstqbTestfrenchLink() throws InterruptedException {
        WebElement element = driver.findElement(IstqTestfrenchLink);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        //driver.findElement(IstqTestfrenchLink).click();
        WebElement element1 = driver.findElement(IstqTestfrenchLink);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        Thread.sleep(500);
        System.out.println("j'ai cliqué sur istqb french test");
        driver.get("https://hightest.nc/ressources/test-istqb.php");

        return new IstqbPage(driver);
    }
}
