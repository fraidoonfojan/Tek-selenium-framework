package tek.Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;

public class ValidCSRLogin {
//    Story # 6
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        By usernameLocator =By.name("username");
        WebElement usernameElement = driver.findElement(usernameLocator);
        usernameElement.sendKeys("supervisor");

        By passwordLocator =By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("tek_supervisor");

        By loginButtonLocator = By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-content/form/mat-card-actions/button[1]");
        WebElement loginButtonElement = driver.findElement(loginButtonLocator);
        loginButtonElement.click();

        Thread.sleep(2000);

        By tekInsuranceAppTitleLocator = By.xpath("/html/body/app-root/app-home-page/div/app-toolbar/mat-toolbar/span[1]");
        WebElement tekInsuranceAppElement = driver.findElement(tekInsuranceAppTitleLocator);
        String pageTitle = tekInsuranceAppElement.getText();
//        System.out.println("Tek Insurance App title: "+pageTitle);
        String expectedTitle = "Tek Insurance App";
        if(pageTitle.equals(expectedTitle)) {
            System.out.println("Page title correct Test passed: " + pageTitle);
        }else {
            System.out.println("page title wrong Test failed: "+pageTitle);

        }
        By usernameValidateLocator = By.xpath("/html/body/app-root/app-home-page/div/app-toolbar/mat-toolbar/button[2]/span[1]");
        WebElement usernameValidateElement = driver.findElement(usernameValidateLocator);
        String validateUsernameText = usernameValidateElement.getText();
        String expectedValidateUsername = "Supervisor";
        System.out.println(validateUsernameText);

        String actualUsername = validateUsernameText.substring(0, expectedValidateUsername.length());
        if(actualUsername.equals(expectedValidateUsername)) {
            System.out.println("username correct, Test passed: "+actualUsername);
        }else{
            System.out.println("username wrong, Test failed: ");
        }

        driver.quit();


    }
}
