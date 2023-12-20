package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private By ToolBoxLink = By.xpath("/html/body/div[2]/header/div[2]/div/div[2]/div/nav[1]/div/ul/li[3]/a");
            /*(new WebDriverWait(driver, 10))
            .until(ExpectedConditions.elementToBeClickable( By.linkText("Toolbox")));
            */
    public HomePage(WebDriver driver){this.driver=driver;}
    public  ToolBoxPage clickToolBoxLink(){

        driver.findElement(ToolBoxLink).click();
        System.out.println("je clique sur toolbox");
        return new ToolBoxPage(driver);
    }




}


