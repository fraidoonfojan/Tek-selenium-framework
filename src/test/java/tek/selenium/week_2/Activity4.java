package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity4 {
    /*
navigate to https://tek-retail-ui.azurewebsites.net/selenium/dropdown
in Select website's language drop down
select what ever language you want.
make use using wait implicit and explicit
 */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        By selectProgramLanguageLocator = By.xpath("//html/body/div/div[1]/div[2]/div/div[1]/select");
        WebElement selectProgramElement = wait.until(ExpectedConditions.visibilityOfElementLocated(selectProgramLanguageLocator));
        Select programLanguage = new Select(selectProgramElement);
        programLanguage.selectByIndex(4);
        Thread.sleep(3000);
        driver.quit();
}}
