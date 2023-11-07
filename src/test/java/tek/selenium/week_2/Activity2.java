package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Activity2 {
    //Use CssSelector
    //Navigate to Insurance app.
    //print Page title.
    //print customer service portal title
    //print second section title (Login)
    //Enter WrongUser Name
    //Enter Wrong password
    //Click login
    //Print error message
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        By pagTitleLocator = By.cssSelector("body > app-root > app-login > mat-toolbar > span:nth-child(2)");
        WebElement pageTitleElement = driver.findElement(pagTitleLocator);
        String pageTitleText =pageTitleElement.getText();
        System.out.println(pageTitleText);

        By customerTitleLocator = By.cssSelector("body > app-root > app-login > div > mat-card > mat-card-title:nth-child(1) > strong");
        WebElement customerTitleElement = driver.findElement(customerTitleLocator);
        String customerTitleText = customerTitleElement.getText();
        System.out.println(customerTitleText);

       By subtitleLocator = By.cssSelector("body > app-root > app-login > div > mat-card > mat-card-title:nth-child(2)");
       WebElement subTitleElement = driver.findElement(subtitleLocator);
       String subTitleText = subTitleElement.getText();
        System.out.println(subTitleText);

        driver.findElement(By.name("username")).sendKeys("wrong username");
        driver.findElement(By.name("password")).sendKeys("password");

        By loginButtonLocator = By.id("loginButton");
        WebElement loginButtonElement = driver.findElement(loginButtonLocator);
        loginButtonElement.click();
//        Thread.sleep(1000);

        By errorMsg = By.className("error");
        WebElement errorElement = driver.findElement(errorMsg);
        String errorText = errorElement.getText();


       driver.quit();


    }
}
