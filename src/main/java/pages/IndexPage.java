package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testingData.StandardData;
import testingData.TimeDelay;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class IndexPage extends BasePageClass {
    private final String indexURL = StandardData.INDEX_URL;

    private final By checkboxesPageLocator = By.xpath("//a[@href='/checkboxes']");
    private final By checkbox1Locator = By.xpath("//form[@id='checkboxes']/input[1]");
    private final By checkbox2Locator = By.xpath("//form[@id='checkboxes']/input[2]");
    private final By dropdownPageLocator = By.xpath("//a[@href='/dropdown']");
    private final By dropdownLocator = By.xpath("//select[@id='dropdown']");
    private final By dropdownOptionLocator = By.xpath("//option[@value='1']");
    private final By formAuthenticationPageLocator = By.xpath("//a[@href='/login']");
    private final By usernameFieldLocator = By.xpath("//input[@type='text']");
    private final By passwordFieldLocator = By.xpath("//input[@type='password']");
    private final By loginButtonLocator = By.xpath("//i[@class='fa fa-2x fa-sign-in']");
    private final By keyPressesPageLocator = By.xpath("//a[@href='/key_presses']");
    private final By targetFieldLocator = By.xpath("//input[@id='target']");
    private final By dragDropPageLocator = By.xpath("//a[@href='/drag_and_drop']");
    private final By columnALocator = By.xpath("//div[@id='column-a']");
    private final By columnBLocator = By.xpath("//div[@id='column-b']");
    private final By fileUploadPageLocator = By.xpath("//a[@href='/upload']");
    private final By chooseFileLocator = By.xpath("//input[@id='file-upload']");
    private final By submitFileButtonLocator = By.xpath("//input[@class='button']");
    private final By basicAuthPageLocator = By.xpath("//a[@href='/basic_auth']");
    private final By WYSIWYGEditorPageLocator = By.xpath("//a[@href='/tinymce']");
    private final By typingFieldLocator = By.xpath("//*[@id='tinymce']");
    private final By clickFileLocator = By.xpath("//span[text()='File']");
    private final By clickNewDocument = By.xpath("//div[@class='tox-collection__item-label']");

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public IndexPage open() {
        openUrl(indexURL);
        return this;
    }

    public IndexPage clickCheckboxesPage() {
        clickButton(checkboxesPageLocator);
        return this;
    }

    public IndexPage clickCheckbox1() {
        clickButton(checkbox1Locator);
        return this;
    }

    public IndexPage clickCheckbox2() {
        clickButton(checkbox2Locator);
        return this;
    }

    public IndexPage clickDropdownPage() {
        clickButton(dropdownPageLocator);
        return this;
    }

    public IndexPage clickDropdown() {
        clickButton(dropdownLocator);
        return this;
    }

    public IndexPage clickOptionLocator() {
        clickButton(dropdownOptionLocator);
        return this;
    }

    public IndexPage clickFormAuthenticationPage() {
        clickButton(formAuthenticationPageLocator);
        return this;
    }

    public IndexPage enterUsername(String username) {
        WebElement usernameField = waitForWebElementToBeVisible(usernameFieldLocator, TimeDelay.DELAY_3_SEC);
        clearAndTypeTextToWebElement(usernameField, username);
        return this;
    }

    public IndexPage enterPassword(String password) {
        WebElement passwordField = waitForWebElementToBeVisible(passwordFieldLocator, TimeDelay.DELAY_3_SEC);
        clearAndTypeTextToWebElement(passwordField, password);
        return this;
    }

    public IndexPage clickLogin() {
        clickButton(loginButtonLocator);
        return this;
    }

    public IndexPage clickKeyPressesPage() {
        clickButton(keyPressesPageLocator);
        return this;
    }

    public IndexPage pressSpace() {
        pressSpace(targetFieldLocator);
        return this;
    }

    public IndexPage pressTab() {
        pressTab(targetFieldLocator);
        return this;
    }

    public IndexPage clickDragNDropPage() {
        clickButton(dragDropPageLocator);
        return this;
    }

    public IndexPage dragAndDrop() {
        dragElement(columnALocator, columnBLocator);
        return this;
    }

    public IndexPage clickUploadPage() {
        clickButton(fileUploadPageLocator);
        return this;
    }

    public IndexPage clickUpload() {
        clickButton(submitFileButtonLocator);
        return this;
    }

    public IndexPage uploadFile() {
        uploadFile(chooseFileLocator);
        return this;
    }

    public IndexPage clickEditorPage() {
        clickButton(WYSIWYGEditorPageLocator);
        return this;
    }

    public IndexPage clickFile(){
        clickButton(clickFileLocator);
        return this;
    }
    public IndexPage clickNewDoc(){
        clickButton(clickNewDocument);
        return this;
    }
    public IndexPage enterText(){
        texting(typingFieldLocator);
        return this;
    }
    public IndexPage clickBasicAuthPage() {
        clickButton(basicAuthPageLocator);
        return this;
    }

}