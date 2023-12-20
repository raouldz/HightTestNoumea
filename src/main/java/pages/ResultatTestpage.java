package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultatTestpage {
    private WebDriver driver;
    private By Email = By.id("email");
    private By SubmitEmail = By.id("submitMail");

    public ResultatTestpage(WebDriver driver){this.driver=driver;}
    public void submitEmail(String userMail){
        driver.findElement(Email).sendKeys(userMail);
        driver.findElement(SubmitEmail).click();
    }



}
