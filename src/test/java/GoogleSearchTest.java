import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {
    WebDriver driver;
    String resultStatsID="resultStats";

    @AfterSuite
    public void afterSuite(){
        //driver.quit();
    }
    @Test
    public void test004() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\iouli\\IdeaProjects\\sepJavaTestNG\\src\\test\\resources\\geckodriver.exe");



        openBrowser();
        navigateToMainPage();
        typeQuery();
        submitSearch();
        waitForResultElement();
        assertResultsPage();

    }

    private void waitForResultElement() {
        By elementToWait =By.id(resultStatsID);
        ExpectedCondition condition=ExpectedConditions.presenceOfElementLocated(elementToWait);
        WebDriverWait webDriverWait=new WebDriverWait(driver, 10);
        webDriverWait.until(condition);
    }

    private void assertResultsPage() {

        WebElement resultStatsElement=driver.findElement(By.id(resultStatsID));
        boolean isDisplayed=resultStatsElement.isDisplayed();
        boolean expected=true;
        Assert.assertEquals(isDisplayed, true);
    }

    private void submitSearch() {
        String selector="#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input";
        driver.findElement(By.cssSelector(selector)).submit();

    }

    private void typeQuery() {
        String selector="#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input";
        driver.findElement(By.cssSelector(selector));
        WebElement webelement=driver.findElement(By.cssSelector(selector));
        webelement.sendKeys("Portnov Computer School");
    }

    private void navigateToMainPage() {
        String url="https://www.google.com/";
        driver.get(url);
    }

    private void openBrowser() {
        driver=new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }
}
