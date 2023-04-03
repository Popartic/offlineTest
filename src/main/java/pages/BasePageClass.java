package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingData.TimeDelay;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class BasePageClass {

    protected WebDriver driver;

    public BasePageClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void openUrl(String url) {
        driver.get(url);
    }

    //da saceka da element bude vidljiv na mestu na kome se nalazi
    protected WebElement waitForWebElementToBeVisible(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement waitForWebElementToBeVisible(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    //da upise tekst u web element
    protected void typeTextToWebElement(WebElement element, String text) {
        waitForWebElementToBeVisible(element, TimeDelay.DELAY_5_SEC);
        element.sendKeys(text);
    }

    //da ocistimo string
    protected void clearTextFromWebElement(WebElement element) {
        waitForWebElementToBeVisible(element, TimeDelay.DELAY_5_SEC);
        element.clear();
    }

    //metoda koja u sebi ima i metodu za brisanje i metodu za ispis
    protected void clearAndTypeTextToWebElement(WebElement element, String text) {
        clearTextFromWebElement(element);
        typeTextToWebElement(element, text);
    }

    //da iskoristimo u metodi dole
    protected void clickOnWebElement(WebElement element) {
        element.click();
    }

    //metoda koja radi klik
    protected void clickButton(By locator) {
        WebElement element = waitForWebElementToBeVisible(locator, TimeDelay.DELAY_5_SEC);
        clickOnWebElement(element);
    }

    //metoda koja cita text sa stranice
    protected String getTextFromWebElement(WebElement element) {
        return element.getText();
    }

    //metoda koja pritiska Enter
    protected void pressEnter(By locator) {
        WebElement element = waitForWebElementToBeVisible(locator, TimeDelay.DELAY_3_SEC);
        element.sendKeys(Keys.ENTER);
    }

    //metoda koja pritiska Space
    protected void pressSpace(By locator){
        WebElement element = waitForWebElementToBeVisible(locator, TimeDelay.DELAY_3_SEC);
        element.sendKeys(Keys.SPACE);
    }

    //metoda koja pritiska TAB
    protected void pressTab(By locator){
        WebElement element = waitForWebElementToBeVisible(locator, TimeDelay.DELAY_3_SEC);
        element.sendKeys(Keys.TAB);
    }
    //metoda koja radi upload odredjenog fajla
    protected void uploadFile(By locator){
        WebElement element = waitForWebElementToBeVisible(locator, TimeDelay.DELAY_3_SEC);
        element.sendKeys("C:\\Users\\User\\Desktop\\New Text Document.txt");
    }
    //metoda koja vrsi ispis u editoru
    protected void texting(By locator){
        WebElement element = waitForWebElementToBeVisible(locator,TimeDelay.DELAY_3_SEC);
        element.sendKeys("Some text Some text Some text Some text Some text Some text Some text Some text Some text Some text Some text");
    }

    //metoda koja radi dragAndDrop
    protected void dragElement(By locator1, By locator2){
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(locator1);
        WebElement target = driver.findElement(locator2);
        actions.dragAndDrop(element,target).build().perform();
    }




}


