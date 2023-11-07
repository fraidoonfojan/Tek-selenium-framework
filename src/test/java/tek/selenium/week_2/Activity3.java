package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity3 {
    //Navigate to Facebook.com
    //Click on Create new Account.
    //Validate dialog title is Sign Up
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://www.facebook.com");

    try

    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        By createAccountLocator = By.linkText("Create new account");
        WebElement signUpElement = wait.until(ExpectedConditions.elementToBeClickable(createAccountLocator));
        signUpElement.click();

        By dialogTitleLocator = By.xpath("/html/body/div[3]/div[2]/div/div/div[1]/div[1]");
        WebElement signUpDialogElement =
                wait.until(ExpectedConditions.visibilityOfElementLocated(dialogTitleLocator));
        String signUpDialogText = signUpDialogElement.getText();
        System.out.println(signUpDialogText);
    }catch(Exception e){
        e.printStackTrace();

        }finally {
        driver.quit();

    }
//        note: if there is an error or exception it stops execution and cant stop driver.
//        in order to close the browser we need to handle it, we use try and catch statement.



    }
}
