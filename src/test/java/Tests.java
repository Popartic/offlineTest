import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.IndexPage;
import testingData.StandardData;


public class Tests extends BaseTestClass{

    WebDriver driver;
    String username;
    String password;


    @BeforeMethod
    public void setUpTest(){
        driver = setUpDriver();
        username = StandardData.USERNAME;
        password = StandardData.PASSWORD;
    }

    //checkboxes
    @Test
    public void TC01(){
        IndexPage indexPage = new IndexPage(driver).open();

        indexPage.clickCheckboxesPage();
        indexPage.clickCheckbox1().clickCheckbox2();
    }
    //dropdown
    @Test
    public void TC02(){
        IndexPage indexPage = new IndexPage(driver).open();

        indexPage.clickDropdownPage();
        indexPage.clickDropdown().clickOptionLocator();
    }
    //login
    @Test
    public void TC03(){
        IndexPage indexPage = new IndexPage(driver);

        indexPage.open();
        indexPage.clickFormAuthenticationPage();
        indexPage.enterUsername(username);
        indexPage.enterPassword(password);
        indexPage.clickLogin();
    }
    //keyword presses
    @Test
    public void TC04(){
        IndexPage indexPage = new IndexPage(driver);

        indexPage.open();
        indexPage.clickKeyPressesPage();
        indexPage.pressSpace();
        indexPage.pressTab();
    }
    //drag and drop
    @Test
    public void TC05(){
        IndexPage indexPage = new IndexPage(driver);

        indexPage.open();
        indexPage.clickDragNDropPage();
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='column-b']"));
        actions.dragAndDrop(element,target).build().perform();
    }
    //drag and drop 2
    @Test
    public void TC05_2(){
        IndexPage indexPage = new IndexPage(driver);

        indexPage.open();
        indexPage.clickDragNDropPage();
        indexPage.dragAndDrop();
    }
    //upload
    @Test
    public void TC06(){
        IndexPage indexPage = new IndexPage(driver).open();

        indexPage.clickUploadPage();
        indexPage.uploadFile();
        indexPage.clickUpload();
    }
    //basic auth
    @Test
    public void TC07(){
        IndexPage indexPage = new IndexPage(driver).open();

        indexPage.clickBasicAuthPage();
    }
    //text editor
    @Test
    public void TC08(){
        IndexPage indexPage = new IndexPage(driver).open();

        indexPage.clickEditorPage();
        indexPage.clickFile().clickNewDoc();
        indexPage.enterText();
    }
    @AfterMethod(alwaysRun = true)
    public void tearDownTest(){
        quitDriver(driver);
    }

}




