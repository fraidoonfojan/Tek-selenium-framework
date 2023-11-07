package tek.selenium.week_2;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.locks.Condition;

public class UseImplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        By pagTitleLocator = By.cssSelector("body > app-root > app-login > mat-toolbar > span:nth-child(2)");
        WebElement pageTitleElement = driver.findElement(pagTitleLocator);
        String pageTitleText =pageTitleElement.getText();
        System.out.println(pageTitleText);

//        Explicitly wait:
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By usernameInputLocator = By.name("username");
        WebElement usernameInputElement = wait.until(ExpectedConditions.presenceOfElementLocated(usernameInputLocator));
        usernameInputElement.sendKeys("wrong username");

        By passwordInputLocator = By.name("password");
        WebElement passwordElement = wait.until(ExpectedConditions.presenceOfElementLocated(passwordInputLocator));
        passwordElement.sendKeys("wrong password");

        By loginButtonLocator = By.cssSelector("#loginButton");
        WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(loginButtonLocator));
        loginButtonElement.click();

        By errorMessageLocator = By.className("error");
        WebElement errorMessageElement = wait.until(ExpectedConditions.elementToBeClickable(errorMessageLocator));
        String errorText = errorMessageElement.getText();
        System.out.println(errorText);


        driver.quit();

    }
}
