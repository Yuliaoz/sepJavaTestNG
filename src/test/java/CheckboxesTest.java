import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class CheckboxesTest {
    WebDriver driver;


    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\iouli\\IdeaProjects\\sepJavaTestNG\\src\\test\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void test005() {
        navigateToMainPage();
        countNumberOfCheckboxes();
        assertNumberOfCheckboxes();
        checkFirstCheckboxIsDisplayed();
        checkFirstCheckboxIsSelected();
        selectUncheckedCheckbox();
        getAttributeValueFromCheckbox();
        assertCheckboxIsChecked();

        //assertCheckboxIsDisplayed();
        // Assert.assertTrue(isinputDisplayed);
    }

    private void assertCheckboxIsChecked() {
        List<WebElement> listOfInputs = driver.findElements(By.tagName("input"));
        WebElement input1 = listOfInputs.get(0);
        WebElement input2 = listOfInputs.get(1);
        String inputCheckedValue = input1.getAttribute("checked");
        Assert.assertEquals(inputCheckedValue, "true");

    }

    private void getAttributeValueFromCheckbox() {
        List<WebElement> listOfInputs = driver.findElements(By.tagName("input"));
        WebElement input1 = listOfInputs.get(0);
        WebElement input2 = listOfInputs.get(1);
        String inputCheckedValue = input1.getAttribute("checked");
    }

    private void selectUncheckedCheckbox() {
        List<WebElement> listOfInputs = driver.findElements(By.tagName("input"));
        WebElement input1 = listOfInputs.get(0);
        WebElement input2 = listOfInputs.get(1);
        String inputCheckedValue = input1.getAttribute("checked");
        if(inputCheckedValue==null){
            input1.click();
        }
    }

    private void checkFirstCheckboxIsSelected() {
        List<WebElement> listOfInputs = driver.findElements(By.tagName("input"));
        WebElement input1 = listOfInputs.get(0);
        WebElement input2 = listOfInputs.get(1);
        String inputCheckedValue = input1.getAttribute("checked");
    }

        private void checkFirstCheckboxIsDisplayed () {
            List<WebElement> listOfInputs = driver.findElements(By.tagName("input"));
            WebElement input1 = listOfInputs.get(0);
            WebElement input2 = listOfInputs.get(1);
            boolean isInputDisplayed = input1.isDisplayed();

        }

        private void assertNumberOfCheckboxes () {
            driver.findElements(By.tagName("input"));
            List<WebElement> listOfInputs = driver.findElements(By.tagName("input"));
            int numberOfInputs = listOfInputs.size();
            Assert.assertTrue(numberOfInputs == 2);
        }

        private void countNumberOfCheckboxes () {
            driver.findElements(By.tagName("input"));
            List<WebElement> listOfInputs = driver.findElements(By.tagName("input"));
            int numberOfInputs = listOfInputs.size();
        }

        private void navigateToMainPage () {
            String url = "https://the-internet.herokuapp.com/checkboxes";
            driver.get(url);
        }

        @AfterSuite
        public void afterSuite () {
            driver.quit();
        }
    }





