package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class IstqbPage {
    private WebDriver driver;
    //private By Question1= By.cssSelector("#main_content > form > div:nth-child(3) > input[type=radio]:nth-child(1)");
   private  By Question1 = By.xpath("//input[@type='radio' and @name='0' and @value='1']");
    private  By Question2 = By.xpath("//input[@type='radio' and @name='1' and @value='2']");
    private  By Question3 = By.xpath("//input[@type='radio' and @name='2' and @value='1']");
    private  By Question4 =By.xpath("//input[@type='radio' and @name='3' and @value='2']");
    private  By Question5 = By.xpath("//input[@type='radio' and @name='4' and @value='2']");
    private  By Question6 = By.xpath("//input[@type='radio' and @name='5' and @value='3']");
    private  By Question7 = By.xpath("//input[@type='radio' and @name='6' and @value='2']");
    private  By Question8 =By.xpath("//input[@type='radio' and @name='7' and @value='4']");
    private  By Question9 =By.xpath("//input[@type='radio' and @name='8' and @value='1']");
    private  By Question10 = By.xpath("//input[@type='radio' and @name='9' and @value='3']");
    private  By Question11 = By.xpath("//input[@type='radio' and @name='10' and @value='4']");
    private  By Question12 =By.xpath("//input[@type='radio' and @name='11' and @value='2']");
    private  By Question13 = By.xpath("//input[@type='radio' and @name='12' and @value='3']");
    private  By Question14 =By.xpath("//input[@type='radio' and @name='13' and @value='2']");
    private  By Question15 = By.xpath("//input[@type='radio' and @name='14' and @value='4']");
    private  By Question16 = By.xpath("//input[@type='radio' and @name='15' and @value='3']");
    private  By Question17 = By.xpath("//input[@type='radio' and @name='16' and @value='3']");
    private  By Question18 = By.xpath("//input[@type='radio' and @name='17' and @value='1']");
    private  By Question19 = By.xpath("//input[@type='radio' and @name='18' and @value='2']");
    private  By Question20 =By.xpath("//input[@type='radio' and @name='19' and @value='2']");


    private By SubmitButton = By.id("submit");


    public IstqbPage(WebDriver driver){
        this.driver = driver;
    }

    public void answerIstqbQuestion() throws InterruptedException {
        System.out.println(driver.getCurrentUrl());
        WebElement Reponse = driver.findElement(Question1);
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        WebElement elemento = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(Question1));
        driver.findElement(Question1).click();
        System.out.println("je clique sur la question1");
        Reponse = driver.findElement(Question2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        Reponse = driver.findElement(Question3);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        WebElement element = driver.findElement(Question6);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        Reponse = driver.findElement(Question4);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        Reponse = driver.findElement(Question5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        Reponse = driver.findElement(Question6);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        element = driver.findElement(Question9);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        Reponse = driver.findElement(Question7);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        Reponse = driver.findElement(Question8);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        Reponse = driver.findElement(Question9);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);

        element = driver.findElement(Question13);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        Reponse = driver.findElement(Question10);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        Reponse = driver.findElement(Question11);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        Reponse = driver.findElement(Question12);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        Reponse = driver.findElement(Question13);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
         element = driver.findElement(Question17);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        Reponse = driver.findElement(Question14);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        Reponse = driver.findElement(Question15);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        Reponse = driver.findElement(Question16);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        Reponse = driver.findElement(Question17);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        element = driver.findElement(Question20);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        Reponse = driver.findElement(Question18);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        Reponse = driver.findElement(Question19);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);
        Reponse = driver.findElement(Question20);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Reponse);

    }
    public ResultatTestpage clickOntermineBouton(){
        driver.findElement(SubmitButton).click();
        return new ResultatTestpage(driver);
    }
}
