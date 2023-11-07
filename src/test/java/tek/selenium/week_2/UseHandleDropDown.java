package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UseHandleDropDown {
    public static void main(String[] args)throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By selectCountryLocator =By.id("countrySelect");
        WebElement selectCountryElement =wait.until(ExpectedConditions.visibilityOfElementLocated(selectCountryLocator));
        selectCountryElement.click();

        By countryLocator = By.id("countrySelect");
        WebElement countryElement = wait.until(ExpectedConditions.visibilityOfElementLocated(countryLocator));
        Select countrySelect = new Select(countryElement);

        Thread.sleep(1000);
        countrySelect.selectByValue("United States");

        Thread.sleep(1000);
        countrySelect.selectByVisibleText("India");

        Thread.sleep(1000);
        countrySelect.selectByIndex(3);

        By languageLocator = By.id("languageSelect");
        WebElement languageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(languageLocator));
        Select languageSelect = new Select(languageElement);
        Thread.sleep(2000);
        languageSelect.selectByValue("Persian");
        driver.quit();




    }
}
