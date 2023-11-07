package tek.selenium.week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity1 {
    //navigate to insurance app, and login and got to accounts
    //wait for spinner to disappear
    //and print the table headers one by one.
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa.insurance.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        By usernameLocator = By.xpath("//input[@name='username']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameLocator)).sendKeys("supervisor");

        By passwordLocator = By.xpath("//input[@name='password']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocator)).sendKeys("tek_supervisor");

        By loginButton = By.xpath("//button[@id='loginButton']");
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

        By accountLinkLocator = By.xpath("//a[@routerlink = '/csr/accounts']");
        wait.until(ExpectedConditions.elementToBeClickable(accountLinkLocator)).click();

        By spinnerLocator = By.xpath("//app-spinner");
        wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(spinnerLocator)));

//        By deleteHeader = By.xpath("//th[@role='columnheader']");
//        WebElement deleteHeaderElement =wait.until(ExpectedConditions.visibilityOfElementLocated(deleteHeader));
//        String deleteHeaderText = deleteHeaderElement.getText();
//        System.out.println(deleteHeaderText);
//
//        By emailHeader = By.xpath("//th[@role='columnheader'][2]");
//        String emailHeaderText =wait.until(ExpectedConditions.visibilityOfElementLocated(emailHeader)).getText();
//        System.out.println(emailHeaderText);

        By headerList = By.xpath("//th[@role='columnheader']");
        List<WebElement> columnElements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(headerList));
//        List<WebElement> columnElements = driver.findElements(headerList);
        for(WebElement element : columnElements){
            System.out.println(element.getText());
        }


        // the other way is using for loop to loop through all headers and print them all.

//        for(int i =1; i<=8;i++){

//            By headers = By.xpath("//th[@role='columnheader']["+i+"]");
//            teacher approach:
//            By headers = By.xpath("//table/thead/tr/th["+i+"]");
//            String headersText = wait.until(ExpectedConditions.visibilityOfElementLocated(headers)).getText();
//            System.out.println(headersText);
//
//        }
        driver.quit();


    }
}
